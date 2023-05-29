package fr.kecal.msscbrewery.web.service;

import fr.kecal.msscbrewery.web.model.CustomerDto;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
            .id(customerId)
            .name("Kévin Calmant")
            .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
            .id(UUID.randomUUID())
            .name("Kévin Calmant")
            .build();
    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {
        //TODO: impl method
    }

    @Override
    public void deleteById(UUID customerId) {
        //TODO: impl method
    }
}
