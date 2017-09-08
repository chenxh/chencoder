package com.chencoder.test.dao.model;

import com.chencoder.common.base.base.Example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErpLoginHistoryExample implements Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ErpLoginHistoryExample() {
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

        public Criteria andLoginIdIsNull() {
            addCriterion("login_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("login_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(Long value) {
            addCriterion("login_id =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(Long value) {
            addCriterion("login_id <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(Long value) {
            addCriterion("login_id >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(Long value) {
            addCriterion("login_id >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(Long value) {
            addCriterion("login_id <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(Long value) {
            addCriterion("login_id <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<Long> values) {
            addCriterion("login_id in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<Long> values) {
            addCriterion("login_id not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(Long value1, Long value2) {
            addCriterion("login_id between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(Long value1, Long value2) {
            addCriterion("login_id not between", value1, value2, "loginId");
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

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginTokenIsNull() {
            addCriterion("login_token is null");
            return (Criteria) this;
        }

        public Criteria andLoginTokenIsNotNull() {
            addCriterion("login_token is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTokenEqualTo(String value) {
            addCriterion("login_token =", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenNotEqualTo(String value) {
            addCriterion("login_token <>", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenGreaterThan(String value) {
            addCriterion("login_token >", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenGreaterThanOrEqualTo(String value) {
            addCriterion("login_token >=", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenLessThan(String value) {
            addCriterion("login_token <", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenLessThanOrEqualTo(String value) {
            addCriterion("login_token <=", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenLike(String value) {
            addCriterion("login_token like", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenNotLike(String value) {
            addCriterion("login_token not like", value, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenIn(List<String> values) {
            addCriterion("login_token in", values, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenNotIn(List<String> values) {
            addCriterion("login_token not in", values, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenBetween(String value1, String value2) {
            addCriterion("login_token between", value1, value2, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginTokenNotBetween(String value1, String value2) {
            addCriterion("login_token not between", value1, value2, "loginToken");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidIsNull() {
            addCriterion("login_storeId is null");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidIsNotNull() {
            addCriterion("login_storeId is not null");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidEqualTo(String value) {
            addCriterion("login_storeId =", value, "loginStoreid");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidNotEqualTo(String value) {
            addCriterion("login_storeId <>", value, "loginStoreid");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidGreaterThan(String value) {
            addCriterion("login_storeId >", value, "loginStoreid");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidGreaterThanOrEqualTo(String value) {
            addCriterion("login_storeId >=", value, "loginStoreid");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidLessThan(String value) {
            addCriterion("login_storeId <", value, "loginStoreid");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidLessThanOrEqualTo(String value) {
            addCriterion("login_storeId <=", value, "loginStoreid");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidLike(String value) {
            addCriterion("login_storeId like", value, "loginStoreid");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidNotLike(String value) {
            addCriterion("login_storeId not like", value, "loginStoreid");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidIn(List<String> values) {
            addCriterion("login_storeId in", values, "loginStoreid");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidNotIn(List<String> values) {
            addCriterion("login_storeId not in", values, "loginStoreid");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidBetween(String value1, String value2) {
            addCriterion("login_storeId between", value1, value2, "loginStoreid");
            return (Criteria) this;
        }

        public Criteria andLoginStoreidNotBetween(String value1, String value2) {
            addCriterion("login_storeId not between", value1, value2, "loginStoreid");
            return (Criteria) this;
        }

        public Criteria andSationIdIsNull() {
            addCriterion("sation_id is null");
            return (Criteria) this;
        }

        public Criteria andSationIdIsNotNull() {
            addCriterion("sation_id is not null");
            return (Criteria) this;
        }

        public Criteria andSationIdEqualTo(Long value) {
            addCriterion("sation_id =", value, "sationId");
            return (Criteria) this;
        }

        public Criteria andSationIdNotEqualTo(Long value) {
            addCriterion("sation_id <>", value, "sationId");
            return (Criteria) this;
        }

        public Criteria andSationIdGreaterThan(Long value) {
            addCriterion("sation_id >", value, "sationId");
            return (Criteria) this;
        }

        public Criteria andSationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sation_id >=", value, "sationId");
            return (Criteria) this;
        }

        public Criteria andSationIdLessThan(Long value) {
            addCriterion("sation_id <", value, "sationId");
            return (Criteria) this;
        }

        public Criteria andSationIdLessThanOrEqualTo(Long value) {
            addCriterion("sation_id <=", value, "sationId");
            return (Criteria) this;
        }

        public Criteria andSationIdIn(List<Long> values) {
            addCriterion("sation_id in", values, "sationId");
            return (Criteria) this;
        }

        public Criteria andSationIdNotIn(List<Long> values) {
            addCriterion("sation_id not in", values, "sationId");
            return (Criteria) this;
        }

        public Criteria andSationIdBetween(Long value1, Long value2) {
            addCriterion("sation_id between", value1, value2, "sationId");
            return (Criteria) this;
        }

        public Criteria andSationIdNotBetween(Long value1, Long value2) {
            addCriterion("sation_id not between", value1, value2, "sationId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Long value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Long value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Long value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Long value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Long> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Long> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Long value1, Long value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andMktTypeIsNull() {
            addCriterion("mkt_type is null");
            return (Criteria) this;
        }

        public Criteria andMktTypeIsNotNull() {
            addCriterion("mkt_type is not null");
            return (Criteria) this;
        }

        public Criteria andMktTypeEqualTo(Long value) {
            addCriterion("mkt_type =", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeNotEqualTo(Long value) {
            addCriterion("mkt_type <>", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeGreaterThan(Long value) {
            addCriterion("mkt_type >", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("mkt_type >=", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeLessThan(Long value) {
            addCriterion("mkt_type <", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeLessThanOrEqualTo(Long value) {
            addCriterion("mkt_type <=", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeIn(List<Long> values) {
            addCriterion("mkt_type in", values, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeNotIn(List<Long> values) {
            addCriterion("mkt_type not in", values, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeBetween(Long value1, Long value2) {
            addCriterion("mkt_type between", value1, value2, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeNotBetween(Long value1, Long value2) {
            addCriterion("mkt_type not between", value1, value2, "mktType");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andSysversionIsNull() {
            addCriterion("sysVersion is null");
            return (Criteria) this;
        }

        public Criteria andSysversionIsNotNull() {
            addCriterion("sysVersion is not null");
            return (Criteria) this;
        }

        public Criteria andSysversionEqualTo(String value) {
            addCriterion("sysVersion =", value, "sysversion");
            return (Criteria) this;
        }

        public Criteria andSysversionNotEqualTo(String value) {
            addCriterion("sysVersion <>", value, "sysversion");
            return (Criteria) this;
        }

        public Criteria andSysversionGreaterThan(String value) {
            addCriterion("sysVersion >", value, "sysversion");
            return (Criteria) this;
        }

        public Criteria andSysversionGreaterThanOrEqualTo(String value) {
            addCriterion("sysVersion >=", value, "sysversion");
            return (Criteria) this;
        }

        public Criteria andSysversionLessThan(String value) {
            addCriterion("sysVersion <", value, "sysversion");
            return (Criteria) this;
        }

        public Criteria andSysversionLessThanOrEqualTo(String value) {
            addCriterion("sysVersion <=", value, "sysversion");
            return (Criteria) this;
        }

        public Criteria andSysversionLike(String value) {
            addCriterion("sysVersion like", value, "sysversion");
            return (Criteria) this;
        }

        public Criteria andSysversionNotLike(String value) {
            addCriterion("sysVersion not like", value, "sysversion");
            return (Criteria) this;
        }

        public Criteria andSysversionIn(List<String> values) {
            addCriterion("sysVersion in", values, "sysversion");
            return (Criteria) this;
        }

        public Criteria andSysversionNotIn(List<String> values) {
            addCriterion("sysVersion not in", values, "sysversion");
            return (Criteria) this;
        }

        public Criteria andSysversionBetween(String value1, String value2) {
            addCriterion("sysVersion between", value1, value2, "sysversion");
            return (Criteria) this;
        }

        public Criteria andSysversionNotBetween(String value1, String value2) {
            addCriterion("sysVersion not between", value1, value2, "sysversion");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNull() {
            addCriterion("device is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNotNull() {
            addCriterion("device is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEqualTo(String value) {
            addCriterion("device =", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotEqualTo(String value) {
            addCriterion("device <>", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThan(String value) {
            addCriterion("device >", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("device >=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThan(String value) {
            addCriterion("device <", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThanOrEqualTo(String value) {
            addCriterion("device <=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLike(String value) {
            addCriterion("device like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotLike(String value) {
            addCriterion("device not like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceIn(List<String> values) {
            addCriterion("device in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotIn(List<String> values) {
            addCriterion("device not in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceBetween(String value1, String value2) {
            addCriterion("device between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotBetween(String value1, String value2) {
            addCriterion("device not between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andVenderidIsNull() {
            addCriterion("venderId is null");
            return (Criteria) this;
        }

        public Criteria andVenderidIsNotNull() {
            addCriterion("venderId is not null");
            return (Criteria) this;
        }

        public Criteria andVenderidEqualTo(String value) {
            addCriterion("venderId =", value, "venderid");
            return (Criteria) this;
        }

        public Criteria andVenderidNotEqualTo(String value) {
            addCriterion("venderId <>", value, "venderid");
            return (Criteria) this;
        }

        public Criteria andVenderidGreaterThan(String value) {
            addCriterion("venderId >", value, "venderid");
            return (Criteria) this;
        }

        public Criteria andVenderidGreaterThanOrEqualTo(String value) {
            addCriterion("venderId >=", value, "venderid");
            return (Criteria) this;
        }

        public Criteria andVenderidLessThan(String value) {
            addCriterion("venderId <", value, "venderid");
            return (Criteria) this;
        }

        public Criteria andVenderidLessThanOrEqualTo(String value) {
            addCriterion("venderId <=", value, "venderid");
            return (Criteria) this;
        }

        public Criteria andVenderidLike(String value) {
            addCriterion("venderId like", value, "venderid");
            return (Criteria) this;
        }

        public Criteria andVenderidNotLike(String value) {
            addCriterion("venderId not like", value, "venderid");
            return (Criteria) this;
        }

        public Criteria andVenderidIn(List<String> values) {
            addCriterion("venderId in", values, "venderid");
            return (Criteria) this;
        }

        public Criteria andVenderidNotIn(List<String> values) {
            addCriterion("venderId not in", values, "venderid");
            return (Criteria) this;
        }

        public Criteria andVenderidBetween(String value1, String value2) {
            addCriterion("venderId between", value1, value2, "venderid");
            return (Criteria) this;
        }

        public Criteria andVenderidNotBetween(String value1, String value2) {
            addCriterion("venderId not between", value1, value2, "venderid");
            return (Criteria) this;
        }

        public Criteria andApiversionIsNull() {
            addCriterion("apiVersion is null");
            return (Criteria) this;
        }

        public Criteria andApiversionIsNotNull() {
            addCriterion("apiVersion is not null");
            return (Criteria) this;
        }

        public Criteria andApiversionEqualTo(String value) {
            addCriterion("apiVersion =", value, "apiversion");
            return (Criteria) this;
        }

        public Criteria andApiversionNotEqualTo(String value) {
            addCriterion("apiVersion <>", value, "apiversion");
            return (Criteria) this;
        }

        public Criteria andApiversionGreaterThan(String value) {
            addCriterion("apiVersion >", value, "apiversion");
            return (Criteria) this;
        }

        public Criteria andApiversionGreaterThanOrEqualTo(String value) {
            addCriterion("apiVersion >=", value, "apiversion");
            return (Criteria) this;
        }

        public Criteria andApiversionLessThan(String value) {
            addCriterion("apiVersion <", value, "apiversion");
            return (Criteria) this;
        }

        public Criteria andApiversionLessThanOrEqualTo(String value) {
            addCriterion("apiVersion <=", value, "apiversion");
            return (Criteria) this;
        }

        public Criteria andApiversionLike(String value) {
            addCriterion("apiVersion like", value, "apiversion");
            return (Criteria) this;
        }

        public Criteria andApiversionNotLike(String value) {
            addCriterion("apiVersion not like", value, "apiversion");
            return (Criteria) this;
        }

        public Criteria andApiversionIn(List<String> values) {
            addCriterion("apiVersion in", values, "apiversion");
            return (Criteria) this;
        }

        public Criteria andApiversionNotIn(List<String> values) {
            addCriterion("apiVersion not in", values, "apiversion");
            return (Criteria) this;
        }

        public Criteria andApiversionBetween(String value1, String value2) {
            addCriterion("apiVersion between", value1, value2, "apiversion");
            return (Criteria) this;
        }

        public Criteria andApiversionNotBetween(String value1, String value2) {
            addCriterion("apiVersion not between", value1, value2, "apiversion");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeIsNull() {
            addCriterion("logout_time is null");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeIsNotNull() {
            addCriterion("logout_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeEqualTo(Date value) {
            addCriterion("logout_time =", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeNotEqualTo(Date value) {
            addCriterion("logout_time <>", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeGreaterThan(Date value) {
            addCriterion("logout_time >", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logout_time >=", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeLessThan(Date value) {
            addCriterion("logout_time <", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeLessThanOrEqualTo(Date value) {
            addCriterion("logout_time <=", value, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeIn(List<Date> values) {
            addCriterion("logout_time in", values, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeNotIn(List<Date> values) {
            addCriterion("logout_time not in", values, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeBetween(Date value1, Date value2) {
            addCriterion("logout_time between", value1, value2, "logoutTime");
            return (Criteria) this;
        }

        public Criteria andLogoutTimeNotBetween(Date value1, Date value2) {
            addCriterion("logout_time not between", value1, value2, "logoutTime");
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