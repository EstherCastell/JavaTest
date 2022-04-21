package katas.katas.KataService.Models;

public class Car {
    private Long id;
    private String brand;
    private String plateNumber;

    public Car() {
    }

    public Car(Long id, String brand, String plateNumber) {
        this.id = id;
        this.brand = brand;
        this.plateNumber = plateNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
