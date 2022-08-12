package com.food.ordering.system.order.service.domain.valueobject;

import java.util.Objects;
import java.util.UUID;

public class StreetAddress {
    private final UUID id;
    private final String street;
    private final String postaCode;
    private final String city;

    public StreetAddress(UUID id, String street, String postaCode, String city) {
        this.id = id;
        this.street = street;
        this.postaCode = postaCode;
        this.city = city;
    }

    public UUID getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getPostaCode() {
        return postaCode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreetAddress that = (StreetAddress) o;
        return street.equals(that.street) && postaCode.equals(that.postaCode) && city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, postaCode, city);
    }
}
