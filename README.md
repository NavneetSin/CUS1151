Homeworks1: 

Note: for your convenience I provide source code for both questions. You just need to complete TO DO parts in source code.

Q1)

Grades.java
Write a program that keeps a map in which both keys and values are strings (the names of students and their course grades. Prompt the user of the program to add or remove students, to modify grades, or to print all grades. The printout should be sorted by name and formatted like this:

Carl: B+
Joe: C
Sarah: A
Q2)

Reimplement Q1 so that the keys of the map are objects of class Student. A student should have a first name, a last name, and a unique integer ID. For grade changes and removals, lookup should be by ID. The printout should be sorted by last name. If two students have the same last name, then use the first name as a tie breaker. If the first names are also identical, then use the integer ID. Hint: Use two maps.

Grades.java
Student.java
+++++++++++++++++++++++++++++

Q3)

Write Java program (name your class file: CUS1151__lastName_HW1.java) and a method called myMethod that accepts two Lists as its parameters and returns a new List containing alternating elements from the two lists, in the following order:

 First element from first list
First element from second list
Second element from first list
Second element from second list
Third element from first list
Third element from second list
. . .
If the lists do not contain the same number of elements, the remaining elements from the longer list should be placed consecutively at the end. For example, for a first list of [1, 2, 3, 4, 5] and a second list of [6, 7, 8, 9, 10, 11, 12], a call of alternate(list1, list2) should return a list containing [1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12]

Your method body can look like this:

public static List 
 
 
 
    
  
  
   
   
     
  
  
  alternate(List
 
  
  
     
   
   
     list1, List 
    
      list2) { 
     
List 
     
       result = new ArrayList 
      
        (); 
       
Iterator 
       
         i1 = list1.iterator(); 
        
Iterator 
        
          i2 = list2.iterator(); //To do 
         
 
         
        
       
      
     
   
 
 
 
 
 
    
  
      return result;
}


Q4)[you can write in Q3 java class]

Write a method called removeInRange that accepts four parameters: a LinkedList, an element value, a starting index, and an ending index. The method’s behavior is to remove all occurrences of the given element that appear in the list between the starting index (inclusive) and the ending index (exclusive). Other values and occurrences of the given value that appear outside the given index range are not affected.

For example, for the list [0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16], a call of removeInRange(list, 0, 5, 13) should produce the list [0, 0, 2, 0, 4, 6, 8, 10, 12, 0, 14, 0, 16]. Notice that the zeros located at indexes between 5 inclusive and 13 exclusive in the original list (before any modifications were made) have been removed.

your method body can look like this:

public static void removeInRange(List 
 
 
 
 
 
    
  
  
   
   
     
  
  
  
  
  list, int value, int min, int max) 
  
  
  
  
  
     
   
   
{ Iterator
  
  
  
  
  
     
   
   
     itr = list.iterator(); 
    
 //to do 
   
 
 
 
 
 
    
  
  }
