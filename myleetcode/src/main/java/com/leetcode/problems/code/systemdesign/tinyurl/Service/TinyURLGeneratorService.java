package com.leetcode.problems.code.systemdesign.tinyurl.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.leetcode.problems.code.systemdesign.tinyurl.domain.Url;
import com.leetcode.problems.code.systemdesign.tinyurl.repository.URLRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 535. Encode and Decode TinyURL bloomfilter
 */

@Service
public class TinyURLGeneratorService {

  private static final Logger logger = Logger.getLogger(TinyURLGeneratorService.class);

  public String keySource = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

  public String urlString = "http://myurlgenerator/";
  @Autowired
  private URLRepository urlRepository;
  @Autowired
  private TinyURLCRUDService urlcrudService;

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

  public Url findUrl(String longURL) {

    ArrayList<Url> urlList = (ArrayList<Url>) urlRepository.findBylongURL(longURL);
    if (!urlList.isEmpty()) {
      logger.info("url in database saved" + urlList.get(0));
      return urlList.get(0);
    } else {
      return null;
    }


  }


  public String encodeLongUrl(String longURL) {
    String value = null;
    Url url = findUrl(longURL);
    logger.info("url in database saved" + url);

    if (url == null) {
      value = urlString + getValue().toString();
      urlcrudService.createURL(value, longURL);


    } else {
      value = url.getShortURL();

    }
    return value;
  }

  public String decodeShortUrl(String shortURL) {
    ArrayList<Url> urlList = (ArrayList<Url>) urlRepository.findByshortURL(shortURL);
    if (!urlList.isEmpty()) {
      return urlList.get(0).getLongURL();
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