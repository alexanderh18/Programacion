/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

import java.io.PrintStream;

/**
 *
 * @author general
 */
public class parcial 
{
public static int mayor_entre_3 (int num1, int num2, int num3 )
    {
        int mayor = 0;
        if (num1 > num2)
        {
            if(num1 > num3)
            {
               mayor = num1;  
            }
            else
            {
                mayor = num3;
            }   
        }
        else
        {
            if(num2 > num3)
            {
             mayor = num2;
            }
            else
            {
                mayor = num3;
            }
        }
    return mayor;
    }

public static double promedio_entre_5(int n1, int n2, int n3, int n4, int n5)
    {
       double promedio;
       promedio = (n1 + n2 + n3 + n4 + n5) / 5.0;
       
       return promedio;
    }
public static void main(String[] args) 
    {
        System.out.println( mayor_entre_3(15,12,9) );
        System.out.println( mayor_entre_3(15,90,9) );
        System.out.println( mayor_entre_3(30,2,0) );
        System.out.println( mayor_entre_3(0,8,1) );
        System.out.println( mayor_entre_3(13,19,60) );
        
        System.out.println( promedio_entre_5(1,2,3,4,5) );
        
    }
}

//**
    //* @param args the command line arguments

     //*/
    //public static void main(String[] args) {
        // TODO code application logic here
   
    

