package com.persistent.variable;

public class StudentId {
      
	int rollnumber;
     String name;

     public StudentId(int rollnumber, String name) {
         
    	 this.rollnumber = rollnumber;
         this.name = name;
     } 
     
      public static void main(String[] args) {
          
         StudentId s1 = new StudentId(123456789,"Bhanu");
         
         
         System.out.println(s1.rollnumber);
         System.out.println(s1.name);

      }
}
