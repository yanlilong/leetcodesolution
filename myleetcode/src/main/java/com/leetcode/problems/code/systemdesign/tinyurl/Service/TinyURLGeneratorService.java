package com.leetcode.problems.code.systemdesign.tinyurl;

import java.util.Random;

import com.leetcode.problems.code.systemdesign.tinyurl.domain.Url;
import com.leetcode.problems.code.systemdesign.tinyurl.repository.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 535. Encode and Decode TinyURL bloomfilter
 */

  @Service
public class TinyURLGeneratorService {

  public String keySource = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

  public String urlString = "http://myurlgenerator/";
 @Autowired
  private URLRepository urlRepository;

  public String getValue() {
    StringBuilder builder = new StringBuilder();
    Random random = new Random();
    int index = 0;
    while (builder.length() < 6) {
      index = random.nextInt(keySource.length());
      builder.append(keySource.charAt(index));
    }
    return builder.toString();
  }

  public boolean findUrl(String longURL) {
    boolean hasURL = false;
    Url url = urlRepository.findBylongURL(longURL);
    if (url != null) {
      hasURL = true;
    }

    return hasURL;

  }


  public String encodeLongUrl(String longURL) {
    String value = null;

    if (!findUrl(longURL)) {
      value = urlString + getValue().toString();


    } else {

      Url url = urlRepository.findBylongURL(longURL);
      if (url != null) {
        value = urlString + url.getShortURL();
      }

    }
    return value;
  }

  public  String decodeShortUrl(String shortURL) {
    Url url = urlRepository.findByshortURL(shortURL);
    if (url != null) {
      return url.getLongURL();
    } else {
      return null;
    }

  }
  

  /**public static void main(String[] args) {

   System.out.println(getValue());
   String tinyURL = EnDeCodeTinyURL
   .encodeLongUrl("https://docs.oracle.com/javase/7/docs/api/java/net/URL.html");
   System.out.println("tinURL=" + tinyURL);
   System.out.println("longURL" + decodeShortUrl(tinyURL));

   tinyURL = EnDeCodeTinyURL.encodeLongUrl(
   "https://stackoverflow.com/questions/41107/how-to-generate-a-random-alpha-numeric-string");
   System.out.println("tinURL=" + tinyURL);
   System.out.println("longURL" + decodeShortUrl(tinyURL));

   }*/

}