package katas.katas.KataService.Services;

import katas.katas.KataService.Exceptions.RentServiceExceptions;
import katas.katas.KataService.Models.Rent;
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

    public Rent rentACar(Long userId, Long carId) {
        //Buscar usuario
        var user = userRepository.findById(userId);
        if(user.isEmpty()){
            throw new RentServiceExceptions("User not found", "R-101");
        }
        //buscar un coche
        var car = carRepository.findById(carId);
        if (car.isEmpty()){
            throw new RentServiceExceptions("Car not found", "R-102");
        }
        //comprobar si está alquilado el coche
        var rent = rentRepository.findCarById(car.get());
        if (car.isPresent()){
            throw new RentServiceExceptions("This car is alredy rented", "R-001");
        }
        //construir el nuevo alquiler
        Rent newRent = new Rent();
        newRent.setUser(user.get());
        newRent.setCar(car.get());
        rentRepository.save(newRent);

        return new Rent();

    }
}
