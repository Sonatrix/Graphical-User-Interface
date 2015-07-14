/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author PKDREAMS
 */




import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.awt.event.KeyEvent;

   public class Login extends JFrame {
    Connection con;
    Statement st,stm;
    ResultSet result;
   
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
   
    public Login()throws Exception  
    {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/login","root","*********");
        st = con.createStatement();
        JOptionPane.showMessageDialog(null, "connected");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 566, 359);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JLabel lblUserName = new JLabel("User Name");
        lblUserName.setBounds(144, 89, 90, 14);
        panel.add(lblUserName);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(144, 142, 90, 14);
        panel.add(lblPassword);

        textField = new JTextField();
        textField.setBounds(248, 86, 86, 20);
        panel.add(textField);
        textField.setColumns(10);

        JButton btnLogin = new JButton("sign in");
        btnLogin.addActionListener(new ActionListener() {
           // @Override
            public void actionPerformed(ActionEvent xe) {
                String un=textField.getText();
                String pwd=passwordField.getText().trim();
                String str,s1;
                try {
                          
                    str="select pass from login where username='un'";
                        result=st.executeQuery(str);
                     if(un.equals(un))
                        {
                            JOptionPane.showMessageDialog(null, "Login successfully");
                            EventQueue.invokeLater(new Runnable() 
                            {
                             // @Override
                                   public void run() 
                                   {
                                                   try {
                    
                                                        new MyComputer().setVisible(true);
                                                         //dispose();
                                                       } catch (Exception e) 
                                                       {
                                                            e.printStackTrace();
                                                       }
                                     }
                            });
                        }
                     else
                        {
                            JOptionPane.showMessageDialog(null, "wrong details");
                        }
                   
                }
                    catch(Exception e) 
                    {
                      e.printStackTrace();
                    }
                }
               
        });

        btnLogin.setBounds(144, 209, 89, 23);
        panel.add(btnLogin);
        
        JButton signup = new JButton("sign up");
        signup.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent arg0) 
            {
                String un=textField.getText();
                String pwd=passwordField.getText().trim();
                String str;
                try
                {
                    str="insert into login    values('"+un+"','"+pwd+"')";
                     st.executeUpdate(str);
                     JOptionPane.showMessageDialog(null, "submitted successfully");
                 }catch(Exception xe)
                {
                    
                }
            }
        });
        signup.setBounds(254, 209, 89, 23);
        panel.add(signup);
        

        passwordField = new JPasswordField();
        passwordField.setBounds(247, 142, 86, 20);
        panel.add(passwordField);
    }
 
  }

