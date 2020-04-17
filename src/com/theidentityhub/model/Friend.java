package com.theidentityhub.model;


/**
 * The Class Friend.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
public class Friend {

     /** The display name. */
     private String displayName;

     /** The identity id. */
     private String identityId;

     /** The large pictures. */
     private String[] largePictures;

     /** The medium pictures. */
     private String[] mediumPictures;

     /** The small picture. */
     private String smallPicture;

     /** The small pictures. */
     private String[] smallPictures;

     /**
      * Instantiates a new friend.
      * 
      * @param displayName
      *             the display name
      * @param identityId
      *             the identity id
      * @param largePictures
      *             the large pictures
      * @param mediumPictures
      *             the medium pictures
      * @param smallPicture
      *             the small picture
      * @param smallPictures
      *             the small pictures
      */
     public Friend(String displayName, String identityId,
               String[] largePictures, String[] mediumPictures,
               String smallPicture, String[] smallPictures) {
          super();
          displayName = displayName;
          identityId = identityId;
          largePictures = largePictures;
          mediumPictures = mediumPictures;
          smallPicture = smallPicture;
          smallPictures = smallPictures;
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
      * Gets the small picture.
      * 
      * @return the small picture
      */
     public String getSmallPicture() {
          return smallPicture;
     }

     /**
      * Gets the small pictures.
      * 
      * @return the small pictures
      */
     public String[] getSmallPictures() {
          return smallPictures;
     }

}
