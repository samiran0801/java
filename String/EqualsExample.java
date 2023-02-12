public class EqualsExample{  
public static void main(String args[]){  
String s1="samiran";  
String s2="samiran";  
String s3="SAMIRAN";  
String s4="basu";  
System.out.println(s1.equals(s2));//true because content and case is same  
System.out.println(s1.equals(s3));//false because case is not same  
System.out.println(s1.equals(s4));//false because content is not same  
}}  
