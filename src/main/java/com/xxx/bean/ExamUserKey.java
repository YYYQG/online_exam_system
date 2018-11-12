package com.xxx.bean;

import java.io.Serializable;

public class ExamUserKey implements Serializable {
    /**
     * 试卷的id
     */
    private Integer examId;

    /**
     * 考试学生的id
     */
    private Integer userId;

    /**
     * exam_user
     */
    private static final long serialVersionUID = 1L;

    /**
     * 试卷的id
     * @return exam_id 试卷的id
     */
    public Integer getExamId() {
        return examId;
    }

    /**
     * 试卷的id
     * @param examId 试卷的id
     */
    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    /**
     * 考试学生的id
     * @return user_id 考试学生的id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 考试学生的id
     * @param userId 考试学生的id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}