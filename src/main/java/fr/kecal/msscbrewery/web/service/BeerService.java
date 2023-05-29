package fr.kecal.msscbrewery.web.service;

import fr.kecal.msscbrewery.web.model.BeerDto;
import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}
