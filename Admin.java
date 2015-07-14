/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.EventQueue;

/**
 *
 * @author PKDREAMS
 */
public class Admin 
{
  
    public static void main(String[] args)  throws Exception
   {
     
       EventQueue.invokeLater(new Runnable() {
           // @Override
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                   
                   // frame.dispose();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
       
   }
}
