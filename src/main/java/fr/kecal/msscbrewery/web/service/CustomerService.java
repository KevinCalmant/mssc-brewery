package fr.kecal.msscbrewery.web.service;

import fr.kecal.msscbrewery.web.model.CustomerDto;
import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
