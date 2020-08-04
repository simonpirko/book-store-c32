package by.tms.bootstore.service;


import by.tms.bootstore.dao.BookDAO;
import by.tms.bootstore.dao.UserDAO;
import by.tms.bootstore.entity.user.Moderator;
import by.tms.bootstore.entity.user.User;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.jdbc.support.KeyHolder;
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
    public void createUser(User user) {
        KeyHolder keyHolder = userDAO.createUser(user);
    }


    public void updateUser(long id) {
    }

    public void deleteUser(long id) {
    }

    public void deleteUserByEmail(String email){
        userDAO.deleteUserByEmail(email);
    }

    public User getUserById(long id) {
        return userDAO.getUser(id);
    }

    public List<User> getUserList() {
        return userDAO.getAllUsers();
    }

    public void logout() {
    }

    public void createModerator() {
    }

    public void updateModerator() {
    }

    public void deleteModerator() {
    }

    public Moderator getModeratorById(long id) {
        return new Moderator();
    }

    public List<Moderator> getModeratorList() {
        return new ArrayList<Moderator>();
    }


}
