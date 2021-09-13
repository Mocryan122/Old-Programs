package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {


public static void main(String[] args) {
Scanner mox = new Scanner(System.in);
System.out.print("");
String sched = "CC11 - A2 Lecture: 8:30am - 10:30am Lab: 10:30am - 1:30pm";
String sched1 = "MATH 4 - CCA2 Lecture: 4:30pm - 7:30pm" ;
String noclass = "No Class" ;
String PE ="PE 11 - CCA2 Lecture: 1:00pm - 5:00pm";

System.out.print("1:Monday ");
System.out.print("2:Tuesday ");
System.out.print("3:Wendesday ");
System.out.print("4:Thursday ");
System.out.print("5:Friday ");
System.out.print("6:Saturday ");
System.out.print("7:Sunday ");
System.out.println(" ");
int answer = mox.nextInt();

switch(answer){
case 1:
System.out.println(noclass);

break;

case 2:
System.out.println(sched);
System.out.println(sched1);
break;

case 3:
System.out.println(noclass);
break;

case 4:
System.out.println(PE);
break;

case 5:
System.out.println(sched);
System.out.println(sched1);
break;

case 6:
System.out.println(noclass);
break;

case 7:
System.out.println(noclass);
break;

default:
System.out.println("try again");
}



}
}