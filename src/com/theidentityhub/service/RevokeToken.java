package com.theidentityhub.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

import android.os.AsyncTask;
import android.util.Log;

/**
 * The class revokes the token that the user is using for authentication.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
class RevokeToken extends AsyncTask<String, Void, Void> {

     /*
      * (non-Javadoc)
      * 
      * @see android.os.AsyncTask#doInBackground(java.lang.Object[])
      */
     @Override
     protected Void doInBackground(String... params) {
          List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();

          nameValuePairs.add(new BasicNameValuePair("token",
                    IdentityConfig.ACCESS_TOKEN));
          nameValuePairs.add(new BasicNameValuePair("client_id",
                    IdentityConfig.CLIENT_ID));

          HttpClient httpclient = new DefaultHttpClient();
          HttpPost httppost = new HttpPost(params[0]);
          httppost.setHeader(HTTP.CONTENT_TYPE,
                    "application/x-www-form-urlencoded;charset=UTF-8");

          try {
               httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs,
                         "UTF-8"));
          } catch (UnsupportedEncodingException e) {
               e.printStackTrace();
          }

          // Execute HTTP Post Request
          try {
               HttpResponse response = httpclient.execute(httppost);
               Log.e("Response:", "Code--->>"
                         + response.getStatusLine().getStatusCode());
          } catch (IOException e) {
               e.printStackTrace();
          }
          return null;
     }

}
