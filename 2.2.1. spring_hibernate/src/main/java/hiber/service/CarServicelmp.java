package hiber.service;

import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CarServicelmp implements CarService {

    @Autowired
    private CarService carService;

    @Transactional
    @Override
    public void add(Car car) {
        carService.add(car);
    }
    @Transactional
    @Override
    public List<Car> listCar() {
        return carService.listCar();
    }
}
