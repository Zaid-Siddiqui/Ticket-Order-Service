package com.DCinema.Ticketorderservice.Common;

import com.DCinema.Ticketorderservice.Entity.CinemaOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponse {
    private CinemaOrder ticket;
    private Double amount;
    private String transactionId;
    private String message;

}
