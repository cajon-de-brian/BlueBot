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
import com.github.drsmugleaf.eve.esi.model.GetCharactersCharacterIdWalletJournal200Ok;
import com.github.drsmugleaf.eve.esi.model.GetCharactersCharacterIdWalletTransactions200Ok;
import com.github.drsmugleaf.eve.esi.model.GetCorporationsCorporationIdWallets200Ok;
import com.github.drsmugleaf.eve.esi.model.GetCorporationsCorporationIdWalletsDivisionJournal200Ok;
import com.github.drsmugleaf.eve.esi.model.GetCorporationsCorporationIdWalletsDivisionTransactions200Ok;
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
 * API tests for WalletApi
 */
@Ignore
public class WalletApiTest {

    private final WalletApi api = new WalletApi();

    
    /**
     * Get a character&#39;s wallet balance
     *
     * Returns a character&#39;s wallet balance  --- Alternate route: &#x60;/dev/characters/{character_id}/wallet/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/wallet/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/wallet/&#x60;  --- This route is cached for up to 120 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdWalletTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        Double response = api.getCharactersCharacterIdWallet(characterId, datasource, ifNoneMatch, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get character wallet journal
     *
     * Retrieve the given character&#39;s wallet journal going 30 days back  --- Alternate route: &#x60;/dev/characters/{character_id}/wallet/journal/&#x60;  Alternate route: &#x60;/v4/characters/{character_id}/wallet/journal/&#x60;  --- This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdWalletJournalTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdWalletJournal200Ok> response = api.getCharactersCharacterIdWalletJournal(characterId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get wallet transactions
     *
     * Get wallet transactions of a character  --- Alternate route: &#x60;/dev/characters/{character_id}/wallet/transactions/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/wallet/transactions/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/wallet/transactions/&#x60;  --- This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdWalletTransactionsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        Long fromId = null;
        String ifNoneMatch = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdWalletTransactions200Ok> response = api.getCharactersCharacterIdWalletTransactions(characterId, datasource, fromId, ifNoneMatch, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Returns a corporation&#39;s wallet balance
     *
     * Get a corporation&#39;s wallets  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/wallets/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/wallets/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/wallets/&#x60;  --- This route is cached for up to 300 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdWalletsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdWallets200Ok> response = api.getCorporationsCorporationIdWallets(corporationId, datasource, ifNoneMatch, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation wallet journal
     *
     * Retrieve the given corporation&#39;s wallet journal for the given division going 30 days back  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/wallets/{division}/journal/&#x60;  Alternate route: &#x60;/v3/corporations/{corporation_id}/wallets/{division}/journal/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdWalletsDivisionJournalTest() throws ApiException {
        Integer corporationId = null;
        Integer division = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdWalletsDivisionJournal200Ok> response = api.getCorporationsCorporationIdWalletsDivisionJournal(corporationId, division, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation wallet transactions
     *
     * Get wallet transactions of a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/wallets/{division}/transactions/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/wallets/{division}/transactions/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/wallets/{division}/transactions/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdWalletsDivisionTransactionsTest() throws ApiException {
        Integer corporationId = null;
        Integer division = null;
        String datasource = null;
        Long fromId = null;
        String ifNoneMatch = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdWalletsDivisionTransactions200Ok> response = api.getCorporationsCorporationIdWalletsDivisionTransactions(corporationId, division, datasource, fromId, ifNoneMatch, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}