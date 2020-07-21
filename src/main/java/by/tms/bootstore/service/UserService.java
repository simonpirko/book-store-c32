package by.tms.bootstore.service;


import by.tms.bootstore.entity.user.Moderator;
import by.tms.bootstore.entity.user.User;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class UserService {

    public void createUser(){
    }


    public void updateUser(long id){
    }

    public void deleteUser(long id){
    }

    public User getUserById(long id){
        return new User();
    }

    public List<User> getUserList(){
        return new ArrayList<User>();
    }

    public void logout(){
    }

    public void createModerator(){
    }

    public void updateModerator(){
    }

    public void deleteModerator(){
    }

    public Moderator getModeratorById(long id){
        return new Moderator();
    }

    public List<Moderator> getModeratorList(){
        return new ArrayList<Moderator>();
    }



}
