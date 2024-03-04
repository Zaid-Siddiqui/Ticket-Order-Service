package com.DCinema.Ticketorderservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DCinema.Ticketorderservice.Common.TransactionRequest;
import com.DCinema.Ticketorderservice.Common.TransactionResponse;

import com.DCinema.Ticketorderservice.Service.TicketOrderService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/order")
public class CinemaOrderController {
    @Autowired
    private TicketOrderService service;

    @PostMapping("/bookticket")
    public TransactionResponse bookticket(@RequestBody TransactionRequest request) throws JsonProcessingException {
        return service.saveticket(request);
    }

}
