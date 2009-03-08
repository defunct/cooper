package com.goodworkalan.cooper;

// TODO Document.
public class IndexComparable<T, F extends Comparable<? super F>> implements Comparable<Bucket<T, F>>
{
    // TODO Document.
    private final Comparable<? super F> comparable;
    
    // TODO Document.
    public IndexComparable(Comparable<? super F> comparable)
    {
        this.comparable = comparable;
    }
    
    // TODO Document.
    public int compareTo(Bucket<T, F> o)
    {
        return comparable.compareTo(o.getFields());
    }
}
