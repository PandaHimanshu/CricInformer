package com.cricinfo.cricinformer.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cricinfo.cricinformer.Entities.Match;

@Service
public interface MatchService {
    List<Match> getLiveMatchScores();
    List<List<String>> getCWC2023PointTable();

    List<Match> getAllMatches();
}
