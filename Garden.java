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

public class Garden extends JPanel
{
  
  private Main ba;
  private Flower F;
  
  public Garden()
  {
    this.ba=ba;
    this.F=F;
  }
  
  public void plantSeed(){
    //plant seed from available seeds in next avail plot
    if(ba.currentInventory.length()>0)
    {
      if(F.currentF<=5){
        
        //plant chosen seed in next available plot point, set boolean isAlive to true for that flower, paint unbloomed flower, 
        if(ba.currentInventory[0].getName().equals("orangeFlower.png")){
          flower[F.currentF].isAlive = true;
          g.drawImage(currentF,flower[F.currentF].plotX,flower[F.currentF].plotY,null);
          F.currentF++;
        }
           if(ba.currentInventory[0].getName().equals("blueFlower.png")){
             flower[currentF].isAlive = true;
             g.drawImage(currentF,flower[F.currentF].plotX,flower[F.currentF].plotY,null);
             F.currentF++;
           }
              if(ba.currentInventory[0].getName().equals("greenFlower.png")){
                flower[currentF].isAlive = true;
              g.drawImage(currentF,flower[F.currentF].plotX,flower[F.currentF].plotY,null);
                F.currentF++;
              }
                 if(ba.currentInventory[0].getName().equals("pinkFlower.png")){
                   flower[currentF].isAlive = true;
                   g.drawImage(currentF,flower[F.currentF].plotX,flower[F.currentF].plotY,null);
                   F.currentF++;
                 }
                    
                    
                    
                    }
      else{
        System.out.println("No available seeds. Purchase some from the store.");
      }
    }
  }
  
 
@Override
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    BufferedImage currentF = null;
    try {
      currentF = ImageIO.read(new File(ba.currentInventory[0].getName()));
    } catch (IOException e) {
    }
}
  }
// public void useFertilizer(Flower flower){
//   //force grow flower,must have fertilizer (purchased from shop)
// } 
 
   

