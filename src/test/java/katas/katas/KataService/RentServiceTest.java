package katas.katas.KataService;

import katas.katas.KataService.Models.Car;
import katas.katas.KataService.Models.Rent;
import katas.katas.KataService.Models.User;
import katas.katas.KataService.Repositories.CarRepository;
import katas.katas.KataService.Repositories.RentRepository;
import katas.katas.KataService.Repositories.UserRepository;
import katas.katas.KataService.Services.RentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class RentServiceTest {

    @Mock
    private RentRepository rentRepository;
    @Mock
    private CarRepository carRepository;
    @Mock
    private UserRepository userRepository;

    private User user;
    private Car car;

    @BeforeEach
    void setUp(){
        user = new User();
        car = new Car();
    }
    @Test
    void userCanRentACar(){
        User user = new User(1L, "name");
        Car car = new Car(1L, "opel", "A000y");
        Rent rent = new Rent(1L,user, car, LocalDate.now());

        var rentservice = new RentService(carRepository, userRepository, rentRepository);

        Mockito.when(userRepository.findById(user.getId())).thenReturn(Optional.of(user));
        Mockito.when(carRepository.findById(car.getId())).thenReturn(Optional.of(car));
        Mockito.when(rentRepository.save(any(Rent.class))).thenReturn(rent);

        assertEquals(user, userRepository.findById(user.getId()).get());
        assertEquals(car, carRepository.findById(car.getId()).get());
        assertEquals(rent, rentRepository.save(new Rent (1L, new User(3L, "name"), new Car(3L, "brand", "P888"), LocalDate.now())));
    }

}