package com.pelinhangisi.publisher.controller;

import com.pelinhangisi.publisher.dto.AdvertisementDto;
import com.pelinhangisi.publisher.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/advertisement")
public class AdvertisementController {

    private AdvertisementService advertisementService;

    @Autowired
    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @PostMapping
    public void createAdvertisement(@RequestBody AdvertisementDto advertisementDto){
        advertisementService.createAdvertisement(advertisementDto);
    }
}
