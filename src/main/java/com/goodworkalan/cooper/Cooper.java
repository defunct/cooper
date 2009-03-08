package com.goodworkalan.cooper;

import com.goodworkalan.stash.Stash;
import com.goodworkalan.strata.ComparableFactory;
import com.goodworkalan.strata.Extractor;

// TODO Document.
public class Cooper<T, F extends Comparable<? super F>> implements ComparableFactory<Bucket<T, F>>
{
    // TODO Document.
    private final Extractor<T, F> extractor;
    
    // TODO Document.
    public Cooper(Extractor<T, F> extractor)
    {
        this.extractor = extractor;
    }
    
    // TODO Document.
    public Bucket<T, F> newBucket(Stash stash, T object)
    {
        return new Bucket<T, F>(object, extractor.extract(stash, object));
    }
    
    // TODO Document.
    public Comparable<? super Bucket<T, F>> newComparable(Stash stash, Bucket<T, F> object)
    {
        return null;
    }
    
    // TODO Document.
    public Comparable<Bucket<T, F>> newIndexComparable(Stash stash, Comparable<? super F> object)
    {
        return null;
    }
}
