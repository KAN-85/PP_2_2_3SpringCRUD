package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(Integer count, List<Car> list) {

        list.add(new Car("Model1", "Type1", 231));
        list.add(new Car("Model2", "Type1", 234));
        list.add(new Car("Model3", "Type2", 431));
        list.add(new Car("Model4", "Type3", 453));
        list.add(new Car("Model5", "Type4", 543));

        if (count > 5) return list;

        return list.stream().limit(count).toList();
    }


}
