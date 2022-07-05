package hiber.dao;

import hiber.model.Car;

import java.io.Serializable;
import java.util.List;

public interface CarDao {
    Serializable add(Car car);
    List<Car> listCar();

}
