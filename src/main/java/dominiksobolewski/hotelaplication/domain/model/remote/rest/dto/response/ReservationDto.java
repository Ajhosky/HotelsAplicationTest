package dominiksobolewski.hotelaplication.domain.model.remote.rest.dto.response;

import dominiksobolewski.hotelaplication.domain.model.ReservationStatus;
import dominiksobolewski.hotelaplication.domain.model.remote.rest.dto.request.CustomersDto;
import dominiksobolewski.hotelaplication.domain.model.remote.rest.dto.request.RoomReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatus status;
    private List<RoomReservationDto> rooms;
    private CustomersDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, ReservationStatus status, List<RoomReservationDto> rooms, CustomersDto person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public List<RoomReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomReservationDto> rooms) {
        this.rooms = rooms;
    }

    public CustomersDto getPerson() {
        return person;
    }

    public void setPerson(CustomersDto person) {
        this.person = person;
    }
}
