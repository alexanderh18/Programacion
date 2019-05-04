/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;
import java.io.*;
/**
 *
 * @author general
 */
public class arreglos 
{
    

public static void main (String [] args) 
    {
            BufferedReader br = new BufferedReader ( new InputStreamReader (System.in)); 
            BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter (System.out));
                double min = 5.0, max = 0.0, prom = 0.0 ;
                
                try 
                {
                    int estudiantes = Integer.parseInt(br.readLine());
                    double [] arreglos = new double [ estudiantes ];
                    //recibir notas
                        for (int i = 0; i < estudiantes; i++)
                        {
                            arreglos[i] = Double.parseDouble(br.readLine());
                        }
                        for (int i = 0; i < estudiantes; i++) 
                            {
                            if(arreglos[i] < min)
                                {
                                    min = arreglos[i];                 
                                }
                                    if(arreglos[i] > max)
                                {
                                    max = arreglos [i];
                                }
                                    prom = prom + arreglos[i]; 
                            } 
                                  prom = prom / estudiantes;
                                    
                            bw.write ("las notas mas baja es :" + min + ", la nota maxima es :" + max +", el promedio de la nota es :" + prom); 
                            bw.flush();  
                }
                catch (Exception ex) {}    
    }
}
  