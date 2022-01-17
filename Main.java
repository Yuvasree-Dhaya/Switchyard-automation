/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package circuit;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Graphics2D;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel{

    public void paint(Graphics g) {


        super.paint(g);

         setBackground(Color.magenta);//Setting a Background Color
         Graphics2D g2d = (Graphics2D)g;
         AllButtons b=new AllButtons();
         BasicStroke bs1 = new BasicStroke(8, BasicStroke.CAP_BUTT,
         BasicStroke.JOIN_BEVEL);
         g2d.setStroke(bs1);
        //Parallel Bus Lines
         g2d.drawLine(20, 30, 1200, 30);
         Font f = new Font("SANS SERIF", Font.BOLD, 12);
         g.setFont(f);
         g.drawString("MAIN BUS 1", 1250, 30);

         g2d.drawLine(20,60 , 1200,60);
         Font f1 = new Font("SANS SERIF", Font.BOLD, 12);
         g.setFont(f1);
         g.drawString("MAIN BUS 2", 1250, 60);

        //BasicStroke for thickness of Left and Right side Lines
        BasicStroke bs5 = new BasicStroke(4, BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs5);
        g.setColor(Color.BLACK);
        g2d.drawLine(50,30,50,130);
        g.setFont(f1);
        g.drawString("ST",20 , 130);
        g.setColor(Color.RED);
        g2d.drawOval(30, 130, 30, 30);
        g2d.drawOval(30, 150, 30, 30);
        g2d.drawLine(50, 180,50 ,250);
        g.setColor(Color.BLACK);

        g.setFont(f1);
        g.drawString("6.6 KV Bus", 10, 230);
        g.setColor(Color.RED);
        g2d.drawLine(10,250,250,250);
        g2d.drawLine(120,250 ,120,200);
        g.setColor(Color.BLACK);

        g.setFont(f1);
        g.drawString("UST", 40, 300);
        g.setColor(Color.RED);
        g2d.drawOval(110,170 ,30 ,30);
        g2d.drawOval(110,150 ,30 ,30);
        g.setColor(Color.BLACK);

        g.setFont(f1);
        g.drawString("UAT", 140, 150);
        g.setColor(Color.GREEN);
        g2d.drawLine(120,150,120,120);
        g2d.drawLine(120,120,300,120);
        g2d.drawLine(300,120 ,300,550 );
        g2d.drawLine(300,550 ,800,550);
        g2d.drawLine(800,550 ,800 ,120);
        g2d.drawLine(800,120 ,950 ,120);
        g2d.drawLine(950,120 ,950 ,150);
        g.setColor(Color.RED);
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("UAT", 930, 150);
        g.setColor(Color.RED);
        g2d.drawOval(930,150 ,30 ,30);
        g2d.drawOval(930,170 ,30 ,30);
         g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("ST", 1020, 150);
        g.setColor(Color.RED);
        g2d.drawLine(950,200 ,950 ,250 );
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("6.6KV BUS", 970, 230);
        g.setColor(Color.RED);
        g2d.drawLine(1200,250,850,250);//6.6KV BUS LINE
        g2d.drawLine(1050,60,1050,130);//BUS 2 ST
        g2d.drawOval(1040,130,30,30);
        g2d.drawOval(1040,150,30,30);
        g2d.drawLine(1050,180,1050,250);
        g2d.drawLine(1085,250,1085,300);//6.6KV LOAD
         g2d.drawRect(1075,300 ,25 ,30 );
        g2d.drawLine(1120,250,1120,300);
        g2d.drawRect(1110,300 ,25 ,30 );
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("6.6KV LOADS",1115,350);
        g.setColor(Color.RED);
           g2d.drawLine(900,250,900,300);
        g.setColor(Color.BLACK);

        g.setFont(f1);
        g.drawString("UST",900,300);
        g.setColor(Color.RED);
        g2d.drawOval(890,300,30,30);
        g2d.drawOval(890,320,30,30);
        g2d.drawLine(900,350,900,400);
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("0.4KV BUS",970,380);
        g.setColor(Color.RED);
        g2d.drawLine(850,400,1200,400);
        g2d.drawLine(990,400,990,450);//LOADS
         g2d.drawRect(980,450 ,25 ,30 );
        g2d.drawLine(1030,400,1030,450);
        g2d.drawRect(1020,450 ,25 ,30 );
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("LOADS",1000,500 );
        g.setColor(Color.RED);
        g2d.drawLine(160,250 ,160 ,300 );
        g2d.drawRect(150,300 ,25 ,30 );
        g2d.drawLine(200,250, 200,300 );
        g2d.drawRect(190,300 ,25 ,30 );
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("6.6 KV LOADS",180,330 );
        g.setColor(Color.RED);
        g2d.drawLine(30,250,30,300);
        g2d.drawOval(15, 300, 30, 30);
        g2d.drawOval(15, 320, 30, 30);
        g2d.drawLine(30,350 ,30 ,400 );
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("0.4 KV BUS",60,380 );
        g.setColor(Color.RED);
        g2d.drawLine(10,400,250,400);//O.4 KV BUS LINE
        g2d.drawLine(80,400 ,80 ,450 );
        g2d.drawRect(70,450 ,25 ,30 );
        g2d.drawLine(110,400, 110,450 );
        g2d.drawRect(100,450 ,25 ,30 );
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString(" LOADS",100,500 );



        BasicStroke bs2 = new BasicStroke(6, BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs2);
        g.setColor(Color.blue);

        g2d.drawLine(400, 30, 400, 130);
        g2d.drawLine(700, 60, 700, 130);
        g2d.drawRect(400, 200, 300, 0);
        g2d.drawLine(400,200,400, 150);
        g2d.drawLine(700,200,700,150);
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("ISOLATOR 89A", 430, 110);
        g.setColor(Color.blue);
        g2d.drawLine(400,150, 430, 120);
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("ISOLATOR 89B", 730, 110);
        g.setColor(Color.blue);
        g2d.drawLine(700,150, 730, 120);
        g2d.drawLine(550,200 ,550,250 );
        g.setColor(Color.BLACK);
        g.setFont(f1);
        g.drawString("Earth Switch", 370, 250);

        g2d.drawLine(550,230,450,230);
        g2d.drawLine(450,230,450,250);
        g2d.drawLine(450,270,450,290);

        g2d.drawLine(430,290,470,290);
        g2d.drawLine(440,310,460,310);
        g.setColor(Color.BLUE);
        g2d.drawRect(520,250, 55, 60);
        g.setColor(Color.BLACK);
         g.setFont(f1);
        g.drawString("Circuit Breaker", 580, 280);
        g.setColor(Color.BLUE);
        g2d.drawLine(550,310,550 ,350 );
        g.setColor(Color.BLACK);
         g.setFont(f1);
        g.drawString("ISOLATOR 89C", 430, 380);
        g.setColor(Color.BLUE);
        g2d.drawLine(550,380,520,350);
        g2d.drawLine(550,380,550,450);

        g.setColor(Color.BLACK);
         g.setFont(f1);
        g.drawString("Earth Switch", 660, 350);

        g2d.drawLine(550,330,650,330);
        g2d.drawLine(650,330,650,350);

        g2d.drawLine(650,350,650,380);
        g2d.drawLine(650,400,650,430);

        g2d.drawLine(650,430,680,430);
        g2d.drawLine(630,430,660,430);
        g2d.drawLine(640,450,670,450);


        BasicStroke bs3 = new BasicStroke(2, BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs3);
        g.setColor(Color.blue);
        g2d.drawOval(530, 450, 50, 50);
        g2d.drawOval(530, 490, 50, 50);
        g.setColor(Color.BLACK);
         g.setFont(f1);
        g.drawString("GT", 600, 490);
        g.setColor(Color.blue);
        g2d.setStroke(bs2);
        g2d.drawLine(550, 540, 550, 570);
        g2d.setStroke(bs3);
        g.setColor(Color.GRAY);
        g2d.drawOval(530, 570, 50, 50);
        g.fillOval(530, 570, 50,50);
       
       

}

    public static void main(String[] args) {

        JFrame frame = new JFrame("Main");
        frame.add(new Main());
  // frame.getContentPane.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        frame.getContentPane().add(new AllButtons(),BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        


        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //JPanel panel=new JPanel();
        
       
       

    }

}
