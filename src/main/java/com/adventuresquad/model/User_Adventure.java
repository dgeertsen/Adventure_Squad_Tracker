/*
 * This code defines a Java class named User_Adventure, 
 * which represents a user_adventure entity in the adventure_squad database.
 * 
 * @Author: Devon Geertsen
 * @Date: 3/18/2023
 */

package com.adventuresquad.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user_adventure")
public class User_Adventure {
  //Primary Key
  @Id
  private int adventure_id;
  private int location_id;
}
