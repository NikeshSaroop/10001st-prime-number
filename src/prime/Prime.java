/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikesh
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
List<Integer> primenumbers = new ArrayList<Integer>();
int number = 2;

while (primenumbers.size() < 10001) 
{
   boolean isPrime = true;
   for (Integer prime : primenumbers) 
   {
      if (number % prime == 0) 
      {
         isPrime = false;
         break;
      }
   }
   if (isPrime) 
   {
      primenumbers.add(number);
   }
   number++;
}
System.out.println(primenumbers.get(10000));
    }
    
}
