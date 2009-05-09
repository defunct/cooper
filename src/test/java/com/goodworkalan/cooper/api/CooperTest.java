package com.goodworkalan.cooper.api;

import org.testng.annotations.Test;

import com.goodworkalan.cooper.Bucket;
import com.goodworkalan.cooper.Cooper;
import com.goodworkalan.ilk.Ilk;
import com.goodworkalan.stash.Stash;
import com.goodworkalan.strata.Query;
import com.goodworkalan.strata.Schema;
import com.goodworkalan.strata.Strata;
import com.mallardsoft.tuple.Pair;
import com.mallardsoft.tuple.ordered.Ordered;

public class CooperTest
{
    @Test
    public void cooper()
    {
        Cooper<Person, Ordered<Pair<String, String>>> cooper = new  Cooper<Person, Ordered<Pair<String,String>>>(new LastNameFirst());
        Schema<Bucket<Person, Ordered<Pair<String, String>>>> schema = new Schema<Bucket<Person, Ordered<Pair<String,String>>>>();
        schema.setInnerCapacity(7);
        schema.setLeafCapacity(12);
        Strata<Bucket<Person, Ordered<Pair<String, String>>>> strata = schema.inMemory(new Stash(), new Ilk<Bucket<Person, Ordered<Pair<String, String>>>>() { });
        Query<Bucket<Person, Ordered<Pair<String, String>>>> query = strata.query();
        
        Person person = new Person();
        person.setFirstName("Alan");
        person.setLastName("Gutierrez");
        person.setEmail("alan@blogometer.com");
        
        query.add(cooper.newBucket(query.getStash(), person));
    }
    
    public void kissPerson(Person person)
    {
        // Do some kissing here...
    }
    
    @Test
    public void tuple()
    {
        Cooper<Person, Ordered<Pair<String, String>>> cooper = new Cooper<Person, Ordered<Pair<String,String>>>(new LastNameFirst());
        Schema<Bucket<Person, Ordered<Pair<String, String>>>> schema = new Schema<Bucket<Person, Ordered<Pair<String,String>>>>();
        schema.setInnerCapacity(7);
        schema.setLeafCapacity(12);
        Strata<Bucket<Person, Ordered<Pair<String, String>>>> strata = schema.inMemory(new Stash(), new Ilk<Bucket<Person, Ordered<Pair<String,String>>>>() { });
        Query<Bucket<Person, Ordered<Pair<String, String>>>> query = strata.query();
        
        Person person = new Person();
        person.setFirstName("Thomas");
        person.setLastName("Jefferson");
        query.add(cooper.newBucket(query.getStash(), person));
        
        person = new Person();
        person.setFirstName("George");
        person.setLastName("Jefferson");
        query.add(cooper.newBucket(query.getStash(), person));
        
        person = new Person();
        person.setFirstName("Don");
        person.setLastName("Johnson");
        query.add(cooper.newBucket(query.getStash(), person));
        
        person = new Person();
        person.setFirstName("Henry");
        person.setLastName("James");
        query.add(cooper.newBucket(query.getStash(), person));
        
//        Partial<Single<String>, Pair<String, String>> byLastName = Compare.oneOf(Compare.<String, String>pair()); 
//        
//        Comparable<Bucket<Person, Pair<String, String>>> search = cooper.newIndexComparable(query.getStash(), byLastName.compare(Tuple.from("Johnson")));
//        Cursor<Bucket<Person, Pair<String, String>>> cursor = query.find(search);
//        assertTrue(cursor.hasNext());
    }
    
}
