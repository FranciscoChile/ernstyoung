package com.ernstyoung.persistence;

import org.springframework.data.repository.CrudRepository;

import com.ernstyoung.model.Phone;

public interface PhoneRepository extends CrudRepository<Phone, Long> {
    
}
