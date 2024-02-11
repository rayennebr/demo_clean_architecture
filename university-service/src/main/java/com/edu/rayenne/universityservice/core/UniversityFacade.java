package com.edu.rayenne.universityservice.core;

import com.edu.rayenne.universityservice.core.universityUseCase.CreateUniversity;
import com.edu.rayenne.universityservice.core.universityUseCase.ReadUniversity;
import com.edu.rayenne.universityservice.domain.model.University;
import com.edu.rayenne.universityservice.domain.persistencePort.UniversityPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UniversityFacade implements CreateUniversity, ReadUniversity {

    private final UniversityPersistencePort universityPersistencePort;

    @Override
    public University addUniversity(University university) {
        return universityPersistencePort.addUniversity(university);
    }

    @Override
    public List<University> getAllUniversity() {
        return universityPersistencePort.getAllUniversity();
    }

    @Override
    public Optional<University> getByID(Long id) {
        return universityPersistencePort.getAllUniversity()
                .stream()
                .filter(university->university.universityId()==id)
                .findAny();
    }
}
