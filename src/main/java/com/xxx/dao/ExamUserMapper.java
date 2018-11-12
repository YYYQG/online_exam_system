package com.xxx.dao;

import com.xxx.bean.ExamUser;
import com.xxx.bean.ExamUserExample;
import com.xxx.bean.ExamUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamUserMapper {
    int countByExample(ExamUserExample example);

    int deleteByExample(ExamUserExample example);

    int deleteByPrimaryKey(ExamUserKey key);

    int insert(ExamUser record);

    int insertSelective(ExamUser record);

    List<ExamUser> selectByExample(ExamUserExample example);

    ExamUser selectByPrimaryKey(ExamUserKey key);

    int updateByExampleSelective(@Param("record") ExamUser record, @Param("example") ExamUserExample example);

    int updateByExample(@Param("record") ExamUser record, @Param("example") ExamUserExample example);

    int updateByPrimaryKeySelective(ExamUser record);

    int updateByPrimaryKey(ExamUser record);
}