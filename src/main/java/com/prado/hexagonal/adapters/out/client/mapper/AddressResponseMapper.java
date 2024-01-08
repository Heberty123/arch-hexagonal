package com.prado.hexagonal.adapters.out.client.mapper;

import com.prado.hexagonal.adapters.out.client.response.AddressResponse;
import com.prado.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
