package NailShop;

import NailShop.AbstractEvent;

public class NailFinished extends AbstractEvent {

    private Long id;
    private Long reservationId;
    private String employee;
    private String description;
    private Long fee;
    private String phoneNumber;
    private String reservationDate;
    private String ReservatorName;

    public NailFinished(Nail nail) {
        this.phoneNumber = nail.getPhoneNumber();
        this.reservationDate = nail.getReservationDate();
        this.ReservatorName = nail.getReservatorName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservatorName() {
        return ReservatorName;
    }

    public void setReservatorName(String getReservatorName) {
        this.ReservatorName = getReservatorName;
    }

}
