package com.example.lab6gtics.Repository;

import com.example.lab6gtics.Entity.Device;
import com.example.lab6gtics.Entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository  extends JpaRepository<Location, Integer>  {
}
