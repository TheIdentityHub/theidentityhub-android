package com.theidentityhub.service;

import java.lang.reflect.Type;
import java.util.ArrayList;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.theidentityhub.model.AccountProvider;

/**
 * The Class GetAccountsAsync executes the rest service and retrieves a list of
 * {@link AccountProvider} objects.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
class GetAccountsAsync extends
          AsyncTask<String, Void, ArrayList<AccountProvider>> {

     /*
      * (non-Javadoc)
      * 
      * @see android.os.AsyncTask#doInBackground(java.lang.Object[])
      */
     @Override
     protected ArrayList<AccountProvider> doInBackground(String... params) {

          final Gson gson = new Gson();
          final Type listType = new TypeToken<ArrayList<AccountProvider>>() {
          }.getType();
          final String jsonResult = ApiCall.createGetApiCall(params[0]);
          final ArrayList<AccountProvider> accountProvider = gson.fromJson(
                    jsonResult, listType);
          return accountProvider;
     }

     /*
      * (non-Javadoc)
      * 
      * @see android.os.AsyncTask#onPostExecute(java.lang.Object)
      */
     @Override
     protected void onPostExecute(ArrayList<AccountProvider> result) {
          super.onPostExecute(result);

          Log.e("test", "RES AS JSON ACCOUNTS: __ " + result);

     }
}
