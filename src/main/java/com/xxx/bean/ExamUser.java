package com.xxx.bean;

import java.io.Serializable;

public class ExamUser extends ExamUserKey implements Serializable {
    /**
     * 单选的成绩
     */
    private Integer singleproblemScore;

    /**
     * 多选的成绩
     */
    private Integer multisproblemScore;

    /**
     * 判断的成绩
     */
    private Integer judgeproblemScore;

    /**
     * 
     */
    private Boolean locked;

    /**
     * exam_user
     */
    private static final long serialVersionUID = 1L;

    /**
     * 单选的成绩
     * @return singleproblem_score 单选的成绩
     */
    public Integer getSingleproblemScore() {
        return singleproblemScore;
    }

    /**
     * 单选的成绩
     * @param singleproblemScore 单选的成绩
     */
    public void setSingleproblemScore(Integer singleproblemScore) {
        this.singleproblemScore = singleproblemScore;
    }

    /**
     * 多选的成绩
     * @return multisproblem_score 多选的成绩
     */
    public Integer getMultisproblemScore() {
        return multisproblemScore;
    }

    /**
     * 多选的成绩
     * @param multisproblemScore 多选的成绩
     */
    public void setMultisproblemScore(Integer multisproblemScore) {
        this.multisproblemScore = multisproblemScore;
    }

    /**
     * 判断的成绩
     * @return judgeproblem_score 判断的成绩
     */
    public Integer getJudgeproblemScore() {
        return judgeproblemScore;
    }

    /**
     * 判断的成绩
     * @param judgeproblemScore 判断的成绩
     */
    public void setJudgeproblemScore(Integer judgeproblemScore) {
        this.judgeproblemScore = judgeproblemScore;
    }

    /**
     * 
     * @return locked 
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 
     * @param locked 
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}