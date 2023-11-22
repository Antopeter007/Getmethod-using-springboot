package com.demo.example;

public class StudentsList {

	private int id;
	private String name;
	private int no;
	private String sclName;

	public int getId() {
		return id;
	}

	public StudentsList(int id, String name, int no, String sclName) {
		super();
		this.id = id;
		this.name = name;
		this.no = no;
		this.sclName = sclName;
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

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSclName() {
		return sclName;
	}

	public void setSclName(String sclName) {
		this.sclName = sclName;
	}
}
