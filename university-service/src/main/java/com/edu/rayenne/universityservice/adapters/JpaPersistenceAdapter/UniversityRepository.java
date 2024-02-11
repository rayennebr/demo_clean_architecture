package com.edu.rayenne.universityservice.adapters.JpaPersistenceAdapter;

import com.edu.rayenne.universityservice.adapters.entites.UniversityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<UniversityEntity,Long> {
}
