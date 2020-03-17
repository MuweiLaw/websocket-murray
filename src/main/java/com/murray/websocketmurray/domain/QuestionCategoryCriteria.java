package com.murray.websocketmurray.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author mybatis-generator
 * date:2020/02/15 17:22
 */
public class QuestionCategoryCriteria {
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
    public QuestionCategoryCriteria() {
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
     * 答题分类表sdw_question_category
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

        public Criteria andQuestionCategoryIdIsNull() {
            addCriterion("`question_category_id` is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdIsNotNull() {
            addCriterion("`question_category_id` is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdEqualTo(Short value) {
            addCriterion("`question_category_id` =", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdNotEqualTo(Short value) {
            addCriterion("`question_category_id` <>", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdGreaterThan(Short value) {
            addCriterion("`question_category_id` >", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdGreaterThanOrEqualTo(Short value) {
            addCriterion("`question_category_id` >=", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdLessThan(Short value) {
            addCriterion("`question_category_id` <", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdLessThanOrEqualTo(Short value) {
            addCriterion("`question_category_id` <=", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdIn(List<Short> values) {
            addCriterion("`question_category_id` in", values, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdNotIn(List<Short> values) {
            addCriterion("`question_category_id` not in", values, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdBetween(Short value1, Short value2) {
            addCriterion("`question_category_id` between", value1, value2, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdNotBetween(Short value1, Short value2) {
            addCriterion("`question_category_id` not between", value1, value2, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("`parent_id` is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("`parent_id` is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Short value) {
            addCriterion("`parent_id` =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Short value) {
            addCriterion("`parent_id` <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Short value) {
            addCriterion("`parent_id` >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Short value) {
            addCriterion("`parent_id` >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Short value) {
            addCriterion("`parent_id` <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Short value) {
            addCriterion("`parent_id` <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Short> values) {
            addCriterion("`parent_id` in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Short> values) {
            addCriterion("`parent_id` not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Short value1, Short value2) {
            addCriterion("`parent_id` between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Short value1, Short value2) {
            addCriterion("`parent_id` not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdFirstIsNull() {
            addCriterion("`parent_id_first` is null");
            return (Criteria) this;
        }

        public Criteria andParentIdFirstIsNotNull() {
            addCriterion("`parent_id_first` is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdFirstEqualTo(Short value) {
            addCriterion("`parent_id_first` =", value, "parentIdFirst");
            return (Criteria) this;
        }

        public Criteria andParentIdFirstNotEqualTo(Short value) {
            addCriterion("`parent_id_first` <>", value, "parentIdFirst");
            return (Criteria) this;
        }

        public Criteria andParentIdFirstGreaterThan(Short value) {
            addCriterion("`parent_id_first` >", value, "parentIdFirst");
            return (Criteria) this;
        }

        public Criteria andParentIdFirstGreaterThanOrEqualTo(Short value) {
            addCriterion("`parent_id_first` >=", value, "parentIdFirst");
            return (Criteria) this;
        }

        public Criteria andParentIdFirstLessThan(Short value) {
            addCriterion("`parent_id_first` <", value, "parentIdFirst");
            return (Criteria) this;
        }

        public Criteria andParentIdFirstLessThanOrEqualTo(Short value) {
            addCriterion("`parent_id_first` <=", value, "parentIdFirst");
            return (Criteria) this;
        }

        public Criteria andParentIdFirstIn(List<Short> values) {
            addCriterion("`parent_id_first` in", values, "parentIdFirst");
            return (Criteria) this;
        }

        public Criteria andParentIdFirstNotIn(List<Short> values) {
            addCriterion("`parent_id_first` not in", values, "parentIdFirst");
            return (Criteria) this;
        }

        public Criteria andParentIdFirstBetween(Short value1, Short value2) {
            addCriterion("`parent_id_first` between", value1, value2, "parentIdFirst");
            return (Criteria) this;
        }

        public Criteria andParentIdFirstNotBetween(Short value1, Short value2) {
            addCriterion("`parent_id_first` not between", value1, value2, "parentIdFirst");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("`title` is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("`title` is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("`title` =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("`title` <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("`title` >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("`title` >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("`title` <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("`title` <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("`title` like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("`title` not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("`title` in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("`title` not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("`title` between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("`title` not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("`keywords` is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("`keywords` is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("`keywords` =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("`keywords` <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("`keywords` >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("`keywords` >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("`keywords` <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("`keywords` <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("`keywords` like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("`keywords` not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("`keywords` in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("`keywords` not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("`keywords` between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("`keywords` not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andCategoryDescIsNull() {
            addCriterion("`category_desc` is null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescIsNotNull() {
            addCriterion("`category_desc` is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescEqualTo(String value) {
            addCriterion("`category_desc` =", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotEqualTo(String value) {
            addCriterion("`category_desc` <>", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescGreaterThan(String value) {
            addCriterion("`category_desc` >", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescGreaterThanOrEqualTo(String value) {
            addCriterion("`category_desc` >=", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescLessThan(String value) {
            addCriterion("`category_desc` <", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescLessThanOrEqualTo(String value) {
            addCriterion("`category_desc` <=", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescLike(String value) {
            addCriterion("`category_desc` like", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotLike(String value) {
            addCriterion("`category_desc` not like", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescIn(List<String> values) {
            addCriterion("`category_desc` in", values, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotIn(List<String> values) {
            addCriterion("`category_desc` not in", values, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescBetween(String value1, String value2) {
            addCriterion("`category_desc` between", value1, value2, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotBetween(String value1, String value2) {
            addCriterion("`category_desc` not between", value1, value2, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("`icon` is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("`icon` is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("`icon` =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("`icon` <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("`icon` >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("`icon` >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("`icon` <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("`icon` <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("`icon` like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("`icon` not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("`icon` in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("`icon` not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("`icon` between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("`icon` not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andThumbIsNull() {
            addCriterion("`thumb` is null");
            return (Criteria) this;
        }

        public Criteria andThumbIsNotNull() {
            addCriterion("`thumb` is not null");
            return (Criteria) this;
        }

        public Criteria andThumbEqualTo(String value) {
            addCriterion("`thumb` =", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotEqualTo(String value) {
            addCriterion("`thumb` <>", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThan(String value) {
            addCriterion("`thumb` >", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThanOrEqualTo(String value) {
            addCriterion("`thumb` >=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThan(String value) {
            addCriterion("`thumb` <", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThanOrEqualTo(String value) {
            addCriterion("`thumb` <=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLike(String value) {
            addCriterion("`thumb` like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotLike(String value) {
            addCriterion("`thumb` not like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbIn(List<String> values) {
            addCriterion("`thumb` in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotIn(List<String> values) {
            addCriterion("`thumb` not in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbBetween(String value1, String value2) {
            addCriterion("`thumb` between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotBetween(String value1, String value2) {
            addCriterion("`thumb` not between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andPropPicIsNull() {
            addCriterion("`prop_pic` is null");
            return (Criteria) this;
        }

        public Criteria andPropPicIsNotNull() {
            addCriterion("`prop_pic` is not null");
            return (Criteria) this;
        }

        public Criteria andPropPicEqualTo(String value) {
            addCriterion("`prop_pic` =", value, "propPic");
            return (Criteria) this;
        }

        public Criteria andPropPicNotEqualTo(String value) {
            addCriterion("`prop_pic` <>", value, "propPic");
            return (Criteria) this;
        }

        public Criteria andPropPicGreaterThan(String value) {
            addCriterion("`prop_pic` >", value, "propPic");
            return (Criteria) this;
        }

        public Criteria andPropPicGreaterThanOrEqualTo(String value) {
            addCriterion("`prop_pic` >=", value, "propPic");
            return (Criteria) this;
        }

        public Criteria andPropPicLessThan(String value) {
            addCriterion("`prop_pic` <", value, "propPic");
            return (Criteria) this;
        }

        public Criteria andPropPicLessThanOrEqualTo(String value) {
            addCriterion("`prop_pic` <=", value, "propPic");
            return (Criteria) this;
        }

        public Criteria andPropPicLike(String value) {
            addCriterion("`prop_pic` like", value, "propPic");
            return (Criteria) this;
        }

        public Criteria andPropPicNotLike(String value) {
            addCriterion("`prop_pic` not like", value, "propPic");
            return (Criteria) this;
        }

        public Criteria andPropPicIn(List<String> values) {
            addCriterion("`prop_pic` in", values, "propPic");
            return (Criteria) this;
        }

        public Criteria andPropPicNotIn(List<String> values) {
            addCriterion("`prop_pic` not in", values, "propPic");
            return (Criteria) this;
        }

        public Criteria andPropPicBetween(String value1, String value2) {
            addCriterion("`prop_pic` between", value1, value2, "propPic");
            return (Criteria) this;
        }

        public Criteria andPropPicNotBetween(String value1, String value2) {
            addCriterion("`prop_pic` not between", value1, value2, "propPic");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andListOrderIsNull() {
            addCriterion("`list_order` is null");
            return (Criteria) this;
        }

        public Criteria andListOrderIsNotNull() {
            addCriterion("`list_order` is not null");
            return (Criteria) this;
        }

        public Criteria andListOrderEqualTo(Integer value) {
            addCriterion("`list_order` =", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderNotEqualTo(Integer value) {
            addCriterion("`list_order` <>", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderGreaterThan(Integer value) {
            addCriterion("`list_order` >", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("`list_order` >=", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderLessThan(Integer value) {
            addCriterion("`list_order` <", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderLessThanOrEqualTo(Integer value) {
            addCriterion("`list_order` <=", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderIn(List<Integer> values) {
            addCriterion("`list_order` in", values, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderNotIn(List<Integer> values) {
            addCriterion("`list_order` not in", values, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderBetween(Integer value1, Integer value2) {
            addCriterion("`list_order` between", value1, value2, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("`list_order` not between", value1, value2, "listOrder");
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
     * 答题分类表sdw_question_category的映射实体
     */
    public static class Criteria extends BaseCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 答题分类表sdw_question_category的动态SQL对象.
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