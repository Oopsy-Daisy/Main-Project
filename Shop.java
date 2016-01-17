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
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Shop
{  
  //ArrayList of Visible and Unavailable Items
  //Methods to display items
  //Method to sell items and to buy back items from user
  ArrayList<Item> availableItems = new ArrayList<Item>();
  ArrayList<Item> unavailableItems = new ArrayList<Item>();
  
  public Shop(int userLevel)
  {
    availableItems.add(new Item("greenFlower.png"));
    unavailableItems.add(new Item("blueFlower.png"));
    unavailableItems.add(new Item("orangeFlower.png"));
    unavailableItems.add(new Item("pinkFlower.png"));
    availableItems.add(new Item("fertilizer.png"));
  }
  
  public void paint(Graphics2D g) {
    
    BufferedImage img = null;
    try {
      img = ImageIO.read(new File("strawberry.jpg"));
    } catch (IOException e) {
    } 
    
  }
}