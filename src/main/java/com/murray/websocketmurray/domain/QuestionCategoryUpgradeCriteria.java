package com.murray.websocketmurray.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author mybatis-generator
 * date:2020/02/15 17:22
 */
public class QuestionCategoryUpgradeCriteria {
    /** 
     * 排序字段
    */
    protected String orderByClause;

    /** 
     * 过滤重复数据
    */
    protected boolean distinct;

    /** 
     * 查询条件
    */
    protected List<Criteria> oredCriteria;

    /** 
     * 构造查询条件
     */
    public QuestionCategoryUpgradeCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /** 
     * 设置排序字段
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /** 
     * 获取排序字段
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /** 
     * 设置过滤重复数据
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /** 
     * 是否过滤重复数据
     */
    public boolean isDistinct() {
        return distinct;
    }

    /** 
     * 获取当前的查询条件实例
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /** 
     * 增加或者的查询条件,用于构建或者查询
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /** 
     * 创建一个新的或者查询条件
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /** 
     * 创建一个查询条件
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /** 
     * 内部构建查询条件对象
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /** 
     * 清除查询条件
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 答题分类知识书等级配置表sdw_question_category_upgrade
     */
    protected abstract static class BaseCriteria {
        protected List<Criterion> criteria;

        protected BaseCriteria() {
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

        public Criteria andQuestionCategoryUpgradeIdIsNull() {
            addCriterion("`question_category_upgrade_id` is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryUpgradeIdIsNotNull() {
            addCriterion("`question_category_upgrade_id` is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryUpgradeIdEqualTo(Integer value) {
            addCriterion("`question_category_upgrade_id` =", value, "questionCategoryUpgradeId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryUpgradeIdNotEqualTo(Integer value) {
            addCriterion("`question_category_upgrade_id` <>", value, "questionCategoryUpgradeId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryUpgradeIdGreaterThan(Integer value) {
            addCriterion("`question_category_upgrade_id` >", value, "questionCategoryUpgradeId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryUpgradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`question_category_upgrade_id` >=", value, "questionCategoryUpgradeId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryUpgradeIdLessThan(Integer value) {
            addCriterion("`question_category_upgrade_id` <", value, "questionCategoryUpgradeId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryUpgradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("`question_category_upgrade_id` <=", value, "questionCategoryUpgradeId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryUpgradeIdIn(List<Integer> values) {
            addCriterion("`question_category_upgrade_id` in", values, "questionCategoryUpgradeId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryUpgradeIdNotIn(List<Integer> values) {
            addCriterion("`question_category_upgrade_id` not in", values, "questionCategoryUpgradeId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryUpgradeIdBetween(Integer value1, Integer value2) {
            addCriterion("`question_category_upgrade_id` between", value1, value2, "questionCategoryUpgradeId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryUpgradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`question_category_upgrade_id` not between", value1, value2, "questionCategoryUpgradeId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdIsNull() {
            addCriterion("`question_category_id` is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdIsNotNull() {
            addCriterion("`question_category_id` is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdEqualTo(Integer value) {
            addCriterion("`question_category_id` =", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdNotEqualTo(Integer value) {
            addCriterion("`question_category_id` <>", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdGreaterThan(Integer value) {
            addCriterion("`question_category_id` >", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`question_category_id` >=", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdLessThan(Integer value) {
            addCriterion("`question_category_id` <", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("`question_category_id` <=", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdIn(List<Integer> values) {
            addCriterion("`question_category_id` in", values, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdNotIn(List<Integer> values) {
            addCriterion("`question_category_id` not in", values, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("`question_category_id` between", value1, value2, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`question_category_id` not between", value1, value2, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnIsNull() {
            addCriterion("`upgrade_sn` is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnIsNotNull() {
            addCriterion("`upgrade_sn` is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnEqualTo(Byte value) {
            addCriterion("`upgrade_sn` =", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnNotEqualTo(Byte value) {
            addCriterion("`upgrade_sn` <>", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnGreaterThan(Byte value) {
            addCriterion("`upgrade_sn` >", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnGreaterThanOrEqualTo(Byte value) {
            addCriterion("`upgrade_sn` >=", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnLessThan(Byte value) {
            addCriterion("`upgrade_sn` <", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnLessThanOrEqualTo(Byte value) {
            addCriterion("`upgrade_sn` <=", value, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnIn(List<Byte> values) {
            addCriterion("`upgrade_sn` in", values, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnNotIn(List<Byte> values) {
            addCriterion("`upgrade_sn` not in", values, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnBetween(Byte value1, Byte value2) {
            addCriterion("`upgrade_sn` between", value1, value2, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andUpgradeSnNotBetween(Byte value1, Byte value2) {
            addCriterion("`upgrade_sn` not between", value1, value2, "upgradeSn");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdIsNull() {
            addCriterion("`question_prop_id` is null");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdIsNotNull() {
            addCriterion("`question_prop_id` is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdEqualTo(String value) {
            addCriterion("`question_prop_id` =", value, "questionPropId");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdNotEqualTo(String value) {
            addCriterion("`question_prop_id` <>", value, "questionPropId");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdGreaterThan(String value) {
            addCriterion("`question_prop_id` >", value, "questionPropId");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdGreaterThanOrEqualTo(String value) {
            addCriterion("`question_prop_id` >=", value, "questionPropId");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdLessThan(String value) {
            addCriterion("`question_prop_id` <", value, "questionPropId");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdLessThanOrEqualTo(String value) {
            addCriterion("`question_prop_id` <=", value, "questionPropId");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdLike(String value) {
            addCriterion("`question_prop_id` like", value, "questionPropId");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdNotLike(String value) {
            addCriterion("`question_prop_id` not like", value, "questionPropId");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdIn(List<String> values) {
            addCriterion("`question_prop_id` in", values, "questionPropId");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdNotIn(List<String> values) {
            addCriterion("`question_prop_id` not in", values, "questionPropId");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdBetween(String value1, String value2) {
            addCriterion("`question_prop_id` between", value1, value2, "questionPropId");
            return (Criteria) this;
        }

        public Criteria andQuestionPropIdNotBetween(String value1, String value2) {
            addCriterion("`question_prop_id` not between", value1, value2, "questionPropId");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("`number` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("`number` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Byte value) {
            addCriterion("`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Byte value) {
            addCriterion("`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Byte value) {
            addCriterion("`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Byte value) {
            addCriterion("`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Byte value) {
            addCriterion("`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Byte> values) {
            addCriterion("`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Byte> values) {
            addCriterion("`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Byte value1, Byte value2) {
            addCriterion("`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("`number` not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andGoldIsNull() {
            addCriterion("`gold` is null");
            return (Criteria) this;
        }

        public Criteria andGoldIsNotNull() {
            addCriterion("`gold` is not null");
            return (Criteria) this;
        }

        public Criteria andGoldEqualTo(Short value) {
            addCriterion("`gold` =", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotEqualTo(Short value) {
            addCriterion("`gold` <>", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThan(Short value) {
            addCriterion("`gold` >", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThanOrEqualTo(Short value) {
            addCriterion("`gold` >=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThan(Short value) {
            addCriterion("`gold` <", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThanOrEqualTo(Short value) {
            addCriterion("`gold` <=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldIn(List<Short> values) {
            addCriterion("`gold` in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotIn(List<Short> values) {
            addCriterion("`gold` not in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldBetween(Short value1, Short value2) {
            addCriterion("`gold` between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotBetween(Short value1, Short value2) {
            addCriterion("`gold` not between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("`score` is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("`score` is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Byte value) {
            addCriterion("`score` =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Byte value) {
            addCriterion("`score` <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Byte value) {
            addCriterion("`score` >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("`score` >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Byte value) {
            addCriterion("`score` <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Byte value) {
            addCriterion("`score` <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Byte> values) {
            addCriterion("`score` in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Byte> values) {
            addCriterion("`score` not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Byte value1, Byte value2) {
            addCriterion("`score` between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Byte value1, Byte value2) {
            addCriterion("`score` not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("`updated_at` is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("`updated_at` is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("`updated_at` =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("`updated_at` <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("`updated_at` >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("`updated_at` >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("`updated_at` <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("`updated_at` <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("`updated_at` in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("`updated_at` not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("`updated_at` between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("`updated_at` not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("`created_at` is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("`created_at` is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("`created_at` =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("`created_at` <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("`created_at` >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("`created_at` >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("`created_at` <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("`created_at` <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("`created_at` in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("`created_at` not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("`created_at` between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("`created_at` not between", value1, value2, "createdAt");
            return (Criteria) this;
        }
    }

    /**
     * 答题分类知识书等级配置表sdw_question_category_upgrade的映射实体
     */
    public static class Criteria extends BaseCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 答题分类知识书等级配置表sdw_question_category_upgrade的动态SQL对象.
     */
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