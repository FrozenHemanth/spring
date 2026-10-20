package com.frozen.inventrymanagement.repository;

import com.frozen.inventrymanagement.entity.RegisterEntity;

public interface RegisterRepository {
    public boolean save(RegisterEntity registerEntity);
}