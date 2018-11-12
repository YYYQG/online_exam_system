package com.xxx.dao;

import com.xxx.bean.ExamProblem;
import com.xxx.bean.ExamProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamProblemMapper {
    int countByExample(ExamProblemExample example);

    int deleteByExample(ExamProblemExample example);

    int deleteByPrimaryKey(Integer examId);

    int insert(ExamProblem record);

    int insertSelective(ExamProblem record);

    List<ExamProblem> selectByExample(ExamProblemExample example);

    ExamProblem selectByPrimaryKey(Integer examId);

    int updateByExampleSelective(@Param("record") ExamProblem record, @Param("example") ExamProblemExample example);

    int updateByExample(@Param("record") ExamProblem record, @Param("example") ExamProblemExample example);

    int updateByPrimaryKeySelective(ExamProblem record);

    int updateByPrimaryKey(ExamProblem record);
}