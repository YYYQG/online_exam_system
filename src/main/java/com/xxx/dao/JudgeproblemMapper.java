package com.xxx.dao;

import com.xxx.bean.Judgeproblem;
import com.xxx.bean.JudgeproblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JudgeproblemMapper {
    int countByExample(JudgeproblemExample example);

    int deleteByExample(JudgeproblemExample example);

    int deleteByPrimaryKey(Integer judgeProblemId);

    int insert(Judgeproblem record);

    int insertSelective(Judgeproblem record);

    List<Judgeproblem> selectByExample(JudgeproblemExample example);

    Judgeproblem selectByPrimaryKey(Integer judgeProblemId);

    int updateByExampleSelective(@Param("record") Judgeproblem record, @Param("example") JudgeproblemExample example);

    int updateByExample(@Param("record") Judgeproblem record, @Param("example") JudgeproblemExample example);

    int updateByPrimaryKeySelective(Judgeproblem record);

    int updateByPrimaryKey(Judgeproblem record);
}