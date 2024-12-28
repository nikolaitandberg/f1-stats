package no.nikolaitandberg.f1data.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DriverService {
    private final DriverRepository driverRepository;

    @Autowired
    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public List<Driver> getDrivers(){
        return driverRepository.findAll();
    }

    public List<Driver> getDriversByNationality(String nationality){
        return driverRepository.findAll().stream()
                .filter(driver -> nationality.equals(driver.getNationality()))
                .collect(Collectors.toList());
    }

    public List<Driver> getDriversByName(String searchText) {
        return driverRepository.findAll().stream()
                .filter(driver -> (driver.getFirstName() + driver.getLastName()).contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Driver addDriver(Driver driver) {
        driverRepository.save(driver);
        return driver;
    }

    //TODO: update & delete driver
}
