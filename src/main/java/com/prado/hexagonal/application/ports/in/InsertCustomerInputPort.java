package com.prado.hexagonal.application.ports.in;

import com.prado.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
