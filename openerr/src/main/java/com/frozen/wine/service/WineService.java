package com.frozen.wine.service;

import com.frozen.wine.dto.WineDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WineService {
    public boolean saveAndValidate(WineDTO wineDTO);
    List<WineDTO> findAll();

    WineDTO findById(int id);
}
