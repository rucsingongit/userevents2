package com.motel666.tracking.userevents.repo;

import com.motel666.tracking.userevents.model.UserEvent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface UserEventRepo extends CrudRepository<UserEvent, Long> {

    Iterable<UserEvent> findByTimestampBetween(Date startDate, Date endDate);

    Iterable<UserEvent> findByUserId(Long userId);


}
