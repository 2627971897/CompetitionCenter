package com.edu.po;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("STUDENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("STUDENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("STUDENT_ID =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("STUDENT_ID <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("STUDENT_ID >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_ID >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("STUDENT_ID <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_ID <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("STUDENT_ID like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("STUDENT_ID not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("STUDENT_ID in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("STUDENT_ID not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("STUDENT_ID between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("STUDENT_ID not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("STUDENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("STUDENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("STUDENT_NAME =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("STUDENT_NAME <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("STUDENT_NAME >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_NAME >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("STUDENT_NAME <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_NAME <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("STUDENT_NAME like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("STUDENT_NAME not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("STUDENT_NAME in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("STUDENT_NAME not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("STUDENT_NAME between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("STUDENT_NAME not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIsNull() {
            addCriterion("STUDENT_MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIsNotNull() {
            addCriterion("STUDENT_MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andStudentMajorEqualTo(String value) {
            addCriterion("STUDENT_MAJOR =", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotEqualTo(String value) {
            addCriterion("STUDENT_MAJOR <>", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorGreaterThan(String value) {
            addCriterion("STUDENT_MAJOR >", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_MAJOR >=", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLessThan(String value) {
            addCriterion("STUDENT_MAJOR <", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_MAJOR <=", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLike(String value) {
            addCriterion("STUDENT_MAJOR like", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotLike(String value) {
            addCriterion("STUDENT_MAJOR not like", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIn(List<String> values) {
            addCriterion("STUDENT_MAJOR in", values, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotIn(List<String> values) {
            addCriterion("STUDENT_MAJOR not in", values, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorBetween(String value1, String value2) {
            addCriterion("STUDENT_MAJOR between", value1, value2, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotBetween(String value1, String value2) {
            addCriterion("STUDENT_MAJOR not between", value1, value2, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIsNull() {
            addCriterion("STUDENT_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIsNotNull() {
            addCriterion("STUDENT_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andStudentGradeEqualTo(String value) {
            addCriterion("STUDENT_GRADE =", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotEqualTo(String value) {
            addCriterion("STUDENT_GRADE <>", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeGreaterThan(String value) {
            addCriterion("STUDENT_GRADE >", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_GRADE >=", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLessThan(String value) {
            addCriterion("STUDENT_GRADE <", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_GRADE <=", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLike(String value) {
            addCriterion("STUDENT_GRADE like", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotLike(String value) {
            addCriterion("STUDENT_GRADE not like", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIn(List<String> values) {
            addCriterion("STUDENT_GRADE in", values, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotIn(List<String> values) {
            addCriterion("STUDENT_GRADE not in", values, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeBetween(String value1, String value2) {
            addCriterion("STUDENT_GRADE between", value1, value2, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotBetween(String value1, String value2) {
            addCriterion("STUDENT_GRADE not between", value1, value2, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentClassIsNull() {
            addCriterion("STUDENT_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andStudentClassIsNotNull() {
            addCriterion("STUDENT_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andStudentClassEqualTo(String value) {
            addCriterion("STUDENT_CLASS =", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotEqualTo(String value) {
            addCriterion("STUDENT_CLASS <>", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassGreaterThan(String value) {
            addCriterion("STUDENT_CLASS >", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_CLASS >=", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLessThan(String value) {
            addCriterion("STUDENT_CLASS <", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_CLASS <=", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassLike(String value) {
            addCriterion("STUDENT_CLASS like", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotLike(String value) {
            addCriterion("STUDENT_CLASS not like", value, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassIn(List<String> values) {
            addCriterion("STUDENT_CLASS in", values, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotIn(List<String> values) {
            addCriterion("STUDENT_CLASS not in", values, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassBetween(String value1, String value2) {
            addCriterion("STUDENT_CLASS between", value1, value2, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentClassNotBetween(String value1, String value2) {
            addCriterion("STUDENT_CLASS not between", value1, value2, "studentClass");
            return (Criteria) this;
        }

        public Criteria andStudentPwdIsNull() {
            addCriterion("STUDENT_PWD is null");
            return (Criteria) this;
        }

        public Criteria andStudentPwdIsNotNull() {
            addCriterion("STUDENT_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPwdEqualTo(String value) {
            addCriterion("STUDENT_PWD =", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdNotEqualTo(String value) {
            addCriterion("STUDENT_PWD <>", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdGreaterThan(String value) {
            addCriterion("STUDENT_PWD >", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_PWD >=", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdLessThan(String value) {
            addCriterion("STUDENT_PWD <", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_PWD <=", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdLike(String value) {
            addCriterion("STUDENT_PWD like", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdNotLike(String value) {
            addCriterion("STUDENT_PWD not like", value, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdIn(List<String> values) {
            addCriterion("STUDENT_PWD in", values, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdNotIn(List<String> values) {
            addCriterion("STUDENT_PWD not in", values, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdBetween(String value1, String value2) {
            addCriterion("STUDENT_PWD between", value1, value2, "studentPwd");
            return (Criteria) this;
        }

        public Criteria andStudentPwdNotBetween(String value1, String value2) {
            addCriterion("STUDENT_PWD not between", value1, value2, "studentPwd");
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