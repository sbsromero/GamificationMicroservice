package com.microservice.gamification.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.gamification.domain.LeaderBoardRow;
import com.microservice.gamification.repository.ScoreCardRepository;

@Service
class LeaderBoardServiceImpl implements LeaderBoardService {

    private ScoreCardRepository scoreCardRepository;

    LeaderBoardServiceImpl(ScoreCardRepository scoreCardRepository) {
        this.scoreCardRepository = scoreCardRepository;
    }

    @Override
    public List<LeaderBoardRow> getCurrentLeaderBoard() {
        return scoreCardRepository.findFirst10();
    }
}