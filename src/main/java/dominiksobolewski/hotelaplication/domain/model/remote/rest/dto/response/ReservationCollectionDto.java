package dominiksobolewski.hotelaplication.domain.model.remote.rest.dto.response;

import java.util.List;

public class ReservationCollectionDto {
    private List<ReservationDto> reservation;

    public ReservationCollectionDto() {
    }

    public ReservationCollectionDto(List<ReservationDto> reservation) {
        this.reservation = reservation;
    }

    public List<ReservationDto> getReservation() {
        return reservation;
    }

    public void setReservation(List<ReservationDto> reservation) {
        this.reservation = reservation;
    }
}
