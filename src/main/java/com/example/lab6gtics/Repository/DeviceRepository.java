package com.example.lab6gtics.Repository;

import com.example.lab6gtics.DTO.IntervencionesPorSitio;
import com.example.lab6gtics.Entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceRepository extends JpaRepository<Device, Integer> {

}
