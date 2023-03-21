package com.adventuresquad.service;

import java.util.List;
import com.adventuresquad.model.Adventure;


public interface AdventureService {
  //Our CRUD Methods
  
  //Get all uers READ
  public List<Adventure> getAllAdventures();
  
  //Post a player, CREATE
  public Adventure saveAdventure(Adventure adventure);
  
  //Update a player, UPDATE
  public Adventure updateAdventure(Adventure adventure, int Id);
  

}
