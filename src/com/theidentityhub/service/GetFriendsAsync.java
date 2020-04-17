package com.theidentityhub.service;

import java.lang.reflect.Type;
import java.util.ArrayList;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.theidentityhub.model.Friend;

/**
 * The Class GetFriendsAsync executes the rest service and retrieves a list of
 * {@link Friend} objects.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
class GetFriendsAsync extends AsyncTask<String, Void, ArrayList<Friend>> {

     /*
      * (non-Javadoc)
      * 
      * @see android.os.AsyncTask#doInBackground(java.lang.Object[])
      */
     @Override
     protected ArrayList<Friend> doInBackground(String... params) {

          final Gson gson = new Gson();
          final Type listType = new TypeToken<ArrayList<Friend>>() {
          }.getType();
          final String jsonResult = ApiCall.createGetApiCall(params[0]);
          final ArrayList<Friend> friends = gson.fromJson(jsonResult, listType);
          return friends;
     }

     /*
      * (non-Javadoc)
      * 
      * @see android.os.AsyncTask#onPostExecute(java.lang.Object)
      */
     @Override
     protected void onPostExecute(ArrayList<Friend> result) {
          super.onPostExecute(result);

          Log.e("test", "RES AS JSON FRIENDS: __ " + result);

     }
}
