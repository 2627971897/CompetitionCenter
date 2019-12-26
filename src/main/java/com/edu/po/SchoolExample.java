package com.edu.po;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
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

        public Criteria andSchoolIdIsNull() {
            addCriterion("SCHOOL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("SCHOOL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("SCHOOL_ID =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("SCHOOL_ID <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("SCHOOL_ID >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCHOOL_ID >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("SCHOOL_ID <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("SCHOOL_ID <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("SCHOOL_ID in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("SCHOOL_ID not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("SCHOOL_ID between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SCHOOL_ID not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountIsNull() {
            addCriterion("SCHOOL_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountIsNotNull() {
            addCriterion("SCHOOL_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountEqualTo(String value) {
            addCriterion("SCHOOL_ACCOUNT =", value, "schoolAccount");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountNotEqualTo(String value) {
            addCriterion("SCHOOL_ACCOUNT <>", value, "schoolAccount");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountGreaterThan(String value) {
            addCriterion("SCHOOL_ACCOUNT >", value, "schoolAccount");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_ACCOUNT >=", value, "schoolAccount");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountLessThan(String value) {
            addCriterion("SCHOOL_ACCOUNT <", value, "schoolAccount");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_ACCOUNT <=", value, "schoolAccount");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountLike(String value) {
            addCriterion("SCHOOL_ACCOUNT like", value, "schoolAccount");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountNotLike(String value) {
            addCriterion("SCHOOL_ACCOUNT not like", value, "schoolAccount");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountIn(List<String> values) {
            addCriterion("SCHOOL_ACCOUNT in", values, "schoolAccount");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountNotIn(List<String> values) {
            addCriterion("SCHOOL_ACCOUNT not in", values, "schoolAccount");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountBetween(String value1, String value2) {
            addCriterion("SCHOOL_ACCOUNT between", value1, value2, "schoolAccount");
            return (Criteria) this;
        }

        public Criteria andSchoolAccountNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_ACCOUNT not between", value1, value2, "schoolAccount");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdIsNull() {
            addCriterion("SCHOOL_PWD is null");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdIsNotNull() {
            addCriterion("SCHOOL_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdEqualTo(String value) {
            addCriterion("SCHOOL_PWD =", value, "schoolPwd");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdNotEqualTo(String value) {
            addCriterion("SCHOOL_PWD <>", value, "schoolPwd");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdGreaterThan(String value) {
            addCriterion("SCHOOL_PWD >", value, "schoolPwd");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_PWD >=", value, "schoolPwd");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdLessThan(String value) {
            addCriterion("SCHOOL_PWD <", value, "schoolPwd");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_PWD <=", value, "schoolPwd");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdLike(String value) {
            addCriterion("SCHOOL_PWD like", value, "schoolPwd");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdNotLike(String value) {
            addCriterion("SCHOOL_PWD not like", value, "schoolPwd");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdIn(List<String> values) {
            addCriterion("SCHOOL_PWD in", values, "schoolPwd");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdNotIn(List<String> values) {
            addCriterion("SCHOOL_PWD not in", values, "schoolPwd");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdBetween(String value1, String value2) {
            addCriterion("SCHOOL_PWD between", value1, value2, "schoolPwd");
            return (Criteria) this;
        }

        public Criteria andSchoolPwdNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_PWD not between", value1, value2, "schoolPwd");
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