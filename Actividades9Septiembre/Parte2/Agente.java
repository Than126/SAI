/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades09septiembreSAI.parte2;
import jade.core.Agent;
/**
 *
 * @author Soledad
 */
public class Agente extends Agent{
    public void setup(){
        Comportamiento c=new Comportamiento();
        this.addBehaviour(c);
    }
}
