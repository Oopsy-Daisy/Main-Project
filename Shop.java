//import java.awt.*;
//import javax.swing.*;
import javax.imageio.*;
import java.io.*;
//import java.awt.Image;
import java.awt.image.BufferedImage;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.awt.event.*;
import java.awt.Graphics2D;
import java.util.ArrayList;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseEvent;
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

public class Shop
{  
  //ArrayList of Visible and Unavailable Items
  //Methods to display items
  //Method to sell items and to buy back items from user
  ArrayList<Item> availableItems = new ArrayList<Item>();
  ArrayList<Item> unavailableItems = new ArrayList<Item>();
  
  public Shop()
  {
    availableItems.add(new Item("greenFlower.png", 250, 50));
    availableItems.add(new Item("blueFlower.png", 150, 50));
    availableItems.add(new Item("orangeFlower.png", 50, 50));
    availableItems.add(new Item("pinkFlower.png", 350, 50));
    availableItems.add(new Item("fertilizer.png", 450, 50));
  }
  
  public void paint(Graphics2D g) {
    Graphics2D g2d = (Graphics2D) g;
    g.setColor(Color.white);
    g.fillRect (0, 0, 1280, 984);  
    for (Item i:availableItems)
     {
       i.paint(g2d);
     }
  }
}