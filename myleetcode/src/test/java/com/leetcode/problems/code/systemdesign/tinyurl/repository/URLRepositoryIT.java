package com.leetcode.problems.code.systemdesign.tinyurl.repository;

import com.leetcode.problems.code.systemdesign.tinyurl.domain.Url;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

@Sql
public class URLRepositoryIT {
@Autowired
  private URLRepository urlRepository;

@Test
  public void shouldFindURL(){
  List<Url> urlList=urlRepository.findAll()
}
}
