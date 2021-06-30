import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class vowel
 {
   public static void main(String args[])
   { 
     char ch;
     Scanner ac=new Scanner(System.in);
     ch=ac.next().charAt(0);
     if
     (ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
    {
 
    System.out.println("it is an vowel");
    }
   else
   {
     System.out.println("it is a constant");
   }
     
   }
 }
