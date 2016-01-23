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
import java.util.ArrayList;

public class Garden 
{
  private Challenges chall;
  private Main ba;
  private static ArrayList<Flower> gardenPlot = new ArrayList<Flower>();
  BufferedImage orange = null;
  BufferedImage blue = null;
  BufferedImage green = null;
  BufferedImage pink = null;
  int x=275;
  int y=750;
  
  
  public Garden()
  {
    
  }
  
  public void plantFlower()
  {
    if (ba.currentInventory.size()!=0)
    {
      if (x+ba.currentInventory.get(0).getWidth()<=1280)
      {
        gardenPlot.add(new Flower(x,y, true, ba.currentInventory.get(0).getName()));
        x=x+ba.currentInventory.get(0).getWidth();
        Main.currentInventory.remove(0);
      }
    }
  }
  
  public void paint(Graphics2D g) {
    for (Flower i:gardenPlot)
    {
      i.paint(g);
    }
  }
}



