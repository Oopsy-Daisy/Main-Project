import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.InputStream;
  import java.net.URL;

public class PlayMusic
{  
  public void playMusic()
  {
  }
    
  public void playSong()
  {
    try{
      URL s = this.getClass().getResource("piano2.wav");
      System.out.println(s);
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(s);
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.start();
    }
    catch(Exception ex)
    {
      ex.printStackTrace();
    }
  }
}