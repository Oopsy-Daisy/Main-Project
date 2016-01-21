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
  private String img;
  public int plotX;
  public int plotY;
  private boolean isAlive = false;
  private int currentF = 0; //updates everytime a new flower is planted or dies
  Flower[] flowers = new Flower[5];//colour depends on seeds
  private Main ba;
  
  public Flower(plotX,plotY,isAlive){
    this.ba=ba;
    flowers[0] = new Flower (10,10,false);
    flowers[1] = new Flower (20,10,false);
    flowers[2] = new Flower (30,10,false);
  }
  
  
  public void die(){
    //set isAlive to false, checks the accuracy of the challenge; if below 50%, kill flower
    if (challenge acc<50){
      if(ba.fertilizerCount<=0){
        isAlive = false;
        //stop printing
        currentF--;
      }
      else{
        ba.fertilizerCount--;
      }
    }
  }
}


