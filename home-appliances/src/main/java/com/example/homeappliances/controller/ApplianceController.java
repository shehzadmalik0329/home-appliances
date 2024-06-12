package com.example.homeappliances.controller;

import com.example.homeappliances.model.Appliance;
import com.example.homeappliances.service.ApplianceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/appliances")
@Slf4j
@AllArgsConstructor
public class ApplianceController {
    private final ApplianceService applianceService;

    @PostMapping("/")
    public UUID createAppliance(@RequestBody Appliance appliance) {
        return applianceService.createAppliance(appliance);
    }

    @PutMapping("/")
    public UUID updateAppliance(@RequestBody Appliance appliance) {
        return applianceService.updateAppliance(appliance);
    }

    @DeleteMapping("/{applianceId}")
    public boolean deleteAppliance(@PathVariable("applianceId") UUID applianceId) {
        return applianceService.deleteAppliance(applianceId);
    }
}
