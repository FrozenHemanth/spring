package com.frozen.wine.repo;

import com.frozen.wine.dto.WineDTO;
import com.frozen.wine.entity.WineEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.ZoneId;

@Repository
public class WineRepositoryImpl implements WineRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public boolean save(WineDTO wineDTO) {
        System.out.println("Running save in WineRepositoryImpl");
        try {
            WineEntity entity = convertToEntity(wineDTO);
            entityManager.persist(entity);
            entityManager.flush();
            System.out.println("Data saved successfully with ID: " + entity.getId());
            return true;
        } catch (Exception e) {
            System.out.println("Error saving data: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    private WineEntity convertToEntity(WineDTO wineDTO) {
        WineEntity entity = new WineEntity();
        entity.setCompanyName(wineDTO.getCompanyName());
        entity.setCompanyAddress(wineDTO.getCompanyAddress());
        entity.setManufacturerName(wineDTO.getManufacturerName());
        if (wineDTO.getManufactureDate() != null) {
            entity.setManufactureDate(wineDTO.getManufactureDate().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate());
        }
        entity.setAge(wineDTO.getAge());
        entity.setPrice(wineDTO.getPrice());
        return entity;
    }
}
