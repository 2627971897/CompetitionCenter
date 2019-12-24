package com.edu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProCollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProCollectExample() {
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

        public Criteria andProColIdIsNull() {
            addCriterion("PRO_COL_ID is null");
            return (Criteria) this;
        }

        public Criteria andProColIdIsNotNull() {
            addCriterion("PRO_COL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProColIdEqualTo(Integer value) {
            addCriterion("PRO_COL_ID =", value, "proColId");
            return (Criteria) this;
        }

        public Criteria andProColIdNotEqualTo(Integer value) {
            addCriterion("PRO_COL_ID <>", value, "proColId");
            return (Criteria) this;
        }

        public Criteria andProColIdGreaterThan(Integer value) {
            addCriterion("PRO_COL_ID >", value, "proColId");
            return (Criteria) this;
        }

        public Criteria andProColIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_COL_ID >=", value, "proColId");
            return (Criteria) this;
        }

        public Criteria andProColIdLessThan(Integer value) {
            addCriterion("PRO_COL_ID <", value, "proColId");
            return (Criteria) this;
        }

        public Criteria andProColIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_COL_ID <=", value, "proColId");
            return (Criteria) this;
        }

        public Criteria andProColIdIn(List<Integer> values) {
            addCriterion("PRO_COL_ID in", values, "proColId");
            return (Criteria) this;
        }

        public Criteria andProColIdNotIn(List<Integer> values) {
            addCriterion("PRO_COL_ID not in", values, "proColId");
            return (Criteria) this;
        }

        public Criteria andProColIdBetween(Integer value1, Integer value2) {
            addCriterion("PRO_COL_ID between", value1, value2, "proColId");
            return (Criteria) this;
        }

        public Criteria andProColIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_COL_ID not between", value1, value2, "proColId");
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

        public Criteria andProNameIsNull() {
            addCriterion("PRO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("PRO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("PRO_NAME =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("PRO_NAME <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("PRO_NAME >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_NAME >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("PRO_NAME <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("PRO_NAME <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("PRO_NAME like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("PRO_NAME not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("PRO_NAME in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("PRO_NAME not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("PRO_NAME between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("PRO_NAME not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProLinkIsNull() {
            addCriterion("PRO_LINK is null");
            return (Criteria) this;
        }

        public Criteria andProLinkIsNotNull() {
            addCriterion("PRO_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andProLinkEqualTo(String value) {
            addCriterion("PRO_LINK =", value, "proLink");
            return (Criteria) this;
        }

        public Criteria andProLinkNotEqualTo(String value) {
            addCriterion("PRO_LINK <>", value, "proLink");
            return (Criteria) this;
        }

        public Criteria andProLinkGreaterThan(String value) {
            addCriterion("PRO_LINK >", value, "proLink");
            return (Criteria) this;
        }

        public Criteria andProLinkGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_LINK >=", value, "proLink");
            return (Criteria) this;
        }

        public Criteria andProLinkLessThan(String value) {
            addCriterion("PRO_LINK <", value, "proLink");
            return (Criteria) this;
        }

        public Criteria andProLinkLessThanOrEqualTo(String value) {
            addCriterion("PRO_LINK <=", value, "proLink");
            return (Criteria) this;
        }

        public Criteria andProLinkLike(String value) {
            addCriterion("PRO_LINK like", value, "proLink");
            return (Criteria) this;
        }

        public Criteria andProLinkNotLike(String value) {
            addCriterion("PRO_LINK not like", value, "proLink");
            return (Criteria) this;
        }

        public Criteria andProLinkIn(List<String> values) {
            addCriterion("PRO_LINK in", values, "proLink");
            return (Criteria) this;
        }

        public Criteria andProLinkNotIn(List<String> values) {
            addCriterion("PRO_LINK not in", values, "proLink");
            return (Criteria) this;
        }

        public Criteria andProLinkBetween(String value1, String value2) {
            addCriterion("PRO_LINK between", value1, value2, "proLink");
            return (Criteria) this;
        }

        public Criteria andProLinkNotBetween(String value1, String value2) {
            addCriterion("PRO_LINK not between", value1, value2, "proLink");
            return (Criteria) this;
        }

        public Criteria andProColTimeIsNull() {
            addCriterion("PRO_COL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProColTimeIsNotNull() {
            addCriterion("PRO_COL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProColTimeEqualTo(Date value) {
            addCriterion("PRO_COL_TIME =", value, "proColTime");
            return (Criteria) this;
        }

        public Criteria andProColTimeNotEqualTo(Date value) {
            addCriterion("PRO_COL_TIME <>", value, "proColTime");
            return (Criteria) this;
        }

        public Criteria andProColTimeGreaterThan(Date value) {
            addCriterion("PRO_COL_TIME >", value, "proColTime");
            return (Criteria) this;
        }

        public Criteria andProColTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PRO_COL_TIME >=", value, "proColTime");
            return (Criteria) this;
        }

        public Criteria andProColTimeLessThan(Date value) {
            addCriterion("PRO_COL_TIME <", value, "proColTime");
            return (Criteria) this;
        }

        public Criteria andProColTimeLessThanOrEqualTo(Date value) {
            addCriterion("PRO_COL_TIME <=", value, "proColTime");
            return (Criteria) this;
        }

        public Criteria andProColTimeIn(List<Date> values) {
            addCriterion("PRO_COL_TIME in", values, "proColTime");
            return (Criteria) this;
        }

        public Criteria andProColTimeNotIn(List<Date> values) {
            addCriterion("PRO_COL_TIME not in", values, "proColTime");
            return (Criteria) this;
        }

        public Criteria andProColTimeBetween(Date value1, Date value2) {
            addCriterion("PRO_COL_TIME between", value1, value2, "proColTime");
            return (Criteria) this;
        }

        public Criteria andProColTimeNotBetween(Date value1, Date value2) {
            addCriterion("PRO_COL_TIME not between", value1, value2, "proColTime");
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