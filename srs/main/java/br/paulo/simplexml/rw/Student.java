package br.paulo.simplexml.rw;
/**
 * 
 * 	@author Paulo Pereira
 *	@version 1.0
 */
public class Student {
	//Student atributes
	private String name;
	private int age;
	private boolean sex;//false= mele true= famele
	
	//constructor
	public Student(String name, int age, boolean sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	//generic constructor
	public Student(){
		
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	
}
