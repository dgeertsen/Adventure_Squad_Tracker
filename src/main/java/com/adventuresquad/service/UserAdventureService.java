package com.adventuresquad.service;

import java.util.List;
import com.adventuresquad.model.UserAdventure;


public interface UserAdventureService {
  //Our CRUD Methods
  
  //Get all UserAdventures READ
  public List<UserAdventure> getAllUserAdventures();
  
  //Update a UserAdventure, UPDATE
  public UserAdventure updateUserAdventure(UserAdventure userAdventure, int Id);
  

}
