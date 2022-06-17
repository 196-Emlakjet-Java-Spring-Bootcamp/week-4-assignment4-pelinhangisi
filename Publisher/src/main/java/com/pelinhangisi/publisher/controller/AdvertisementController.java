package com.pelinhangisi.publisher.controller;

import com.pelinhangisi.publisher.dto.AdvertisementDto;
import com.pelinhangisi.publisher.entity.Advertisement;
import com.pelinhangisi.publisher.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/advertisement")
public class AdvertisementController {

    private AdvertisementService advertisementService;

    @Autowired
    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @PostMapping("/create")
    public void createAdvertisement(@RequestBody AdvertisementDto advertisementDto){
        advertisementService.createAdvertisement(advertisementDto);
    }


    // SQL sorguları oluşturulduktan sonra GetMapping ile yol gösterme
    @GetMapping("/date")
    public List<Advertisement> findAdvertisementByCreatedAtBetween(@RequestParam(name="startDate") LocalDateTime startDate,@RequestParam("endDate") LocalDateTime endDate){
        return advertisementService.findAdvertisementByCreatedAtBetween(startDate,endDate);
    }

    @GetMapping("/createfirst")
    public List<Advertisement> findAdvertisementByCreatedAtOrderByAsc() {
        return advertisementService.findAdvertisementByCreatedAtOrderByAsc();
    }

    @GetMapping("/createlast")
    public List<Advertisement> findAdvertisementByCreatedAtOrderByDesc(){
        return advertisementService.findAdvertisementByCreatedAtOrderByDesc();
    }

    @GetMapping("/title")
    public List<Advertisement> findAdvertisementByTitleContainingIgnoreCase(String title){
        return advertisementService.findAdvertisementByTitleContainingIgnoreCase(title);
    }

    @GetMapping("/description")
    public List<Advertisement> findAdvertisementByDescriptionContainingIgnoreCase(String description){
        return advertisementService.findAdvertisementByDescriptionContainingIgnoreCase(description);
    }
}
