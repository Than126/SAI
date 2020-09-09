/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividades09septiembreSAI;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

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
