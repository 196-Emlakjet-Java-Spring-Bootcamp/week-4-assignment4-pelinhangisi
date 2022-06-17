package com.pelinhangisi.consumer.service;

import com.pelinhangisi.consumer.dao.UserRepository;
import com.pelinhangisi.consumer.dto.UserDto;
import com.pelinhangisi.consumer.entitiy.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RabbitListener(queues = "${queue.name}")
    public void createUser(@Payload UserDto userDto) throws InterruptedException{
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        userRepository.save(user);

    }
}
