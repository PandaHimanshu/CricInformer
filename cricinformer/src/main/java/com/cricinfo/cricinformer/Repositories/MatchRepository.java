package com.cricinfo.cricinformer.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricinfo.cricinformer.Entities.Match;
import java.util.List;


public interface MatchRepository extends JpaRepository<Match, Integer> {
    Optional<Match> findByTeamHeading(String teamHeading);
}
