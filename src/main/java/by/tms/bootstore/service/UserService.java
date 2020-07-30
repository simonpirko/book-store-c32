package by.tms.bootstore.service;


import by.tms.bootstore.dao.BookDAO;
import by.tms.bootstore.dao.UserDAO;
import by.tms.bootstore.entity.user.Moderator;
import by.tms.bootstore.entity.user.User;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    private final UserDAO userDAO;
    private final ModelMapper modelMapper;


    public UserService(UserDAO userDAO, ModelMapper modelMapper) {
        this.userDAO = userDAO;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public void createUser(User user){
        userDAO.createUser(user);
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
