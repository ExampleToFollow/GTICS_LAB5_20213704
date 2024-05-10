package com.example.lab6gtics.Repository;

import com.example.lab6gtics.DTO.IntervencionesPorSitio;
import com.example.lab6gtics.Entity.Device;
import com.example.lab6gtics.Entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationRepository  extends JpaRepository<Location, Integer>  {
    @Query(nativeQuery = true, value="select count(TicketID) as cantidad , s.SiteName as sede from ticket t left join site s on t.SiteId = s.SiteId group by s.SiteId")
    List<IntervencionesPorSitio> getIntervencionesPorSitio();
}
