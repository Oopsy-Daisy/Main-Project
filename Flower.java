import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.awt.*;

public class Flower 
{
  public String img;
  public int plotX  = 0;
  public int plotY = 0;
  public boolean isAlive = false;
  private BufferedImage flowerImg = null;
  
  public Flower(int plotX,int plotY,boolean isAlive, String img){
    this.plotX=plotX;
    this.plotY=plotY;
    this.isAlive=isAlive; 
    this.img=img;
    try
    {
      flowerImg = ImageIO.read(new File(img));
    } catch (IOException e){
    }
  }
  
  public void paint(Graphics2D g2d)
  {
    g2d.drawImage(flowerImg, plotX, plotY, null);
  }
}
