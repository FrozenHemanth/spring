package com.frozen.wine.service;

import com.frozen.wine.dto.WineDTO;
import com.frozen.wine.entity.WineEntity;
import com.frozen.wine.repo.WineRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Component
public class WineServiceImpl implements WineService {
    @Autowired
    private WineRepository wineRepository;

    public WineServiceImpl() {
        System.out.println("WineServiceImpl object created.");
    }
    @Override
    public boolean saveAndValidate(WineDTO wineDTO) {
      if (wineDTO != null) {
            System.out.println("validateandSave() method called in WineServiceImpl.");
          WineEntity wineEntity = new WineEntity();
          BeanUtils.copyProperties(wineDTO, wineEntity);
          wineRepository.save(wineEntity);
          return true;
        }
        return false;
    }
    @Override
    public List<WineDTO> findAll() {
        System.out.println("findAll() method called in WineServiceImpl.");
        List<WineEntity> wineEntities = wineRepository.findAll();
        if (wineEntities != null && !wineEntities.isEmpty()) {
            System.out.println("Found " + wineEntities.size() + " wine entities.");
            return wineEntities
                    .stream()
                    .map(wineEntity -> {

                        WineDTO wineDTO = new WineDTO();
                        BeanUtils.copyProperties(wineEntity, wineDTO);
                        return wineDTO;
                    })
                    .collect(Collectors.toList());


        } else {
            System.out.println("No wine entities found in Database.");

            return java.util.Collections.emptyList();
        }

    }

    @Override
    public WineDTO findById(int id) {
        System.out.println("findById() method called in WineServiceImpl for id: " + id);
        if (id > 0) {
            System.out.println("Valid id provided: " + id);
            Optional<WineEntity> optionalWineEntity = wineRepository.findById(id);
            if (optionalWineEntity.isPresent()) {
                System.out.println("Wine entity found for id: " + id);
                WineEntity wineEntity = optionalWineEntity.get();
                WineDTO wineDTO = new WineDTO();
                BeanUtils.copyProperties(wineEntity, wineDTO);
                return wineDTO;
            } else {
                System.out.println("No wine entity found for id: " + id);
            }
        }
        return null;
    }
}

