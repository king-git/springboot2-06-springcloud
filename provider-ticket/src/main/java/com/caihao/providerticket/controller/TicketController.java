package com.caihao.providerticket.controller;

import com.caihao.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CaiHao
 * @create 2019-09-08 22:21:46
 */


@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;



    @GetMapping("/ticket")
    public String getticket(){
        return ticketService.getTicket();
    }

}
