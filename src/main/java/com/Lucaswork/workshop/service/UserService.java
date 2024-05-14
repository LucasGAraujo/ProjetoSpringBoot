package com.Lucaswork.workshop.service;

import com.Lucaswork.workshop.entities.User;
import com.Lucaswork.workshop.repositorys.UserRepositorys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepositorys repositorys;
    public List<User> findAll() {
        return repositorys.findAll();
    }
    public User findById(Long id) {
        Optional<User> obj = repositorys.findById(id);
        return  obj.get();
    }
}
