package com.theidentityhub.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * The Class ApiCall.
 * 
 * @author Marija Nikolovska
 * @since 1.0
 */
class ApiCall {

     /**
      * Creates {@link HttpGet} request, and the received response is saved and returned as {@link String}.
      * 
      * @param URL
      *             the url.
      * @return the string
      */
     public static String createGetApiCall(final String URL) {
          final StringBuilder stringBuilder = new StringBuilder();
          final HttpClient httpClient = new DefaultHttpClient();
          final HttpGet httpGet = new HttpGet(URL);
          HttpResponse response = null;
          int retry = 0;

          try {
               do {
                    response = httpClient.execute(httpGet);
                    retry++;
                    try {
                         Thread.sleep(1000);
                    } catch (final InterruptedException e) {
                    }
               } while ((response.getStatusLine().getStatusCode() != 200)
                         && (retry <= 2));
               if (response.getStatusLine().getStatusCode() == 200) {

                    final HttpEntity entity = response.getEntity();
                    final InputStream inputStream = entity.getContent();
                    final BufferedReader reader = new BufferedReader(
                              new InputStreamReader(inputStream));
                    String line;
                    while ((line = reader.readLine()) != null) {
                         stringBuilder.append(line);
                    }
                    inputStream.close();
               }

          } catch (final Exception e) {
          }

          return stringBuilder.toString();
     }

}
