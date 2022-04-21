package katas.katas.KataService.Services;

import katas.katas.KataService.Repositories.CarRepository;
import katas.katas.KataService.Repositories.RentRepository;
import katas.katas.KataService.Repositories.UserRepository;

public class RentService {
    private CarRepository carRepository;
    private UserRepository userRepository;
    private RentRepository rentRepository;

    public RentService(CarRepository carRepository, UserRepository userRepository, RentRepository rentRepository) {
        this.carRepository = carRepository;
        this.userRepository = userRepository;
        this.rentRepository = rentRepository;
    }
}
