package com.gtm.repository;

import com.gtm.pojo.Score;

public interface ScoreRepository {
    public Score getScoreWithThesisIdAndCouncilDetailId(int thesisId, int councilDetailId);
    public long checkTheGradedThesisByCouncilDetailId(int thesisId, int councilDetailId);
    public boolean addScore(Score score);
    public boolean updateScore(int scoreId, Score score);
}
