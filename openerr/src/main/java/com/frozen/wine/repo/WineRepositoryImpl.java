package com.frozen.wine.repo;

import com.frozen.wine.entity.WineEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class WineRepositoryImpl implements WineRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public WineRepositoryImpl() {
        System.out.println("WineRepositoryImpl object created.");
    }

@Override
    public boolean save(WineEntity wineEntity) {
        System.out.println("Running save in WineRepositoryImpl");
        System.out.println("WineEntity details: " + wineEntity.toString());
        entityManager.persist(wineEntity);
        return true;
    }
    @Override
    public List<WineEntity> findAll() {
        System.out.println("Running findAll in WineRepositoryImpl");
        List<WineEntity> wineEntitieslist = entityManager
                .createNamedQuery("WineEntity.findAll", WineEntity.class)
                .getResultList();
        System.out.println("Found " + wineEntitieslist.size() + " wine entities.");
        return wineEntitieslist;
    }
}
