package com.pelinhangisi.publisher.service;


import com.pelinhangisi.publisher.dto.AdvertisementDto;
import com.pelinhangisi.publisher.entity.Advertisement;

import java.time.LocalDateTime;
import java.util.List;

public interface AdvertisementService {
        void createAdvertisement(AdvertisementDto advertisementDto);

        // Sorgu Servisi

        List<Advertisement> findAdvertisementByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate);

        List<Advertisement> findAdvertisementByCreatedAtOrderByAsc();

        List<Advertisement> findAdvertisementByCreatedAtOrderByDesc();

        List<Advertisement> findAdvertisementByTitleContainingIgnoreCase(String title);

        List<Advertisement> findAdvertisementByDescriptionContainingIgnoreCase(String description);

}
