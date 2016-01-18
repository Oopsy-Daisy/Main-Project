import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlayMusic
{  
  public void playMusic()
  {
  }
    
  public void playSong()
  {
    try{
      AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource("pompeii.wav"));
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.start();
    }
    catch(Exception ex)
    {
      System.out.println("Error Reached");
    }
  }
}