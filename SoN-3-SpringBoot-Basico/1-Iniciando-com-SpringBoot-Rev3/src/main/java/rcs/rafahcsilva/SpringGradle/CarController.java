package rcs.rafahcsilva.SpringGradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping
    @ResponseBody
    public List<Car> findAll() {
        return this.carRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Car> findById(@PathVariable("id") Long id) {
        return this.carRepository.findById(id);
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CREATED)
    public Car create(@RequestBody Car car) {
        return this.carRepository.save(car);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void updateById(@PathVariable("id") Long id, @RequestBody Car car) {
        this.carRepository.findById(id).map(car1 -> {
            car1.setName(car.getName());
            car1.setYear(car.getYear());
            car1.setColor(car.getColor());
            return this.carRepository.save(car1);
        });
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void removeById(@PathVariable("id") Long id) {
        this.carRepository.deleteById(id);
    }
}
