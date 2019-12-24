package com.edu.po;

import java.util.ArrayList;
import java.util.List;

public class EntryExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EntryExtendExample() {
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

        public Criteria andEntryExtendIdIsNull() {
            addCriterion("ENTRY_EXTEND_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntryExtendIdIsNotNull() {
            addCriterion("ENTRY_EXTEND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntryExtendIdEqualTo(Integer value) {
            addCriterion("ENTRY_EXTEND_ID =", value, "entryExtendId");
            return (Criteria) this;
        }

        public Criteria andEntryExtendIdNotEqualTo(Integer value) {
            addCriterion("ENTRY_EXTEND_ID <>", value, "entryExtendId");
            return (Criteria) this;
        }

        public Criteria andEntryExtendIdGreaterThan(Integer value) {
            addCriterion("ENTRY_EXTEND_ID >", value, "entryExtendId");
            return (Criteria) this;
        }

        public Criteria andEntryExtendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTRY_EXTEND_ID >=", value, "entryExtendId");
            return (Criteria) this;
        }

        public Criteria andEntryExtendIdLessThan(Integer value) {
            addCriterion("ENTRY_EXTEND_ID <", value, "entryExtendId");
            return (Criteria) this;
        }

        public Criteria andEntryExtendIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENTRY_EXTEND_ID <=", value, "entryExtendId");
            return (Criteria) this;
        }

        public Criteria andEntryExtendIdIn(List<Integer> values) {
            addCriterion("ENTRY_EXTEND_ID in", values, "entryExtendId");
            return (Criteria) this;
        }

        public Criteria andEntryExtendIdNotIn(List<Integer> values) {
            addCriterion("ENTRY_EXTEND_ID not in", values, "entryExtendId");
            return (Criteria) this;
        }

        public Criteria andEntryExtendIdBetween(Integer value1, Integer value2) {
            addCriterion("ENTRY_EXTEND_ID between", value1, value2, "entryExtendId");
            return (Criteria) this;
        }

        public Criteria andEntryExtendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTRY_EXTEND_ID not between", value1, value2, "entryExtendId");
            return (Criteria) this;
        }

        public Criteria andEntryIdIsNull() {
            addCriterion("ENTRY_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntryIdIsNotNull() {
            addCriterion("ENTRY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntryIdEqualTo(Integer value) {
            addCriterion("ENTRY_ID =", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotEqualTo(Integer value) {
            addCriterion("ENTRY_ID <>", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdGreaterThan(Integer value) {
            addCriterion("ENTRY_ID >", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTRY_ID >=", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdLessThan(Integer value) {
            addCriterion("ENTRY_ID <", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENTRY_ID <=", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdIn(List<Integer> values) {
            addCriterion("ENTRY_ID in", values, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotIn(List<Integer> values) {
            addCriterion("ENTRY_ID not in", values, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdBetween(Integer value1, Integer value2) {
            addCriterion("ENTRY_ID between", value1, value2, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTRY_ID not between", value1, value2, "entryId");
            return (Criteria) this;
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

        public Criteria andExtendValueIsNull() {
            addCriterion("EXTEND_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andExtendValueIsNotNull() {
            addCriterion("EXTEND_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andExtendValueEqualTo(String value) {
            addCriterion("EXTEND_VALUE =", value, "extendValue");
            return (Criteria) this;
        }

        public Criteria andExtendValueNotEqualTo(String value) {
            addCriterion("EXTEND_VALUE <>", value, "extendValue");
            return (Criteria) this;
        }

        public Criteria andExtendValueGreaterThan(String value) {
            addCriterion("EXTEND_VALUE >", value, "extendValue");
            return (Criteria) this;
        }

        public Criteria andExtendValueGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE >=", value, "extendValue");
            return (Criteria) this;
        }

        public Criteria andExtendValueLessThan(String value) {
            addCriterion("EXTEND_VALUE <", value, "extendValue");
            return (Criteria) this;
        }

        public Criteria andExtendValueLessThanOrEqualTo(String value) {
            addCriterion("EXTEND_VALUE <=", value, "extendValue");
            return (Criteria) this;
        }

        public Criteria andExtendValueLike(String value) {
            addCriterion("EXTEND_VALUE like", value, "extendValue");
            return (Criteria) this;
        }

        public Criteria andExtendValueNotLike(String value) {
            addCriterion("EXTEND_VALUE not like", value, "extendValue");
            return (Criteria) this;
        }

        public Criteria andExtendValueIn(List<String> values) {
            addCriterion("EXTEND_VALUE in", values, "extendValue");
            return (Criteria) this;
        }

        public Criteria andExtendValueNotIn(List<String> values) {
            addCriterion("EXTEND_VALUE not in", values, "extendValue");
            return (Criteria) this;
        }

        public Criteria andExtendValueBetween(String value1, String value2) {
            addCriterion("EXTEND_VALUE between", value1, value2, "extendValue");
            return (Criteria) this;
        }

        public Criteria andExtendValueNotBetween(String value1, String value2) {
            addCriterion("EXTEND_VALUE not between", value1, value2, "extendValue");
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