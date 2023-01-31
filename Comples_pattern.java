import java.util.*;

import javax.xml.transform.Source;
public class Comples_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        /* 
        Question print : 
        N = 10
        *         
         *        
          *       
           *      
            *     
             *    
              *   
               *  
                * 
                 *
                  * 
        */

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(i == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
/* 
        // Question 2) 
        N = 11
        *         *
         *       * 
          *     *  
           *   *   
            * *    
             *     
            * *    
           *   *   
          *     *  
         *       * 
        *         *
    */

    for(int i = 0 ; i < N ; i++){
        for(int j = 0 ; j < N ; j++){
            if(i == j || i+j == N -1 ){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    }
}
