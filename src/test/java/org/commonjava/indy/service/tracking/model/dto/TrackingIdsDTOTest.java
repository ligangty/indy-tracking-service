package org.commonjava.indy.service.tracking.model.dto;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
public class TrackingIdsDTOTest
{
    @Test
    public void test_TrackingIdsDTO_0() throws Throwable
    {
        java.util.HashSet<String> strSet0 = new java.util.HashSet<String>();
        boolean boolean2 = strSet0.add( "IndyEvent{eventID=b020bdc3-8ade-4e45-b284-02c51d700ca2, eventMetadata=null}" );
        assertTrue( boolean2 );
        java.util.HashSet<String> strSet3 = new java.util.HashSet<String>();
        boolean boolean5 = strSet3.add( "IndyEvent{eventID=b020bdc3-8ade-4e45-b284-02c51d700ca2, eventMetadata=null}" );
        assertTrue( boolean5 );
        TrackingIdsDTO trackingIdsDTO6 = new TrackingIdsDTO( strSet0, strSet3 );

    }

    @Test
    public void test_setSealed_0() throws Throwable
    {
        TrackingIdsDTO trackingIdsDTO0 = new TrackingIdsDTO();
        java.util.HashSet<String> strSet1 = new java.util.HashSet<String>();
        boolean boolean3 = strSet1.add( "IndyEvent{eventID=b020bdc3-8ade-4e45-b284-02c51d700ca2, eventMetadata=null}" );
        assertTrue( boolean3 );
        trackingIdsDTO0.setSealed( strSet1 );

    }

    @Test
    public void test_setInProgress_0() throws Throwable
    {
        TrackingIdsDTO trackingIdsDTO0 = new TrackingIdsDTO();
        java.util.HashSet<String> strSet1 = new java.util.HashSet<String>();
        boolean boolean3 = strSet1.add( "IndyEvent{eventID=b020bdc3-8ade-4e45-b284-02c51d700ca2, eventMetadata=null}" );
        assertTrue( boolean3 );
        trackingIdsDTO0.setInProgress( strSet1 );

    }

    private Object getFieldValue( Object obj, String fieldName )
                    throws java.lang.reflect.InvocationTargetException, SecurityException, IllegalArgumentException,
                    IllegalAccessException
    {
        try
        {
            java.lang.reflect.Field field = obj.getClass().getField( fieldName );
            return field.get( obj );
        }
        catch ( NoSuchFieldException e )
        {
            for ( java.lang.reflect.Method publicMethod : obj.getClass().getMethods() )
            {
                if ( publicMethod.getName().startsWith( "get" ) && publicMethod.getParameterCount() == 0
                                && publicMethod.getName().toLowerCase().equals( "get" + fieldName.toLowerCase() ) )
                {
                    return publicMethod.invoke( obj );
                }
            }
        }
        throw new IllegalArgumentException(
                        "Could not find field or getter " + fieldName + " for class " + obj.getClass().getName() );
    }
}
