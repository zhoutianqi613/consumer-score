package com.example.score.dao;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
@Component
public interface ScoreDao {
    @Update("update tb_account_four set score = score + #{score} where acct_id = #{accountId}")
    public void increaseBonusPoint(@Param("accountId") String accountId, @Param("score") double score);

    @Update("update tb_account_four set score = score - #{score} where acct_id = #{accountId}")
    public void decreaseBonusPoint(@Param("accountId") String accountId, @Param("score") double score);
}
