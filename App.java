// Namespace - keeping objects unique.
// translate to a folder.
// Helps you organize 'like' code.
package myFirstProject;

// App is the entry point to our application.
public class App 
{
	public static void main(String[] argz)
	{
		User u1 = new User();
		u1.setfirstname("George");
		u1.setlastname("John");
		u1.setEmail("George@john.com");
		u1.setUserName("gjohn");
		
		User u2 = new User();
		u2.setfirstname("Henry");
		u2.setlastname("Bourne");
		u2.setEmail("h@bourne.com");
		u2.setUserName("hbourne");
		
		User u3 = new User();
		u3.setfirstname("Derek");
		u3.setlastname("Lewis");
		u3.setEmail("d@lewis.com");
		u3.setUserName("DLew");
		
		User u4 = new User();
		u4.setfirstname("Tyson");
		u4.setlastname("Mike");
		u4.setEmail("Mike@Tyson.com");
		u4.setUserName("MikeTyson");
		
		User u5 = new User();
		u5.setfirstname("Larry");
		u5.setlastname("Layhe");
		u5.setEmail("Fofflayhe@gmail.com");
		u5.setUserName("FoffLayhe");
		
		User u6 = new User();
		u6.setfirstname("Ellis");
		u6.setlastname("Ker");
		u6.setEmail("EllisKer@gmail.com");
		u6.setUserName("EllisKer");
		
		System.out.println(u1.getEmail());
		System.out.println(u2.GetUserName());
		System.out.println(u4.getfirstname());
		System.out.println(u3.getlastname());
	
	
		// for loop 
		for(int x= 0; x < 100; x++)
		{ 
			System.out.println(x);
		}
}

}
