package com.studentsmap.entity;

import java.util.Map;

public class Student {

	private int id;
	private String name;
	private Map<Integer,String> books;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the books
	 */
	public Map<Integer, String> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(Map<Integer, String> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", books=" + books + "]";
	}
	
	
}
