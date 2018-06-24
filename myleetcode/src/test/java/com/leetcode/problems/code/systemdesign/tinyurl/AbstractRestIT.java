package com.leetcode.problems.code.systemdesign.tinyurl;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;


import org.junit.Rule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.springframework.boot.test.web.client.TestRestTemplate;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TinyurlApplication.class}, webEnvironment = WebEnvironment.RANDOM_PORT)
public abstract class AbstractRestIT {

  @Rule
  public WireMockRule wireMockRule = new WireMockRule(wireMockConfig().port(8001));

  @Autowired
  protected TestRestTemplate restTemplate;




}

