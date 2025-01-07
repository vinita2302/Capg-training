import java.util.Scanner; 
class Calculater{
public static void main(String args[]){
 
Scanner sc=new Scanner(System.in); 
System.out.print("enter the choice to perform the operations"); 
int choice=sc.nextInt(); 
 
System.out.print("enter the first number"); 
int num1=sc.nextInt(); 

System.out.print("enter the second number"); 
int num2=sc.nextInt(); 
 
int result=0; 

switch(choice){
case 1: 
result=num1-num2; 
break; 

case 2: 
result=num1+num2; 
break; 

case 3: 
result=num1*num2; 
break; 

case 4: 
result=num1/num2; 
break; 

default: 
System.out.println("invailad choice"); 
 
} 

System.out.println( result); 

} 
}