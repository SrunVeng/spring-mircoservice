package com.example.department_service.util.Datainit;

import com.example.department_service.infrastructure.entity.Department;
import com.example.department_service.infrastructure.repository.DepartmentRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInit {

    private final DepartmentRepository departmentRepository;



    @PostConstruct
    public void init() {
        Department department1 = Department.builder()
                .departmentCode("H-001")
                .departmentDescription("IT Department")
                .departmentName("IT")
                .build();
        Department department2 = Department.builder()
                .departmentCode("H-002")
                .departmentDescription("HR Department")
                .departmentName("HR")
                .build();
        Department department3 = Department.builder()
                .departmentCode("H-003")
                .departmentDescription("FINANCE Department")
                .departmentName("FINANCE")
                .build();
        Department department4 = Department.builder()
                .departmentCode("H-004")
                .departmentDescription("AUDIT Department")
                .departmentName("AUDIT")
                .build();
        Department department5 = Department.builder()
                .departmentCode("B-005")
                .departmentDescription("SALES Department")
                .departmentName("SALES")
                .build();

        departmentRepository.saveAll(List.of(department1, department2, department3, department4, department5));
    }
}
