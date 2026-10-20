package com.frozen.inventrymanagement.service;

import com.frozen.inventrymanagement.dto.RegisterDTO;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Override
    public boolean validateAndSave(RegisterDTO registerDTO) {
        return false;
    }
}
