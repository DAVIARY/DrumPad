import greenfoot.*;


/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    //private String[] message1 = { "Q", "W", "E", "R"};
    private String KeyLetter; 
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public Message(String key)
    {
        KeyLetter = key;
        GreenfootImage gi= new greenfoot.GreenfootImage(150,50*3);
        //gi.setColor(java.awt.Color.white);
        float fontSize = 25f;
        Font font = gi.getFont().deriveFont(fontSize);
        gi.setFont(font);
        gi.drawString(key,25, 30);
        setImage(gi);
    }
}
