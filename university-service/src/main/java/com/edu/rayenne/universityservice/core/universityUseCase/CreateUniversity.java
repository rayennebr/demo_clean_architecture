package com.edu.rayenne.universityservice.core.universityUseCase;

import com.edu.rayenne.universityservice.domain.model.University;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface CreateUniversity {

    University addUniversity(University university);
}
