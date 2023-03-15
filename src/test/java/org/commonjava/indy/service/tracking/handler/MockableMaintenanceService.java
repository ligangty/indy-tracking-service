package org.commonjava.indy.service.tracking.handler;

import io.quarkus.test.Mock;
import org.apache.http.HttpStatus;
import org.commonjava.indy.service.tracking.client.content.BatchDeleteRequest;
import org.commonjava.indy.service.tracking.client.content.MaintenanceService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.core.Response;

@Mock
@RestClient
public class MockableMaintenanceService
                implements MaintenanceService
{
    @Override
    public Response doDelete( BatchDeleteRequest request )
    {
        return Response.status( HttpStatus.SC_OK ).build();
    }
}
