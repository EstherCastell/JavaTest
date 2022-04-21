package katas.katas.KataService.Repositories;

import katas.katas.KataService.Models.Car;
import katas.katas.KataService.Models.Rent;

import java.util.Optional;

public interface RentRepository {
    Rent save(Rent rent);

    Optional <Rent> findCarById(Car car);
}
