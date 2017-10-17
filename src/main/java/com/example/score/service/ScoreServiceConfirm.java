package com.example.score.service;

import com.example.score.dao.ScoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("scoreServiceConfirm")
public class ScoreServiceConfirm implements ScoreService{
    @Autowired
    private ScoreDao scoreDao;

    @Override
    @Transactional
    public void Score(String accountId, double score) {
        System.out.println("ScoreServiceConfirm::Score() has been called...");
    }

}
