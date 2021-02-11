package com.datajparest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.datajparest.domain.Student;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long> {

}
