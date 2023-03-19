/*
 * This code defines a Java class named Adventure, 
 * which represents a adventure entity in the adventure_squad database.
 * 
 * @Author: Devon Geertsen
 * @Date: 3/18/2023
 */


package com.adventuresquad.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.relational.core.mapping.Column;
import lombok.Data;

@Data
@Entity
@Table(name="adventure")
public class Adventure {
  
  //Primary Key
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int adventure_id;
  
  //Other Columns
  @Column(value = "location_id")
  private int location_id;
  @Column(value = "start_date")
  private Date start_date;
  @Column(value = "end_date")
  private Date end_date; 

}
