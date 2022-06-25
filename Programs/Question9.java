import java.util.ArrayList;  
  
public class Question9{  
   public static void main(String[] args) {  
        
      // creating an ArrayList having default size 5  
      ArrayList<String> arr = new ArrayList<String>(5);  
  
      // Adding elements to the ArrayList  
      arr.add("Shweta");  
      arr.add("Pari");  
      arr.add("Sagrika");  
      arr.add("Niya");  
  
      System.out.println("The list of the size is: " + arr.size());  
        
      // Showing all the elements in the ArrayList  
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }    
        
      // Removing the specified element from ArrayList  
      arr.remove("Pari");  
  
      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
        
      // Showing all the elements in the ArrayList  
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }  
   }  
}