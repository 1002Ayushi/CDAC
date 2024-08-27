class Student{
	
	//instance variables
	int id;
	String name;
	String address;
	float marks;
	
	//static variable
	static String iName = "cdac mumbai";

Student(){  }//zero parametrized constructor

Student(int id){ //one parametrized constructor
this.id =id;
}

Student(int a, String b, String c , float d){ //more than one parametrized constructor
	id = a;
	name = b;
	 address = c;
	  marks = d;
	  
}

//instance method
 void display(){
	 System.out.println("Student Details");
	 
	  System.out.println("insttitute name"+ iName);
 }
 
 //static method
 static void print(){
	  System.out.println("Student Id" + id);//error in static method we cannot access non-static 
	  
	   System.out.println("instiute name"+ iName);
 }
}



class DayFive{

public static void main(String []args){

   Student obj1 = new Student();
   Student obj2 = new Student(1);   
   obj1.display();
     obj2.display();
}
}