package com.motel666.tracking.userevents.service;

import com.motel666.tracking.userevents.model.UserEvent;
import com.motel666.tracking.userevents.repo.UserEventRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserEventService {


    private static final Logger LOGGER = LoggerFactory.getLogger(UserEventService.class);

    @Autowired
    private UserEventRepo userEventRepository;

    public UserEvent createNewUserEvent(UserEvent userEvent){
        return this.userEventRepository.save(userEvent);
    }

    public List<UserEvent> getByUserId(Long userId)
    {

      /*  List<UserEvent> collect = StreamSupport.stream(this.userEventRepository.findByUserId(userId))
                .collect(Collectors.toList());*/

        Iterable<UserEvent> userEvents = this.userEventRepository.findByUserId(userId);
        List<UserEvent> userEventsList = new ArrayList<>();
        for(UserEvent eachEvent: userEvents) {
            userEventsList.add(eachEvent);
        }

        return userEventsList;
    }

    public List<UserEvent> getByTimeRange(Date startDate, Date endDate)
    {


        Iterable<UserEvent> userEvents = this.userEventRepository.findByTimestampBetween(startDate, endDate);
        List<UserEvent> userEventsList = new ArrayList<>();
        for(UserEvent eachEvent: userEvents) {
            userEventsList.add(eachEvent);
        }

        return userEventsList;
    }



}
