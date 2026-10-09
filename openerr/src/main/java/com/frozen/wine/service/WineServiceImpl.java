package com.frozen.wine.service;

import com.frozen.wine.dto.WineDTO;
import com.frozen.wine.repo.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
            return wineRepository.save(wineDTO);
        }
        return false;
    }
}
