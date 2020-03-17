package com.murray.websocketmurray.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * 答题分类表 sdw_question_category
 * @author mybatis-generator
 * date:2020/02/15 17:22
 */
public class QuestionCategory implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -5493949627506429338L;

    /** 
     * 自增id
     */ 
    private Short questionCategoryId;

    /** 
     * 父级ID  默认：0
     */ 
    private Short parentId;

    /** 
     * 父级第一级分类ID  默认：0
     */ 
    private Short parentIdFirst;

    /** 
     * 名称
     */ 
    private String title;

    /** 
     * 分类的关键字,可能是为了搜索
     */ 
    private String keywords;

    /** 
     * 分类描叙
     */ 
    private String categoryDesc;

    /** 
     * 图标
     */ 
    private String icon;

    /** 
     * 弹出的图
     */ 
    private String thumb;

    /** 
     * 道具图片
     */ 
    private String propPic;

    /** 
     * 状态1显示2不显示  默认：1
     */ 
    private Byte state;

    /** 
     * 排序  默认：255
     */ 
    private Integer listOrder;

    /** 
     * 最后一次修改时间
     */ 
    private Date updatedAt;

    /** 
     * 创建时间  默认：CURRENT_TIMESTAMP
     */ 
    private Date createdAt;

    /** 
     * 获取 自增id sdw_question_category.question_category_id
     * @return 自增id
     */
    public Short getQuestionCategoryId() {
        return questionCategoryId;
    }

    /** 
     * 设置 自增id sdw_question_category.question_category_id
     * @param questionCategoryId 自增id
     */
    public void setQuestionCategoryId(Short questionCategoryId) {
        this.questionCategoryId = questionCategoryId;
    }

    /** 
     * 获取 父级ID sdw_question_category.parent_id
     * @return 父级ID
     */
    public Short getParentId() {
        return parentId;
    }

    /** 
     * 设置 父级ID sdw_question_category.parent_id
     * @param parentId 父级ID
     */
    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    /** 
     * 获取 父级第一级分类ID sdw_question_category.parent_id_first
     * @return 父级第一级分类ID
     */
    public Short getParentIdFirst() {
        return parentIdFirst;
    }

    /** 
     * 设置 父级第一级分类ID sdw_question_category.parent_id_first
     * @param parentIdFirst 父级第一级分类ID
     */
    public void setParentIdFirst(Short parentIdFirst) {
        this.parentIdFirst = parentIdFirst;
    }

    /** 
     * 获取 名称 sdw_question_category.title
     * @return 名称
     */
    public String getTitle() {
        return title;
    }

    /** 
     * 设置 名称 sdw_question_category.title
     * @param title 名称
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /** 
     * 获取 分类的关键字,可能是为了搜索 sdw_question_category.keywords
     * @return 分类的关键字,可能是为了搜索
     */
    public String getKeywords() {
        return keywords;
    }

    /** 
     * 设置 分类的关键字,可能是为了搜索 sdw_question_category.keywords
     * @param keywords 分类的关键字,可能是为了搜索
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /** 
     * 获取 分类描叙 sdw_question_category.category_desc
     * @return 分类描叙
     */
    public String getCategoryDesc() {
        return categoryDesc;
    }

    /** 
     * 设置 分类描叙 sdw_question_category.category_desc
     * @param categoryDesc 分类描叙
     */
    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc == null ? null : categoryDesc.trim();
    }

    /** 
     * 获取 图标 sdw_question_category.icon
     * @return 图标
     */
    public String getIcon() {
        return icon;
    }

    /** 
     * 设置 图标 sdw_question_category.icon
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /** 
     * 获取 弹出的图 sdw_question_category.thumb
     * @return 弹出的图
     */
    public String getThumb() {
        return thumb;
    }

    /** 
     * 设置 弹出的图 sdw_question_category.thumb
     * @param thumb 弹出的图
     */
    public void setThumb(String thumb) {
        this.thumb = thumb == null ? null : thumb.trim();
    }

    /** 
     * 获取 道具图片 sdw_question_category.prop_pic
     * @return 道具图片
     */
    public String getPropPic() {
        return propPic;
    }

    /** 
     * 设置 道具图片 sdw_question_category.prop_pic
     * @param propPic 道具图片
     */
    public void setPropPic(String propPic) {
        this.propPic = propPic == null ? null : propPic.trim();
    }

    /** 
     * 获取 状态1显示2不显示 sdw_question_category.state
     * @return 状态1显示2不显示
     */
    public Byte getState() {
        return state;
    }

    /** 
     * 设置 状态1显示2不显示 sdw_question_category.state
     * @param state 状态1显示2不显示
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /** 
     * 获取 排序 sdw_question_category.list_order
     * @return 排序
     */
    public Integer getListOrder() {
        return listOrder;
    }

    /** 
     * 设置 排序 sdw_question_category.list_order
     * @param listOrder 排序
     */
    public void setListOrder(Integer listOrder) {
        this.listOrder = listOrder;
    }

    /** 
     * 获取 最后一次修改时间 sdw_question_category.updated_at
     * @return 最后一次修改时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /** 
     * 设置 最后一次修改时间 sdw_question_category.updated_at
     * @param updatedAt 最后一次修改时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /** 
     * 获取 创建时间 sdw_question_category.created_at
     * @return 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /** 
     * 设置 创建时间 sdw_question_category.created_at
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", questionCategoryId=").append(questionCategoryId);
        sb.append(", parentId=").append(parentId);
        sb.append(", parentIdFirst=").append(parentIdFirst);
        sb.append(", title=").append(title);
        sb.append(", keywords=").append(keywords);
        sb.append(", categoryDesc=").append(categoryDesc);
        sb.append(", icon=").append(icon);
        sb.append(", thumb=").append(thumb);
        sb.append(", propPic=").append(propPic);
        sb.append(", state=").append(state);
        sb.append(", listOrder=").append(listOrder);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append("]");
        return sb.toString();
    }
}