package com.DCinema.Ticketorderservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TICKET_ORDER_TB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CinemaOrder {
    @Id
    @GeneratedValue
    private int orderId;
    private int ticketId;
    private String moviename;
    private String customername;
    private int ticketqantity;
    private int price;
    private double amount;

}
