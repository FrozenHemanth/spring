package com.frozen.wine.service;

import com.frozen.wine.dto.WineDTO;
import org.springframework.stereotype.Service;

@Service
public interface WineService {
    public boolean saveAndValidate(WineDTO wineDTO);
}
