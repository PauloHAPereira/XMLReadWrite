package br.paulo.simplexml.rw;


import java.util.ArrayList;
/**
 * 	@author Paulo Pereira
 *	@version 1.0
 */
public class Main {

	public static void main(String[] args) {
		String fileName = "xmlTest.xml";
		//change here!
		String path = "C:/Users/Paulo Pereira/Desktop/";
		XmlWriter xmlWriter = new XmlWriter();
		XmlReader xmlReader = new XmlReader();
		
		ArrayList<Student> students = new ArrayList<>();
		//creating studants
		Student student1 = new Student("Paulo", 25, false);
		Student student2 = new Student("Jessica", 25, true);
		Student student3 = new Student("Icaro", 19 , false);
		Student student4 = new Student("Ana", 67, true);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
		//Serializer the list of studants in xml
		xmlWriter.serializerStudents(path, fileName, students);
		//Read and print the Xml
		xmlReader.readXml(path,fileName);
		//Deserializer as a Students List
		students.clear();
		students = xmlReader.deserializerStudent(path, fileName);
		Student novo = students.get(0);
		
		System.out.println(novo.getName());
	}

}
