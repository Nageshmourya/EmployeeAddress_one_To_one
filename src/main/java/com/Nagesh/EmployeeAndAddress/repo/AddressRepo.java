package com.Nagesh.EmployeeAndAddress.repo;

import com.Nagesh.EmployeeAndAddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepo extends JpaRepository<Address,Long> {
    Optional<Address> findById(Long id);
}
