package com.frozen.service;

import com.frozen.dto.RegisterDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class RegisterServiceImpl implements RegisterService {
public RegisterServiceImpl() {
        System.out.println("RegisterServiceImpl object created.");
    }
    @Override
    public boolean validateandSave(RegisterDTO registerDTO) {
        System.out.println("validateandSave() method called in RegisterServiceImpl.");
        return true;
    }
}
