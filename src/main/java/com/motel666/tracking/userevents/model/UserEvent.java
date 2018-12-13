package com.motel666.tracking.userevents.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserEvent {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long eventId;

    private Long userId;

    private String eventType;


    private Date timestamp;

    private String context;

    public UserEvent() {
    }

    public UserEvent(Long userId, String eventType, Date timestamp, String context) {
        this.userId = userId;
        this.eventType = eventType;
        this.timestamp = timestamp;
        this.context = context;
    }

    public UserEvent(Long eventId, Long userId, String eventType, Date timestamp, String context) {
        this.eventId = eventId;
        this.userId = userId;
        this.eventType = eventType;
        this.timestamp = timestamp;
        this.context = context;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
