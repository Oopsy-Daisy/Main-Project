import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.beans.*; //Property change stuff
import java.util.Timer;
import java.util.TimerTask;

public class Main extends JPanel
{   
  //Overall Variables from Class Diagram
  private Typing type = new Typing(this);
  public static int lessonNumb=0;
  public static int lessonsDone=0;
  public static Boolean typingDone = false;
  private Challenges challenge = new Challenges(this);
  
  public Main ()
  {
    addKeyListener(new KeyListener() {
      @Override
      public void keyTyped(KeyEvent e) {
      }
      @Override
      public void keyReleased(KeyEvent e) {
        type.keyReleased(e);
        challenge.keyReleased(e);
      }
      @Override
      public void keyPressed(KeyEvent e) {
        type.keyPressed(e);
        challenge.keyPressed(e);
      }
    });
    setFocusable(true); 
  }
  
  
  @Override
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    //type.paint(g2d,lessonNumb);
    challenge.paint(g2d);
    
  }
  //Option Methods
  //Methods for the interaction of sub methods; final integration step
  public static void main(String[] args) throws InterruptedException {
    Main ba = new Main();
    ba.doAll();
  }
  
  public void doAll()
  {
    JFrame frame = new JFrame("Animation");
    Menu demo = new Menu();
    frame.setJMenuBar(demo.createMenuBar());
    frame.setContentPane(demo.createContentPane());
    frame.add(this);
    frame.setSize(1280, 984);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    while(true)
//    {
//      Object[] possibilities = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
//      String s = (String)JOptionPane.showInputDialog(frame,"CHOOSE A NUMBER U CLOWN FINE SIR","Select a Lesson", JOptionPane.PLAIN_MESSAGE,null,possibilities,"1");
//      lessonNumb=Integer.parseInt(s);
//      while (!typingDone) {
//        this.repaint();
//        try {
//          Thread.sleep(10);
//        }
//        catch (Exception e){
//          e.printStackTrace();
//        }
//      }
//      typingDone = false;
//      type.resetTyping();
//    }
    while(true)
    {
      this.repaint();
      try {
        Thread.sleep(10);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
  }
}
