    package main;

   import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Student;

   public class Application {
       public static void main(String[] args) {
    	
    //1 
    	install();
    //2 
    	Student s= new Student(11L,"John Doe");
   	//3
   		 addOneStudent(s); 		 
    //4 	
    	Student return_s= findOneStudent(s.getId());
   	//4
   		System.out.println(return_s);
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
          //check();
       }
       
       
       
   	public static void addOneStudent(Student s) {
   	       EntityManagerFactory factory = Persistence.createEntityManagerFactory("sqlite-database");
   	       EntityManager em = factory.createEntityManager();
   	       
   	       em.getTransaction().begin();

   	       em.persist(s);

   	       em.getTransaction().commit();
   	   }
      
     public static Student findOneStudent(Long id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sqlite-database");
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();

        Student s = em.find(Student.class,id);

        em.getTransaction().commit();
        return s;
    }
       
       public static void install() {
	       EntityManagerFactory factory = Persistence.createEntityManagerFactory("sqlite-database");
	       EntityManager em = factory.createEntityManager();
	       
	       em.getTransaction().begin();

	       em
	         .createNativeQuery("Create table if not exists Student(id INTEGER PRIMARY KEY, fullName VARCHAR(30));")
	         .executeUpdate();

	       em.getTransaction().commit();
	       
	   }
           
       public static void check() {
           EntityManagerFactory factory = Persistence.createEntityManagerFactory("sqlite-database");
           EntityManager em = factory.createEntityManager();
       }
   }