package com.pps.opa.dto;

import jakarta.validation.constraints.NotNull;

public class PolicyInput {
    public String userId;
    public String paymentId;
    @NotNull public String action;       // create | refund | cancel
    @NotNull public Long amountCents;    // >= 1
    public String currency;              // e.g. USD
}