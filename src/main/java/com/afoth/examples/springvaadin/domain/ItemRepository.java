package com.afoth.examples.springvaadin.domain;

import com.vaadin.spring.annotation.VaadinSessionScope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@VaadinSessionScope
public interface ItemRepository extends JpaRepository<Item, Long> {
}
