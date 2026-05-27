package com.example.payment_service.dto;

import com.example.payment_service.entity.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequestDTO(Long orderID,
                                BigDecimal amount,
                                String customerEmail,
                                PaymentMethod method) {
}
