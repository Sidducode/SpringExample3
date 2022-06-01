package com.passengerset.entity;

import java.util.Set;

public class Passanger {

	private int id;
	private String name;
	private Set<String> trainname;
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
	 * @return the trainname
	 */
	public Set<String> getTrainname() {
		return trainname;
	}
	/**
	 * @param trainname the trainname to set
	 */
	public void setTrainname(Set<String> trainname) {
		this.trainname = trainname;
	}
	@Override
	public String toString() {
		return "Passanger [id=" + id + ", name=" + name + ", trainname=" + trainname + "]";
	}
	
	
}
