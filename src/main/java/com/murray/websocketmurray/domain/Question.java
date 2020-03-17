package com.murray.websocketmurray.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * 答题表 sdw_question
 * @author mybatis-generator
 * date:2020/02/15 17:22
 */
public class Question implements Serializable {
    /** 
     * 串行版本ID
    */
    private static final long serialVersionUID = 4567705301107501024L;

    /** 
     * 主键，自增
     */ 
    private Integer questionId;

    /** 
     * 答题分类id  默认：0
     */ 
    private Short questionCategoryId;

    /** 
     * 答案a
     */ 
    private String answerA;

    /** 
     * 答案b
     */ 
    private String answerB;

    /** 
     * 答案c
     */ 
    private String answerC;

    /** 
     * 答案d
     */ 
    private String answerD;

    /** 
     * 正确答案
     */ 
    private String answer;

    /** 
     * 难度：1容易2一般 3难  默认：1
     */ 
    private Byte isEasy;

    /** 
     * 创建时间  默认：CURRENT_TIMESTAMP
     */ 
    private Date createdAt;

    /** 
     * 最后一次修改时间
     */ 
    private Date updatedAt;

    /** 
     * 问题名
     */ 
    private String question;

    /** 
     * 获取 主键，自增 sdw_question.question_id
     * @return 主键，自增
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /** 
     * 设置 主键，自增 sdw_question.question_id
     * @param questionId 主键，自增
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /** 
     * 获取 答题分类id sdw_question.question_category_id
     * @return 答题分类id
     */
    public Short getQuestionCategoryId() {
        return questionCategoryId;
    }

    /** 
     * 设置 答题分类id sdw_question.question_category_id
     * @param questionCategoryId 答题分类id
     */
    public void setQuestionCategoryId(Short questionCategoryId) {
        this.questionCategoryId = questionCategoryId;
    }

    /** 
     * 获取 答案a sdw_question.answer_a
     * @return 答案a
     */
    public String getAnswerA() {
        return answerA;
    }

    /** 
     * 设置 答案a sdw_question.answer_a
     * @param answerA 答案a
     */
    public void setAnswerA(String answerA) {
        this.answerA = answerA == null ? null : answerA.trim();
    }

    /** 
     * 获取 答案b sdw_question.answer_b
     * @return 答案b
     */
    public String getAnswerB() {
        return answerB;
    }

    /** 
     * 设置 答案b sdw_question.answer_b
     * @param answerB 答案b
     */
    public void setAnswerB(String answerB) {
        this.answerB = answerB == null ? null : answerB.trim();
    }

    /** 
     * 获取 答案c sdw_question.answer_c
     * @return 答案c
     */
    public String getAnswerC() {
        return answerC;
    }

    /** 
     * 设置 答案c sdw_question.answer_c
     * @param answerC 答案c
     */
    public void setAnswerC(String answerC) {
        this.answerC = answerC == null ? null : answerC.trim();
    }

    /** 
     * 获取 答案d sdw_question.answer_d
     * @return 答案d
     */
    public String getAnswerD() {
        return answerD;
    }

    /** 
     * 设置 答案d sdw_question.answer_d
     * @param answerD 答案d
     */
    public void setAnswerD(String answerD) {
        this.answerD = answerD == null ? null : answerD.trim();
    }

    /** 
     * 获取 正确答案 sdw_question.answer
     * @return 正确答案
     */
    public String getAnswer() {
        return answer;
    }

    /** 
     * 设置 正确答案 sdw_question.answer
     * @param answer 正确答案
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    /** 
     * 获取 难度：1容易2一般 3难 sdw_question.is_easy
     * @return 难度：1容易2一般 3难
     */
    public Byte getIsEasy() {
        return isEasy;
    }

    /** 
     * 设置 难度：1容易2一般 3难 sdw_question.is_easy
     * @param isEasy 难度：1容易2一般 3难
     */
    public void setIsEasy(Byte isEasy) {
        this.isEasy = isEasy;
    }

    /** 
     * 获取 创建时间 sdw_question.created_at
     * @return 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /** 
     * 设置 创建时间 sdw_question.created_at
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /** 
     * 获取 最后一次修改时间 sdw_question.updated_at
     * @return 最后一次修改时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /** 
     * 设置 最后一次修改时间 sdw_question.updated_at
     * @param updatedAt 最后一次修改时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /** 
     * 获取 问题名 sdw_question.question
     * @return 问题名
     */
    public String getQuestion() {
        return question;
    }

    /** 
     * 设置 问题名 sdw_question.question
     * @param question 问题名
     */
    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", questionId=").append(questionId);
        sb.append(", questionCategoryId=").append(questionCategoryId);
        sb.append(", answerA=").append(answerA);
        sb.append(", answerB=").append(answerB);
        sb.append(", answerC=").append(answerC);
        sb.append(", answerD=").append(answerD);
        sb.append(", answer=").append(answer);
        sb.append(", isEasy=").append(isEasy);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", question=").append(question);
        sb.append("]");
        return sb.toString();
    }
}