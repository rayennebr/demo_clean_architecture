package com.edu.rayenne.universityservice.core.universityUseCase;

import com.edu.rayenne.universityservice.domain.model.University;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

public interface ReadUniversity {
    List<University> getAllUniversity();
    Optional<University> getByID(Long id);
}
