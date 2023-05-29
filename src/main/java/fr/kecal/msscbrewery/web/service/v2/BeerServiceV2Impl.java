package fr.kecal.msscbrewery.web.service.v2;

import fr.kecal.msscbrewery.web.model.v2.BeerDtoV2;
import fr.kecal.msscbrewery.web.model.v2.BeerStyleEnum;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
            .name("Galaxy Cat")
            .style(BeerStyleEnum.PALE_ALE)
            .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
            .id(UUID.randomUUID())
            .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        //TODO: impl - would add a real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
        //TODO: impl - would add a real impl to delete beer
    }
}
