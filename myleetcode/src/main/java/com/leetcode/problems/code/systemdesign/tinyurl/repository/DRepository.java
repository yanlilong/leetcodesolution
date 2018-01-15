package com.leetcode.problems.code.systemdesign.tinyurl.repository;

import com.leetcode.problems.code.systemdesign.tinyurl.domain.Identifiable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class DRepository<T extends Identifiable> {

  @Autowired
  private IdGenerator idGenerator;
  private List<T> elements = Collections.synchronizedList(new ArrayList<T>());

  public T create(T element) {
    elements.add(element);
    element.setId(idGenerator.getNextId());
    return element;
  }

  public boolean delete(Long id) {
    return elements.removeIf(element -> element.getId().equals(id));
  }

  public List<T> findAll() {
    return elements;
  }
  public Optional<T> findById(Long id){
    return elements.stream().filter(e->e.getId().equals(id)).findFirst();
  }

}
