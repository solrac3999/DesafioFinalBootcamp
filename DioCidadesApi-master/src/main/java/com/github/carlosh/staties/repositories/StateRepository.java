package com.github.carlosh.staties.repositories;

import com.github.carlosh.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
