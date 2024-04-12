package com.crick.apis.repositories;

import com.crick.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Integer is the primary key of Match class
public interface MatchRepo extends JpaRepository<Match, Integer> {

    // I want to fetch the match data here
      // for that provide the teamHeading

      Optional<Match> findByTeamHeading(String teamHeading);
}
