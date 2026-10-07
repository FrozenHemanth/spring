package com.frozen.repo;

import com.frozen.dto.WineDTO;

public class WineRepositoryImpl implements WineRepository {
    @Override
    public boolean save(WineDTO wineDTO) {
        System.out.println("Running save in WineRepositoryImpl");

        return true;
    }
}
