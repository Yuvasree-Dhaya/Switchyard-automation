/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package circuit;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
//import java.lang.String;
import java.awt.Dimension;

import java.io.*;

//import java.util.EventObject;
//import java.awt.Color;
import java.awt.Graphics;
import java.awt.Color;

public class AllButtons  extends JPanel{

 
    public boolean GeneratorStart=false;
    public boolean LeftEarthSwitch=false;
    public boolean RightEarthSwitch=false;
    public boolean Isolator89Closed=false;
    public boolean Isolator89A=false;
    public boolean Isolator89B=false;
    private JPanel panel;
    private JButton button;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private String BusbarVoltage="3000";
    private String BusbarFrequency="5";
    private String BusbarPhase="RYB";
    private JLabel PhaseLabel;
    private JTextField voltage;
    private JTextField Frequency;

   


    public AllButtons()
     {


        
         button=new JButton("G");
         button.setPreferredSize(new Dimension(50,50));
         button.setBackground(Color.red);
         button2=new JButton("Earth Switch-1");
         button2.setBackground(Color.red);
         button3=new JButton("Earth Switch-2");
         button3.setBackground(Color.red);
         button1=new JButton("To Close Isolator 89C");
         button1.setBackground(Color.red);
         button5=new JButton("To Close Isolator 89B");
         button5.setBackground(Color.red);
         button6=new JButton("To Close Isolator 89A");
         button6.setBackground(Color.red);
         button4=new JButton("To Close Circuit Breaker");
         button4.setBackground(Color.red);
         button7=new JButton("Fault");
         button7.setBackground(Color.red);




        
          button.addActionListener(new ActionListener()
          {
             public void actionPerformed(ActionEvent e)
             {
                          String actionCommand = e.getActionCommand();

                          if(!GeneratorStart)
                          {
                          
                          String Frequency=JOptionPane.showInputDialog("Enter Frequency");
                          String Phase=JOptionPane.showInputDialog("Enter Phase");
                          String Voltage=JOptionPane.showInputDialog("Enter Voltage");

                          if((Frequency.equals(BusbarFrequency))&& (Voltage.equals(BusbarVoltage))&&(Phase.equals(BusbarPhase)))
                          {
                         repaint();
                         JOptionPane.showMessageDialog(null,"GENERATOR SUCCESSFULLY STARTED", "ALERT",JOptionPane.PLAIN_MESSAGE);
                         button.setBackground(Color.GREEN);
                         GeneratorStart=!GeneratorStart;
                         }
                          else
                          {
                              JOptionPane.showMessageDialog(null, "SYNCHRONISATION FAILED","ALERT",JOptionPane.ERROR_MESSAGE);
                          }
                          }
                          else
                          {
                              JOptionPane.showMessageDialog(null, "GENERATOR ALREADY STARTED", "ALERT", JOptionPane.ERROR_MESSAGE);
                          }

                     }
        });


            button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               
                
                JOptionPane.showMessageDialog(null,"CHECKING LEFT EARTH SWITCH","ALERT",JOptionPane.PLAIN_MESSAGE);
                if(!LeftEarthSwitch)
                {
           
                LeftEarthSwitch=!LeftEarthSwitch;
                JOptionPane.showMessageDialog(null, "LEFT EARTH SWITCH IS OPEN", "ALERT",JOptionPane.PLAIN_MESSAGE);
             
                }
                else
                {
                    LeftEarthSwitch=!LeftEarthSwitch;
                    JOptionPane.showMessageDialog(null, "EARTH SWITCH CLOSED","ALERT" ,JOptionPane.ERROR_MESSAGE);
                    button2.setBackground(Color.GREEN);
                }
            }

            
        });
        
        button3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
           
                JOptionPane.showMessageDialog(null,"CHECKING RIGHT EARTH SWITCH ","ALERT",JOptionPane.PLAIN_MESSAGE);
                if(!RightEarthSwitch)
                {
                JOptionPane.showMessageDialog(null,"RIGHT EARTH SWITCH IS OPEN","ALERT",JOptionPane.PLAIN_MESSAGE);
                RightEarthSwitch=!RightEarthSwitch;
                }
                else
                {
                 RightEarthSwitch=!RightEarthSwitch;
                 button3.setBackground(Color.GREEN);
                 JOptionPane.showMessageDialog(null," EARTH SWITCH CLOSED","ALERT " ,JOptionPane.PLAIN_MESSAGE);
                  JOptionPane.showMessageDialog(null,"GENERATOR GOING TO TRIP","ALERT " ,JOptionPane.PLAIN_MESSAGE);
                
                 if(!RightEarthSwitch && !LeftEarthSwitch)
                  {
                    button.setBackground(Color.red);
                    button1.setBackground(Color.red);
                    button4.setBackground(Color.red);
                    button5.setBackground(Color.red);
                    button6.setBackground(Color.red);
                    }
                
                }

            }
        });

        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if((LeftEarthSwitch)&&(RightEarthSwitch))
                {
                    button1.setBackground(Color.GREEN);
                JOptionPane.showMessageDialog(null,"ISOLATOR 89C Closed","ALERT",JOptionPane.PLAIN_MESSAGE);
                Isolator89Closed=!Isolator89Closed;
               
                }
                else
                {
                    JOptionPane.showMessageDialog(null, " FIRST CHECK THE EARTH SWITCHES ", "ALERT", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


           button6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
             

                    if((LeftEarthSwitch)&&(RightEarthSwitch)&&(Isolator89Closed)&&(!Isolator89B))
                    {
                        button6.setBackground(Color.GREEN);
                        JOptionPane.showMessageDialog(null, "ISOLATOR 89A CLOSED","ALERT" ,JOptionPane.PLAIN_MESSAGE );
                        Isolator89A=!Isolator89A;
                    }
             
                else
                {
                    if(!LeftEarthSwitch)
                        JOptionPane.showMessageDialog(null, "CHECK THE LEFT EARTH SWITCH FIRST","ALERT" ,JOptionPane.ERROR_MESSAGE);
                    else if(!RightEarthSwitch)
                        JOptionPane.showMessageDialog(null, "CHECK THE RIGHT EARTH SWITCH FIRST","ALERT" ,JOptionPane.ERROR_MESSAGE);
                    else
                    JOptionPane.showMessageDialog(null, "CHECK THE ISOLATOR 89C FIRST","ALERT" ,JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        );


        button5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                    if((LeftEarthSwitch)&&(RightEarthSwitch)&&(Isolator89Closed)&&(!Isolator89A))
                    {
                        button6.setBackground(Color.GREEN);
                        JOptionPane.showMessageDialog(null, "ISOLATOR 89B CLOSED","ALERT" ,JOptionPane.PLAIN_MESSAGE );
                        Isolator89A=!Isolator89A;
                    }

                else
                {
                    if(!LeftEarthSwitch)
                        JOptionPane.showMessageDialog(null, "CHECK THE LEFT EARTH SWITCH FIRST","ALERT" ,JOptionPane.ERROR_MESSAGE);
                    else if(!RightEarthSwitch)
                        JOptionPane.showMessageDialog(null, "CHECK THE RIGHT EARTH SWITCH FIRST","ALERT" ,JOptionPane.ERROR_MESSAGE);
                    else if(Isolator89A)
                    {
                       JOptionPane.showMessageDialog(null, "ISOLATOR 89A ALREADY CLOSED","ALERT" ,JOptionPane.ERROR_MESSAGE);
                    }
                   
                }
            }
        });

      
        button4.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               if((Isolator89Closed )&&(Isolator89A))
               {
                   button4.setBackground(Color.GREEN);
                   JOptionPane.showMessageDialog(null,"CIRCUIT BREAKER CLOSED","ALERT",JOptionPane.PLAIN_MESSAGE);
                   JOptionPane.showMessageDialog(null,"POWER IS TARNSMITTED THR' MAIN BUS 1","ALERT",JOptionPane.PLAIN_MESSAGE);


               }
               else if((Isolator89Closed)&&(Isolator89B))
               {
                   button4.setBackground(Color.GREEN);
                   JOptionPane.showMessageDialog(null, "CIRCUIT BREAKER CLOSED","ALERT", JOptionPane.PLAIN_MESSAGE);
                   JOptionPane.showMessageDialog(null,"POWER IS TRNSMITTED THR' MAIN BUS 2","ALERT",JOptionPane.PLAIN_MESSAGE);

               }
               else
               {
                   JOptionPane.showMessageDialog(null,"CIRCUIT BREAKER  CANNOT CLOSE","",JOptionPane.ERROR_MESSAGE);
               }
           }


        });

        button7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(LeftEarthSwitch && RightEarthSwitch)
                {

                    JOptionPane.showMessageDialog(null, "MANUALLY CLOSE THE EARTH SWITCHES");                    
                  
                    
                }
                else
                {
                       JOptionPane.showMessageDialog(null,"NO CHANCE OF OCCURING TRIP");

                }
            }
        }
                );

    
         add(button);
         add(button2);
         add(button3);
         add(button1);
         add(button6);
         add(button5);
         add(button4);
         add(button7);



    }


   
    
}





                   
            
