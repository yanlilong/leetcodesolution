package com.leetcode.problems.code.systemdesign.tinyurl.Service;

import com.leetcode.problems.code.systemdesign.tinyurl.repository.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leetcode.problems.code.systemdesign.tinyurl.domain.Url;

import org.apache.log4j.Logger;


@Service
public class TinyURLCRUDService {

  private static final Logger logger = Logger.getLogger(TinyURLCRUDService.class);
  @Autowired
  private URLRepository urlRepository;

  public void createURL(String longURL, String shortURL) {
    if ((longURL != null) && (shortURL != null)) {
      Url url = new Url();
      url.setLongURL(longURL);
      url.setShortURL(shortURL);
      urlRepository.save(url);
      logger.info("save" + shortURL + "   " + longURL + "in database");
    } else {
      logger.info("longURL and shortURL can not be null");
    }
  }

  public void deleteURL(String longURL, String shortURL) {
    if ((longURL != null) && (shortURL != null)) {
      Url url = new Url();
      url.setLongURL(longURL);
      url.setShortURL(shortURL);
      urlRepository.delete(url);
    } else {
      logger.info("longURL and shortURL can not be null");
    }
  }


}
