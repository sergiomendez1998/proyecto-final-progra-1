package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class Ticket {
    private int idTicket;
    private int idEvent;
    private int  idSeat;
    private int  idSection;
    private int idBuyer;
    private String noTicket;
    private Date purchaseDate;
}
