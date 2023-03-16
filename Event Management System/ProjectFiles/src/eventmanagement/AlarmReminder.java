
package eventmanagement;

import java.applet.AudioClip;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.io.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.DataLine;
import sun.applet.Main;
import sun.audio.*;

public class AlarmReminder //Alarm reminder class
{

public void play() //Method for playing alarm sournd
{
    try{
   InputStream in = new FileInputStream("E:\\iProject\\EventManagement\\EventManagement\\src\\eventmanagement\\Images\\alarm_beep.wav");
   AudioStream as = new AudioStream(in);
   AudioPlayer.player.start(in);
       }
    catch(Exception ex)
    {
    
        System.out.println(ex);
    
    }
}
//Method for playing alarm sournd
}
//Alarm reminder class