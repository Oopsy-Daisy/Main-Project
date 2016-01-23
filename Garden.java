//import java.awt.*;
//import javax.swing.*;
//import javax.imageio.*;
//import java.io.*;
//import java.awt.Image;
import java.awt.image.BufferedImage;
//import java.awt.event.KeyEvent;
////import java.awt.event.KeyListener;
//import java.awt.event.*;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Garden 
{
//  private Challenges chall;
//  private Main ba;
  public static ArrayList<Flower> gardenPlot = new ArrayList<Flower>();
  BufferedImage orange = null;
  BufferedImage blue = null;
  BufferedImage green = null;
  BufferedImage pink = null;
  int x=275;
  int y=750;
  int nextFlower=0;
  
  
  public Garden()
  {
    
  }
  
  public void plantFlower()
  {
    if (Main.currentInventory.size()!=0)
    {
      if (gardenPlot.size()<10)
      {
        if (x+Main.currentInventory.get(0).getWidth()<=1280)
        {
          gardenPlot.add(new Flower(x,y, true, Main.currentInventory.get(0).getName()));
          x=x+Main.currentInventory.get(0).getWidth();
          Main.currentInventory.remove(0);
        }
      }
      else
      {
        gardenPlot.add(new Flower(gardenPlot.get(0).plotX,y, true, Main.currentInventory.get(0).getName()));
        gardenPlot.remove(0);
        x=x+Main.currentInventory.get(0).getWidth();
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



