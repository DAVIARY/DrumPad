import greenfoot.*;

/**
 * Write a description of class Backbeat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Backbeat extends Actor
{
    /**
     * Act - do whatever the Backbeat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public GreenfootSound backGroundMusic = new GreenfootSound("3c.wav");
   public GreenfootSound song; 
   int songVolume;
    
    public Backbeat()
    {
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(new Color(255, 0, 0, 255));
        img.fillOval(0, 0, 50, 50);
        setImage(img);
        backGroundMusic.setVolume(songVolume);
        
    } 
    
    public void act() 
    {    
        musicStart();
        musicStop();
        animation();
        songVolume();
    
    }
    
        public void songVolume()
    {

       if(Greenfoot.isKeyDown("up") && songVolume < 100)
       {
           backGroundMusic.setVolume(songVolume++);
       }
       
       if(Greenfoot.isKeyDown("down") && songVolume >1)
       {
           backGroundMusic.setVolume(songVolume--);
       }
       
    }

    public void animation()
    {
        if(!backGroundMusic.isPlaying())
       {
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(new Color(255, 0, 0, 255));
        img.fillOval(0, 0, 50, 50);
        setImage(img);
    
       } 
       else 
       {
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(new Color(0, 255, 0, 255));
        img.fillOval(0, 0, 50, 50);
        setImage(img);
    
        }
    }
   
    public void music()
    {
      if(!backGroundMusic.isPlaying())
      {
          backGroundMusic.playLoop();
      }
    }
    
    public void musicStart()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            music();
        }
    }
    
    public void musicStop()
    {
        if (Greenfoot.isKeyDown("enter"))
        {
            backGroundMusic.pause();
        }
    }
}
