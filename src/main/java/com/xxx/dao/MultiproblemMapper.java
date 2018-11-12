package com.xxx.dao;

import com.xxx.bean.Multiproblem;
import com.xxx.bean.MultiproblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MultiproblemMapper {
    int countByExample(MultiproblemExample example);

    int deleteByExample(MultiproblemExample example);

    int deleteByPrimaryKey(Integer multiProblemId);

    int insert(Multiproblem record);

    int insertSelective(Multiproblem record);

    List<Multiproblem> selectByExample(MultiproblemExample example);

    Multiproblem selectByPrimaryKey(Integer multiProblemId);

    int updateByExampleSelective(@Param("record") Multiproblem record, @Param("example") MultiproblemExample example);

    int updateByExample(@Param("record") Multiproblem record, @Param("example") MultiproblemExample example);

    int updateByPrimaryKeySelective(Multiproblem record);

    int updateByPrimaryKey(Multiproblem record);
}