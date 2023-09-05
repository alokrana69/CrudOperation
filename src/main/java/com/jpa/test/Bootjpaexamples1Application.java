 package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class Bootjpaexamples1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bootjpaexamples1Application.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//	    User user = new User();
	    
//	    user.setId(1);
//	    user.setName("Durgesh kumar");
//	    user.setCity("Delhi");
//	    user.setStatus("I am java programmer");
//	    
//	    User user1 = userRepository.save(user);
//	    
//	    System.out.println(user1);
//	     
	    
// create object of User....................
	    
//	    User user1 = new User();
//	    
//	    user1.setName("alok");
//	    user1.setCity("Bangalore");
//	    user1.setStatus("Java programmer");
//	    
//	    User user2 = new User();
//	    user2.setName("souraj");
//	    user2.setCity("Mumbai");
//	    user2.setStatus("Python Programmer");
	                                                                                                  // if you try to store single data in database that time we will use.............
	     User user3 = new User();                                                                    // User resultUser = userRespository.save(user2);
	     user3.setName("Rohit Rana");                                                               // System.out.println("saved user " + resultUser);
	     user3.setCity("Gaujrat");
	     user3.setStatus("he is student");
	     
	     User user4 = userRepository.save(user3);
	     System.out.println(user4);
	                                                                    // System.out.println("done");
	     
// if you store mutiple user data.....
	    
	//    List<User> users = List.of(user1,user2);
	    
// save multiple objects...........   
		
	 //   Iterable<User> result =  userRepository.saveAll(users);
		
// only for print....... 
		
	//   result.forEach(user->{
	//	   System.out.println(user);
	 //  });
		
//	    System.out.println("saved user: " + resultUser);
	 //  System.out.println("done");
	  
	    
// UPDATE.....the user of id 11.............................................................
	     
//	   Optional<User> optional =  userRepository.findById(11);
//	   User user = optional.get();
//	   user.setName("Ankit Tiwari");
//	   User result = userRepository.save(user);
//	   System.out.println(result);
//--------------------------------------------------------------------------------------
		
// to get the data............
		// findById(id)-return optional containing your data.....
		
     //  Iterable<User> itr =  userRepository.findAll();
//using lambda expression...........
//       itr.forEach(user->{
//    	   System.out.println(user);     
//       });
//-------------------------------------------------------------------------------------		
		

// DELETE the data in databases..............................................
		//userRepository.deleteById(11);
		//System.out.println("deleted......");
			
//	 Iterable<User> allusers = 	userRepository.findAll();
//	 
//	 allusers.forEach(user->{
//		 System.out.println(user);
//	 });
//		userRepository.deleteAll(allusers);
	}

}
