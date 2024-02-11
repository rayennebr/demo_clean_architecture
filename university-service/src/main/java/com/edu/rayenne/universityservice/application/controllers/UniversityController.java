package com.edu.rayenne.universityservice.application.controllers;

import com.edu.rayenne.universityservice.core.universityUseCase.CreateUniversity;
import com.edu.rayenne.universityservice.core.universityUseCase.ReadUniversity;
import com.edu.rayenne.universityservice.domain.model.University;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/university")
@CrossOrigin("*")
@Slf4j
@RequiredArgsConstructor
public class UniversityController {

    private final CreateUniversity createUniversity;
    private final ReadUniversity readUniversity;

    @GetMapping("/")
    public List<University>getAllUniversity()
    {
        return readUniversity.getAllUniversity();
    }
}
