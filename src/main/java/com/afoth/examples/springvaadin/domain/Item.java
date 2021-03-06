package com.afoth.examples.springvaadin.domain;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue
    Long id;
}
