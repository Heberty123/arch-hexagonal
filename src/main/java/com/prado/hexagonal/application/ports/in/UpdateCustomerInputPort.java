package com.prado.hexagonal.application.ports.in;

import com.prado.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
