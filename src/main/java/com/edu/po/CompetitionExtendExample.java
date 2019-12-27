package com.edu.po;

import java.util.ArrayList;
import java.util.List;

public class CompetitionExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompetitionExtendExample() {
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

        public Criteria andCompExtendIdIsNull() {
            addCriterion("COMP_EXTEND_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompExtendIdIsNotNull() {
            addCriterion("COMP_EXTEND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompExtendIdEqualTo(Integer value) {
            addCriterion("COMP_EXTEND_ID =", value, "compExtendId");
            return (Criteria) this;
        }

        public Criteria andCompExtendIdNotEqualTo(Integer value) {
            addCriterion("COMP_EXTEND_ID <>", value, "compExtendId");
            return (Criteria) this;
        }

        public Criteria andCompExtendIdGreaterThan(Integer value) {
            addCriterion("COMP_EXTEND_ID >", value, "compExtendId");
            return (Criteria) this;
        }

        public Criteria andCompExtendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMP_EXTEND_ID >=", value, "compExtendId");
            return (Criteria) this;
        }

        public Criteria andCompExtendIdLessThan(Integer value) {
            addCriterion("COMP_EXTEND_ID <", value, "compExtendId");
            return (Criteria) this;
        }

        public Criteria andCompExtendIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMP_EXTEND_ID <=", value, "compExtendId");
            return (Criteria) this;
        }

        public Criteria andCompExtendIdIn(List<Integer> values) {
            addCriterion("COMP_EXTEND_ID in", values, "compExtendId");
            return (Criteria) this;
        }

        public Criteria andCompExtendIdNotIn(List<Integer> values) {
            addCriterion("COMP_EXTEND_ID not in", values, "compExtendId");
            return (Criteria) this;
        }

        public Criteria andCompExtendIdBetween(Integer value1, Integer value2) {
            addCriterion("COMP_EXTEND_ID between", value1, value2, "compExtendId");
            return (Criteria) this;
        }

        public Criteria andCompExtendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMP_EXTEND_ID not between", value1, value2, "compExtendId");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNull() {
            addCriterion("COMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNotNull() {
            addCriterion("COMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompIdEqualTo(Integer value) {
            addCriterion("COMP_ID =", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotEqualTo(Integer value) {
            addCriterion("COMP_ID <>", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThan(Integer value) {
            addCriterion("COMP_ID >", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMP_ID >=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThan(Integer value) {
            addCriterion("COMP_ID <", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMP_ID <=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdIn(List<Integer> values) {
            addCriterion("COMP_ID in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotIn(List<Integer> values) {
            addCriterion("COMP_ID not in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdBetween(Integer value1, Integer value2) {
            addCriterion("COMP_ID between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMP_ID not between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andExtendKeyIsNull() {
            addCriterion("EXTEND_KEY is null");
            return (Criteria) this;
        }

        public Criteria andExtendKeyIsNotNull() {
            addCriterion("EXTEND_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andExtendKeyEqualTo(String value) {
            addCriterion("EXTEND_KEY =", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyNotEqualTo(String value) {
            addCriterion("EXTEND_KEY <>", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyGreaterThan(String value) {
            addCriterion("EXTEND_KEY >", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_KEY >=", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyLessThan(String value) {
            addCriterion("EXTEND_KEY <", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyLessThanOrEqualTo(String value) {
            addCriterion("EXTEND_KEY <=", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyLike(String value) {
            addCriterion("EXTEND_KEY like", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyNotLike(String value) {
            addCriterion("EXTEND_KEY not like", value, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyIn(List<String> values) {
            addCriterion("EXTEND_KEY in", values, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyNotIn(List<String> values) {
            addCriterion("EXTEND_KEY not in", values, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyBetween(String value1, String value2) {
            addCriterion("EXTEND_KEY between", value1, value2, "extendKey");
            return (Criteria) this;
        }

        public Criteria andExtendKeyNotBetween(String value1, String value2) {
            addCriterion("EXTEND_KEY not between", value1, value2, "extendKey");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("IS_DEL is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("IS_DEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("IS_DEL =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("IS_DEL <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("IS_DEL >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DEL >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("IS_DEL <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("IS_DEL <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("IS_DEL like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("IS_DEL not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("IS_DEL in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("IS_DEL not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("IS_DEL between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("IS_DEL not between", value1, value2, "isDel");
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