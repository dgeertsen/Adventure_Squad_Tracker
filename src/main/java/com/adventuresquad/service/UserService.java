package com.adventuresquad.service;

import java.util.List;
import com.adventuresquad.model.User;


public interface UserService {
  //Our crud methods are going to placed
  
  //Get all uers READ
  public List<User> getAllUsers();
  
  //specific, looking by user ID, READ
  public User getUserById(int id);
  
  //Post a player, CREATE
  public User saveUser(User user);
  
  //Update a player, UPDATE
  public User updateUser(User user, int Id);
  
  //Delete a player, DELETE
  public void deleteUser(int Id);
}
