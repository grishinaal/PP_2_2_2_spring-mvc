package web.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("MINI Cooper", 2022, 3.875000));
        carList.add(new Car("Audi A6", 2020, 5.400000));
        carList.add(new Car("Mazda 6", 2023, 2.800000));
        carList.add(new Car("Toyota C-HR", 2022, 3.290000));
        carList.add(new Car("Jaguar F-Pace SVR", 2022, 12.700000));
    }

    @Override
    public List<Car> carList(int count) {
        if (count > 5) count = 5;
        return carList.subList(0, count);
    }
}