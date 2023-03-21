package com.adventuresquad.service;

import java.util.List;
import com.adventuresquad.model.User;


public interface UserService {
  //Our crud methods are going to placed
  
  //Get all uers READ
  public List<User> getAllUsers();
  
  //specific, looking by user ID, READ
  public User getUserById(int id);
  
  //Post a user, CREATE
  public User saveUser(User user);
  
  //Put a user, UPDATE
  public User updateUser(User user, int id);
  
  //Delete a user, DELETE
  public void deleteUser(int id);
}
