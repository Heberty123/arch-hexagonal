package com.prado.hexagonal.application.ports.in;

import com.prado.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
