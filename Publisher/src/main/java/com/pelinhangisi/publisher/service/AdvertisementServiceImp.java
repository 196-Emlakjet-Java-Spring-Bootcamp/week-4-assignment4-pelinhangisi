package com.pelinhangisi.publisher.service;

import com.pelinhangisi.publisher.dto.AdvertisementDto;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AdvertisementServiceImp implements AdvertisementService {

    private RabbitTemplate rabbitTemplate;
    private Queue queue;

    @Autowired
    public AdvertisementServiceImp(RabbitTemplate rabbitTemplate, Queue queue) {
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }

    @Override
    public void createAdvertisement(AdvertisementDto advertisementDto) {
        int i = 1;
        while (i <= 50) {
            rabbitTemplate.convertAndSend(this.queue.getName(), advertisementDto);
            i++;
        }
    }
}
