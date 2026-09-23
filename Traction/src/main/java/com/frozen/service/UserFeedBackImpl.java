package com.frozen.service;

public class UserFeedBackImpl implements UserFeedBackService
{
public UserFeedBackImpl() {
        System.out.println("UserFeedBackImpl object created.");
    }
    @Override
    public Boolean validateandSave() {
        System.out.println("validateandSave() method called in UserFeedBackImpl.");
        return true;
    }
}
