package com.frozen.service;

public class RegisterServiceImpl implements RegisterService {
public RegisterServiceImpl() {
        System.out.println("RegisterServiceImpl object created.");
    }
    @Override
    public Boolean validateandSave() {
        System.out.println("validateandSave() method called in RegisterServiceImpl.");
        return true;
    }
}
