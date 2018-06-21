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
import com.github.drsmugleaf.eve.esi.model.Forbidden;
import com.github.drsmugleaf.eve.esi.model.GetCharactersCharacterIdLoyaltyPoints200Ok;
import com.github.drsmugleaf.eve.esi.model.GetLoyaltyStoresCorporationIdOffers200Ok;
import com.github.drsmugleaf.eve.esi.model.GetLoyaltyStoresCorporationIdOffersNotFound;
import com.github.drsmugleaf.eve.esi.model.InternalServerError;
import com.github.drsmugleaf.eve.esi.model.ServiceUnavailable;
import com.github.drsmugleaf.eve.esi.model.Unauthorized;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoyaltyApi
 */
@Ignore
public class LoyaltyApiTest {

    private final LoyaltyApi api = new LoyaltyApi();

    
    /**
     * Get loyalty points
     *
     * Return a list of loyalty points for all corporations the character has worked for  --- Alternate route: &#x60;/dev/characters/{character_id}/loyalty/points/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/loyalty/points/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/loyalty/points/&#x60;  --- This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdLoyaltyPointsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdLoyaltyPoints200Ok> response = api.getCharactersCharacterIdLoyaltyPoints(characterId, datasource, ifNoneMatch, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List loyalty store offers
     *
     * Return a list of offers from a specific corporation&#39;s loyalty store  --- Alternate route: &#x60;/dev/loyalty/stores/{corporation_id}/offers/&#x60;  Alternate route: &#x60;/legacy/loyalty/stores/{corporation_id}/offers/&#x60;  Alternate route: &#x60;/v1/loyalty/stores/{corporation_id}/offers/&#x60;  --- This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyStoresCorporationIdOffersTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetLoyaltyStoresCorporationIdOffers200Ok> response = api.getLoyaltyStoresCorporationIdOffers(corporationId, datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}