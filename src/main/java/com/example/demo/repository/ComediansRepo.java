package com.example.demo.repository;

import com.example.demo.model.Comedian;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComediansRepo extends CrudRepository<Comedian,Long> {
}
