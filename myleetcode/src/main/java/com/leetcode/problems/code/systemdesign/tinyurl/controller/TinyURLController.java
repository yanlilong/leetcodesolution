package com.leetcode.problems.code.systemdesign.tinyurl.controller;


import com.leetcode.problems.code.systemdesign.tinyurl.repository.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leetcode.problems.code.systemdesign.tinyurl.EnDeCodeTinyURL;
import com.leetcode.problems.code.systemdesign.tinyurl.domain.Url;

@Controller
public class TinyURLController {
  private static URLRepository urlRepository;

  @Autowired
  @RequestMapping("/myurlgenerator")
  @ResponseBody
  public String getLongURL(String longURL) {
    String shortURL = EnDeCodeTinyURL.encodeLongUrl(longURL);
    Url url = new Url();
    url.setLongURL(longURL);
    url.setShortURL(shortURL);
    urlRepository.save(url);
    return "longURL:=" + longURL + "shortURL:=" + shortURL;
  }


}
