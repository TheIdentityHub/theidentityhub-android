package com.theidentityhub.model;

/**
 * The Class Token.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
public class Token {

     /** The access_token. */
     private String access_token;

     /** The token_type. */
     private String token_type;

     /** The expires_in. */
     private String expires_in;

     /** The scope. */
     private String scope;

     /** The resource_owner_identity_verified. */
     private int resource_owner_identity_verified;

     /** The refresh_token. */
     private String refresh_token;

     /**
      * Instantiates a new token.
      * 
      * @param access_token
      *             the access_token
      * @param token_type
      *             the token_type
      * @param expires_in
      *             the expires_in
      * @param scope
      *             the scope
      * @param resource_owner_identity_verified
      *             the resource_owner_identity_verified
      */
     public Token(String access_token, String token_type, String expires_in,
               String scope, int resource_owner_identity_verified) {
          super();
          access_token = access_token;
          token_type = token_type;
          expires_in = expires_in;
          scope = scope;
          resource_owner_identity_verified = resource_owner_identity_verified;
     }

     /**
      * Instantiates a new token.
      * 
      * @param access_token
      *             the access_token
      * @param token_type
      *             the token_type
      * @param expires_in
      *             the expires_in
      * @param scope
      *             the scope
      * @param refresh_token
      *             the refresh_token
      */
     public Token(String access_token, String token_type, String expires_in,
               String scope, String refresh_token) {
          super();
          access_token = access_token;
          token_type = token_type;
          expires_in = expires_in;
          scope = scope;
          refresh_token = refresh_token;
     }

     /**
      * Gets the access_token.
      * 
      * @return the access_token
      */
     public String getAccess_token() {
          return access_token;
     }

     /**
      * Gets the token_type.
      * 
      * @return the token_type
      */
     public String getToken_type() {
          return token_type;
     }

     /**
      * Gets the expires_in.
      * 
      * @return the expires_in
      */
     public String getExpires_in() {
          return expires_in;
     }

     /**
      * Gets the scope.
      * 
      * @return the scope
      */
     public String getScope() {
          return scope;
     }

     /**
      * Gets the resource_owner_identity_verified.
      * 
      * @return the resource_owner_identity_verified
      */
     public int getResource_owner_identity_verified() {
          return resource_owner_identity_verified;
     }

     /**
      * Gets the refresh_token.
      * 
      * @return the refresh_token
      */
     public String getRefresh_token() {
          return refresh_token;
     }

}
