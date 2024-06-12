package com.example.homeappliances.service;

import com.example.homeappliances.exception.ApplianceNotFoundException;
import com.example.homeappliances.model.Appliance;
import com.example.homeappliances.repository.ApplianceRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@AllArgsConstructor
public class ApplianceService {
    private final ApplianceRepository applianceRepository;
    public UUID createAppliance(Appliance appliance) {
        var savedAppliance = applianceRepository.save(appliance);
        return savedAppliance.getId();
    }

    public UUID updateAppliance(Appliance appliance) {
        var updatedAppliance = applianceRepository.save(appliance);
        return updatedAppliance.getId();
    }

    public void searchAppliance(Appliance appliance) {
        //TODO: implement search functionality
    }

    public boolean deleteAppliance(UUID applianceId) {
        applianceRepository.deleteById(applianceId);
        return true;
    }

    public Appliance getApplianceById(UUID applianceId) {
        return applianceRepository.findById(applianceId)
                .orElseThrow(() -> new ApplianceNotFoundException("Appliance not found for ID "+applianceId));
    }

    public List<Appliance> getAllAppliances() {
        return applianceRepository.findAll();
    }
}
