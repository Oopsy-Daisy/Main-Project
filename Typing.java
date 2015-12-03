import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;
import java.awt.Graphics2D;

public class Typing extends JPanel
{  
  String line;
  public Typing()
  {
  }
  @Override
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    int i=25;
     try
    {
      //Create a new instance of the FileReader and pass it the
      //file that needs to be read
      FileReader fr = new FileReader("Word List.txt");
      //Create a new instance of the BufferedReader and
      //add the FileReader to it
      BufferedReader br = new BufferedReader(fr);
      //A string variable that will temporarily what you’re reading
      
      //A dual purpose line! First it reads the next line and then
      //it checks to see if that line was null. If it’s null, then
      //that means you’re at the end of the file.
      while ((line=br.readLine()) != null)
      {
        g.drawString(line, 25, i);
        i+=14;
      }
      //close the file when you’re done
      br.close();
    }
    catch(IOException e)
    {
      //Error message
    }
    
  }
  
  public static void main(String[] args) throws InterruptedException {
    JFrame frame = new JFrame("Animation");
    Typing ba = new Typing();
    frame.add(ba);
    frame.setSize(1280, 984);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
//    while (true) {
//      ba.repaint();
//      Thread.sleep(10);
//    }
  }    
}
