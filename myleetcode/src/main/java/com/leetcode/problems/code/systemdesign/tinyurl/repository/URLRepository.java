package com.leetcode.problems.code.systemdesign.tinyurl.repository;

import java.lang.reflect.Array;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import com.leetcode.problems.code.systemdesign.tinyurl.domain.Url;

@Transactional

public interface URLRepository extends CrudRepository<Url, Long> {


  public List<Url> findBylongURL(String longURL);

  public List<Url> findByshortURL(String shortURL);
}
