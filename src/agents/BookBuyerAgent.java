/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agents;

import jade.core.Agent;
import behaviours.RequestPerformer;
import jade.core.AID;
import jade.core.behaviours.*;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import gui.BookBuyerGui;
/**
 *
 * @author Soledad
 */
public class BookBuyerAgent extends Agent {
    private String bookTitle;
  private AID[] sellerAgents;
  private int ticker_timer = 10000;
  private BookBuyerAgent this_agent = this;
  private BookBuyerGui buyerGui;
  
  protected void setup() {
    System.out.println("Buyer agent " + getAID().getName() + " is ready");
    buyerGui=new BookBuyerGui(this);
    buyerGui.showGui();
    
    /*Object[] args = getArguments();
    if(args != null && args.length > 0) {
      bookTitle = (String)args[0];
      System.out.println("Book: " + bookTitle);
      
      addBehaviour(new TickerBehaviour(this, ticker_timer) {
        protected void onTick() {
          System.out.println("Trying to buy " + bookTitle);
          
          DFAgentDescription template = new DFAgentDescription();
          ServiceDescription sd = new ServiceDescription();
          sd.setType("book-selling");
          template.addServices(sd);
          
          try {
            DFAgentDescription[] result = DFService.search(myAgent, template);
            System.out.println("Found the following seller agents:");
            sellerAgents = new AID[result.length];
            for(int i = 0; i < result.length; i++) {
              sellerAgents[i] = result[i].getName();
              System.out.println(sellerAgents[i].getName());
            }
            
          }catch(FIPAException fe) {
            fe.printStackTrace();
          }
          
          myAgent.addBehaviour(new RequestPerformer(this_agent));
        }
      });
    } else {
      System.out.println("No target book title specified");
      doDelete();
    }*/
    
  }
  
  public void aver(String apellido){
    if(apellido != null && apellido.length() > 0) {
      bookTitle = apellido;
      System.out.println("Book: " + bookTitle);
      
      addBehaviour(new TickerBehaviour(this, ticker_timer) {
        protected void onTick() {
          System.out.println("Trying to buy " + bookTitle);
          
          DFAgentDescription template = new DFAgentDescription();
          ServiceDescription sd = new ServiceDescription();
          sd.setType("book-selling");
          template.addServices(sd);
          
          try {
            DFAgentDescription[] result = DFService.search(myAgent, template);
            System.out.println("Found the following seller agents:");
            sellerAgents = new AID[result.length];
            for(int i = 0; i < result.length; i++) {
              sellerAgents[i] = result[i].getName();
              System.out.println(sellerAgents[i].getName());
            }
            
          }catch(FIPAException fe) {
            fe.printStackTrace();
          }
          
          myAgent.addBehaviour(new RequestPerformer(this_agent));
        }
      });
    } else {
      System.out.println("No target book title specified");
      doDelete();
    }
  }
  protected void takeDown() {
    System.out.println("Buyer agent " + getAID().getName() + " terminating");
  }
  
  public AID[] getSellerAgents() {
    return sellerAgents;
  }
  
  public String getBookTitle() {
    return bookTitle;
  }
    
}
