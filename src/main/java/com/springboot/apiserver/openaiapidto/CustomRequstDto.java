package com.springboot.apiserver.openaiapidto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomRequstDto {
    private String model;
    private List<MessageDto> messages;
}