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

public class Flower extends JPanel
{
  //Flower variables including the colour height and health
  private String colour;
  private int height;
  private boolean alive;
  List<Flower> flowers = new ArrayList<Flower>(plot, colour);
  //Methods for flower, mainly idle, grow and die
  public void idle(){
    //sway animation????
  }
 
    @Override
public void grow(Graphics g) {
Graphics2D g2d = (Graphics2D) g;
g2d.drawRect(50, 50, 30, 30);//plot x,plot y, img)


  }
  private void die(){
    //remove flower from end list
  }
}
  
