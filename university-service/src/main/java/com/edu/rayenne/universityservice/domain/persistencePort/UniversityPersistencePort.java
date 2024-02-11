package com.edu.rayenne.universityservice.domain.persistencePort;

import com.edu.rayenne.universityservice.domain.model.University;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UniversityPersistencePort {

    University addUniversity(University university);
    List<University> getAllUniversity();
    List<University> deleteUniversity(Long id);
    List<University>updateUniversity(Long id,University university);
}
