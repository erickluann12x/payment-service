package com.example.payment_service.dto;

import com.example.payment_service.entity.PaymentMethod;
import com.example.payment_service.entity.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentResponseDTO(Long id,
                                 Long orderId,
                                 String customerEmail,
                                 BigDecimal amount,
                                 PaymentMethod method,
                                 PaymentStatus status,
                                 LocalDateTime paymentDate,
                                 LocalDateTime createdAt) {
}
