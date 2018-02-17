package com.leetcode.problems.code.systemdesign.tinyurl.controller;


import com.leetcode.problems.code.systemdesign.tinyurl.Exception.NotFoundException;
import com.leetcode.problems.code.systemdesign.tinyurl.Service.TinyURLGeneratorService;
import com.leetcode.problems.code.systemdesign.tinyurl.Service.TinyURLCRUDService;
import com.leetcode.problems.code.systemdesign.tinyurl.repository.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.Iterator;


import com.leetcode.problems.code.systemdesign.tinyurl.domain.Url;

@Controller
public class TinyURLController {

  @Autowired
  private URLRepository urlRepository;

  @Autowired
  private TinyURLGeneratorService tinyURL;


  @RequestMapping("/myurlgenerator")
  @ResponseBody
  public String getshortURL(String longURL) {
    //EnDeCodeTinyURL tinyURL=new EnDeCodeTinyURL();
    String shortURL = tinyURL.encodeLongUrl(longURL);
    if (shortURL == null) {
      throw new NotFoundException(longURL +" for shortURL has not been calculated");
    }

    return "longURL:=" + longURL + "shortURL:=" + shortURL;
  }

  @RequestMapping(path = "/myurlgenerator/allurls", produces = "application/json;charset=UTF-8")
  @ResponseBody
  public ArrayList<Url> getAllURL() {
    Url url = new Url();
    ArrayList<Url> urlList = new ArrayList<Url>();
    Iterator iter = urlRepository.findAll().iterator();
    if (iter != null) {
      while (iter.hasNext()) {
        urlList.add(((Url) iter.next()));
      }
    } else {
      throw new NotFoundException("NO URL found.");
    }

    return urlList;


  }

}
