package com.goodworkalan.cooper;

// TODO Document.
public class BucketComparable<T, F extends Comparable<? super F>> implements Comparable<Bucket<T, F>>
{
    // TODO Document.
    private final Bucket<T, F> left;
    
    // TODO Document.
    public BucketComparable(Bucket<T, F> left)
    {
        this.left = left;
    }

    // TODO Document.
    public int compareTo(Bucket<T, F> right)
    {
        return left.getFields().compareTo(right.getFields());
    }
}
