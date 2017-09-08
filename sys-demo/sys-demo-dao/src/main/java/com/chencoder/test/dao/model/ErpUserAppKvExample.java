package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErpUserAppKvExample implements Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ErpUserAppKvExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserKeyIsNull() {
            addCriterion("user_key is null");
            return (Criteria) this;
        }

        public Criteria andUserKeyIsNotNull() {
            addCriterion("user_key is not null");
            return (Criteria) this;
        }

        public Criteria andUserKeyEqualTo(String value) {
            addCriterion("user_key =", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotEqualTo(String value) {
            addCriterion("user_key <>", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyGreaterThan(String value) {
            addCriterion("user_key >", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyGreaterThanOrEqualTo(String value) {
            addCriterion("user_key >=", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLessThan(String value) {
            addCriterion("user_key <", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLessThanOrEqualTo(String value) {
            addCriterion("user_key <=", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLike(String value) {
            addCriterion("user_key like", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotLike(String value) {
            addCriterion("user_key not like", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyIn(List<String> values) {
            addCriterion("user_key in", values, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotIn(List<String> values) {
            addCriterion("user_key not in", values, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyBetween(String value1, String value2) {
            addCriterion("user_key between", value1, value2, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotBetween(String value1, String value2) {
            addCriterion("user_key not between", value1, value2, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserValueIsNull() {
            addCriterion("user_value is null");
            return (Criteria) this;
        }

        public Criteria andUserValueIsNotNull() {
            addCriterion("user_value is not null");
            return (Criteria) this;
        }

        public Criteria andUserValueEqualTo(String value) {
            addCriterion("user_value =", value, "userValue");
            return (Criteria) this;
        }

        public Criteria andUserValueNotEqualTo(String value) {
            addCriterion("user_value <>", value, "userValue");
            return (Criteria) this;
        }

        public Criteria andUserValueGreaterThan(String value) {
            addCriterion("user_value >", value, "userValue");
            return (Criteria) this;
        }

        public Criteria andUserValueGreaterThanOrEqualTo(String value) {
            addCriterion("user_value >=", value, "userValue");
            return (Criteria) this;
        }

        public Criteria andUserValueLessThan(String value) {
            addCriterion("user_value <", value, "userValue");
            return (Criteria) this;
        }

        public Criteria andUserValueLessThanOrEqualTo(String value) {
            addCriterion("user_value <=", value, "userValue");
            return (Criteria) this;
        }

        public Criteria andUserValueLike(String value) {
            addCriterion("user_value like", value, "userValue");
            return (Criteria) this;
        }

        public Criteria andUserValueNotLike(String value) {
            addCriterion("user_value not like", value, "userValue");
            return (Criteria) this;
        }

        public Criteria andUserValueIn(List<String> values) {
            addCriterion("user_value in", values, "userValue");
            return (Criteria) this;
        }

        public Criteria andUserValueNotIn(List<String> values) {
            addCriterion("user_value not in", values, "userValue");
            return (Criteria) this;
        }

        public Criteria andUserValueBetween(String value1, String value2) {
            addCriterion("user_value between", value1, value2, "userValue");
            return (Criteria) this;
        }

        public Criteria andUserValueNotBetween(String value1, String value2) {
            addCriterion("user_value not between", value1, value2, "userValue");
            return (Criteria) this;
        }

        public Criteria andAccountDictIdIsNull() {
            addCriterion("account_dict_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountDictIdIsNotNull() {
            addCriterion("account_dict_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountDictIdEqualTo(Long value) {
            addCriterion("account_dict_id =", value, "accountDictId");
            return (Criteria) this;
        }

        public Criteria andAccountDictIdNotEqualTo(Long value) {
            addCriterion("account_dict_id <>", value, "accountDictId");
            return (Criteria) this;
        }

        public Criteria andAccountDictIdGreaterThan(Long value) {
            addCriterion("account_dict_id >", value, "accountDictId");
            return (Criteria) this;
        }

        public Criteria andAccountDictIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_dict_id >=", value, "accountDictId");
            return (Criteria) this;
        }

        public Criteria andAccountDictIdLessThan(Long value) {
            addCriterion("account_dict_id <", value, "accountDictId");
            return (Criteria) this;
        }

        public Criteria andAccountDictIdLessThanOrEqualTo(Long value) {
            addCriterion("account_dict_id <=", value, "accountDictId");
            return (Criteria) this;
        }

        public Criteria andAccountDictIdIn(List<Long> values) {
            addCriterion("account_dict_id in", values, "accountDictId");
            return (Criteria) this;
        }

        public Criteria andAccountDictIdNotIn(List<Long> values) {
            addCriterion("account_dict_id not in", values, "accountDictId");
            return (Criteria) this;
        }

        public Criteria andAccountDictIdBetween(Long value1, Long value2) {
            addCriterion("account_dict_id between", value1, value2, "accountDictId");
            return (Criteria) this;
        }

        public Criteria andAccountDictIdNotBetween(Long value1, Long value2) {
            addCriterion("account_dict_id not between", value1, value2, "accountDictId");
            return (Criteria) this;
        }

        public Criteria andExtDictIdIsNull() {
            addCriterion("ext_dict_id is null");
            return (Criteria) this;
        }

        public Criteria andExtDictIdIsNotNull() {
            addCriterion("ext_dict_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtDictIdEqualTo(Long value) {
            addCriterion("ext_dict_id =", value, "extDictId");
            return (Criteria) this;
        }

        public Criteria andExtDictIdNotEqualTo(Long value) {
            addCriterion("ext_dict_id <>", value, "extDictId");
            return (Criteria) this;
        }

        public Criteria andExtDictIdGreaterThan(Long value) {
            addCriterion("ext_dict_id >", value, "extDictId");
            return (Criteria) this;
        }

        public Criteria andExtDictIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ext_dict_id >=", value, "extDictId");
            return (Criteria) this;
        }

        public Criteria andExtDictIdLessThan(Long value) {
            addCriterion("ext_dict_id <", value, "extDictId");
            return (Criteria) this;
        }

        public Criteria andExtDictIdLessThanOrEqualTo(Long value) {
            addCriterion("ext_dict_id <=", value, "extDictId");
            return (Criteria) this;
        }

        public Criteria andExtDictIdIn(List<Long> values) {
            addCriterion("ext_dict_id in", values, "extDictId");
            return (Criteria) this;
        }

        public Criteria andExtDictIdNotIn(List<Long> values) {
            addCriterion("ext_dict_id not in", values, "extDictId");
            return (Criteria) this;
        }

        public Criteria andExtDictIdBetween(Long value1, Long value2) {
            addCriterion("ext_dict_id between", value1, value2, "extDictId");
            return (Criteria) this;
        }

        public Criteria andExtDictIdNotBetween(Long value1, Long value2) {
            addCriterion("ext_dict_id not between", value1, value2, "extDictId");
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