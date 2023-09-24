import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Actor
{
    private boolean isDown;
    private String Squares;
    private String downImage;
    private String downKey;
    private String sound; 
    
    /**
     * Act - do whatever the Square wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Square(String keyName,String soundFile)
    {
        Squares = keyName;
        downKey = downImage;
        sound = soundFile;
       
        
        GreenfootImage img = new GreenfootImage(200,200);
        img.setColor(new Color(255, 255, 255, 255));
        img.drawRect(0,0,100,100);
        setImage(img);
        
    }
    
    public void act() 
    {
        if ( !isDown && Greenfoot.isKeyDown(Squares))
            {
            GreenfootImage img = new GreenfootImage(200,200);
            int red = Greenfoot.getRandomNumber(200) + 30;
            int green = Greenfoot.getRandomNumber(200) + 30;
            int blue = Greenfoot.getRandomNumber(200) + 30;
            int alpha = Greenfoot.getRandomNumber(190) + 60;
        
            img.setColor(new Color(red, green, blue, 255));
            img.fillRect(0,0,100,100);
            setImage(img);
            isDown = true;
            play();
        }   
        if ( isDown && !Greenfoot.isKeyDown(Squares))
        {
            GreenfootImage img = new GreenfootImage(200,200);
            int red = Greenfoot.getRandomNumber(200) + 30;
            int green = Greenfoot.getRandomNumber(200) + 30;
            int blue = Greenfoot.getRandomNumber(200) + 30;
            int alpha = Greenfoot.getRandomNumber(190) + 60;
        
            img.setColor(new Color(255, 255, 255, 255));
            img.drawRect(0,0,100,100);
            setImage(img);
            isDown = false;
    
        } 
    }
    public void play()
    {
        Greenfoot.playSound(sound);
    }
    }

