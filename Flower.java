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
  private boolean isGrown;
  private boolean isAlive;
  List<Flower> flowers = new ArrayList<Flower>(plot, colour);//grown flowers, plot and colour depends on seeds
  //Methods for flower, mainly idle, grow and die
  public void idle(){
    //sway animation????
  }
 
    @Override
public void grow(Graphics g) {//grows flower one completed lesson after planting 
Graphics2D g2d = (Graphics2D) g;
g2d.drawRect(50, 50, 30, 30);//plot x,plot y, img)


  }
  public void die(){
    //remove flower from end list, checks the accuracy of the lesson; if below 50%, kill flower
  }
}
  
