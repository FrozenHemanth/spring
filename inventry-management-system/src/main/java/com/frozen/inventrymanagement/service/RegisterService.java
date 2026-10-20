package com.frozen.inventrymanagement.service;

import com.frozen.inventrymanagement.dto.RegisterDTO;

public interface RegisterService {
    public boolean validateAndSave(RegisterDTO registerDTO);
}
