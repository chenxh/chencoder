package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErpStaInfoExample implements Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ErpStaInfoExample() {
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

        public Criteria andStaCodeIsNull() {
            addCriterion("sta_code is null");
            return (Criteria) this;
        }

        public Criteria andStaCodeIsNotNull() {
            addCriterion("sta_code is not null");
            return (Criteria) this;
        }

        public Criteria andStaCodeEqualTo(String value) {
            addCriterion("sta_code =", value, "staCode");
            return (Criteria) this;
        }

        public Criteria andStaCodeNotEqualTo(String value) {
            addCriterion("sta_code <>", value, "staCode");
            return (Criteria) this;
        }

        public Criteria andStaCodeGreaterThan(String value) {
            addCriterion("sta_code >", value, "staCode");
            return (Criteria) this;
        }

        public Criteria andStaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sta_code >=", value, "staCode");
            return (Criteria) this;
        }

        public Criteria andStaCodeLessThan(String value) {
            addCriterion("sta_code <", value, "staCode");
            return (Criteria) this;
        }

        public Criteria andStaCodeLessThanOrEqualTo(String value) {
            addCriterion("sta_code <=", value, "staCode");
            return (Criteria) this;
        }

        public Criteria andStaCodeLike(String value) {
            addCriterion("sta_code like", value, "staCode");
            return (Criteria) this;
        }

        public Criteria andStaCodeNotLike(String value) {
            addCriterion("sta_code not like", value, "staCode");
            return (Criteria) this;
        }

        public Criteria andStaCodeIn(List<String> values) {
            addCriterion("sta_code in", values, "staCode");
            return (Criteria) this;
        }

        public Criteria andStaCodeNotIn(List<String> values) {
            addCriterion("sta_code not in", values, "staCode");
            return (Criteria) this;
        }

        public Criteria andStaCodeBetween(String value1, String value2) {
            addCriterion("sta_code between", value1, value2, "staCode");
            return (Criteria) this;
        }

        public Criteria andStaCodeNotBetween(String value1, String value2) {
            addCriterion("sta_code not between", value1, value2, "staCode");
            return (Criteria) this;
        }

        public Criteria andStaNameIsNull() {
            addCriterion("sta_name is null");
            return (Criteria) this;
        }

        public Criteria andStaNameIsNotNull() {
            addCriterion("sta_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaNameEqualTo(String value) {
            addCriterion("sta_name =", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameNotEqualTo(String value) {
            addCriterion("sta_name <>", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameGreaterThan(String value) {
            addCriterion("sta_name >", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameGreaterThanOrEqualTo(String value) {
            addCriterion("sta_name >=", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameLessThan(String value) {
            addCriterion("sta_name <", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameLessThanOrEqualTo(String value) {
            addCriterion("sta_name <=", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameLike(String value) {
            addCriterion("sta_name like", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameNotLike(String value) {
            addCriterion("sta_name not like", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameIn(List<String> values) {
            addCriterion("sta_name in", values, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameNotIn(List<String> values) {
            addCriterion("sta_name not in", values, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameBetween(String value1, String value2) {
            addCriterion("sta_name between", value1, value2, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameNotBetween(String value1, String value2) {
            addCriterion("sta_name not between", value1, value2, "staName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andLastUpdUserIsNull() {
            addCriterion("Last_upd_user is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdUserIsNotNull() {
            addCriterion("Last_upd_user is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdUserEqualTo(Long value) {
            addCriterion("Last_upd_user =", value, "lastUpdUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdUserNotEqualTo(Long value) {
            addCriterion("Last_upd_user <>", value, "lastUpdUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdUserGreaterThan(Long value) {
            addCriterion("Last_upd_user >", value, "lastUpdUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdUserGreaterThanOrEqualTo(Long value) {
            addCriterion("Last_upd_user >=", value, "lastUpdUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdUserLessThan(Long value) {
            addCriterion("Last_upd_user <", value, "lastUpdUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdUserLessThanOrEqualTo(Long value) {
            addCriterion("Last_upd_user <=", value, "lastUpdUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdUserIn(List<Long> values) {
            addCriterion("Last_upd_user in", values, "lastUpdUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdUserNotIn(List<Long> values) {
            addCriterion("Last_upd_user not in", values, "lastUpdUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdUserBetween(Long value1, Long value2) {
            addCriterion("Last_upd_user between", value1, value2, "lastUpdUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdUserNotBetween(Long value1, Long value2) {
            addCriterion("Last_upd_user not between", value1, value2, "lastUpdUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeIsNull() {
            addCriterion("last_upd_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeIsNotNull() {
            addCriterion("last_upd_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeEqualTo(Date value) {
            addCriterion("last_upd_time =", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotEqualTo(Date value) {
            addCriterion("last_upd_time <>", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeGreaterThan(Date value) {
            addCriterion("last_upd_time >", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_upd_time >=", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeLessThan(Date value) {
            addCriterion("last_upd_time <", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_upd_time <=", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeIn(List<Date> values) {
            addCriterion("last_upd_time in", values, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotIn(List<Date> values) {
            addCriterion("last_upd_time not in", values, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeBetween(Date value1, Date value2) {
            addCriterion("last_upd_time between", value1, value2, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_upd_time not between", value1, value2, "lastUpdTime");
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