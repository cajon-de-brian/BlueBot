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
import com.github.drsmugleaf.eve.esi.model.GetDogmaAttributesAttributeIdNotFound;
import com.github.drsmugleaf.eve.esi.model.GetDogmaAttributesAttributeIdOk;
import com.github.drsmugleaf.eve.esi.model.GetDogmaEffectsEffectIdNotFound;
import com.github.drsmugleaf.eve.esi.model.GetDogmaEffectsEffectIdOk;
import com.github.drsmugleaf.eve.esi.model.InternalServerError;
import com.github.drsmugleaf.eve.esi.model.ServiceUnavailable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DogmaApi
 */
@Ignore
public class DogmaApiTest {

    private final DogmaApi api = new DogmaApi();

    
    /**
     * Get attributes
     *
     * Get a list of dogma attribute ids  --- Alternate route: &#x60;/dev/dogma/attributes/&#x60;  Alternate route: &#x60;/legacy/dogma/attributes/&#x60;  Alternate route: &#x60;/v1/dogma/attributes/&#x60;  --- This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDogmaAttributesTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getDogmaAttributes(datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get attribute information
     *
     * Get information on a dogma attribute  --- Alternate route: &#x60;/dev/dogma/attributes/{attribute_id}/&#x60;  Alternate route: &#x60;/legacy/dogma/attributes/{attribute_id}/&#x60;  Alternate route: &#x60;/v1/dogma/attributes/{attribute_id}/&#x60;  --- This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDogmaAttributesAttributeIdTest() throws ApiException {
        Integer attributeId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        GetDogmaAttributesAttributeIdOk response = api.getDogmaAttributesAttributeId(attributeId, datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get effects
     *
     * Get a list of dogma effect ids  --- Alternate route: &#x60;/dev/dogma/effects/&#x60;  Alternate route: &#x60;/legacy/dogma/effects/&#x60;  Alternate route: &#x60;/v1/dogma/effects/&#x60;  --- This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDogmaEffectsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getDogmaEffects(datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get effect information
     *
     * Get information on a dogma effect  --- Alternate route: &#x60;/dev/dogma/effects/{effect_id}/&#x60;  Alternate route: &#x60;/v2/dogma/effects/{effect_id}/&#x60;  --- This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDogmaEffectsEffectIdTest() throws ApiException {
        Integer effectId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        GetDogmaEffectsEffectIdOk response = api.getDogmaEffectsEffectId(effectId, datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}