package com.caihao.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * @author CaiHao
 * @create 2019-09-08 22:20:00
 */

@Service
public class TicketService {

    public String getTicket(){
        System.err.println("端口号======8001");
        return "《猛龙过江》";
    }

}
