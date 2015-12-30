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


public class Typing
{  
  //Need to import files into an arrayList of lessons
  //Setup function to display and run typing lessons
  //Include keyListeners
  
  String line;
  boolean shiftPressed=false;
  private Main ba;
  int charNumb=0;
  boolean typed=false;
  String typedChar="kjsfdhsg";
  int x=25;
  ArrayList<String>lessons=new ArrayList<String>(); 
  ArrayList<ColourChar> colourChars = new ArrayList<ColourChar>();
  
  public Typing(Main ba)
  {
    this.ba=ba;
    try
    {
      //Create a new instance of the FileReader and pass it the
      //file that needs to be read
      FileReader fr = new FileReader("Word List.txt");
      //Create a new instance of the BufferedReader and
      //add the FileReader to it
      BufferedReader br = new BufferedReader(fr);
      //A string variable that will temporarily what youâ€™re reading
      
      //A dual purpose line! First it reads the next line and then
      //it checks to see if that line was null. If itâ€™s null, then
      //that means youâ€™re at the end of the file.
      while ((line=br.readLine()) != null)
      {
        lessons.add(line);
      }
      //close the file when youâ€™re done
      br.close();
    }
    catch(IOException e)
    {
      //Error message
    }
  }
  
  public void keyReleased(KeyEvent e) {
    typed=true;
    if (e.getKeyCode()==KeyEvent.VK_SHIFT)
    {shiftPressed=false;}
    if(e.getKeyCode()==KeyEvent.VK_SPACE)
    {typedChar=" ";}
// LOWER CASE LETTERS
    if (e.getKeyCode()==KeyEvent.VK_A && shiftPressed==false)
    {typedChar="a";}
    if (e.getKeyCode()==KeyEvent.VK_B && shiftPressed==false)
    {typedChar="b";}  
    if (e.getKeyCode()==KeyEvent.VK_C && shiftPressed==false)
    {typedChar="c";}
    if (e.getKeyCode()==KeyEvent.VK_D && shiftPressed==false)
    {typedChar="d";}
    if (e.getKeyCode()==KeyEvent.VK_E && shiftPressed==false)
    {typedChar="e";}
    if (e.getKeyCode()==KeyEvent.VK_F && shiftPressed==false)
    {typedChar="f";}
    if (e.getKeyCode()==KeyEvent.VK_G && shiftPressed==false)
    {typedChar="g";}
    if (e.getKeyCode()==KeyEvent.VK_H && shiftPressed==false)
    {typedChar="h";}
    if (e.getKeyCode()==KeyEvent.VK_I && shiftPressed==false)
    {typedChar="i";}
    if (e.getKeyCode()==KeyEvent.VK_J && shiftPressed==false)
    {typedChar="j";}
    if (e.getKeyCode()==KeyEvent.VK_K && shiftPressed==false)
    {typedChar="k";}
    if (e.getKeyCode()==KeyEvent.VK_L && shiftPressed==false)
    {typedChar="l";}
    if (e.getKeyCode()==KeyEvent.VK_M && shiftPressed==false)
    {typedChar="m";}
    if (e.getKeyCode()==KeyEvent.VK_N && shiftPressed==false)
    {typedChar="n";}
    if (e.getKeyCode()==KeyEvent.VK_O && shiftPressed==false)
    {typedChar="o";}
    if (e.getKeyCode()==KeyEvent.VK_P && shiftPressed==false)
    {typedChar="p";}
    if (e.getKeyCode()==KeyEvent.VK_Q && shiftPressed==false)
    {typedChar="q";}
    if (e.getKeyCode()==KeyEvent.VK_R && shiftPressed==false)
    {typedChar="r";}
    if (e.getKeyCode()==KeyEvent.VK_S && shiftPressed==false)
    {typedChar="s";}
    if (e.getKeyCode()==KeyEvent.VK_T && shiftPressed==false)
    {typedChar="t";}
    if (e.getKeyCode()==KeyEvent.VK_U && shiftPressed==false)
    {typedChar="u";}
    if (e.getKeyCode()==KeyEvent.VK_V && shiftPressed==false)
    {typedChar="v";}
    if (e.getKeyCode()==KeyEvent.VK_W && shiftPressed==false)
    {typedChar="w";}
    if (e.getKeyCode()==KeyEvent.VK_X && shiftPressed==false)
    {typedChar="x";}
    if (e.getKeyCode()==KeyEvent.VK_Y && shiftPressed==false)
    {typedChar="y";}
    if (e.getKeyCode()==KeyEvent.VK_Z && shiftPressed==false)
    {typedChar="z";}
    
// UPPER CASE LETTERS
    if (e.getKeyCode()==KeyEvent.VK_A && shiftPressed==true)
    {typedChar="A";}
    if (e.getKeyCode()==KeyEvent.VK_B && shiftPressed==true)
    {typedChar="B";}  
    if (e.getKeyCode()==KeyEvent.VK_C && shiftPressed==true)
    {typedChar="C";}
    if (e.getKeyCode()==KeyEvent.VK_D && shiftPressed==true)
    {typedChar="D";}
    if (e.getKeyCode()==KeyEvent.VK_E && shiftPressed==true)
    {typedChar="E";}
    if (e.getKeyCode()==KeyEvent.VK_F && shiftPressed==true)
    {typedChar="F";}
    if (e.getKeyCode()==KeyEvent.VK_G && shiftPressed==true)
    {typedChar="G";}
    if (e.getKeyCode()==KeyEvent.VK_H && shiftPressed==true)
    {typedChar="H";}
    if (e.getKeyCode()==KeyEvent.VK_I && shiftPressed==true)
    {typedChar="I";}
    if (e.getKeyCode()==KeyEvent.VK_J && shiftPressed==true)
    {typedChar="J";}
    if (e.getKeyCode()==KeyEvent.VK_K && shiftPressed==true)
    {typedChar="K";}
    if (e.getKeyCode()==KeyEvent.VK_L && shiftPressed==true)
    {typedChar="L";}
    if (e.getKeyCode()==KeyEvent.VK_M && shiftPressed==true)
    {typedChar="M";}
    if (e.getKeyCode()==KeyEvent.VK_N && shiftPressed==true)
    {typedChar="N";}
    if (e.getKeyCode()==KeyEvent.VK_O && shiftPressed==true)
    {typedChar="O";}
    if (e.getKeyCode()==KeyEvent.VK_P && shiftPressed==true)
    {typedChar="P";}
    if (e.getKeyCode()==KeyEvent.VK_Q && shiftPressed==true)
    {typedChar="Q";}
    if (e.getKeyCode()==KeyEvent.VK_R && shiftPressed==true)
    {typedChar="R";}
    if (e.getKeyCode()==KeyEvent.VK_S && shiftPressed==true)
    {typedChar="S";}
    if (e.getKeyCode()==KeyEvent.VK_T && shiftPressed==true)
    {typedChar="T";}
    if (e.getKeyCode()==KeyEvent.VK_U && shiftPressed==true)
    {typedChar="U";}
    if (e.getKeyCode()==KeyEvent.VK_V && shiftPressed==true)
    {typedChar="V";}
    if (e.getKeyCode()==KeyEvent.VK_W && shiftPressed==true)
    {typedChar="W";}
    if (e.getKeyCode()==KeyEvent.VK_X && shiftPressed==true)
    {typedChar="X";}
    if (e.getKeyCode()==KeyEvent.VK_Y && shiftPressed==true)
    {typedChar="Y";}
    if (e.getKeyCode()==KeyEvent.VK_Z && shiftPressed==true)
    {typedChar="Z";}
    
// NUMBERS
    if (e.getKeyCode()==KeyEvent.VK_0 && shiftPressed==false)
    {typedChar="0";}
    if (e.getKeyCode()==KeyEvent.VK_1 && shiftPressed==false)
    {typedChar="1";}
    if (e.getKeyCode()==KeyEvent.VK_2 && shiftPressed==false)
    {typedChar="2";}
    if (e.getKeyCode()==KeyEvent.VK_3 && shiftPressed==false)
    {typedChar="3";}
    if (e.getKeyCode()==KeyEvent.VK_4 && shiftPressed==false)
    {typedChar="4";}
    if (e.getKeyCode()==KeyEvent.VK_5 && shiftPressed==false)
    {typedChar="5";}
    if (e.getKeyCode()==KeyEvent.VK_6 && shiftPressed==false)
    {typedChar="6";}
    if (e.getKeyCode()==KeyEvent.VK_7 && shiftPressed==false)
    {typedChar="7";}
    if (e.getKeyCode()==KeyEvent.VK_8 && shiftPressed==false)
    {typedChar="8";}
    if (e.getKeyCode()==KeyEvent.VK_9 && shiftPressed==false)
    {typedChar="9";}
// PUNCTUATION AND OTHER CHARARATERS
    if (e.getKeyCode()==KeyEvent.VK_BACK_QUOTE && shiftPressed==false)
    {typedChar="`";}//`
    if (e.getKeyCode()==KeyEvent.VK_MINUS && shiftPressed==false)
    {typedChar="-";}//-
    if (e.getKeyCode()==KeyEvent.VK_EQUALS && shiftPressed==false)
    {typedChar="=";}//=
    if (e.getKeyCode()==KeyEvent.VK_BACK_QUOTE && shiftPressed==true)
    {typedChar="~";}//~
    if (e.getKeyCode()==KeyEvent.VK_1 && shiftPressed==true)
    {typedChar="!";}//!
    if (e.getKeyCode()==KeyEvent.VK_2 && shiftPressed==true)
    {typedChar="@";}//@
    if (e.getKeyCode()==KeyEvent.VK_3 && shiftPressed==true)
    {typedChar="#";}//#
    if (e.getKeyCode()==KeyEvent.VK_4 && shiftPressed==true)
    {typedChar="$";}//$
    if (e.getKeyCode()==KeyEvent.VK_5 && shiftPressed==true)
    {typedChar="%";}//%
    if (e.getKeyCode()==KeyEvent.VK_6 && shiftPressed==true)
    {typedChar="^";}//^
    if (e.getKeyCode()==KeyEvent.VK_7 && shiftPressed==true)
    {typedChar="&";}//&
    if (e.getKeyCode()==KeyEvent.VK_8 && shiftPressed==true)
    {typedChar="*";}//*
    if (e.getKeyCode()==KeyEvent.VK_9 && shiftPressed==true)
    {typedChar="(";}//(
    if (e.getKeyCode()==KeyEvent.VK_0 && shiftPressed==true)
    {typedChar=")";}//)
    if (e.getKeyCode()==KeyEvent.VK_MINUS && shiftPressed==true)
    {typedChar="_";}//_
    if (e.getKeyCode()==KeyEvent.VK_EQUALS && shiftPressed==true)
    {typedChar="+";}//+
    if (e.getKeyCode()==KeyEvent.VK_OPEN_BRACKET && shiftPressed==false)
    {typedChar="[";}//[
    if (e.getKeyCode()==KeyEvent.VK_CLOSE_BRACKET && shiftPressed==false)
    {typedChar="]";}//]
    if (e.getKeyCode()==KeyEvent.VK_BACK_SLASH && shiftPressed==false)
    {typedChar="\\";}//\
    if (e.getKeyCode()==KeyEvent.VK_OPEN_BRACKET && shiftPressed==true)
    {typedChar="{";}//{
    if (e.getKeyCode()==KeyEvent.VK_CLOSE_BRACKET && shiftPressed==true)
    {typedChar="}";}//}
    if (e.getKeyCode()==KeyEvent.VK_BACK_SLASH && shiftPressed==true)
    {typedChar="|";}//|
    if (e.getKeyCode()==KeyEvent.VK_SEMICOLON && shiftPressed==false)
    {typedChar=";";}//;
    if (e.getKeyCode()==KeyEvent.VK_SEMICOLON && shiftPressed==true)
    {typedChar=":";}//:
    if (e.getKeyCode()==KeyEvent.VK_QUOTE && shiftPressed==false)
    {typedChar="'";}//'
    if (e.getKeyCode()==KeyEvent.VK_QUOTE && shiftPressed==true)
    {typedChar="\"";}//"
    if (e.getKeyCode()==KeyEvent.VK_COMMA && shiftPressed==false)
    {typedChar=",";}//,
    if (e.getKeyCode()==KeyEvent.VK_COMMA && shiftPressed==true)
    {typedChar="<";}//<
    if (e.getKeyCode()==KeyEvent.VK_PERIOD && shiftPressed==false)
    {typedChar=".";}//.
    if (e.getKeyCode()==KeyEvent.VK_PERIOD && shiftPressed==true)
    {typedChar=">";}//>
    if (e.getKeyCode()==KeyEvent.VK_SLASH && shiftPressed==false)
    {typedChar="/";}///
    if (e.getKeyCode()==KeyEvent.VK_SLASH && shiftPressed==true)
    {typedChar="?";}//?
  }
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode()==KeyEvent.VK_SHIFT)
    {
      shiftPressed=true;
    }
  }
  public void keyTyped(KeyEvent e) {
  }
  
  public void paint(Graphics2D g) {
    int i=25;
    int fontSize = 18;
    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
    for (int count=0;count<lessons.size();count++)
    {
      g.drawString(lessons.get(count), 25, i);
      i+=14;
    }
//    for (int count=1;count<lessons.size();count+=2)//which line? (disregard lesson titles)
//    {
//      for (int count2=0;count2<lessons.get(1).length();count2++)//which char in the line?
//      {
    if (charNumb<lessons.get(1).length())
    {
        if (typedChar.equals(lessons.get(1).substring(charNumb,charNumb+1))==true && typed==true)
        {
//          g.setColor(Color.GREEN);
//          g.drawString(lessons.get(1).substring(charNumb,charNumb+1), x, 500);
//          x+=8;
          charNumb++;
          typed=false;
          colourChars.add(new ColourChar(lessons.get(1).charAt(charNumb-1), Color.GREEN));
        }
        if (typedChar.equals(lessons.get(1).substring(charNumb,charNumb+1))==false && typed==true)
        {
//          g.setColor(Color.RED);
//          g.drawString(lessons.get(1).substring(charNumb,charNumb+1), x, 500);
//          x+=8;
          charNumb++;
          typed=false;
          colourChars.add(new ColourChar(lessons.get(1).charAt(charNumb-1), Color.RED));
        }
        x=25;
        for (int i1 = 0; i1 < colourChars.size(); i1++)
        {
          g.setColor(colourChars.get(i1).theColour);
          g.drawString(""+colourChars.get(i1).theChar, x, 500);
          x+=8;
        }
    }
  }
//    }
//  }
  
//  public static void main(String[] args) throws InterruptedException {
//    JFrame frame = new JFrame("Animation");
//    Typing ba = new Typing();
//    frame.add(ba);
//    frame.setSize(1280, 984);
//    frame.setVisible(true);
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    
////    while (true) {
////      ba.repaint();
////      Thread.sleep(10);
////    }
//  }    
}
