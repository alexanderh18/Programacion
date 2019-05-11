/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

/**
 *
 * @author general
 */
public class ExampleMatrix {
    
        public static int [] pos_pieza_mas_adelantada(Board board)
        {
            int f1 = 3, c1 =4; //esquina inferior izquierda
            int f2 = 3, c2 = 7; //esquina inferior derecha
            int max = 0, dist1, dist2;
            int [] pos = new int [2]; // posicion a devolver
            
            for ( int i = 3; i< board.filas; i++ ){
                for(int j = 0; j < board.columnas; j++) {
                    if (board [i] [j] == 1 ) { // ficha del jugador 1
                        // distancia a la primera esquina
                        dist1 = Math.abs (i - f1) + Math.abs (j - c1);
                        //distancia a la segunda fila
                        dist2 = Math.abs (i - f2) + Math.abs (j - c2);
                       
                        if (dist1 < dist2 ) //usamos dist1 
                        {
                           if (dist1 > max) {
                                max = dist1;
                                //fila de la ficha mas lejana
                                pos [0] = i; 
                                //columna de la ficha mas lejana
                                pos[1] = j;
                            } 
                        }
                    }
                }
            }
                
            
            
            
            return pos; 
        }
    
    }
