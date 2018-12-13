package com.motel666.tracking.userevents;

import com.motel666.tracking.userevents.model.UserEvent;
import com.motel666.tracking.userevents.repo.UserEventRepo;
import com.motel666.tracking.userevents.service.UserEventService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Date;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;


@RunWith(MockitoJUnitRunner.class)
public class UserEventServiceTest {

    @Mock
    UserEventRepo repository;

    @InjectMocks
    UserEventService service;

    @Test
    public void verifySaveTest() {

    }

    @Test
    public void getUserEventsByUserIdtest() {
        UserEvent userEvent = new UserEvent(12345454545l, 3545354543545435l, "Browsing", null, null)
        when(service.getByUserId(anyLong())).thenReturn(userEvent);
    }




}
