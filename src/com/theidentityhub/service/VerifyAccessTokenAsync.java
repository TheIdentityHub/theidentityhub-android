package com.theidentityhub.service;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.theidentityhub.model.VerifyResult;

/**
 * The class verifies the token that the user is using for authentication.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
class VerifyAccessTokenAsync extends AsyncTask<String, Void, Boolean> {

     /*
      * (non-Javadoc)
      * 
      * @see android.os.AsyncTask#doInBackground(java.lang.Object[])
      */
     @Override
     protected Boolean doInBackground(String... params) {
          final Gson gson = new Gson();
          String jsonString = ApiCall.createGetApiCall(params[0]);
          VerifyResult verifyResult = gson.fromJson(jsonString,
                    VerifyResult.class);
          if (verifyResult.getExpires_in() > 0
                    && verifyResult.getError() == null) {
               return true;
          } else {
               return false;
          }
     }

     /*
      * (non-Javadoc)
      * 
      * @see android.os.AsyncTask#onPostExecute(java.lang.Object)
      */
     @Override
     protected void onPostExecute(Boolean result) {
          super.onPostExecute(result);

          Log.e("test", "Verify " + result);

     }
}
