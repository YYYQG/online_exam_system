package com.xxx.bean;

import java.util.ArrayList;
import java.util.List;

public class ExamUserExample {
    /**
     * exam_user
     */
    protected String orderByClause;

    /**
     * exam_user
     */
    protected boolean distinct;

    /**
     * exam_user
     */
    protected List<Criteria> oredCriteria;

    public ExamUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * exam_user 2018-11-12
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andExamIdIsNull() {
            addCriterion("exam_id is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(Integer value) {
            addCriterion("exam_id =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(Integer value) {
            addCriterion("exam_id <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(Integer value) {
            addCriterion("exam_id >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_id >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(Integer value) {
            addCriterion("exam_id <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_id <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<Integer> values) {
            addCriterion("exam_id in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<Integer> values) {
            addCriterion("exam_id not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_id between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_id not between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSingleproblemScoreIsNull() {
            addCriterion("singleproblem_score is null");
            return (Criteria) this;
        }

        public Criteria andSingleproblemScoreIsNotNull() {
            addCriterion("singleproblem_score is not null");
            return (Criteria) this;
        }

        public Criteria andSingleproblemScoreEqualTo(Integer value) {
            addCriterion("singleproblem_score =", value, "singleproblemScore");
            return (Criteria) this;
        }

        public Criteria andSingleproblemScoreNotEqualTo(Integer value) {
            addCriterion("singleproblem_score <>", value, "singleproblemScore");
            return (Criteria) this;
        }

        public Criteria andSingleproblemScoreGreaterThan(Integer value) {
            addCriterion("singleproblem_score >", value, "singleproblemScore");
            return (Criteria) this;
        }

        public Criteria andSingleproblemScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("singleproblem_score >=", value, "singleproblemScore");
            return (Criteria) this;
        }

        public Criteria andSingleproblemScoreLessThan(Integer value) {
            addCriterion("singleproblem_score <", value, "singleproblemScore");
            return (Criteria) this;
        }

        public Criteria andSingleproblemScoreLessThanOrEqualTo(Integer value) {
            addCriterion("singleproblem_score <=", value, "singleproblemScore");
            return (Criteria) this;
        }

        public Criteria andSingleproblemScoreIn(List<Integer> values) {
            addCriterion("singleproblem_score in", values, "singleproblemScore");
            return (Criteria) this;
        }

        public Criteria andSingleproblemScoreNotIn(List<Integer> values) {
            addCriterion("singleproblem_score not in", values, "singleproblemScore");
            return (Criteria) this;
        }

        public Criteria andSingleproblemScoreBetween(Integer value1, Integer value2) {
            addCriterion("singleproblem_score between", value1, value2, "singleproblemScore");
            return (Criteria) this;
        }

        public Criteria andSingleproblemScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("singleproblem_score not between", value1, value2, "singleproblemScore");
            return (Criteria) this;
        }

        public Criteria andMultisproblemScoreIsNull() {
            addCriterion("multisproblem_score is null");
            return (Criteria) this;
        }

        public Criteria andMultisproblemScoreIsNotNull() {
            addCriterion("multisproblem_score is not null");
            return (Criteria) this;
        }

        public Criteria andMultisproblemScoreEqualTo(Integer value) {
            addCriterion("multisproblem_score =", value, "multisproblemScore");
            return (Criteria) this;
        }

        public Criteria andMultisproblemScoreNotEqualTo(Integer value) {
            addCriterion("multisproblem_score <>", value, "multisproblemScore");
            return (Criteria) this;
        }

        public Criteria andMultisproblemScoreGreaterThan(Integer value) {
            addCriterion("multisproblem_score >", value, "multisproblemScore");
            return (Criteria) this;
        }

        public Criteria andMultisproblemScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("multisproblem_score >=", value, "multisproblemScore");
            return (Criteria) this;
        }

        public Criteria andMultisproblemScoreLessThan(Integer value) {
            addCriterion("multisproblem_score <", value, "multisproblemScore");
            return (Criteria) this;
        }

        public Criteria andMultisproblemScoreLessThanOrEqualTo(Integer value) {
            addCriterion("multisproblem_score <=", value, "multisproblemScore");
            return (Criteria) this;
        }

        public Criteria andMultisproblemScoreIn(List<Integer> values) {
            addCriterion("multisproblem_score in", values, "multisproblemScore");
            return (Criteria) this;
        }

        public Criteria andMultisproblemScoreNotIn(List<Integer> values) {
            addCriterion("multisproblem_score not in", values, "multisproblemScore");
            return (Criteria) this;
        }

        public Criteria andMultisproblemScoreBetween(Integer value1, Integer value2) {
            addCriterion("multisproblem_score between", value1, value2, "multisproblemScore");
            return (Criteria) this;
        }

        public Criteria andMultisproblemScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("multisproblem_score not between", value1, value2, "multisproblemScore");
            return (Criteria) this;
        }

        public Criteria andJudgeproblemScoreIsNull() {
            addCriterion("judgeproblem_score is null");
            return (Criteria) this;
        }

        public Criteria andJudgeproblemScoreIsNotNull() {
            addCriterion("judgeproblem_score is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeproblemScoreEqualTo(Integer value) {
            addCriterion("judgeproblem_score =", value, "judgeproblemScore");
            return (Criteria) this;
        }

        public Criteria andJudgeproblemScoreNotEqualTo(Integer value) {
            addCriterion("judgeproblem_score <>", value, "judgeproblemScore");
            return (Criteria) this;
        }

        public Criteria andJudgeproblemScoreGreaterThan(Integer value) {
            addCriterion("judgeproblem_score >", value, "judgeproblemScore");
            return (Criteria) this;
        }

        public Criteria andJudgeproblemScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("judgeproblem_score >=", value, "judgeproblemScore");
            return (Criteria) this;
        }

        public Criteria andJudgeproblemScoreLessThan(Integer value) {
            addCriterion("judgeproblem_score <", value, "judgeproblemScore");
            return (Criteria) this;
        }

        public Criteria andJudgeproblemScoreLessThanOrEqualTo(Integer value) {
            addCriterion("judgeproblem_score <=", value, "judgeproblemScore");
            return (Criteria) this;
        }

        public Criteria andJudgeproblemScoreIn(List<Integer> values) {
            addCriterion("judgeproblem_score in", values, "judgeproblemScore");
            return (Criteria) this;
        }

        public Criteria andJudgeproblemScoreNotIn(List<Integer> values) {
            addCriterion("judgeproblem_score not in", values, "judgeproblemScore");
            return (Criteria) this;
        }

        public Criteria andJudgeproblemScoreBetween(Integer value1, Integer value2) {
            addCriterion("judgeproblem_score between", value1, value2, "judgeproblemScore");
            return (Criteria) this;
        }

        public Criteria andJudgeproblemScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("judgeproblem_score not between", value1, value2, "judgeproblemScore");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Boolean value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Boolean value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Boolean value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Boolean value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Boolean> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Boolean> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("locked not between", value1, value2, "locked");
            return (Criteria) this;
        }
    }

    /**
     * exam_user
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * exam_user 2018-11-12
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}