package com.theidentityhub.service;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.theidentityhub.model.AccountProvider;
import com.theidentityhub.model.Friend;
import com.theidentityhub.model.Profile;
import com.theidentityhub.model.Role;
import com.theidentityhub.model.Token;

/**
 * The Class IdentityService.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
public class IdentityService {

     /** The client identifier. */
     private String clientId;

     /** The base url. */
     private String baseUrl;

     /** The is authenticated. */
     private boolean isAuthenticated;

     /**
      * Instantiates a new identity service.
      * 
      * @param clientId
      *             the client id
      * @param baseUrl
      *             the base url
      */
     public IdentityService(String clientId, String baseUrl) {
          super();
          this.clientId = clientId;
          this.baseUrl = baseUrl;
          IdentityConfig.config(clientId, baseUrl);
     }

     /**
      * Gets the client identifier.
      * 
      * @return the client identifier
      */
     public String getClientIdentifier() {
          return clientId;
     }

     /**
      * Gets the base url.
      * 
      * @return the base url
      */
     public String getBaseUrl() {
          return baseUrl;
     }

     /**
      * Checks if is authenticated.
      * 
      * @return true, if is authenticated
      */
     public boolean isAuthenticated() {
          return isAuthenticated;
     }

     /**
      * Sets the authenticated.
      * 
      * @param isAuthenticated
      *             the new authenticated
      */
     public void setAuthenticated(boolean isAuthenticated) {
          this.isAuthenticated = isAuthenticated;
     }

     /**
      * This method verifies the received token. Returns true if is valid, false
      * otherwise.
      * 
      * @return true, if successful
      * @throws InterruptedException
      *              the interrupted exception
      * @throws ExecutionException
      *              the execution exception
      */
     public boolean verifyToken() throws InterruptedException,
               ExecutionException {
          return new VerifyAccessTokenAsync().execute(Urls.VERIFY_URI).get();
     }

     /**
      * This method revokes the token, and after this method is called the token
      * is not valid anymore. To get new valid token the user must authenticate
      * again by signing in ({@link #tryAuthenticate(Context)} or
      * {@link #tryAuthenticate(Context, String)}).
      */
     public void signOut() {
          new RevokeToken().execute(Urls.REVOKE_URI);
     }

     /**
      * Returns the profile data for the currently authenticated user.
      * 
      * @return the profile
      * @throws InterruptedException
      *              the interrupted exception
      * @throws ExecutionException
      *              the execution exception
      */
     public Profile getProfile() throws InterruptedException,
               ExecutionException {
          return getProfile(null);
     }

     /**
      * Returns the profile data for the currently authenticated user, for
      * specific identity ID parameter.
      * 
      * @param identityId
      *             the identity id
      * @return the profile
      * @throws InterruptedException
      *              the interrupted exception
      * @throws ExecutionException
      *              the execution exception
      */
     public Profile getProfile(final String identityId)
               throws InterruptedException, ExecutionException {
          if (identityId == null) {
               return new GetProfileAsync().execute(Urls.IDENTITY_URI).get();
          } else {
               Urls.IDENTITY_URI_WITH_ID = baseUrl + Urls.API_ENDPOINT + "/"
                         + identityId + Urls.ACCESS_TOKEN_PARAM;
               return new GetProfileAsync().execute(Urls.IDENTITY_URI_WITH_ID)
                         .get();
          }
     }

     /**
      * Returns the accounts data for the currently authenticated user.
      * 
      * @return the accounts
      * @throws InterruptedException
      *              the interrupted exception
      * @throws ExecutionException
      *              the execution exception
      */
     public ArrayList<AccountProvider> getAccounts()
               throws InterruptedException, ExecutionException {
          return getAccounts(null);
     }

     /**
      * Returns the accounts data for the currently authenticated user, for
      * specific identity ID parameter.
      * 
      * @param identityId
      *             the identity id
      * @return the accounts
      * @throws InterruptedException
      *              the interrupted exception
      * @throws ExecutionException
      *              the execution exception
      */
     public ArrayList<AccountProvider> getAccounts(final String identityId)
               throws InterruptedException, ExecutionException {
          if (identityId == null) {
               return new GetAccountsAsync().execute(Urls.ACCOUNTS_URI).get();
          } else {
               Urls.ACCOUNTS_URI_WITH_ID = baseUrl + Urls.API_ENDPOINT + "/"
                         + identityId + Urls.ACCOUNTS + Urls.ACCESS_TOKEN_PARAM;
               return new GetAccountsAsync().execute(Urls.ACCOUNTS_URI_WITH_ID)
                         .get();
          }
     }

     /**
      * Returns the roles data for the currently authenticated user.
      * 
      * @return the roles
      * @throws InterruptedException
      *              the interrupted exception
      * @throws ExecutionException
      *              the execution exception
      */
     public ArrayList<Role> getRoles() throws InterruptedException,
               ExecutionException {
          return getRoles(null);
     }

     /**
      * Returns the roles data for the currently authenticated user, for
      * specific identity ID parameter.
      * 
      * @param identityId
      *             the identity id
      * @return the roles
      * @throws InterruptedException
      *              the interrupted exception
      * @throws ExecutionException
      *              the execution exception
      */
     public ArrayList<Role> getRoles(final String identityId)
               throws InterruptedException, ExecutionException {
          if (identityId == null) {
               return new GetRolesAsync().execute(Urls.ROLES_URI).get();
          } else {
               Urls.ROLES_URI_WITH_ID = baseUrl + Urls.API_ENDPOINT + "/"
                         + identityId + Urls.ROLES + Urls.ACCESS_TOKEN_PARAM;
               return new GetRolesAsync().execute(Urls.ROLES_URI).get();
          }
     }

     /**
      * Returns the friends data for the currently authenticated user.
      * 
      * @return the friends
      * @throws InterruptedException
      *              the interrupted exception
      * @throws ExecutionException
      *              the execution exception
      */
     public ArrayList<Friend> getFriends() throws InterruptedException,
               ExecutionException {
          return getFriends(null);
     }

     /**
      * Returns the friends data for the currently authenticated user, for
      * specific identity ID parameter.
      * 
      * @param identityId
      *             the identity id
      * @return the friends
      * @throws InterruptedException
      *              the interrupted exception
      * @throws ExecutionException
      *              the execution exception
      */
     public ArrayList<Friend> getFriends(final String identityId)
               throws InterruptedException, ExecutionException {
          if (identityId == null) {
               return new GetFriendsAsync().execute(Urls.FRIENDS_URI).get();
          } else {
               Urls.FRIENDS_URI_WITH_ID = baseUrl + Urls.API_ENDPOINT + "/"
                         + identityId + Urls.FRIENDS + Urls.ACCESS_TOKEN_PARAM
                         + Urls.OFFSET_PARAM + Urls.LIMIT_PARAM;
               return new GetFriendsAsync().execute(Urls.FRIENDS_URI_WITH_ID)
                         .get();
          }
     }

     /**
      * This method tries to authenticate the user by providing list of the
      * accounts the user can use to do the authentication.
      * 
      * @param context
      *             the context
      * @return true, if successful
      */
     public boolean tryAuthenticate(final Context context) {
          return tryAuthenticate(context, null);
     }

     /**
      * This method tries to authenticate the user by opening the specific
      * provider the user should use for authentication, specified with the
      * accountProviderId parameter.
      * 
      * @param context
      *             the context
      * @param accountProviderId
      *             the account provider id
      * @return true, if successful
      */
     public boolean tryAuthenticate(final Context context,
               String accountProviderId) {
          AlertDialog.Builder builder = new AlertDialog.Builder(context);

          WebView wv = new WebView(context);
          wv.getSettings().setJavaScriptEnabled(true);
          wv.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
          builder.setView(wv);
          final AlertDialog alert = builder.create();
          alert.show();
          alert.getWindow()
                    .clearFlags(
                              WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                                        | WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);
          alert.getWindow().setSoftInputMode(
                    WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
          if (accountProviderId != null) {
               wv.loadUrl(Urls.AUTH_URL + Urls.PROVIDER_ID + accountProviderId);// 3136309828983524457
          } else {
               wv.loadUrl(Urls.AUTH_URL);
          }
          wv.setWebViewClient(new WebViewClient() {
               @Override
               public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;
               }
          });
          wv.setWebViewClient(new WebViewClient() {

               @Override
               public void onPageStarted(WebView view, String url,
                         Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    Log.e("web", url);
                    if (url.startsWith(Urls.EXPECTED_AUTH_RESPONSE)) {
                         view.setVisibility(View.GONE);
                         IdentityConfig.ACCESS_TOKEN = parseTokenFromUrl(url)
                                   .getAccess_token();

                         alert.dismiss();
                         IdentityConfig.config(IdentityService.this.clientId,
                                   IdentityService.this.baseUrl);
                         IdentityService.this.isAuthenticated = true;

                    } else {
                         IdentityService.this.isAuthenticated = false;
                    }
               }
          });
          return this.isAuthenticated;

     }

     /**
      * Parses the token from the response url.
      * 
      * @param urlString
      *             the url string
      * @return the token
      */
     private final Token parseTokenFromUrl(String urlString) {
          Uri uri = Uri.parse(urlString);
          final String fragment = uri.getFragment();
          final String[] fragmentArray = fragment.split("&");
          String accessToken = "";
          String tokenType = "";
          String expiresIn = "";
          String scope = "";
          int resourceOwnerIdentityVerified = 0;

          for (int i = 0; i < fragmentArray.length; i++) {
               final String[] paramArray = fragmentArray[i].split("=");
               if (paramArray[0].compareTo("access_token") == 0
                         && paramArray.length > 1) {
                    accessToken = paramArray[1];
               }
               if (paramArray[0].compareTo("token_type") == 0
                         && paramArray.length > 1) {
                    tokenType = paramArray[1];
               }
               if (paramArray[0].compareTo("expires_in") == 0
                         && paramArray.length > 1) {
                    expiresIn = paramArray[1];
               }
               if (paramArray[0].compareTo("scope") == 0
                         && paramArray.length > 1) {
                    scope = paramArray[1];
               }
               if (paramArray[0].compareTo("resource_owner_identity_verified") == 0
                         && paramArray.length > 1) {
                    resourceOwnerIdentityVerified = Integer
                              .parseInt(paramArray[1]);
               }
          }

          final Token token = new Token(accessToken, tokenType, expiresIn,
                    scope, resourceOwnerIdentityVerified);

          return token;
     }
}
