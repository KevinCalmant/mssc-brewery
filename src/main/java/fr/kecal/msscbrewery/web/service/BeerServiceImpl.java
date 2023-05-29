package fr.kecal.msscbrewery.web.service;

import fr.kecal.msscbrewery.web.model.BeerDto;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
            .name("Galaxy Cat")
            .style("Pale Ale")
            .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
            .id(UUID.randomUUID())
            .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //TODO: impl - would add a real impl to update beer
    }
}
