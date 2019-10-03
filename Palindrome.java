import java.util.Scanner;
public class Palindrome
{
      public static void main (String[]args) throws Exception
      {
        System.out.println ("Hola, introduce la palabra a identificar");
        Scanner bring = new Scanner (System.in);
    
        String fullpali = bring.nextLine ();
    
        boolean is_palindrome = false;
    
        StringBuilder string_builder = new StringBuilder (fullpali);
        String reversed_fullpali = string_builder.reverse ().toString ();
    
          is_palindrome = fullpali.equals (reversed_fullpali);
    
        if (is_palindrome)
          {
        System.out.println ("Palindromo aprobado");
          }
        else
          {
        System.out.println ("palindromo rechazado");
          }

        bring.close ();
        
    }
   
}
