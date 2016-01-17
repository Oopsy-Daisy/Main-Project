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
  ArrayList<String> availableItems = new ArrayList<String>();
  ArrayList<String> unavailableItems = new ArrayList<String>();
  
  public Shop(int userLevel)
  {
    unavailableItems.add("greenFlower.png");
    unavailableItems.add("blueFlower.png");
    unavailableItems.add("orangeFlower.png");
    unavailableItems.add("pinkFlower.png");
    unavailableItems.add("fertilizer.png");
  }
}