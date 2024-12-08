package com.java.Coursework01.controller;

import com.java.Coursework01.model.Ticket;
import com.java.Coursework01.service.TicketService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public void addTicket(@RequestBody Ticket ticket) {
        ticketService.saveTicket(ticket);
    }
}
