package com.frozen.service;

import com.frozen.dto.WineDTO;
import org.springframework.stereotype.Service;

@Service
public interface WineService {
    public boolean saveAndValidate(WineDTO wineDTO);
}
