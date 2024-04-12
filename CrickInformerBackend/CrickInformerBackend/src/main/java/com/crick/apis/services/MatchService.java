package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;
import java.util.Map;

// to make application loosely coupled that's why we make MatchService as an Interface
public interface MatchService {
    // get all matches
    List<Match> getAllMatches();

    // get live matches
    List<Match> getLiveMatches();


    // get cwc2023 point table
    List<List<String>> getPointTable();
}
