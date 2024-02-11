package com.edu.rayenne.universityservice.domain.model;

import lombok.Builder;


@Builder
public record University(Long universityId,
                         String universityRef,
                         String universityName) {
}
