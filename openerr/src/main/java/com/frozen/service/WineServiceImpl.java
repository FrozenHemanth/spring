package com.frozen.service;

import com.frozen.dto.WineDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class WineServiceImpl implements WineService {
    public WineServiceImpl() {
        System.out.println("WineServiceImpl object created.");
    }
    @Override
    public boolean saveAndValidate(WineDTO wineDTO) {
      if (wineDTO != null) {
            System.out.println("validateandSave() method called in WineServiceImpl.");
            return true;
        }
        return false;
    }
}
