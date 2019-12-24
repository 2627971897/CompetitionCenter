package com.edu.po;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("TEACHER_ID =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("TEACHER_ID <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("TEACHER_ID >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_ID >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("TEACHER_ID <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_ID <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("TEACHER_ID like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("TEACHER_ID not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("TEACHER_ID in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("TEACHER_ID not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("TEACHER_ID between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("TEACHER_ID not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("TEACHER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("TEACHER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("TEACHER_NAME =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("TEACHER_NAME <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("TEACHER_NAME >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_NAME >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("TEACHER_NAME <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_NAME <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("TEACHER_NAME like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("TEACHER_NAME not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("TEACHER_NAME in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("TEACHER_NAME not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("TEACHER_NAME between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("TEACHER_NAME not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptIsNull() {
            addCriterion("TEACHER_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptIsNotNull() {
            addCriterion("TEACHER_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptEqualTo(String value) {
            addCriterion("TEACHER_DEPT =", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptNotEqualTo(String value) {
            addCriterion("TEACHER_DEPT <>", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptGreaterThan(String value) {
            addCriterion("TEACHER_DEPT >", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_DEPT >=", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptLessThan(String value) {
            addCriterion("TEACHER_DEPT <", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_DEPT <=", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptLike(String value) {
            addCriterion("TEACHER_DEPT like", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptNotLike(String value) {
            addCriterion("TEACHER_DEPT not like", value, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptIn(List<String> values) {
            addCriterion("TEACHER_DEPT in", values, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptNotIn(List<String> values) {
            addCriterion("TEACHER_DEPT not in", values, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptBetween(String value1, String value2) {
            addCriterion("TEACHER_DEPT between", value1, value2, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherDeptNotBetween(String value1, String value2) {
            addCriterion("TEACHER_DEPT not between", value1, value2, "teacherDept");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIsNull() {
            addCriterion("TEACHER_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIsNotNull() {
            addCriterion("TEACHER_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleEqualTo(String value) {
            addCriterion("TEACHER_TITLE =", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotEqualTo(String value) {
            addCriterion("TEACHER_TITLE <>", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleGreaterThan(String value) {
            addCriterion("TEACHER_TITLE >", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_TITLE >=", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLessThan(String value) {
            addCriterion("TEACHER_TITLE <", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_TITLE <=", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLike(String value) {
            addCriterion("TEACHER_TITLE like", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotLike(String value) {
            addCriterion("TEACHER_TITLE not like", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIn(List<String> values) {
            addCriterion("TEACHER_TITLE in", values, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotIn(List<String> values) {
            addCriterion("TEACHER_TITLE not in", values, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleBetween(String value1, String value2) {
            addCriterion("TEACHER_TITLE between", value1, value2, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotBetween(String value1, String value2) {
            addCriterion("TEACHER_TITLE not between", value1, value2, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherPostIsNull() {
            addCriterion("TEACHER_POST is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPostIsNotNull() {
            addCriterion("TEACHER_POST is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPostEqualTo(String value) {
            addCriterion("TEACHER_POST =", value, "teacherPost");
            return (Criteria) this;
        }

        public Criteria andTeacherPostNotEqualTo(String value) {
            addCriterion("TEACHER_POST <>", value, "teacherPost");
            return (Criteria) this;
        }

        public Criteria andTeacherPostGreaterThan(String value) {
            addCriterion("TEACHER_POST >", value, "teacherPost");
            return (Criteria) this;
        }

        public Criteria andTeacherPostGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_POST >=", value, "teacherPost");
            return (Criteria) this;
        }

        public Criteria andTeacherPostLessThan(String value) {
            addCriterion("TEACHER_POST <", value, "teacherPost");
            return (Criteria) this;
        }

        public Criteria andTeacherPostLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_POST <=", value, "teacherPost");
            return (Criteria) this;
        }

        public Criteria andTeacherPostLike(String value) {
            addCriterion("TEACHER_POST like", value, "teacherPost");
            return (Criteria) this;
        }

        public Criteria andTeacherPostNotLike(String value) {
            addCriterion("TEACHER_POST not like", value, "teacherPost");
            return (Criteria) this;
        }

        public Criteria andTeacherPostIn(List<String> values) {
            addCriterion("TEACHER_POST in", values, "teacherPost");
            return (Criteria) this;
        }

        public Criteria andTeacherPostNotIn(List<String> values) {
            addCriterion("TEACHER_POST not in", values, "teacherPost");
            return (Criteria) this;
        }

        public Criteria andTeacherPostBetween(String value1, String value2) {
            addCriterion("TEACHER_POST between", value1, value2, "teacherPost");
            return (Criteria) this;
        }

        public Criteria andTeacherPostNotBetween(String value1, String value2) {
            addCriterion("TEACHER_POST not between", value1, value2, "teacherPost");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdIsNull() {
            addCriterion("TEACHER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdIsNotNull() {
            addCriterion("TEACHER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdEqualTo(String value) {
            addCriterion("TEACHER_PWD =", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdNotEqualTo(String value) {
            addCriterion("TEACHER_PWD <>", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdGreaterThan(String value) {
            addCriterion("TEACHER_PWD >", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_PWD >=", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdLessThan(String value) {
            addCriterion("TEACHER_PWD <", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_PWD <=", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdLike(String value) {
            addCriterion("TEACHER_PWD like", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdNotLike(String value) {
            addCriterion("TEACHER_PWD not like", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdIn(List<String> values) {
            addCriterion("TEACHER_PWD in", values, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdNotIn(List<String> values) {
            addCriterion("TEACHER_PWD not in", values, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdBetween(String value1, String value2) {
            addCriterion("TEACHER_PWD between", value1, value2, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdNotBetween(String value1, String value2) {
            addCriterion("TEACHER_PWD not between", value1, value2, "teacherPwd");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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