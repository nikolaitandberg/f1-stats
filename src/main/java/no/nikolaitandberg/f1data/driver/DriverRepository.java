package no.nikolaitandberg.f1data.driver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, String> {
    void deleteByDriverRef(String driverRef);
    Optional<Driver> findByDriverRef(String driverRef);
}


