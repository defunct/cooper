package com.goodworkalan.cooper;

// TODO Document.
public class Bucket<T, F extends Comparable<? super F>>
{
    // TODO Document.
    private final F fields;
    
    // TODO Document.
    private final T object;
    
    // TODO Document.
    public Bucket(T object, F fields)
    {
        this.fields = fields;
        this.object = object;
    }
    
    // TODO Document.
    public T getObject()
    {
        return object;
    }

    // TODO Document.
    public F getFields()
    {
        return fields;
    }
}
