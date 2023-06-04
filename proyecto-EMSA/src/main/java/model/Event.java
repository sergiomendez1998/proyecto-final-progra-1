package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class Event {
    private int idEvent;
    private String name;
    private String description;
    private String eventLocation;
    private Date eventDate;
    private Time startTime;
    private Time endTime;
    private String status;

    public Event(String name, String description, String eventLocation, Date eventDate, Time startTime) {
        this.name = name;
        this.description = description;
        this.eventDate = eventDate;
        this.startTime = startTime;
        this.eventLocation = eventLocation;
    }
}
