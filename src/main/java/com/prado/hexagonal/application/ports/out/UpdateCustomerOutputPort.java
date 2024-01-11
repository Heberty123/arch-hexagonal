package com.prado.hexagonal.application.ports.out;

import com.prado.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
