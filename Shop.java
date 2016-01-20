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
  private static ArrayList<Item> availableItems = new ArrayList<Item>();
  private static ArrayList<Item>  unavailableItems = new ArrayList<Item>();
  
  public Shop()
  {
    availableItems.add(new Item("orangeFlower.png", 150, 70));
    unavailableItems.add(new Item("blueFlower.png", 350, 100));
    unavailableItems.add(new Item("greenFlower.png", 550, 75));
    unavailableItems.add(new Item("pinkFlower.png", 750, 98));
    unavailableItems.add(new Item("fertilizer.png", 950, 135));
  }
  
  public static void updateItemsAvail()
  {
    if ((Main.lessonsDone/3)>=1)
    {
      availableItems.add(unavailableItems.get(0));
    }
    if ((Main.lessonsDone/3)>=2)
    {
      availableItems.add(unavailableItems.get(1));
    }
    if ((Main.lessonsDone/3)>=3)
    {
      availableItems.add(unavailableItems.get(2));
    }
    if ((Main.lessonsDone/3)>=4)
    {
      availableItems.add(unavailableItems.get(3));
    }
  }
  
  public static void clickMade(int x, int y)
  {
    if(ableToBuyItem(availableItems, "orangeFlower.png", x, y, 1) == true)
    {
      Main.coins = Main.coins-1;
      System.out.println("Orange Flower Sold");
      Main.currentInventory.add(new Item("orangeFlower.png", 50, 50));
    }
    if(ableToBuyItem(availableItems, "blueFlower.png", x, y, 2) == true)
    {
      Main.coins = Main.coins-2;
      System.out.println("Blue Flower Sold");
      Main.currentInventory.add(new Item("blueFlower.png", 150, 50));
    }
    if(ableToBuyItem(availableItems, "greenFlower.png", x, y, 3) == true)
    {
      Main.coins = Main.coins-3;
      System.out.println("Green Flower Sold");
      Main.currentInventory.add(new Item("greenFlower.png", 250, 50));
    }
    if(ableToBuyItem(availableItems, "pinkFlower.png", x, y, 3) == true)
    {
      Main.coins = Main.coins-3;
      System.out.println("Pink Flower Sold");
      Main.currentInventory.add(new Item("pinkFlower.png", 350, 50));
    }
    if(ableToBuyItem(availableItems, "fertilizer.png", x, y, 2) == true)
    {
      Main.coins = Main.coins-2;
      System.out.println("Ferilizer Sold");
      Main.currentInventory.add(new Item("fertilizer.png", 50, 50));
    }
  }
  
  private static boolean ableToBuyItem(ArrayList<Item> list, String name, int x, int y, int price) {
    for (Item item : list) {
      if (item.getName().equals(name)) {
        if (x>=item.getX() && x<=item.getX()+item.getWidth())
        {
          if (y>=item.getY()&& y<=item.getY()+item.getHeight())
          {
            if(Main.coins>=price)
            {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  public void paint(Graphics2D g) {
    updateItemsAvail();
    Graphics2D g2d = (Graphics2D) g;
    g.setColor(Color.white);
    g.fillRect (0, 0, 1280, 984);  
    BufferedImage shelf = null;
    try {
      shelf = ImageIO.read(new File("emptyShelf.png"));
    } catch (IOException e) {
    }
    g.drawImage(shelf,0,0,null);
    for (Item i:availableItems)
    {
      i.paint(g2d);
    }
  }
}
