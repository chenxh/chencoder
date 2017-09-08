package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SyncSapDepExample implements Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SyncSapDepExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements java.io.Serializable {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeIsNull() {
            addCriterion("parent_dep_code is null");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeIsNotNull() {
            addCriterion("parent_dep_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeEqualTo(String value) {
            addCriterion("parent_dep_code =", value, "parentDepCode");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeNotEqualTo(String value) {
            addCriterion("parent_dep_code <>", value, "parentDepCode");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeGreaterThan(String value) {
            addCriterion("parent_dep_code >", value, "parentDepCode");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_dep_code >=", value, "parentDepCode");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeLessThan(String value) {
            addCriterion("parent_dep_code <", value, "parentDepCode");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_dep_code <=", value, "parentDepCode");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeLike(String value) {
            addCriterion("parent_dep_code like", value, "parentDepCode");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeNotLike(String value) {
            addCriterion("parent_dep_code not like", value, "parentDepCode");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeIn(List<String> values) {
            addCriterion("parent_dep_code in", values, "parentDepCode");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeNotIn(List<String> values) {
            addCriterion("parent_dep_code not in", values, "parentDepCode");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeBetween(String value1, String value2) {
            addCriterion("parent_dep_code between", value1, value2, "parentDepCode");
            return (Criteria) this;
        }

        public Criteria andParentDepCodeNotBetween(String value1, String value2) {
            addCriterion("parent_dep_code not between", value1, value2, "parentDepCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeIsNull() {
            addCriterion("dep_code is null");
            return (Criteria) this;
        }

        public Criteria andDepCodeIsNotNull() {
            addCriterion("dep_code is not null");
            return (Criteria) this;
        }

        public Criteria andDepCodeEqualTo(String value) {
            addCriterion("dep_code =", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeNotEqualTo(String value) {
            addCriterion("dep_code <>", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeGreaterThan(String value) {
            addCriterion("dep_code >", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dep_code >=", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeLessThan(String value) {
            addCriterion("dep_code <", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeLessThanOrEqualTo(String value) {
            addCriterion("dep_code <=", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeLike(String value) {
            addCriterion("dep_code like", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeNotLike(String value) {
            addCriterion("dep_code not like", value, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeIn(List<String> values) {
            addCriterion("dep_code in", values, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeNotIn(List<String> values) {
            addCriterion("dep_code not in", values, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeBetween(String value1, String value2) {
            addCriterion("dep_code between", value1, value2, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepCodeNotBetween(String value1, String value2) {
            addCriterion("dep_code not between", value1, value2, "depCode");
            return (Criteria) this;
        }

        public Criteria andDepNameIsNull() {
            addCriterion("dep_name is null");
            return (Criteria) this;
        }

        public Criteria andDepNameIsNotNull() {
            addCriterion("dep_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepNameEqualTo(String value) {
            addCriterion("dep_name =", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotEqualTo(String value) {
            addCriterion("dep_name <>", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThan(String value) {
            addCriterion("dep_name >", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThanOrEqualTo(String value) {
            addCriterion("dep_name >=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThan(String value) {
            addCriterion("dep_name <", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThanOrEqualTo(String value) {
            addCriterion("dep_name <=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLike(String value) {
            addCriterion("dep_name like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotLike(String value) {
            addCriterion("dep_name not like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameIn(List<String> values) {
            addCriterion("dep_name in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotIn(List<String> values) {
            addCriterion("dep_name not in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameBetween(String value1, String value2) {
            addCriterion("dep_name between", value1, value2, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotBetween(String value1, String value2) {
            addCriterion("dep_name not between", value1, value2, "depName");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements java.io.Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements java.io.Serializable {
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