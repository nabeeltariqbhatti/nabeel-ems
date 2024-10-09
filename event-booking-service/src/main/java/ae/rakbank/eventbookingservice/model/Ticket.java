package ae.rakbank.eventbookingservice.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "tickets", indexes ={
        @Index(name = "ticket_number_idx", columnList = "ticketNumber")

})
public class Ticket extends BaseEntity {

    @Column(unique = true)
    private String ticketNumber;

    @Enumerated(value = EnumType.STRING)
    private TicketType ticketType;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "booking_id")
    @JsonBackReference
    private Booking booking;


    public enum TicketType {
        VIP,
        REGULAR,
        STUDENT,
        EARLY_BIRD,
        GROUP
    }}
