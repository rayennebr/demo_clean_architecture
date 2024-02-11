package com.edu.rayenne.universityservice.adapters;

import com.edu.rayenne.universityservice.adapters.JpaPersistenceAdapter.UniversityRepository;
import com.edu.rayenne.universityservice.adapters.mapper.UniversityMapper;
import com.edu.rayenne.universityservice.domain.model.University;
import com.edu.rayenne.universityservice.domain.persistencePort.UniversityPersistencePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class JpaUniversityAdapter implements UniversityPersistencePort {

    private final UniversityRepository universityRepository;
    private final UniversityMapper universityMapper;
    @Override
    public University addUniversity(University university) {
        return universityMapper
                .mapToUniversity(
                        universityRepository
                                .save(
                                        universityMapper
                                                .mapToUniversityEntity(university)
                                )
                );
    }

    @Override
    public List<University> getAllUniversity() {
        return universityRepository
                .findAll()
                .stream()
                .map(universityMapper::mapToUniversity)
                .toList();
    }

    @Override
    public List<University> deleteUniversity(Long id) {
        return null;
    }

    @Override
    public List<University> updateUniversity(Long id, University university) {
        return null;
    }
}
