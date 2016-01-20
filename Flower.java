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
  public int plotX;
  public int plotY;
  private boolean isGrown = false;
  private boolean isAlive = false;
  Flower[] flowers = new Flower[3];//colour depends on seeds
  
  public Flower(){
    flowers[1] = new Flower (10,10,seed.colour,false,false);
    flowers[2] = new Flower (20,10,seed.colour,false,false);
    flowers[3] = new Flower (30,10,seed.colour,false,false);
  }
  
//  public void idle(){
//    sway animation????
//  }
  
  @Override
  public void grow(Graphics g) {//grows flower one completed lesson after planting 
    Graphics2D g2d = (Graphics2D) g;
   
    
    
  }
  public void die(){
    //set isAlive to false, checks the accuracy of the lesson; if below 50%, kill flower
  }
}

