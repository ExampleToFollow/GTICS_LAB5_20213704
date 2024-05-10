package com.example.lab6gtics.Repository;

import com.example.lab6gtics.Entity.Device;
import com.example.lab6gtics.Entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository  extends JpaRepository<Technician, Integer>  {
}
