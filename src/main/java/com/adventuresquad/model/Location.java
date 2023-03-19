/*
 * This code defines a Java class named Location, 
 * which represents a location entity in the adventure_squad database.
 * 
 * @Author: Devon Geertsen
 * @Date: 3/18/2023
 */


package com.adventuresquad.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.relational.core.mapping.Column;
import lombok.Data;

@Data
@Entity
@Table(name="location")
public class Location {
  
  //Primary Key
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int location_id;

  //Other Columns
  @Column(value = "city")
  private String city;
  @Column(value = "state_province")
  private String state_province;
  @Column(value = "country")
  private String country;
}
