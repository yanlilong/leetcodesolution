package com.leetcode.problems.code.systemdesign.tinyurl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import com.leetcode.problems.code.systemdesign.tinyurl.domain.Url;

@Transactional
public interface URLRepository extends CrudRepository<Url, Long> {


  public Url findBylongUrl(String longURL);

  public Url findByshortUrl(String shortURL);
}
