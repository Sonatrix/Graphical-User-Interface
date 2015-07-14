/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author PKDREAMS
 */


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
/**
 *
 * @author PKDREAMS
 */
public  class DrawImage extends JFrame
{
    
      public DrawImage() 
    {
        JFrame frame = new JFrame("Paint Here");
         JButton rButton,gButton,bButton,yButton,oButton,pinkButton,magentaButton,grayButton,wButton,color;
        frame.setSize(700,400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JMenuBar menuBar = new JMenuBar();
         
          JMenu edit = new JMenu("Edit");
          menuBar.add(edit);
          JMenuItem save=new JMenuItem("Save");
          edit.add(save);
          JMenuItem clear=new JMenuItem("Clear");
          edit.add(clear);
        final  Container content = frame.getContentPane();
        content.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
               JButton clear1 =new JButton("clear");      
                final  TextPad drawPad=new TextPad();
                content.add(drawPad, BorderLayout.CENTER);
                JPanel panel=new JPanel();
                panel.setPreferredSize(new Dimension(100, 150));
		panel.setMinimumSize(new Dimension(100, 150));
		panel.setMaximumSize(new Dimension(100, 150));
                content.add(menuBar, BorderLayout.NORTH);
                clear.addActionListener(new ActionListener()
                {
                        
                       // //
			public void actionPerformed(ActionEvent e)
                        {
				drawPad.clear();
			}
        
    });
                clear1.addActionListener(new ActionListener()
                {
                        
                      //  //
			public void actionPerformed(ActionEvent e)
                        {
				drawPad.clear();
			}
        
    });
                save.addActionListener(new ActionListener()
                {
                        
                       // //
			public void actionPerformed(ActionEvent e)
                        {
				drawPad.save();
			}
        
    });
	
	
                 rButton = new JButton();
	          rButton.setBackground(Color.red);
		rButton.addActionListener(new ActionListener(){
                        ////
			public void actionPerformed(ActionEvent e){
				drawPad.red();
			}

		});
                 JButton dgButton = new JButton();
	          dgButton.setBackground(Color.darkGray);
		dgButton.addActionListener(new ActionListener(){
                        ////
			public void actionPerformed(ActionEvent e){
				drawPad.darkgray();
			}

		});
                grayButton = new JButton();
	          grayButton.setBackground(Color.gray);
		grayButton.addActionListener(new ActionListener(){
                        ////
			public void actionPerformed(ActionEvent e){
				drawPad.gray();
			}

		});
                oButton = new JButton();
	          oButton.setBackground(Color.ORANGE);
		oButton.addActionListener(new ActionListener(){
                        ////
			public void actionPerformed(ActionEvent e){
				drawPad.orange();
			}

		});
                pinkButton = new JButton();
	          pinkButton.setBackground(Color.pink);
		pinkButton.addActionListener(new ActionListener(){
                      //  //
			public void actionPerformed(ActionEvent e){
				drawPad.pink();
			}

		});
                wButton = new JButton();
	          wButton.setBackground(Color.white);
		wButton.addActionListener(new ActionListener(){
                        ////
			public void actionPerformed(ActionEvent e){
				drawPad.white();
			}

		});
              color = new JButton("Color");
	          
		color.addActionListener(new ActionListener(){
                       // //
			public void actionPerformed(ActionEvent e){
			drawPad.color();
			}

		});
                 gButton = new JButton();
		gButton.setBackground(Color.green);
		gButton.addActionListener(new ActionListener(){
                        ////
			public void actionPerformed(ActionEvent e){
				drawPad.green();
			}

		});
                magentaButton = new JButton();
		magentaButton.setBackground(Color.MAGENTA);
		magentaButton.addActionListener(new ActionListener(){
                     //   //
			public void actionPerformed(ActionEvent e){
				drawPad.magenta();
			}

		});
                bButton = new JButton();
		bButton.setBackground(Color.blue);
		bButton.addActionListener(new ActionListener(){
                        ////
			public void actionPerformed(ActionEvent e){
				drawPad.blue();
			}

		});
                yButton = new JButton();
		yButton.setBackground(Color.yellow);
		yButton.addActionListener(new ActionListener(){
                      //  //
			public void actionPerformed(ActionEvent e){
				drawPad.yellow();
			}

		});
              
                 
              
		bButton.setPreferredSize(new Dimension(40, 40));
		rButton.setPreferredSize(new Dimension(40, 40));
		yButton.setPreferredSize(new Dimension(40, 40));
		gButton.setPreferredSize(new Dimension(40,40));
                oButton.setPreferredSize(new Dimension(40,40));
                pinkButton.setPreferredSize(new Dimension(40,40));
                magentaButton.setPreferredSize(new Dimension(40,40));
                grayButton.setPreferredSize(new Dimension(40,40));
                dgButton.setPreferredSize(new Dimension(40,40));
                wButton.setPreferredSize(new Dimension(40,40));
		 // color.setPreferredSize(new Dimension(70,20));
		
		panel.add(gButton);
		panel.add(yButton);

		panel.add(bButton);
		panel.add(rButton);
                panel.add(oButton);
                panel.add(pinkButton);
                panel.add(magentaButton);
                panel.add(grayButton);
	        panel.add(dgButton);
                panel.add(wButton);
                panel.add(color);
                panel.add(clear1);
               
       content.add(panel, BorderLayout.WEST);
    JPanel panel1=new JPanel();
      panel1.setPreferredSize(new Dimension(100, 150));
		panel1.setMinimumSize(new Dimension(100, 150));
		panel1.setMaximumSize(new Dimension(100, 150));
                       content.add(panel1, BorderLayout.EAST);   
         JButton   rect=new JButton("rect");
        rect.setPreferredSize(new Dimension(70,40));
        rect.addActionListener(new ActionListener(){
                      //  //
			public void actionPerformed(ActionEvent e){
				drawPad.rectd();
			}

		});
        JButton   frect=new JButton("frect");//filled rectangle
        frect.setPreferredSize(new Dimension(70,40));
        frect.addActionListener(new ActionListener(){
                        ////
			public void actionPerformed(ActionEvent e){
				drawPad.frectd();
			}

		});

        JButton oval=new JButton("oval");
        oval.setPreferredSize(new Dimension(70,40));
        oval.addActionListener(new ActionListener(){
                       // //
			public void actionPerformed(ActionEvent e){
				drawPad.ovald();
			}

		});
        JButton foval=new JButton("foval");
        foval.setPreferredSize(new Dimension(70,40));
        foval.addActionListener(new ActionListener(){
                        ////
			public void actionPerformed(ActionEvent e){
				drawPad.fovald();
			}

		});
        JButton d3rect=new JButton("3Drect");
        d3rect.setPreferredSize(new Dimension(70,40));
        d3rect.addActionListener(new ActionListener(){
                       // //
			public void actionPerformed(ActionEvent e){
				drawPad.d3rect();
			}

		});
         
                JButton arc=new JButton("arc");
        arc.setPreferredSize(new Dimension(70,40));
        arc.addActionListener(new ActionListener(){
                       // //
			public void actionPerformed(ActionEvent e){
				drawPad.arc();
			}

		});
         
          panel1.add(rect);
          panel1.add(frect);
          panel1.add(oval);
          panel1.add(foval);
          panel1.add(d3rect);
          panel1.add(arc);
          
    }
    
}
 class TextPad extends JComponent
{
 Image image;
 Graphics2D graphics2D;
 int currentX, currentY, oldX, oldY;
 public TextPad()
   {
		setDoubleBuffered(false);
		addMouseListener(new MouseAdapter()
                {
                        //
			public void mousePressed(MouseEvent e)
                        {
				oldX = e.getX();
				oldY = e.getY();
			}
		});
		
		addMouseMotionListener(new MouseMotionAdapter()
                {
                        //
			public void mouseDragged(MouseEvent e)
                        {
                            
				currentX = e.getX();
				currentY = e.getY();
                                if(graphics2D != null)
				graphics2D.drawLine(oldX, oldY, currentX, currentY);
				repaint();
				oldX = currentX;
				oldY = currentY;
			}

		}
                        );
   }
 //
 public void paintComponent(Graphics g){
		if(image == null){
			image = createImage(getSize().width, getSize().height);
			graphics2D = (Graphics2D)image.getGraphics();
			//graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			clear();
                        

		}
		g.drawImage(image, 0, 0, null);
	}
 
