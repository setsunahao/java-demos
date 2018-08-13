package com.example.blog.entity;

import java.util.Date;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.id
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.content_id
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    private String contentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.commit_id
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    private String commitId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.by_id
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    private String byId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.comment_content
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    private String commentContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.commit_time
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    private Date commitTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.children
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    private String children;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_comment.upvote
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    private Integer upvote;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.id
     *
     * @return the value of t_comment.id
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.id
     *
     * @param id the value for t_comment.id
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.content_id
     *
     * @return the value of t_comment.content_id
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public String getContentId() {
        return contentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.content_id
     *
     * @param contentId the value for t_comment.content_id
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public void setContentId(String contentId) {
        this.contentId = contentId == null ? null : contentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.commit_id
     *
     * @return the value of t_comment.commit_id
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.commit_id
     *
     * @param commitId the value for t_comment.commit_id
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public void setCommitId(String commitId) {
        this.commitId = commitId == null ? null : commitId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.by_id
     *
     * @return the value of t_comment.by_id
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public String getById() {
        return byId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.by_id
     *
     * @param byId the value for t_comment.by_id
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public void setById(String byId) {
        this.byId = byId == null ? null : byId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.comment_content
     *
     * @return the value of t_comment.comment_content
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.comment_content
     *
     * @param commentContent the value for t_comment.comment_content
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.commit_time
     *
     * @return the value of t_comment.commit_time
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public Date getCommitTime() {
        return commitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.commit_time
     *
     * @param commitTime the value for t_comment.commit_time
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.children
     *
     * @return the value of t_comment.children
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public String getChildren() {
        return children;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.children
     *
     * @param children the value for t_comment.children
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public void setChildren(String children) {
        this.children = children == null ? null : children.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_comment.upvote
     *
     * @return the value of t_comment.upvote
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public Integer getUpvote() {
        return upvote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_comment.upvote
     *
     * @param upvote the value for t_comment.upvote
     *
     * @mbg.generated Tue Jul 17 16:26:37 CST 2018
     */
    public void setUpvote(Integer upvote) {
        this.upvote = upvote;
    }
}