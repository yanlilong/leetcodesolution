package com.leetcode.problems.code.systemdesign.tinyurl.controller;


import com.leetcode.problems.code.systemdesign.tinyurl.exception.runtime.ShortURLNotFoundException;
import com.leetcode.problems.code.systemdesign.tinyurl.exception.URLNotFoundException;
import com.leetcode.problems.code.systemdesign.tinyurl.Service.TinyURLGeneratorService;
import com.leetcode.problems.code.systemdesign.tinyurl.repository.URLRepository;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.util.AntPathMatcher;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;
import com.leetcode.problems.code.systemdesign.tinyurl.domain.Url;
import org.springframework.web.servlet.HandlerMapping;

@RestController
@RequestMapping("/myurlgenerator")
public class TinyURLController {

  static Logger logger = Logger.getLogger(TinyURLController.class.getName());

  private URLRepository urlRepository;

  private TinyURLGeneratorService tinyURL;

  @Autowired
  public TinyURLController(URLRepository urlRepository, TinyURLGeneratorService tinyURL) {
    this.urlRepository = urlRepository;
    this.tinyURL = tinyURL;
  }

  @GetMapping("/getshorturl/**")
  public String getshortURL(HttpServletRequest request) throws ShortURLNotFoundException {
    final String path = request
        .getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE)
        .toString();
    logger.info("path=" + path);

    final String bestMatchingPattern = request
        .getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE).toString();
    logger.info("bestMatchingPattern=" + bestMatchingPattern);

    String arguments = new AntPathMatcher().extractPathWithinPattern(bestMatchingPattern, path);
    String[] argument = arguments.split(":");
    StringBuilder longURL = new StringBuilder();
    longURL.append(argument[0]);
    longURL.append(":/");
    longURL.append(argument[1]);

    logger.info("arguments=" + longURL.toString());

    String shortURL = tinyURL.encodeLongUrl(longURL.toString());
    if (shortURL == null) {
      throw new ShortURLNotFoundException(longURL + "for shortURL has not been calculated");
    }
    return shortURL;
  }

  @PostMapping("/getshorturl/")
  public String getshortURL(@RequestBody Url url) throws Exception {
    if (null == url) {
      throw new ShortURLNotFoundException("shortURL has not been calculated");
    }
    if (url.getLongURL() == null) {
      logger.error("NO LongURL in Request");
    }
    String shortURL = null;
    if (url.getLongURL() != null) {
      shortURL = tinyURL.encodeLongUrl(url.getLongURL().toString());
    }
    return shortURL;
  }

  @GetMapping("/allurls")
  public ArrayList<Url> getAllURL() throws URLNotFoundException {
    Url url = new Url();
    ArrayList<Url> urlList = new ArrayList<Url>();
    Iterator iter = urlRepository.findAll().iterator();
    if (iter == null) {
      throw new URLNotFoundException("NO URL found.");
    }
    while (iter.hasNext()) {
      urlList.add(((Url) iter.next()));
    }
    return urlList;


  }

}
