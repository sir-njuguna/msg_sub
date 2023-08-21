package com.example.msg_sub.consumer;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class MessageForm {
    @NotBlank
    private String name;

    @NotNull
    @Min(0)
    private BigDecimal amount;
}
