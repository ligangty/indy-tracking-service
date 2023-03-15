package org.commonjava.indy.service.tracking.client;

import io.quarkus.test.junit.QuarkusTest;
import org.commonjava.indy.service.tracking.client.content.BatchDeleteRequest;
import org.commonjava.indy.service.tracking.client.content.MaintenanceService;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class MaintenanceServiceTest
{

    @Inject
    @RestClient
    MaintenanceService maintenanceService;

    @Test
    public void testDoDelete()
    {
        try (Response response = maintenanceService.doDelete( new BatchDeleteRequest() ))
        {
            assertEquals( Response.Status.OK.getStatusCode(), response.getStatus() );
        }
    }

}
