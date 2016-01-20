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
 public List<String> seedsAvailable = new ArrayList<String>();//each object has a colour
 
 public void plantSeed(String seedType, int location){
   //plant seed from available seeds in next avail plot
   if(seedsAvailable.length()>0)
   {
   //plant chosen seed in next available plot point, set boolean isAlive to true for that flower, paint unbloomed flower, 
   }
 }
 public void useFertilizer(Flower flower){
   //force grow flower,must have fertilizer (purchased from shop)
 } 
 
   
}
