package com.prado.hexagonal.config;

import com.prado.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.prado.hexagonal.adapters.out.UpdateCustomerAdpater;
import com.prado.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.prado.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
        FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
        UpdateCustomerAdpater updateCustomerAdpater
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdpater);
    }
}
