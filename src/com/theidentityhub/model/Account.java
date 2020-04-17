package com.theidentityhub.model;

/**
 * The Account class contains basic data about the user such as id, name email
 * address, picture URL etc..
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
public class Account {

     /** The account id. */
     private String accountId;

     /** The display name of the account. */
     private String displayName;

     /** The email address. */
     private String emailAddress;

     /** The picture url. */
     private String pictureUrl;

     // not in constructor
     /** The account private personal identifier. */
     private String accountPrivatePersonalIdentifier;

     /** The account profile url. */
     private String accountProfileUrl;

     /** The cannot proceed account already linked. */
     private boolean cannotProceedAccountAlreadyLinked;

     /** The cannot proceed already non queryable account. */
     private boolean cannotProceedAlreadyNonQueryableAccount;

     /** The cannot proceed error occured. */
     private boolean cannotProceedErrorOccured;

     /** The cannot proceed link account canceled. */
     private boolean cannotProceedLinkAccountCanceled;

     /** The return url. */
     private String returnUrl;

     /**
      * Constructor with parameters.
      * 
      * @param accountId
      *             the account identifier
      * @param displayName
      *             the display name
      * @param emailAddress
      *             the email address
      * @param pictureUrl
      *             the picture url
      */
     public Account(String accountId, String displayName, String emailAddress,
               String pictureUrl) {
          super();
          accountId = accountId;
          displayName = displayName;
          emailAddress = emailAddress;
          pictureUrl = pictureUrl;
     }

     /**
      * Gets the account identifier.
      * 
      * @return the account id
      */
     public String getAccountId() {
          return accountId;
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
      * Gets the email address.
      * 
      * @return the email address
      */
     public String getEmailAddress() {
          return emailAddress;
     }

     /**
      * Gets the picture url.
      * 
      * @return the picture url
      */
     public String getPictureUrl() {
          return pictureUrl;
     }

     /**
      * Gets the account private personal identifier.
      * 
      * @return the account private personal identifier
      */
     public String getAccountPrivatePersonalIdentifier() {
          return accountPrivatePersonalIdentifier;
     }

     /**
      * Sets the account private personal identifier.
      * 
      * @param accountPrivatePersonalIdentifier
      *             the new account private personal identifier
      */
     public void setAccountPrivatePersonalIdentifier(
               String accountPrivatePersonalIdentifier) {
          accountPrivatePersonalIdentifier = accountPrivatePersonalIdentifier;
     }

     /**
      * Gets the account profile url.
      * 
      * @return the account profile url
      */
     public String getAccountProfileUrl() {
          return accountProfileUrl;
     }

     /**
      * Sets the account profile url.
      * 
      * @param accountProfileUrl
      *             the new account profile url
      */
     public void setAccountProfileUrl(String accountProfileUrl) {
          accountProfileUrl = accountProfileUrl;
     }

     /**
      * Checks if is cannot proceed account already linked.
      * 
      * @return true, if is cannot proceed account already linked
      */
     public boolean isCannotProceedAccountAlreadyLinked() {
          return cannotProceedAccountAlreadyLinked;
     }

     /**
      * Sets the cannot proceed account already linked.
      * 
      * @param cannotProceedAccountAlreadyLinked
      *             the new cannot proceed account already linked
      */
     public void setCannotProceedAccountAlreadyLinked(
               boolean cannotProceedAccountAlreadyLinked) {
          cannotProceedAccountAlreadyLinked = cannotProceedAccountAlreadyLinked;
     }

     /**
      * Checks if is cannot proceed already non queryable account.
      * 
      * @return true, if is cannot proceed already non queryable account
      */
     public boolean isCannotProceedAlreadyNonQueryableAccount() {
          return cannotProceedAlreadyNonQueryableAccount;
     }

     /**
      * Sets the cannot proceed already non queryable account.
      * 
      * @param cannotProceedAlreadyNonQueryableAccount
      *             the new cannot proceed already non queryable account
      */
     public void setCannotProceedAlreadyNonQueryableAccount(
               boolean cannotProceedAlreadyNonQueryableAccount) {
          cannotProceedAlreadyNonQueryableAccount = cannotProceedAlreadyNonQueryableAccount;
     }

     /**
      * Checks if is cannot proceed error occured.
      * 
      * @return true, if is cannot proceed error occured
      */
     public boolean isCannotProceedErrorOccured() {
          return cannotProceedErrorOccured;
     }

     /**
      * Sets the cannot proceed error occured.
      * 
      * @param cannotProceedErrorOccured
      *             the new cannot proceed error occured
      */
     public void setCannotProceedErrorOccured(boolean cannotProceedErrorOccured) {
          cannotProceedErrorOccured = cannotProceedErrorOccured;
     }

     /**
      * Checks if is cannot proceed link account canceled.
      * 
      * @return true, if is cannot proceed link account canceled
      */
     public boolean isCannotProceedLinkAccountCanceled() {
          return cannotProceedLinkAccountCanceled;
     }

     /**
      * Sets the cannot proceed link account canceled.
      * 
      * @param cannotProceedLinkAccountCanceled
      *             the new cannot proceed link account canceled
      */
     public void setCannotProceedLinkAccountCanceled(
               boolean cannotProceedLinkAccountCanceled) {
          cannotProceedLinkAccountCanceled = cannotProceedLinkAccountCanceled;
     }

     /**
      * Gets the return url.
      * 
      * @return the return url
      */
     public String getReturnUrl() {
          return returnUrl;
     }

     /**
      * Sets the return url.
      * 
      * @param returnUrl
      *             the new return url
      */
     public void setReturnUrl(String returnUrl) {
          returnUrl = returnUrl;
     }

}
