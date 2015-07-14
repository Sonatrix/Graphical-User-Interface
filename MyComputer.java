/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author PKDREAMS
 */
import java.awt.*;
//import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.Icon;

 class MyComputer extends JFrame  
{
     Runtime runtime = Runtime.getRuntime();
      
    public MyComputer()throws Exception
    {
        setTitle("My Computer");
        setVisible(true);
        setSize(700, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,3));
       
        JButton paint=new JButton();
          ImageIcon painticon = new ImageIcon(getClass().getResource("Paint.png"));
          paint.setIcon(painticon);
        add(paint);
        paint.addActionListener(new ActionListener(){   
         // @Override
            public void actionPerformed(ActionEvent e) {
              try {
                  Process process = runtime.exec("C:\\Windows\\system32\\mspaint.exe ");
              } catch (IOException ex) {
                  System.out.println(e);
              }
            }
        });
        JButton myComputer=new JButton();  
        ImageIcon mypc = new ImageIcon(getClass().getResource("mypc.png"));
          myComputer.setIcon(mypc);
        add(myComputer);
        myComputer.addActionListener(new ActionListener(){   
          //@Override
            public void actionPerformed(ActionEvent e) {
              try {
                  Process process = runtime.exec("C:\\Windows\\explorer.exe ");
              } catch (IOException ex) {
                  System.out.println(e);
              }
            }
        });
         JButton note1=new JButton("Notepad");
         ImageIcon note = new ImageIcon(getClass().getResource("note.png"));
          note1.setIcon(note);
        add(note1);
        note1.addActionListener(new ActionListener(){   
         // @Override
            public void actionPerformed(ActionEvent e) {
              try {
                  Process process = runtime.exec("C:\\Windows\\notepad.exe ");
              } catch (IOException ex) {
                  System.out.println(e);
              }
            }
        });
        JButton microsoft=new JButton("My Paint Application");
        add(microsoft);
        microsoft.addActionListener(new ActionListener() {
           // @Override
            public void actionPerformed(ActionEvent xe) 
            {
                EventQueue.invokeLater(new Runnable() {
            //@Override
            public void run() {
                try {
                    
                    new DrawImage().setVisible(true);
                    //dispose();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
                    
                
            }
        });

        JButton mediaPlayer=new JButton("Media Player");
         ImageIcon music = new ImageIcon(getClass().getResource("Music.png"));
          mediaPlayer.setIcon(music);
        add(mediaPlayer);
        mediaPlayer.addActionListener(new ActionListener(){   
          //@Override
            public void actionPerformed(ActionEvent e) {
              try {
                  Process process = runtime.exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe ");
              } catch (IOException ex) {
                  System.out.println(e);
              }
            }
        });
        JButton wordpad=new JButton("Word Pad");
         ImageIcon pad = new ImageIcon(getClass().getResource("wordpadicon.png"));
          wordpad.setIcon(pad);
        add(wordpad);
         wordpad.addActionListener(new ActionListener(){   
          //@Override
            public void actionPerformed(ActionEvent e) {
              try {
                  Process process = runtime.exec("C:\\Windows\\write.exe ");
              } catch (IOException ex) {
                  System.out.println(e);
              }
            }
        });
    }
    
}
