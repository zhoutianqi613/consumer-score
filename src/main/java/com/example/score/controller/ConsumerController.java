package com.example.score.controller;

import com.example.score.dao.ScoreDao;
import com.example.score.service.ScoreService;
import org.bytesoft.compensable.Compensable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@Compensable(interfaceClass = ScoreService.class, confirmableKey = "scoreServiceConfirm", cancellableKey = "scoreServiceCancel")
@RestController
public class ConsumerController implements ScoreService {

    @Autowired
    private ScoreDao scoreDdao;

    @Override
    @ResponseBody
    @RequestMapping(value = "/increase", method = RequestMethod.PUT)
    @Transactional
    public void Score(@RequestParam  String accountId, @RequestParam double score) {
        scoreDdao.increaseBonusPoint(accountId, score);
        throw new IllegalStateException("some error!");
    }
}
