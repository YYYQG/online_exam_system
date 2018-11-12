package com.xxx.bean;

import java.io.Serializable;
import java.util.Date;

public class Exam implements Serializable {
    /**
     * 试卷的id，该试卷的唯一标识
     */
    private Integer examId;

    /**
     * 试卷的名称
     */
    private String examName;

    /**
     * 考试的时间
     */
    private Date examDate;

    /**
     * exam
     */
    private static final long serialVersionUID = 1L;

    /**
     * 试卷的id，该试卷的唯一标识
     * @return exam_id 试卷的id，该试卷的唯一标识
     */
    public Integer getExamId() {
        return examId;
    }

    /**
     * 试卷的id，该试卷的唯一标识
     * @param examId 试卷的id，该试卷的唯一标识
     */
    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    /**
     * 试卷的名称
     * @return exam_name 试卷的名称
     */
    public String getExamName() {
        return examName;
    }

    /**
     * 试卷的名称
     * @param examName 试卷的名称
     */
    public void setExamName(String examName) {
        this.examName = examName;
    }

    /**
     * 考试的时间
     * @return exam_date 考试的时间
     */
    public Date getExamDate() {
        return examDate;
    }

    /**
     * 考试的时间
     * @param examDate 考试的时间
     */
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }
}