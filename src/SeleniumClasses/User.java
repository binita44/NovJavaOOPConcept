package SeleniumClasses;

public class User {
	String name;
	int age;
	String state;
	

	public static void main(String[] args) {
		User u1 = new User();
		u1.name = "John";
		u1.age = 25;
		u1.state = "GA";
		
		User u2 = new User();
		u2.name = "Nancy";
		u2.age = 23;
		u2.state = "TX";
		
		User u3 = new User();
		u3.name = "Jerry";
		u3.age = 28;
		u3.state = "NC";
		
		User u4 = new User();
		u4.name = "Franklin";
		u4.age = 30;
		u4.state = "GA";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.state);
		System.out.println(u2.name+" "+u2.age+" "+u2.state);
		System.out.println(u3.name+" "+u3.age+" "+u3.state);
		System.out.println(u4.name+" "+u4.age+" "+u4.state);
		System.out.println();
		
		u1=u2;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.state);
		System.out.println(u2.name+" "+u2.age+" "+u2.state);
		System.out.println(u3.name+" "+u3.age+" "+u3.state);
		System.out.println(u4.name+" "+u4.age+" "+u4.state);
		System.out.println();
		
		u2=u3;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.state);
		System.out.println(u2.name+" "+u2.age+" "+u2.state);
		System.out.println(u3.name+" "+u3.age+" "+u3.state);
		System.out.println(u4.name+" "+u4.age+" "+u4.state);
		System.out.println();
		
		u3=u4;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.state);
		System.out.println(u2.name+" "+u2.age+" "+u2.state);
		System.out.println(u3.name+" "+u3.age+" "+u3.state);
		System.out.println(u4.name+" "+u4.age+" "+u4.state);
		System.out.println();
		
		u4=u1;
		System.out.println(u1.name+" "+u1.age+" "+u1.state);
		System.out.println(u2.name+" "+u2.age+" "+u2.state);
		System.out.println(u3.name+" "+u3.age+" "+u3.state);
		System.out.println(u4.name+" "+u4.age+" "+u4.state);
		System.out.println();
		
		
		
	}

}
