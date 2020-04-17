package com.theidentityhub.model;

/**
 * The Class VerifyResult.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
public class VerifyResult {

     /** The audience. */
     private String audience;

     /** The scope. */
     private String scope;

     /** The expires_in. */
     private int expires_in;

     /** The resource_owner_identity_verified. */
     private boolean resource_owner_identity_verified;

     /** The error. */
     private String error;

     /**
      * Instantiates a new verify result.
      * 
      * @param audience
      *             the audience
      * @param scope
      *             the scope
      * @param expires_in
      *             the expires_in
      * @param resource_owner_identity_verified
      *             the resource_owner_identity_verified
      * @param error
      *             the error
      */
     public VerifyResult(String audience, String scope, int expires_in,
               boolean resource_owner_identity_verified, String error) {
          super();
          audience = audience;
          scope = scope;
          expires_in = expires_in;
          resource_owner_identity_verified = resource_owner_identity_verified;
          error = error;
     }

     /**
      * Gets the audience.
      * 
      * @return the audience
      */
     public String getAudience() {
          return audience;
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
      * Gets the expires_in.
      * 
      * @return the expires_in
      */
     public int getExpires_in() {
          return expires_in;
     }

     /**
      * Checks if is resource_owner_identity_verified.
      * 
      * @return true, if is resource_owner_identity_verified
      */
     public boolean isResource_owner_identity_verified() {
          return resource_owner_identity_verified;
     }

     /**
      * Gets the error.
      * 
      * @return the error
      */
     public String getError() {
          return error;
     }

}
