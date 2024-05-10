package com.example.lab6gtics.Repository;

import com.example.lab6gtics.Entity.Device;
import com.example.lab6gtics.Entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteRepository  extends JpaRepository<Site, Integer>  {
}
