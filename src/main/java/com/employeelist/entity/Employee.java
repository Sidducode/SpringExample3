package com.employeelist.entity;

import java.util.List;

public class Employee {
	
private int id;
private String name;
private List<String> projects;
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
 * @return the projects
 */
public List<String> getProjects() {
	return projects;
}
/**
 * @param projects the projects to set
 */
public void setProjects(List<String> projects) {
	this.projects = projects;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", projects=" + projects + "]";
}



}
