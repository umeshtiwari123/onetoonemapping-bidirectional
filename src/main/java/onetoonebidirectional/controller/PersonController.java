package onetoonebidirectional.controller;

import onetoonebidirectional.dto.AadharCard;
import onetoonebidirectional.dto.Person;
import onetoonebidrectional.dao.PersonDao;

public class PersonController {

	public static void main(String[] args) {
		
		Person person=new Person();
		person.setName("Rakshith");
		person.setAge(29);
		person.setGender("Male");
		person.setAddress("Delhi");
		
		
		AadharCard aadhar=new AadharCard();
		aadhar.setName("Rakshit");
		aadhar.setAadharcardNumber(123456);
		
		
		person.setAadhar(aadhar);
		aadhar.setPerson(person);
		
		PersonDao dao=new PersonDao();
		dao.savePerson(person);
	}
}
