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
 List<String> seedsAvailable = new ArrayList<String>();//each object has a colour, null xy
 List<int> plot = new ArrayList<int>();//lists all the possible plot points, each object has an x,y
 //list of flowers and their properties, can be accessed by flower class
 
 public void plantSeed(String seedType, int location){
   //plant seed from available seeds in next avail plot
   if(seedsAvailable.length()>0)
   {
   //plant next seed in next available plot point, set boolean isAlive to true, paint unbloomed flower, set xy to plot location
   }
 }
 public void useFertilizer(Flower flower){
   //force grow flower
 } 
 public void background(){
   //paints the garden, shows plot points, spots for text
 }
   
}
