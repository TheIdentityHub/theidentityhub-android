package com.theidentityhub.model;

/**
 * The Class Profile.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
public class Profile {

     /** The display name. */
     private String displayName;

     /** The email address. */
     private String emailAddress;

     /** The email address verified. */
     private boolean emailAddressVerified;

     /** The given name. */
     private String givenName;

     /** The identity id. */
     private String identityId;

     /** The large pictures. */
     private String[] largePictures;

     /** The medium pictures. */
     private String[] mediumPictures;

     /** The picture. */
     private String picture;

     /** The small pictures. */
     private String[] smallPictures;

     /** The surname. */
     private String surname;

     /** The user name. */
     private String userName;

     // not in constructor
     /** The email addresses. */
     private String[] emailAddresses;

     /** The given names. */
     private String[] givenNames;

     /** The localities. */
     private String[] localities;

     /** The surnames. */
     private String[] surnames;

     /** The is editable. */
     private boolean isEditable;

     /** The locality. */
     private String locality;

     /** The private personal identifier. */
     private String privatePersonalIdentifier;

     /**
      * Instantiates a new profile.
      * 
      * @param displayName
      *             the display name
      * @param emailAddress
      *             the email address
      * @param emailAddressVerified
      *             the email address verified
      * @param givenName
      *             the given name
      * @param identityId
      *             the identity id
      * @param largePictures
      *             the large pictures
      * @param mediumPictures
      *             the medium pictures
      * @param picture
      *             the picture
      * @param smallPictures
      *             the small pictures
      * @param surname
      *             the surname
      * @param userName
      *             the user name
      */
     public Profile(String displayName, String emailAddress,
               boolean emailAddressVerified, String givenName,
               String identityId, String[] largePictures,
               String[] mediumPictures, String picture, String[] smallPictures,
               String surname, String userName) {
          super();
          displayName = displayName;
          emailAddress = emailAddress;
          emailAddressVerified = emailAddressVerified;
          givenName = givenName;
          identityId = identityId;
          largePictures = largePictures;
          mediumPictures = mediumPictures;
          picture = picture;
          smallPictures = smallPictures;
          surname = surname;
          userName = userName;
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
      * Checks if is email address verified.
      * 
      * @return true, if is email address verified
      */
     public boolean isEmailAddressVerified() {
          return emailAddressVerified;
     }

     /**
      * Gets the given name.
      * 
      * @return the given name
      */
     public String getGivenName() {
          return givenName;
     }

     /**
      * Gets the identity id.
      * 
      * @return the identity id
      */
     public String getIdentityId() {
          return identityId;
     }

     /**
      * Gets the large pictures.
      * 
      * @return the large pictures
      */
     public String[] getLargePictures() {
          return largePictures;
     }

     /**
      * Gets the medium pictures.
      * 
      * @return the medium pictures
      */
     public String[] getMediumPictures() {
          return mediumPictures;
     }

     /**
      * Gets the picture.
      * 
      * @return the picture
      */
     public String getPicture() {
          return picture;
     }

     /**
      * Gets the small pictures.
      * 
      * @return the small pictures
      */
     public String[] getSmallPictures() {
          return smallPictures;
     }

     /**
      * Gets the surname.
      * 
      * @return the surname
      */
     public String getSurname() {
          return surname;
     }

     /**
      * Gets the user name.
      * 
      * @return the user name
      */
     public String getUserName() {
          return userName;
     }

     // ------------

     /**
      * Gets the email addresses.
      * 
      * @return the email addresses
      */
     public String[] getEmailAddresses() {
          return emailAddresses;
     }

     /**
      * Sets the email addresses.
      * 
      * @param emailAddresses
      *             the new email addresses
      */
     public void setEmailAddresses(String[] emailAddresses) {
          emailAddresses = emailAddresses;
     }

     /**
      * Gets the given names.
      * 
      * @return the given names
      */
     public String[] getGivenNames() {
          return givenNames;
     }

     /**
      * Sets the given names.
      * 
      * @param givenNames
      *             the new given names
      */
     public void setGivenNames(String[] givenNames) {
          givenNames = givenNames;
     }

     /**
      * Gets the localities.
      * 
      * @return the localities
      */
     public String[] getLocalities() {
          return localities;
     }

     /**
      * Sets the localities.
      * 
      * @param localities
      *             the new localities
      */
     public void setLocalities(String[] localities) {
          localities = localities;
     }

     /**
      * Gets the surnames.
      * 
      * @return the surnames
      */
     public String[] getSurnames() {
          return surnames;
     }

     /**
      * Sets the surnames.
      * 
      * @param surnames
      *             the new surnames
      */
     public void setSurnames(String[] surnames) {
          surnames = surnames;
     }

     /**
      * Checks if is editable.
      * 
      * @return true, if is editable
      */
     public boolean isEditable() {
          return isEditable;
     }

     /**
      * Sets the editable.
      * 
      * @param isEditable
      *             the new editable
      */
     public void setEditable(boolean isEditable) {
          isEditable = isEditable;
     }

     /**
      * Gets the locality.
      * 
      * @return the locality
      */
     public String getLocality() {
          return locality;
     }

     /**
      * Sets the locality.
      * 
      * @param locality
      *             the new locality
      */
     public void setLocality(String locality) {
          locality = locality;
     }

     /**
      * Gets the private personal identifier.
      * 
      * @return the private personal identifier
      */
     public String getPrivatePersonalIdentifier() {
          return privatePersonalIdentifier;
     }

     /**
      * Sets the private personal identifier.
      * 
      * @param privatePersonalIdentifier
      *             the new private personal identifier
      */
     public void setPrivatePersonalIdentifier(String privatePersonalIdentifier) {
          privatePersonalIdentifier = privatePersonalIdentifier;
     }

}
