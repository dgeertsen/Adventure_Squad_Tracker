package com.adventuresquad.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.adventuresquad.model.User;
import com.adventuresquad.service.UserService;



@RestController
@RequestMapping("/adventure_squad/user")
public class UserController {
  
  private UserService userService;
  @Autowired
  public UserController(UserService userService) {
    super();
    this.userService=userService;
  }

  @GetMapping
  public List<User> getAllUsers(){
      return userService.getAllUsers();
  }
  
  @GetMapping("{user_id}")
  public ResponseEntity<User> getuserById(@PathVariable("user_id") int userId){
      return new ResponseEntity<User>(userService.getUserById(userId), HttpStatus.OK);
  }
  @PostMapping
  public ResponseEntity<User> saveUser(@RequestBody User user){
      return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
  }
  
  @PutMapping("{user_id}")
  public ResponseEntity<User> updateuser(@PathVariable("user_id") int userId, @RequestBody User user){
      return new ResponseEntity<User>(userService.updateUser(user, userId), HttpStatus.OK);
  }
  
  @DeleteMapping("{user_id}")
  public ResponseEntity<String> deleteuser(@PathVariable("user_id") int userId){
      userService.deleteUser(userId);
      return new ResponseEntity<String>("Adventurer has been deleted.", HttpStatus.OK);
  }
  
}
