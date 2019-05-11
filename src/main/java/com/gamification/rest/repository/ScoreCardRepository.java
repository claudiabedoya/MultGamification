package com.gamification.rest.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.gamification.rest.domain.LeaderBoardRow;
import com.gamification.rest.domain.ScoreCard;

import java.util.List;

public interface ScoreCardRepository extends CrudRepository<ScoreCard, Long> {

	@Query ("SELEC SUM(s.score) FROM com.gamification.rest.domain.ScorCard s WHERE s.userId = :us in")

}


