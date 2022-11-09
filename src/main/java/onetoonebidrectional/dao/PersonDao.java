package onetoonebidrectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebidirectional.dto.Person;


public class PersonDao {

	public void savePerson(Person person)
	{
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(person);
		entityManager.persist(person.getAadhar());
		
		entityTransaction.commit();
		
	}
	
	public Person findPerson(int id)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Person person=entityManager.find(Person.class, id);
		return person;
	}
}
