class Discount{

public static void main(String args[]){
double Total;
double price = 600;
boolean membership = true;

if(price>=1000){
 if(membership == true){
   Total = price * 0.25;
   }
   else{
   Total = price*0.20;
   }
}
else if(price>=500 && price <=999){
   if(membership == true){
   Total = price * 0.15;
   }
   else{
   Total = price*0.10;
   }
}
else {
   if(membership == true){
   Total = price * 0.10;
   }

   else{
   Total = price*0.05;
    }
}
System.out.println(Total);
}
}
