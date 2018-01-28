package com.leetcode.problems.code.systemdesign.tinyurl.controller;


import com.leetcode.problems.code.systemdesign.tinyurl.Service.TinyURLGeneratorService;
import com.leetcode.problems.code.systemdesign.tinyurl.Service.TinyURLCRUDService;
import com.leetcode.problems.code.systemdesign.tinyurl.repository.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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

    return "longURL:=" + longURL + "shortURL:=" + shortURL;
  }

  /** @RequestMapping("/myurlgenerator/url")
   @ResponseBody public ArrayList<Url> getAllURL(){
   Url url=new Url();
   ArrayList<Url>urlList=new ArrayList<Url>();
   Iterator iter =urlRepository.findAll().iterator();
   while(iter.hasNext()) {
   urlList.add(((Url) iter.next()));
   }
   return urlList;


   }
   */

}
