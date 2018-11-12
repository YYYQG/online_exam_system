package com.xxx.dao;

import com.xxx.bean.Singleproblem;
import com.xxx.bean.SingleproblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingleproblemMapper {
    int countByExample(SingleproblemExample example);

    int deleteByExample(SingleproblemExample example);

    int deleteByPrimaryKey(Integer singleProblemId);

    int insert(Singleproblem record);

    int insertSelective(Singleproblem record);

    List<Singleproblem> selectByExample(SingleproblemExample example);

    Singleproblem selectByPrimaryKey(Integer singleProblemId);

    int updateByExampleSelective(@Param("record") Singleproblem record, @Param("example") SingleproblemExample example);

    int updateByExample(@Param("record") Singleproblem record, @Param("example") SingleproblemExample example);

    int updateByPrimaryKeySelective(Singleproblem record);

    int updateByPrimaryKey(Singleproblem record);
}