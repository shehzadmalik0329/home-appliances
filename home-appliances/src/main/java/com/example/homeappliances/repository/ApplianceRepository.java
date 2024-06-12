package com.example.homeappliances.repository;

import com.example.homeappliances.model.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ApplianceRepository extends JpaRepository<Appliance, UUID> {
}
