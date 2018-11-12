package com.xxx.bean;

import java.io.Serializable;

public class Judgeproblem implements Serializable {
    /**
     * 判断题的id
     */
    private Integer judgeProblemId;

    /**
     * 判断题的题目
     */
    private String title;

    /**
     * 判断题的答案
     */
    private Boolean answer;

    /**
     * judgeproblem
     */
    private static final long serialVersionUID = 1L;

    /**
     * 判断题的id
     * @return judge_problem_id 判断题的id
     */
    public Integer getJudgeProblemId() {
        return judgeProblemId;
    }

    /**
     * 判断题的id
     * @param judgeProblemId 判断题的id
     */
    public void setJudgeProblemId(Integer judgeProblemId) {
        this.judgeProblemId = judgeProblemId;
    }

    /**
     * 判断题的题目
     * @return title 判断题的题目
     */
    public String getTitle() {
        return title;
    }

    /**
     * 判断题的题目
     * @param title 判断题的题目
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 判断题的答案
     * @return answer 判断题的答案
     */
    public Boolean getAnswer() {
        return answer;
    }

    /**
     * 判断题的答案
     * @param answer 判断题的答案
     */
    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }
}