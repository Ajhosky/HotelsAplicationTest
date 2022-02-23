package dominiksobolewski.hotelaplication.domain.model.remote.rest.dto.request;

import java.math.BigDecimal;

public class CustomersDto {
    private String name;
    private String address;
    private BigDecimal phone;
    private Integer floor;

    public CustomersDto() {
    }

    public CustomersDto(String name, String address, BigDecimal phone, Integer floor) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getPhone() {
        return phone;
    }

    public void setPhone(BigDecimal phone) {
        this.phone = phone;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
