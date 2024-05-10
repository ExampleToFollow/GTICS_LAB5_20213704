package com.example.lab6gtics.Controller;

import com.example.lab6gtics.Entity.Technician;
import org.springframework.stereotype.Controller;
import com.example.lab6gtics.Repository.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {
    final DeviceRepository deviceRepository;
    final LocationRepository locationRepository;
    final SiteRepository siteRepository;
    final TechnicianRepository technicianRepository;
    final TicketRepository ticketRepository;
    public HomeController( DeviceRepository deviceRepository ,LocationRepository locationRepository ,  SiteRepository siteRepository
            ,TechnicianRepository technicianRepository ,  TicketRepository ticketRepository){
        this.deviceRepository = deviceRepository;
        this.locationRepository = locationRepository;
        this.siteRepository = siteRepository;
        this.technicianRepository = technicianRepository;
        this.ticketRepository = ticketRepository;
    }
    @GetMapping("/Home")
    public String hola() {
        return "index";
    }
    @GetMapping("/TecnicosList")
    public String TecnicosList(Model model) {
        model.addAttribute("listaTecnicos",(technicianRepository.findAll()));
        for(Technician t :(technicianRepository.findAll())){
            System.out.println(t.getFirstName());
        }
        System.out.println("TecnicosList");
        return "listaTecnicos";
    }
    @GetMapping("/createTech")
    public String CreateTechnician(Model model , @ModelAttribute("technician") Technician tech){
        return "EditCreateTechnician";
    }



}
