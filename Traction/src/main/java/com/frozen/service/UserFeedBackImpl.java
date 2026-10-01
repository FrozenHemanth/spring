package com.frozen.service;

import com.frozen.dto.UserFeedBackDTO;
import org.springframework.stereotype.Component;

@Component
public class UserFeedBackImpl implements UserFeedBackService
{
public UserFeedBackImpl() {
        System.out.println("UserFeedBackImpl object created.");
    }
    @Override
    public Boolean validateandSave(UserFeedBackDTO userFeedBackDTO) {
        System.out.println("validateandSave() method called in UserFeedBackImpl.");
        return true;
    }
}
