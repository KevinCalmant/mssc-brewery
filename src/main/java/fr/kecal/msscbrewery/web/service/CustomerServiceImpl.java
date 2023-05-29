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
}
