import java.awt.*;
<<<<<<< HEAD
//import javax.swing.*;
import javax.imageio.*;
import java.io.*;
//import java.awt.Image;
import java.awt.image.BufferedImage;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.awt.event.*;
//import javax.swing.JOptionPane;
//import javax.swing.JDialog;
//import javax.swing.JButton;
//import javax.swing.JRadioButton;
//import javax.swing.ButtonGroup;
//import javax.swing.JLabel;
//import javax.swing.ImageIcon;
//import javax.swing.BoxLayout;
//import javax.swing.Box;
//import javax.swing.BorderFactory;
//import javax.swing.border.Border;
//import javax.swing.JTabbedPane;
//import javax.swing.JPanel;
//import javax.swing.JFrame;
//import java.beans.*; //Property change stuff
//import java.util.Timer;
//import java.util.TimerTask;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseEvent;
=======
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.beans.*; //Property change stuff
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
>>>>>>> master

public class Item
{
  private BufferedImage img = null;
  private String fileLocation = "";
  private int x = 0;
  private int y = 0;
  
<<<<<<< HEAD
  public Item(String fileLocation, int x, int y)
=======
  public Item(String fileLocation)
>>>>>>> master
  {
    this.fileLocation = fileLocation;
    try
    {
      img = ImageIO.read(new File(fileLocation));
    } catch (IOException e)
    {
      System.out.println("No Image");
    }
<<<<<<< HEAD
    this.x = x;
    this.y = y;
=======
>>>>>>> master
  }
  
  public void paint(Graphics2D g2d)
  {
    g2d.drawImage(img, x, y, null);
  }
}