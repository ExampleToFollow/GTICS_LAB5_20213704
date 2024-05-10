package com.example.lab6gtics.Repository;

import com.example.lab6gtics.Entity.Device;
import com.example.lab6gtics.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository  extends JpaRepository<Ticket, Integer>  {
}
