package com.gtm.service.implement;

import com.gtm.pojo.ScoreComponent;
import com.gtm.repository.ScoreComponentRepository;
import com.gtm.service.ScoreComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreComponentServiceImplement implements ScoreComponentService {
    @Autowired
    private ScoreComponentRepository scoreComponentRepository;

    @Override
    public List<ScoreComponent> getScoreComponents() {
        return this.scoreComponentRepository.getScoreComponents();
    }
}