 public void clear()
       {
		graphics2D.setPaint(Color.white);
		graphics2D.fillRect(0, 0, getSize().width, getSize().height);
		graphics2D.setPaint(Color.black);
		repaint();
	}
 public void red(){
		graphics2D.setPaint(Color.red);
		repaint();
	}
 public void save()
 {
      
     String str = JOptionPane
                .showInputDialog(null, "Enter File Name : ");
        
           BufferedImage bufImage = new BufferedImage(getSize().width,getSize().height,BufferedImage.TYPE_INT_RGB);  
           graphics2D=bufImage.createGraphics();  



        try {
            ImageIO.write(bufImage, "jpg", new File(str + ".jpg"));
        } 
            catch (IOException ex) 
        {
                   System.out.println(ex);
        }

 }
 public void orange(){
		graphics2D.setPaint(Color.orange);
		repaint();
	}
 public void pink(){
		graphics2D.setPaint(Color.pink);
		repaint();
	}
 	
public void yellow(){
		graphics2D.setPaint(Color.yellow);
		repaint();
	}
public void darkgray(){
		graphics2D.setPaint(Color.darkGray);
		repaint();
	}
	
	
	
public void blue(){
		graphics2D.setPaint(Color.blue);
		repaint();
	}
	
public void green(){
		graphics2D.setPaint(Color.green);
		repaint();
	
        }
public void magenta(){
		graphics2D.setPaint(Color.MAGENTA);
		repaint();
	
        }
public void gray(){
		graphics2D.setPaint(Color.GRAY);
		repaint();
	
        }
public void white(){
		graphics2D.setPaint(Color.white);
		repaint();
	
        }
public void rectd()
        {
           graphics2D.drawRect(oldX, oldY, currentX, currentY);
            repaint();
        }
public void frectd()
        {
           graphics2D.drawRect(oldX, oldX, currentX, currentY);
            graphics2D.fillRect(oldX, oldX, currentX, currentY);
            repaint();
        }

public void ovald()
      {
          graphics2D.drawOval(oldX, oldY, currentX, currentY);
          repaint();
      }
public void fovald()
      {
          graphics2D.drawOval(oldX, oldY, currentX, currentY);
          graphics2D.fillOval(oldX, oldY, currentX, currentY);
          repaint();
      }
public void d3rect()
      {
          graphics2D.draw3DRect(oldX, oldY, currentX, currentY, true);
          graphics2D.fill3DRect(oldX, oldY, currentX, currentY, true);
          repaint();
      }
public void arc()
      {
          graphics2D.drawArc(oldX, oldY, 100, 150, oldX,120);
          
          repaint();
      }
public void color()
{
    Color bgColor = JColorChooser.showDialog(this,"Choose Background Color",getBackground());
                                if (bgColor != null)
                                 graphics2D.setPaint(bgColor);
}

 }


 
