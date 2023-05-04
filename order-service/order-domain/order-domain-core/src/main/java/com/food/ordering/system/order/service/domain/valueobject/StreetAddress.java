package com.food.ordering.system.order.service.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class StreetAddress {

    private final UUID id;
    private final String street;
    private final String postalCode;
    private final String city;

}
