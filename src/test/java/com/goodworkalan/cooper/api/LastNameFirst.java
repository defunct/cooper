package com.goodworkalan.cooper.api;

import com.goodworkalan.stash.Stash;
import com.goodworkalan.strata.Extractor;
import com.mallardsoft.tuple.Pair;
import com.mallardsoft.tuple.Tuple;
import com.mallardsoft.tuple.ordered.Ordered;

public class LastNameFirst implements Extractor<Person, Ordered<Pair<String, String>>>
{
    public Ordered<Pair<String, String>> extract(Stash stash, Person person)
    {
        return Ordered.order(Tuple.from(person.getLastName(), person.getFirstName()));
    }
}
