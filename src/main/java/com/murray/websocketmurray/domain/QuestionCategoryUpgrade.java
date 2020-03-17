package com.murray.websocketmurray.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * 答题分类知识书等级配置表 sdw_question_category_upgrade
 * @author mybatis-generator
 * date:2020/02/15 17:22
 */
public class QuestionCategoryUpgrade implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = -904574038189075129L;

    /** 
     * 主键，自增
     */ 
    private Integer questionCategoryUpgradeId;

    /** 
     * 分类表  默认：0
     */ 
    private Integer questionCategoryId;

    /** 
     * 等级编号  默认：0
     */ 
    private Byte upgradeSn;

    /** 
     * 知识书道具ID,可能会有多个分类使用同一个道具情况
     */ 
    private String questionPropId;

    /** 
     * 知识书数量  默认：0
     */ 
    private Byte number;

    /** 
     * 所需金币  默认：0
     */ 
    private Short gold;

    /** 
     * 分数百分比:得分增加%  默认：0
     */ 
    private Byte score;

    /** 
     * 最后一次修改时间
     */ 
    private Date updatedAt;

    /** 
     * 创建时间  默认：CURRENT_TIMESTAMP
     */ 
    private Date createdAt;

    /** 
     * 获取 主键，自增 sdw_question_category_upgrade.question_category_upgrade_id
     * @return 主键，自增
     */
    public Integer getQuestionCategoryUpgradeId() {
        return questionCategoryUpgradeId;
    }

    /** 
     * 设置 主键，自增 sdw_question_category_upgrade.question_category_upgrade_id
     * @param questionCategoryUpgradeId 主键，自增
     */
    public void setQuestionCategoryUpgradeId(Integer questionCategoryUpgradeId) {
        this.questionCategoryUpgradeId = questionCategoryUpgradeId;
    }

    /** 
     * 获取 分类表 sdw_question_category_upgrade.question_category_id
     * @return 分类表
     */
    public Integer getQuestionCategoryId() {
        return questionCategoryId;
    }

    /** 
     * 设置 分类表 sdw_question_category_upgrade.question_category_id
     * @param questionCategoryId 分类表
     */
    public void setQuestionCategoryId(Integer questionCategoryId) {
        this.questionCategoryId = questionCategoryId;
    }

    /** 
     * 获取 等级编号 sdw_question_category_upgrade.upgrade_sn
     * @return 等级编号
     */
    public Byte getUpgradeSn() {
        return upgradeSn;
    }

    /** 
     * 设置 等级编号 sdw_question_category_upgrade.upgrade_sn
     * @param upgradeSn 等级编号
     */
    public void setUpgradeSn(Byte upgradeSn) {
        this.upgradeSn = upgradeSn;
    }

    /** 
     * 获取 知识书道具ID,可能会有多个分类使用同一个道具情况 sdw_question_category_upgrade.question_prop_id
     * @return 知识书道具ID,可能会有多个分类使用同一个道具情况
     */
    public String getQuestionPropId() {
        return questionPropId;
    }

    /** 
     * 设置 知识书道具ID,可能会有多个分类使用同一个道具情况 sdw_question_category_upgrade.question_prop_id
     * @param questionPropId 知识书道具ID,可能会有多个分类使用同一个道具情况
     */
    public void setQuestionPropId(String questionPropId) {
        this.questionPropId = questionPropId == null ? null : questionPropId.trim();
    }

    /** 
     * 获取 知识书数量 sdw_question_category_upgrade.number
     * @return 知识书数量
     */
    public Byte getNumber() {
        return number;
    }

    /** 
     * 设置 知识书数量 sdw_question_category_upgrade.number
     * @param number 知识书数量
     */
    public void setNumber(Byte number) {
        this.number = number;
    }

    /** 
     * 获取 所需金币 sdw_question_category_upgrade.gold
     * @return 所需金币
     */
    public Short getGold() {
        return gold;
    }

    /** 
     * 设置 所需金币 sdw_question_category_upgrade.gold
     * @param gold 所需金币
     */
    public void setGold(Short gold) {
        this.gold = gold;
    }

    /** 
     * 获取 分数百分比:得分增加% sdw_question_category_upgrade.score
     * @return 分数百分比:得分增加%
     */
    public Byte getScore() {
        return score;
    }

    /** 
     * 设置 分数百分比:得分增加% sdw_question_category_upgrade.score
     * @param score 分数百分比:得分增加%
     */
    public void setScore(Byte score) {
        this.score = score;
    }

    /** 
     * 获取 最后一次修改时间 sdw_question_category_upgrade.updated_at
     * @return 最后一次修改时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /** 
     * 设置 最后一次修改时间 sdw_question_category_upgrade.updated_at
     * @param updatedAt 最后一次修改时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /** 
     * 获取 创建时间 sdw_question_category_upgrade.created_at
     * @return 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /** 
     * 设置 创建时间 sdw_question_category_upgrade.created_at
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
        sb.append(", questionCategoryUpgradeId=").append(questionCategoryUpgradeId);
        sb.append(", questionCategoryId=").append(questionCategoryId);
        sb.append(", upgradeSn=").append(upgradeSn);
        sb.append(", questionPropId=").append(questionPropId);
        sb.append(", number=").append(number);
        sb.append(", gold=").append(gold);
        sb.append(", score=").append(score);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append("]");
        return sb.toString();
    }
}