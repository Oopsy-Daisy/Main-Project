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

public class Flower extends JPanel
{
  //Flower variables including the colour height and health
  private String colour;
  private int height;
  private int health;
  //Methods for flower, mainly idle, grow and die
  public void idle(){
    //sway animation????
  }
  public void grow(){
    String c = colour;
    int health = 100;
    @Override
public void paint(Graphics g) {
Graphics2D g2d = (Graphics2D) g;
g2d.setColor(Color.c);//GET COLOUR FROM SEED


  }
  private void die(){
    //remove flower from end list
  }
}
