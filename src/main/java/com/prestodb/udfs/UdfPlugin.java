package com.prestodb.udfs;
import com.facebook.presto.spi.Plugin;
import java.util.Set;
import com.google.common.collect.ImmutableSet;

public class UdfPlugin implements Plugin
{
    @Override
    public Set<Class<?>> getFunctions()
    {
        return ImmutableSet.<Class<?>>builder()
                .add(customUdf.class)
                .build();
    }
}