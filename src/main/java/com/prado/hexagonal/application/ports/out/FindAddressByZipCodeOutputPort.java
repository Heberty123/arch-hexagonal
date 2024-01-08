package com.prado.hexagonal.application.ports.out;

import com.prado.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
