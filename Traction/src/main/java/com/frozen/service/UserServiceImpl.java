package com.frozen.service;

import com.frozen.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

public UserServiceImpl() {
        System.out.println("UserServiceImpl object created.");
}

    @Override
    public Boolean validateandSave() {
        return null;
    }
}
