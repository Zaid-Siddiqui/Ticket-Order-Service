package com.DCinema.Ticketorderservice.Common;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TICKET_PAYMENT_TB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    private int paymentId;
    private String transactionId;
    private String paymentStatus;
    private int ticketId;
    private double amount;
}
