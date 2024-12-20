package ae.rakbank.eventmanagementservice.dtos.event;

import ae.rakbank.eventmanagementservice.model.Event;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class UpdateEvent implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @NotBlank(message = "Event code must not be blank")
    private String code;

    private Event.Status status;
    private String eventName;

    private String startDateTime;
    private String endDateTime;
    private int stopBookingBeforeMinutes;
    private BigDecimal ticketPrice;
    private String venue;
    private Long eventId;
    @Min(value = 1, message = "Capacity must be a non-negative integer")
    private Integer capacity;


}
