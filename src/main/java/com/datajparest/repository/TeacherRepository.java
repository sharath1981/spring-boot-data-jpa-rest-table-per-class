package com.datajparest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.datajparest.domain.Teacher;

@RepositoryRestResource
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
