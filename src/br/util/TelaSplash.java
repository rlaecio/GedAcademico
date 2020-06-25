/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.util;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.SplashScreen;

/**
 *
 * @author rlaecio
 */
public class TelaSplash {
         static void rendersplashFrame (Graphics2D g, int frame) {
         final String[] comps = {"Virtual Machine", "Banco de Dados", "Interface de dados", "Sistema de Arquivos"};
         g.setComposite(AlphaComposite.Clear);
         g.fillRect(70, 230, 270, 40);
         g.setPaintMode();
         //g.setColor(Color.black);
         //g.drawString("Iniciando "+comps[(frame/13)%4]+"...", 70, 240);
         g.setColor(Color.red);         
         g.fillRect(70,250,(frame*6)%280,20);
     }

 
    public TelaSplash() {              
            final SplashScreen splash = SplashScreen.getSplashScreen(); //testa o splash
            if(splash == null) {
                System.out.println("SplashScree.getSplashScreen() returned null ");
                return;
            }        
            Graphics2D g = (Graphics2D)splash.createGraphics(); // carrega o splash e os recursos de desenho
            if (g == null) {
                System.out.println("g is null");
                return;
            }
        
            for (int i = 0; i < 47; i++) { //temporiza o splash e a barra de progresso
                rendersplashFrame(g, i);
                splash.update();
                try {
                    Thread.sleep(50);
                }
                catch (InterruptedException e) {
                }                        
            }
            splash.close();
           // setVisible(true);
           // toFront();  
            
    }     
    
}
