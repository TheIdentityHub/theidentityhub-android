package com.theidentityhub.service;

/**
 * The Class IdentityConfig.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
public class IdentityConfig {

     /** The client id. */
     protected static String CLIENT_ID = "";
     /** The scopes. */
     public static String SCOPES = "";

     /** The state. */
     public static String STATE = "";

     /** The offset. */
     public static String OFFSET = "";

     /** The limit. */
     public static String LIMIT = "";

     /** The access token. */
     public static String ACCESS_TOKEN = "";

     /**
      * This method configures and initializes the urls for the rest services.
      * 
      * @param clientId
      *             the client id
      * @param baseUrl
      *             the base url
      */
     public static void config(String clientId, String baseUrl) {
          IdentityConfig.CLIENT_ID = clientId;
          Urls.ACCESS_TOKEN_PARAM = "?access_token="
                    + IdentityConfig.ACCESS_TOKEN;

          Urls.OFFSET_PARAM = "&offset=" + IdentityConfig.OFFSET;
          Urls.LIMIT_PARAM = "&limit=" + IdentityConfig.LIMIT;
          Urls.EXPECTED_AUTH_RESPONSE = baseUrl
                    + "/completerequest#access_token=";
          Urls.AUTH_URL = baseUrl + Urls.AUTH_ENDPOINT
                    + "?response_type=token&client_id=" + clientId
                    + "&redirect_uri=" + baseUrl + "/completerequest"
                    + "&scope=" + IdentityConfig.SCOPES + "&state="
                    + IdentityConfig.STATE;
          Urls.VERIFY_URI = baseUrl + Urls.VERIFY_ENDPOINT
                    + Urls.ACCESS_TOKEN_PARAM;
          Urls.REVOKE_URI = baseUrl + Urls.REVOKE_ENDPOINT;
          Urls.IDENTITY_URI = baseUrl + Urls.API_ENDPOINT
                    + Urls.ACCESS_TOKEN_PARAM;
          Urls.ACCOUNTS_URI = baseUrl + Urls.API_ENDPOINT + Urls.ACCOUNTS
                    + Urls.ACCESS_TOKEN_PARAM;
          Urls.FRIENDS_URI = baseUrl + Urls.API_ENDPOINT + Urls.FRIENDS
                    + Urls.ACCESS_TOKEN_PARAM + Urls.OFFSET_PARAM
                    + Urls.LIMIT_PARAM;

          Urls.ROLES_URI = baseUrl + Urls.API_ENDPOINT + Urls.ROLES
                    + Urls.ACCESS_TOKEN_PARAM;

     }

}
