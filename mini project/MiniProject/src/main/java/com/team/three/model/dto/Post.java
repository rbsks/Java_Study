package com.team.three.model.dto;

import java.util.Date;

public class Post {
	private int post_No;
	private String category;
	private String title;
	private String nickName;
	private Date write_Date;
	private Date update_Date;
	private String contents;
	private int step;
	private int depth;
	private int re_No;
	
	public Post() {
		
	}
	
	public Post(int post_No, String category, String title, String nickName, Date write_Date, Date update_Date,
			String contents, int step, int depth, int re_No) {
		this.post_No = post_No;
		this.category = category;
		this.title = title;
		this.nickName = nickName;
		this.write_Date = write_Date;
		this.update_Date = update_Date;
		this.contents = contents;
		this.step = step;
		this.depth = depth;
		this.re_No = re_No;
	}



	public int getPost_No() {
		return post_No;
	}

	public void setPost_No(int post_No) {
		this.post_No = post_No;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getWrite_Date() {
		return write_Date;
	}

	public void setWrite_Date(Date write_Date) {
		this.write_Date = write_Date;
	}

	public Date getUpdate_Date() {
		return update_Date;
	}

	public void setUpdate_Date(Date update_Date) {
		this.update_Date = update_Date;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getRe_No() {
		return re_No;
	}

	public void setRe_No(int re_No) {
		this.re_No = re_No;
	}

	@Override
	public String toString() {
		return "Post [post_No=" + post_No + ", category=" + category + ", title=" + title + ", nickName=" + nickName
				+ ", write_Date=" + write_Date + ", update_Date=" + update_Date + ", contents=" + contents + ", step="
				+ step + ", depth=" + depth + ", re_No=" + re_No + "]";
	}
	
	
}
