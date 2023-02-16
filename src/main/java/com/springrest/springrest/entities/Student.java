package com.springrest.springrest.entities;

public class Student {
	private long id;
	private String name;
	private String stream;
	public Student(long id, String name, String stream) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", stream=" + stream + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getStream()=" + getStream() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}

}
