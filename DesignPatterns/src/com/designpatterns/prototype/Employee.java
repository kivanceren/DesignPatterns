package com.designpatterns.prototype;

public abstract class Employee implements Cloneable {
	private String name, surname;
	private int salary;
	private byte age;
	private Title title;
	
	public Employee(String name, String surname, int salary, byte age, Title title) {
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.age = age;
		this.title = title;
	}
	
	public Object deepCopy() {
		Object clone = null; 
        try 
        { 
            clone = super.clone(); 
        }  
        catch (CloneNotSupportedException e)  
        { 
            e.printStackTrace(); 
        } 
        return clone; 
	}

	
	public String toString() {
		return "[ name:"+ name + ", surname: "+ surname + ", age: "+ age + ", Salary: " + salary + ", title: " + title + "]";
	}
	
	//Getter ve Setter metotlarý örneði daha net göstermek için konulmuþtur
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}
	
	
	

}
