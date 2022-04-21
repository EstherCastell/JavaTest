package katas.katas.KataService.Repositories;

import katas.katas.KataService.Models.Car;

import java.util.Optional;

public interface CarRepository {
   Optional<Car> findById(Long id);
}
