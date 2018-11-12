package com.xxx.bean;

import java.io.Serializable;

public class ExamProblem implements Serializable {
    /**
     * 试卷的id
     */
    private Integer examId;

    /**
     * 问题的id
     */
    private Integer problemId;

    /**
     * 试卷的类型(1表示是单选，2表示多选，3表示判断)
     */
    private Integer problemType;

    /**
     * exam_problem
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
     * 问题的id
     * @return problem_id 问题的id
     */
    public Integer getProblemId() {
        return problemId;
    }

    /**
     * 问题的id
     * @param problemId 问题的id
     */
    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    /**
     * 试卷的类型(1表示是单选，2表示多选，3表示判断)
     * @return problem_type 试卷的类型(1表示是单选，2表示多选，3表示判断)
     */
    public Integer getProblemType() {
        return problemType;
    }

    /**
     * 试卷的类型(1表示是单选，2表示多选，3表示判断)
     * @param problemType 试卷的类型(1表示是单选，2表示多选，3表示判断)
     */
    public void setProblemType(Integer problemType) {
        this.problemType = problemType;
    }
}