package com.xxx.bean;

import java.io.Serializable;

public class Singleproblem implements Serializable {
    /**
     * 单选题的id
     */
    private Integer singleProblemId;

    /**
     * 单选题的题目
     */
    private String title;

    /**
     * 选项A
     */
    private String optiona;

    /**
     * 选项B
     */
    private String optionb;

    /**
     * 选项C
     */
    private String optionc;

    /**
     * 选项D
     */
    private String optiond;

    /**
     * 正确答案是A还是B还是C还是D
     */
    private String answer;

    /**
     * singleproblem
     */
    private static final long serialVersionUID = 1L;

    /**
     * 单选题的id
     * @return single_problem_id 单选题的id
     */
    public Integer getSingleProblemId() {
        return singleProblemId;
    }

    /**
     * 单选题的id
     * @param singleProblemId 单选题的id
     */
    public void setSingleProblemId(Integer singleProblemId) {
        this.singleProblemId = singleProblemId;
    }

    /**
     * 单选题的题目
     * @return title 单选题的题目
     */
    public String getTitle() {
        return title;
    }

    /**
     * 单选题的题目
     * @param title 单选题的题目
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 选项A
     * @return optionA 选项A
     */
    public String getOptiona() {
        return optiona;
    }

    /**
     * 选项A
     * @param optiona 选项A
     */
    public void setOptiona(String optiona) {
        this.optiona = optiona;
    }

    /**
     * 选项B
     * @return optionB 选项B
     */
    public String getOptionb() {
        return optionb;
    }

    /**
     * 选项B
     * @param optionb 选项B
     */
    public void setOptionb(String optionb) {
        this.optionb = optionb;
    }

    /**
     * 选项C
     * @return optionC 选项C
     */
    public String getOptionc() {
        return optionc;
    }

    /**
     * 选项C
     * @param optionc 选项C
     */
    public void setOptionc(String optionc) {
        this.optionc = optionc;
    }

    /**
     * 选项D
     * @return optionD 选项D
     */
    public String getOptiond() {
        return optiond;
    }

    /**
     * 选项D
     * @param optiond 选项D
     */
    public void setOptiond(String optiond) {
        this.optiond = optiond;
    }

    /**
     * 正确答案是A还是B还是C还是D
     * @return answer 正确答案是A还是B还是C还是D
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 正确答案是A还是B还是C还是D
     * @param answer 正确答案是A还是B还是C还是D
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}