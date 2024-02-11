package com.edu.rayenne.universityservice.adapters.mapper;

import com.edu.rayenne.universityservice.adapters.entites.UniversityEntity;
import com.edu.rayenne.universityservice.domain.model.University;
import org.springframework.stereotype.Component;

@Component
public class UniversityMapper {

   public UniversityEntity mapToUniversityEntity(University university)
    {
        return UniversityEntity.builder()
                .universityId(university.universityId())
                .universityName(university.universityName())
                .universityRef(university.universityRef())
                .build();
    }

    public University mapToUniversity(UniversityEntity university)
    {
        return University.builder()
                .universityId(university.getUniversityId())
                .universityName(university.getUniversityName())
                .universityRef(university.getUniversityRef())
                .build();
    }
}
