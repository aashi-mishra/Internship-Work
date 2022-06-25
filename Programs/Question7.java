public class Question7 {  
public static String reverseWord(String str){  
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  
 
public static void main(String[] args) {  
    System.out.println(Question7.reverseWord("HELLO WORLD"));  
    System.out.println(Question7.reverseWord("THIS IS MY FIRST PROGRAM"));
    }  
}
