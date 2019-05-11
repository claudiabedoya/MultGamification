package com.gamification.rest.service;

import com.gamification.rest.domain.GameStats;

public interface GameService {

	GameStats newAttemptForUser(Long userId, Long attemptId, boolean correct);
	
	GameStats retrieveStatsForUser(Long userId);
	
}
