package com.example.RESTAPICrudOperationWorkbenchMYSQL.repositry;

import com.example.RESTAPICrudOperationWorkbenchMYSQL.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositry extends JpaRepository<Student,Integer> {
}
