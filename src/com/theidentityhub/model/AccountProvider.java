package com.theidentityhub.model;

/**
 * The Class AccountProvider.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
public class AccountProvider {

     /** The accounts. */
     private Account[] accounts;

     /** The display name. */
     private String displayName;

     /** The provider image url. */
     private String providerImageUrl;

     // not in constructor
     /** The account provider id. */
     private String accountProviderId;

     /** The can add another account. */
     private boolean canAddAnotherAccount;

     /** The is non queryable. */
     private boolean isNonQueryable;

     /** The sign in url. */
     private String signInUrl;

     /**
      * Instantiates a new account provider.
      * 
      * @param accounts
      *             the accounts
      * @param displayName
      *             the display name
      * @param providerImageUrl
      *             the provider image url
      */
     public AccountProvider(Account[] accounts, String displayName,
               String providerImageUrl) {
          super();
          accounts = accounts;
          displayName = displayName;
          providerImageUrl = providerImageUrl;
     }

     /**
      * Gets the accounts.
      * 
      * @return the accounts
      */
     public Account[] getAccounts() {
          return accounts;
     }

     /**
      * Gets the display name.
      * 
      * @return the display name
      */
     public String getDisplayName() {
          return displayName;
     }

     /**
      * Gets the provider image url.
      * 
      * @return the provider image url
      */
     public String getProviderImageUrl() {
          return providerImageUrl;
     }

     /**
      * Gets the account provider id.
      * 
      * @return the account provider id
      */
     public String getAccountProviderId() {
          return accountProviderId;
     }

     /**
      * Sets the account provider id.
      * 
      * @param accountProviderId
      *             the new account provider id
      */
     public void setAccountProviderId(String accountProviderId) {
          accountProviderId = accountProviderId;
     }

     /**
      * Checks if is can add another account.
      * 
      * @return true, if is can add another account
      */
     public boolean isCanAddAnotherAccount() {
          return canAddAnotherAccount;
     }

     /**
      * Sets the can add another account.
      * 
      * @param canAddAnotherAccount
      *             the new can add another account
      */
     public void setCanAddAnotherAccount(boolean canAddAnotherAccount) {
          canAddAnotherAccount = canAddAnotherAccount;
     }

     /**
      * Checks if is non queryable.
      * 
      * @return true, if is non queryable
      */
     public boolean isNonQueryable() {
          return isNonQueryable;
     }

     /**
      * Sets the non queryable.
      * 
      * @param isNonQueryable
      *             the new non queryable
      */
     public void setNonQueryable(boolean isNonQueryable) {
          isNonQueryable = isNonQueryable;
     }

     /**
      * Gets the sign in url.
      * 
      * @return the sign in url
      */
     public String getSignInUrl() {
          return signInUrl;
     }

     /**
      * Sets the sign in url.
      * 
      * @param signInUrl
      *             the new sign in url
      */
     public void setSignInUrl(String signInUrl) {
          signInUrl = signInUrl;
     }

}
