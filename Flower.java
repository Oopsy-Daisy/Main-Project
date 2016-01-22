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
  static Flower[] flowers = new Flower[5];//colour depends on seeds
  private Main ba;
  private Challenges chall;
  
  public Flower(int plotX,int plotY,boolean isAlive,Challenges chall, Main ba){
    this.ba=ba;
    this.chall = chall;
    
    flowers[0] = new Flower (10,10,false,chall,ba);
    flowers[1] = new Flower (20,10,false,chall,ba);
    flowers[2] = new Flower (30,10,false,chall,ba);
  }
  
   public void plantSeed(){
    //plant seed from available seeds in next avail plot
    if(ba.currentInventory.size()>0)
    {
      if(currentF<=5){
        
        //plant chosen seed in next available plot point, set boolean isAlive to true for that flower, paint unbloomed flower, 
        if(ba.currentInventory.get(0).getName().equals("orangeFlower.png")){
          flower[currentF].isAlive = true;
          g.drawImage(ba.currentInventory.get(0).getName(),flower[currentF].plotX,flower[currentF].plotY,null);
          currentF++;
        }
           if(ba.currentInventory.get(0).getName().equals("blueFlower.png")){
             flower[currentF].isAlive = true;
             g.drawImage(ba.currentInventory.get(0).getName(),flower[currentF].plotX,flower[currentF].plotY,null);
             currentF++;
           }
              if(ba.currentInventory.get(0).getName().equals("greenFlower.png")){
                flower[currentF].isAlive = true;
              g.drawImage(ba.currentInventory.get(0).getName(),flower[currentF].plotX,flower[currentF].plotY,null);
                currentF++;
              }
                 if(ba.currentInventory.get(0).getName().equals("pinkFlower.png")){
                   flower[currentF].isAlive = true;
                   g.drawImage(ba.currentInventory.get(0).getName(),flower[currentF].plotX,flower[currentF].plotY,null);
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
  
    public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    BufferedImage currentF = null;
    try {
      currentF = ImageIO.read(new File(ba.currentInventory.get(0).getName()));
    } catch (IOException e) {
    }
}
}


