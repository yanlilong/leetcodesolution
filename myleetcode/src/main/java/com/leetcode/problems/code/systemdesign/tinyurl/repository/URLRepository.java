package com.leetcode.problems.code.systemdesign.tinyurl.repository;

import java.lang.reflect.Array;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import com.leetcode.problems.code.systemdesign.tinyurl.domain.Url;
import org.springframework.data.jpa.repository.Query;


public interface URLRepository extends CrudRepository<Url, Long> {

  public List<Url> findByLongURL(String longURL);

  public List<Url> findByShortURL(String shortURL);

}
