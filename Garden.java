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
  private Challenges chall;
  private Main ba;
  static Flower[] flowers = new Flower[5];//colour depends on seeds
  BufferedImage orange = null;
  BufferedImage blue = null;
  BufferedImage green = null;
  BufferedImage pink = null;
  
  
  public Garden()
  {
    this.ba=ba;
    this.chall = chall;
//    this.F=F;
     flowers[0] = new Flower (10,10,false,chall,ba,this);
    flowers[1] = new Flower (20,10,false,chall,ba,this);
    flowers[2] = new Flower (30,10,false,chall,ba,this);
    flowers[3] = new Flower (40,10,false,chall,ba,this);
    flowers[4] = new Flower (50,10,false,chall,ba,this);
    flowers[5] = new Flower (60,10,false,chall,ba,this);
  }
  
  
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    try {
      orange = ImageIO.read(new File("orangeFlower.png"));
    } catch (IOException e) {
    }
    try {
      blue = ImageIO.read(new File("blueFlower.png"));
    } catch (IOException e) {
    }
    try {
      green = ImageIO.read(new File("greenFlower.png"));
    } catch (IOException e) {
    }
    
    try {
      pink = ImageIO.read(new File("pinkFlower.png"));
    } catch (IOException e) {
    }
//@Override
//  public void paint(Graphics g) {
//    super.paint(g);
//    Graphics2D g2d = (Graphics2D) g;
//    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//    BufferedImage currentF = null;
//    try {
//      currentF = ImageIO.read(new File(ba.currentInventory[0].getName()));
//    } catch (IOException e) {
//    }
//}
  }
}
// public void useFertilizer(Flower flower){
//   //force grow flower,must have fertilizer (purchased from shop)
// } 



