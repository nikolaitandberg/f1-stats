package no.nikolaitandberg.f1data.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/driver")
public class DriverController {
    private final DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping
    public List<Driver> getDrivers(
            @RequestParam(required = false) String nationality,
            @RequestParam(required = false) String name) {

        if (nationality != null) {
            return driverService.getDriversByNationality(nationality);
        }
        else if (name != null) {
            return driverService.getDriversByName(name);
        }
        else {
            return driverService.getDrivers();
        }
    }

    @PostMapping
    public ResponseEntity<Driver> addDriver(@RequestBody Driver driver){
        Driver createdDriver = driverService.addDriver(driver);
        return new ResponseEntity<>(createdDriver, HttpStatus.CREATED);
    }

    // TODO: add putmapping & deletemapping
}
