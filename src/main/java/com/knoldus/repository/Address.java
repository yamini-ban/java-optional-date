package com.knoldus.repository;

import java.util.Optional;

public class Address {
    private String primaryAddress;
    private Optional<String> secondaryAddress;

    public Address(String primaryAddress, String secondaryAddress) {
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = Optional.ofNullable(secondaryAddress);
    }

    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(String primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public Optional<String> getSecondaryAddress() {
        return secondaryAddress;
    }

    public void setSecondaryAddress(String secondaryAddress) {
        this.secondaryAddress = Optional.ofNullable(secondaryAddress);
    }

    @Override
    public String toString() {
        return "Address{"
                + "primaryAddress='"
                + primaryAddress
                + '\''
                + ", secondaryAddress="
                + secondaryAddress.orElseGet(() -> "N.A")
                + '}';
    }
}
