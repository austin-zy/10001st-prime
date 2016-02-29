/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10001st.prime;

/**
 *
 * @author Austin
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static boolean isPrime(int foo){
        boolean bool=true;
        for(int j = 2;j<foo;j++){
                if (foo%j==0){
                    bool = false;
                    break;
                }
                else{
                }
            }
        return bool;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int counter = 0;
        for(int i=2;i<10000000;i++){
            if(isPrime(i)){
                counter = counter+1;
                if (counter ==10001){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    
}
