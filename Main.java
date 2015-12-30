import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;

public class Main extends JPanel
{   
  //Overall Variables from Class Diagram
  private Typing type = new Typing(this);
  
  public Main ()
  {
    addKeyListener(new KeyListener() {
      @Override
      public void keyTyped(KeyEvent e) {
      }
      @Override
      public void keyReleased(KeyEvent e) {
        type.keyReleased(e);
      }
      @Override
      public void keyPressed(KeyEvent e) {
        type.keyPressed(e);
      }
    });
    setFocusable(true); 
  }
  
  @Override
  public void paint(Graphics g) {
    //super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    type.paint(g2d);
  }
  //Option Methods
  //Methods for the interaction of sub methods; final integration step
  public static void main(String[] args) throws InterruptedException {
    JFrame frame = new JFrame("Animation");
    Main ba = new Main();
    frame.add(ba);
    frame.setSize(1280, 984);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    while (true) {
      ba.repaint();
      Thread.sleep(10);
    }
  }
}
