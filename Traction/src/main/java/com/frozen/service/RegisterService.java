package com.frozen.service;

import com.frozen.dto.RegisterDTO;

public interface RegisterService {
    public boolean validateandSave(RegisterDTO registerDTO);
}
