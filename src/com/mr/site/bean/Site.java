package com.mr.site.bean;

import java.io.Serializable;

/**
 * 网址实体类
 * 
 * @author gaohailong
 * @version 1.0
 * @data 2016.7.5
 */
public class Site implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String link;
	private int categeory;
	private String date;
	private int frequency;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getCategeory() {
		return categeory;
	}

	public void setCategeory(int categeory) {
		this.categeory = categeory;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

}
