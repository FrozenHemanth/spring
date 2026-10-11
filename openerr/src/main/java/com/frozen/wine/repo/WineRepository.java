package com.frozen.wine.repo;

import com.frozen.wine.dto.WineDTO;
import com.frozen.wine.entity.WineEntity;

import java.util.List;

public interface WineRepository {
public boolean save(WineEntity wineEntity);

    List<WineEntity> findAll();
}
