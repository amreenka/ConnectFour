import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blueCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blueCircle extends Actor
{
    
    public void act() 
    {
        String key = Greenfoot.getKey();
        if("left".equals(key)&& getX() != 50)
        {
            this.setLocation(getX()-100, getY());
        }
        if("right".equals(key)&& getX() != 550)
        {
        
            this.setLocation(getX()+100, getY());
        }
    }    
}
