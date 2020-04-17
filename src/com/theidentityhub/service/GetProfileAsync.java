package com.theidentityhub.service;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.theidentityhub.model.Profile;

/**
 * The Class GetProfileAsync executes the rest service and retrieves a
 * {@link Profile} object.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 * 
 */
class GetProfileAsync extends AsyncTask<String, Void, Profile> {

     /*
      * (non-Javadoc)
      * 
      * @see android.os.AsyncTask#doInBackground(java.lang.Object[])
      */
     @Override
     protected Profile doInBackground(String... params) {

          final Gson gson = new Gson();
          final String jsonResult = ApiCall.createGetApiCall(params[0]);
          final Profile profile = gson.fromJson(jsonResult, Profile.class);
          return profile;
     }

     /*
      * (non-Javadoc)
      * 
      * @see android.os.AsyncTask#onPostExecute(java.lang.Object)
      */
     @Override
     protected void onPostExecute(Profile result) {
          super.onPostExecute(result);

          Log.e("test", "RES AS JSON: __ " + result);

     }
}
