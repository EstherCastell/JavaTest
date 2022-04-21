package katas.katas.KataService.Models;

import java.time.LocalDate;

public class Rent {
    private Long id;
    private User user;
    private Car car;
    private LocalDate rentDate;

    public Rent() {
    }

    public Rent(Long id, User user, Car car, LocalDate rentDate) {
        this.id = id;
        this.user = user;
        this.car = car;
        this.rentDate = rentDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }
}
