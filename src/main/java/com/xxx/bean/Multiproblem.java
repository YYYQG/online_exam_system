package com.xxx.bean;

import java.io.Serializable;

public class Multiproblem implements Serializable {
    /**
     * 多选题的id
     */
    private Integer multiProblemId;

    /**
     * 多选题的题目
     */
    private String title;

    /**
     * 多选的选项A
     */
    private String optiona;

    /**
     * 多选的选项B
     */
    private String optionb;

    /**
     * 多选的选项C
     */
    private String optionc;

    /**
     * 多选的选项D
     */
    private String optiond;

    /**
     * 正确答案是A还是B还是C还是D
     */
    private String answer;

    /**
     * multiproblem
     */
    private static final long serialVersionUID = 1L;

    /**
     * 多选题的id
     * @return multi_problem_id 多选题的id
     */
    public Integer getMultiProblemId() {
        return multiProblemId;
    }

    /**
     * 多选题的id
     * @param multiProblemId 多选题的id
     */
    public void setMultiProblemId(Integer multiProblemId) {
        this.multiProblemId = multiProblemId;
    }

    /**
     * 多选题的题目
     * @return title 多选题的题目
     */
    public String getTitle() {
        return title;
    }

    /**
     * 多选题的题目
     * @param title 多选题的题目
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 多选的选项A
     * @return optionA 多选的选项A
     */
    public String getOptiona() {
        return optiona;
    }

    /**
     * 多选的选项A
     * @param optiona 多选的选项A
     */
    public void setOptiona(String optiona) {
        this.optiona = optiona;
    }

    /**
     * 多选的选项B
     * @return optionB 多选的选项B
     */
    public String getOptionb() {
        return optionb;
    }

    /**
     * 多选的选项B
     * @param optionb 多选的选项B
     */
    public void setOptionb(String optionb) {
        this.optionb = optionb;
    }

    /**
     * 多选的选项C
     * @return optionC 多选的选项C
     */
    public String getOptionc() {
        return optionc;
    }

    /**
     * 多选的选项C
     * @param optionc 多选的选项C
     */
    public void setOptionc(String optionc) {
        this.optionc = optionc;
    }

    /**
     * 多选的选项D
     * @return optionD 多选的选项D
     */
    public String getOptiond() {
        return optiond;
    }

    /**
     * 多选的选项D
     * @param optiond 多选的选项D
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