//DAY 4 CODING
----------------

/*
int a =0;
fro(a>10;a++){
SOP("shdbcj");
} 
COMPILATION ERROR
*/

/*
for(int i=0; i<5 ; i++){
if(true){
break;
}
sop("bfhv");
}
}
NOTHING PRINT , NO ERROR
*/

/*
for(int i=0; i<5 ; i++){
if(){
break;
}
sop("bfhv");
}
}
COMPILATION ERROR
*/

/*
for(int i=0; i<5 ; i++){
if(false){
break;
}
sop("loop");
}
}
OUTPUT--> loop 
          loop
          loop
          loop 		  
*/

// case 1,2,3: -->no error

/*case 1:
  case 2:
  case 3:
*/

//-------------------------------------------------------------------->

//OOPS:--->
class Laptop{
	int memory;
	String modelName;
	String processor; //instance variable
	float price;
	
	//CONSTRUCTOR
	Laptop(){ //zero parameter constructor
		memory=8;
		modelName = "HP";
		processor ="i5";
		os = "windows";
		price = 50000.0f;
	}
	
	Laptop(int a , String b , String c , String d , float e){ //parameter constructor
		memory = a;
		modelName = b;
		 processor = c;
		 os =d;
		 price = e
	}
	
	void clickPhoto(){
		System.out.println("inside clickPhoto()");
	}
	
	String typeNotepad(){
		return "return from typenotepad()";
	}
	
	void sound(){
		System.out.println("inside sound()");
	}
}
	
class Opps{	
public static void main(String[] args){
	int a = 10; //primitive datatype // local variable
	
	Laptop laptopObj1 = new Laptop();//user defined datatype
	
	Laptop laptopObj2 = new Laptop(4, "dell", "i7","Win",60000.0f );
	
	Laptop laptopObj3 = new Laptop();
	laptopObj.sound(); //output --> inside clickPhoto
	//className
	//laptopObj = reference of ojbect
	//new is a keyword , used allocate memory
	//laptop();
	
	System.out.println(laptopObj.memory);
	System.out.println(laptopObj.modelName);
	System.out.println(laptopObj.price);
	
	/*output -->
	0
	null
	0.0
	*/
	
	/*output constructor -->
	8
	HP
	50000.0
	*/
	
	
	
	laptopObj1.clickPhoto();
	laptopObj2.clickPhoto();
	laptopObj3.clickPhoto();
	
	String s = laptopObj.typeNotepad();
	System.out.println(s);
}
}


