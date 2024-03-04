package com.DCinema.Ticketorderservice.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.DCinema.Ticketorderservice.Common.Payment;
import com.DCinema.Ticketorderservice.Common.TransactionRequest;
import com.DCinema.Ticketorderservice.Common.TransactionResponse;
import com.DCinema.Ticketorderservice.Entity.CinemaOrder;
import com.DCinema.Ticketorderservice.Repository.CinemaOrderRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@RefreshScope
public class TicketOrderService {

        @Autowired
        private CinemaOrderRepository ticketOrderRepository;
        @Autowired
        @Lazy
        private RestTemplate template;

        @Value("${microservice.payment-service.endpoints.endpoint.uri}")

        private String ENDPOINT_URL;
        private Logger log = LoggerFactory.getLogger(TicketOrderService.class);

        public TransactionResponse saveticket(TransactionRequest request) throws JsonProcessingException {
                String response = "";
                CinemaOrder ticket = request.getTicket();
                Payment payment = request.getPayment();
                payment.setAmount(ticket.getAmount());
                payment.setTicketId(ticket.getTicketId());

                log.info("TicketOrderService Request: {}", new ObjectMapper().writeValueAsString(request));

                Payment paymentResponse = template.postForObject(ENDPOINT_URL, payment,
                                Payment.class);

                log.info("Payment-Service Response from TicketOrderService Rest call : {}",
                                new ObjectMapper().writeValueAsString(paymentResponse));

                response = paymentResponse.getPaymentStatus().equals("success")
                                ? "Payment Successful And Ticket Booked"
                                : "Payment Failed, Order Added to cart.";

                ticketOrderRepository.save(ticket);
                return new TransactionResponse(ticket, paymentResponse.getAmount(), paymentResponse.getTransactionId(),
                                response);
        }

}
