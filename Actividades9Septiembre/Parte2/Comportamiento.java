/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades09septiembreSAI.parte2;
import jade.core.behaviours.Behaviour;
/**
 *
 * @author Soledad
 */
public class Comportamiento extends Behaviour{
    static int cont=0;
    public void action(){
        System.out.println("Cont:"+cont);
        cont++;
    }
    public boolean done(){
        if(cont==101){
            return true;
        }
        else{
            return false;
        }
    }
}
