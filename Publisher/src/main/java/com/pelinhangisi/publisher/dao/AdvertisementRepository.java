package com.pelinhangisi.publisher.dao;

import com.pelinhangisi.publisher.entity.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

    List<Advertisement> findAdvertisementByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate);

    List<Advertisement> findAdvertisementByCreatedAtOrderByAsc();

    List<Advertisement> findAdvertisementByCreatedAtOrderByDesc();

    List<Advertisement> findAdvertisementByTitleContainingIgnoreCase(String title);

    List<Advertisement> findAdvertisementByDescriptionContainingIgnoreCase(String description);



}
