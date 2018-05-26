package com.demohot.transcript.model;

import com.alibaba.fastjson.JSON;

public class Card {
	private Integer id;
	private String english;
	private String math;
	private String chinese;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getChinese() {
		return chinese;
	}

	public void setChinese(String chinese) {
		this.chinese = chinese;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}

}
