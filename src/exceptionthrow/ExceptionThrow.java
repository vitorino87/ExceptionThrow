/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionthrow;

/**
 *
 * @author tiago.lucas
 */
public class ExceptionThrow {

    /**
     * @param args the command line arguments
     */
    static void demoproc(){
        try{
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e ){
            System.out.println("Caught inside demoproc");
            throw e; //rethrow the exception
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            demoproc();
        }
        catch(NullPointerException e){
            System.out.println("Recaught: "+e);
        }
    }
    
}
