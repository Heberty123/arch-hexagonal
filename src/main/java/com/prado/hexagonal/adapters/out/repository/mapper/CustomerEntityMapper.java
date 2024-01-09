package com.prado.hexagonal.adapters.out.repository.mapper;

import com.prado.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.prado.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
