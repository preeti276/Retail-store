/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class movingtitle extends JPanel{
    int x=0, y=100;
    
    public void paint( Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Font font = new Font ("Tahoma",Font.BOLD+Font.PLAIN,50);
        g2.setFont(font);
        g2.setColor(Color.red);
        g2.drawString("WELCOME TO ONLINE RETAIL STORE!", x,y);
        
        try{Thread.sleep(100);}catch(Exception ex){}
        x = x+10;
        if(x>this.getWidth())
        x=0;
        repaint();
        }
     public static void main(String[] args)
    { JFrame jf = new JFrame("homepage");
   
    jf.setSize(100,100);
    jf.add ( new movingtitle());
    jf.setVisible(true);
    }
}

