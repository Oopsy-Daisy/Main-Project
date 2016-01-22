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
  public int plotX  = 0;
  public int plotY = 0;
  public boolean isAlive = false;
  public int currentF = 0; //updates everytime a new flower is planted or dies
 private static Garden gar;
  private Main ba;
  private Challenges chall;
//   BufferedImage orange = null;
//   BufferedImage blue = null;
//    BufferedImage green = null;
//    BufferedImage pink = null;
//  
  public Flower(int plotX,int plotY,boolean isAlive,Challenges chall, Main ba){
    this.ba=ba;
    this.chall = chall;
    this.gar = gar;
    
    
  }
  
  public void plantSeed(Graphics g){
    //plant seed from available seeds in next avail plot
    if(ba.currentInventory.size()>0)
    {
      if(currentF<=5){
        
        //plant chosen seed in next available plot point, set boolean isAlive to true for that flower, paint unbloomed flower, 
        if(ba.currentInventory.get(0).getName().equals("orangeFlower.png")){
          gar.flowers[currentF].isAlive = true;
          g.drawImage(gar.orange,gar.flowers[currentF].plotX,gar.flowers[currentF].plotY,null);
          currentF++;
        }
        if(ba.currentInventory.get(0).getName().equals("blueFlower.png")){
          gar.flowers[currentF].isAlive = true;
          g.drawImage(gar.blue,gar.flowers[currentF].plotX,gar.flowers[currentF].plotY,null);
          currentF++;
        }
        if(ba.currentInventory.get(0).getName().equals("greenFlower.png")){
          gar.flowers[currentF].isAlive = true;
          g.drawImage(gar.green,gar.flowers[currentF].plotX,gar.flowers[currentF].plotY,null);
          currentF++;
        }
        if(ba.currentInventory.get(0).getName().equals("pinkFlower.png")){
          gar.flowers[currentF].isAlive = true;
          g.drawImage(gar.pink,gar.flowers[currentF].plotX,gar.flowers[currentF].plotY,null);
          currentF++;
        }
        
        
        
      }
      else{
        System.out.println("No available seeds. Purchase some from the store.");
      }
    }
  }
  public void die(){
    //set isAlive to false, checks the accuracy of the challenge; if below 50%, kill flower
    if (chall.getAcc()<50){
      if(ba.fertilizerInventory<=0){
        isAlive = false;
        //stop printing
        currentF--;
      }
      else{
        ba.fertilizerInventory--;
      }
    }
  }
  
//  public void paint(Graphics g) {
//    super.paint(g);
//    Graphics2D g2d = (Graphics2D) g;
//    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//    try {
//      orange = ImageIO.read(new File("orangeFlower.png"));
//    } catch (IOException e) {
//    }
//    
//    try {
//      blue = ImageIO.read(new File("blueFlower.png"));
//    } catch (IOException e) {
//    }
//   
//    try {
//      green = ImageIO.read(new File("greenFlower.png"));
//    } catch (IOException e) {
//    }
//    
//    try {
//      pink = ImageIO.read(new File("pinkFlower.png"));
//    } catch (IOException e) {
//    }
  }



