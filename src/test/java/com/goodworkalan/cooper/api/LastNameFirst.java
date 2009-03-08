package com.goodworkalan.cooper.api;

import com.goodworkalan.stash.Stash;
import com.goodworkalan.strata.Extractor;
import com.mallardsoft.tuple.Pair;

public class LastNameFirst implements Extractor<Person, Pair<String, String>>
{
    public Pair<String, String> extract(Stash stash, Person person)
    {
        return new Pair<String, String>(person.getLastName(), person.getFirstName());
    }
}
