import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kolling
 * @version: 0.1
 */
public class Background extends World
{
    private String[] whiteKeys  = { "a", "s", "d", "f","g", "h", "j", "k", "l", ";", "'", "\\" };
    private String[] whiteNotes = { "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" };
    private String[] blackKeys  = { "q", "w", "", "r", "t", "y", "", "i", "o", "","["};
    private String[] blackNotes = { "3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#"};
    private String[] whiteKeys1  = { "Q", "W", "E", "R"};
    private String[] whiteKeys2  = { "A", "S", "D", "F"};
    private String[] whiteKeys3  = { "Z", "X", "C", "V"};
    private String[] whiteNotes1 = { "kick1.aif", "kick2.aif", "conga1.aif", "hightom.aif"};
    private String[] whiteNotes2 = { "tom1.aif", "handclap.aif", "snare.aif", "crashcym.aif"};
    private String[] whiteNotes3 = { "open_hh.aif", "rimshot.aif", "maracas.aif", "cowbell.aif"};
   
    
    
    /**
     * Make the piano.
     * CHANGE THE key and piano NAME
     * CHANGE THE BACKGROUND    
     */
    public Background() 
    {
        super(800, 340, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        Set();
        set();
       
       
    }
    
    public void Set()
    {
        Backbeat backbeat = new Backbeat();
        addObject(backbeat, 750, 190);
        for (int i=0; i<whiteKeys1.length; i++)
        {
            Square square = new Square(whiteKeys1[i], whiteNotes1[i]);
            addObject(square, 200 + (i*150), 100);
           
        }
        for (int i=0; i<whiteKeys2.length; i++)
        {
            Square square = new Square(whiteKeys2[i], whiteNotes2[i]);
            addObject(square, 200 + (i*150), 220);
            
        }
        for (int i=0; i<whiteKeys3.length; i++)
        {
            Square square = new Square(whiteKeys3[i], whiteNotes3[i]);
            addObject(square, 200 + (i*150), 360);
            
        }
        for (int i = 0; i< 4; i++)
        {
            addObject(new Message(whiteKeys1[i]), 200 + (i*150), 100);
            addObject(new Message(whiteKeys2[i]), 200 + (i*150), 220);
            addObject(new Message(whiteKeys3[i]), 200 + (i*150), 360);
        }
    }
    public void set()
    {
        for (int i=0; i < 90; i++)
        {
           Circle circle = new Circle();
           addObject(circle, Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(340));
        }
    }
}
