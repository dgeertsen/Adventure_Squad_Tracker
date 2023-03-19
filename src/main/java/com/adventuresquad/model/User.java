/*
 * This code defines a Java class named User, 
 * which represents a user entity in the adventure_squad database.
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
@Table(name="user")
public class User {
  
  //Primary Key
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int user_id;
  
  
  //Other Columns
  @Column(value = "first_name")
  private String first_name;
  @Column(value = "last_name")
  private String last_name;
  @Column(value = "age")
  private int age;

}
