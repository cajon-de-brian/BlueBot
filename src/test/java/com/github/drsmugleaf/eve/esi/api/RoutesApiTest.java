/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.drsmugleaf.eve.esi.api;

import com.github.drsmugleaf.eve.esi.ApiException;
import com.github.drsmugleaf.eve.esi.model.BadGateway;
import com.github.drsmugleaf.eve.esi.model.BadRequest;
import com.github.drsmugleaf.eve.esi.model.GetRouteOriginDestinationNotFound;
import com.github.drsmugleaf.eve.esi.model.InternalServerError;
import com.github.drsmugleaf.eve.esi.model.ServiceUnavailable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoutesApi
 */
@Ignore
public class RoutesApiTest {

    private final RoutesApi api = new RoutesApi();

    
    /**
     * Get route
     *
     * Get the systems between origin and destination  --- Alternate route: &#x60;/dev/route/{origin}/{destination}/&#x60;  Alternate route: &#x60;/legacy/route/{origin}/{destination}/&#x60;  Alternate route: &#x60;/v1/route/{origin}/{destination}/&#x60;  --- This route is cached for up to 86400 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRouteOriginDestinationTest() throws ApiException {
        Integer destination = null;
        Integer origin = null;
        List<Integer> avoid = null;
        List<List<Integer>> connections = null;
        String datasource = null;
        String flag = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getRouteOriginDestination(destination, origin, avoid, connections, datasource, flag, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}