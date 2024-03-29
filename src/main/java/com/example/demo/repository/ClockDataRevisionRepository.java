package com.example.demo.repository;

import com.example.demo.model.ClockDataRevision;
import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClockDataRevisionRepository extends JpaRepository<ClockDataRevision, Long> {
}
