import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class redCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class redCircle extends Actor
{
      
      // 70 > 205 = 135
      // 205 > 340 = 135
      private int r;
      private int c;

      public redCircle(){
          this.r = 0;
          this.c = 0;
          
        }
      
    public void act() 
    {
     
        int x;
        int y;
        String key = Greenfoot.getKey();
        if("a".equals(key)&& getX() != 70)
        {
            this.setLocation(getX()-133, getY());
            c--;
        }
        if("d".equals(key)&& getX() != 745)
        {
            this.setLocation(getX()+133, getY());
            c++;
        }
      
        
      if("s".equals(key)&& getY() != 745)
       {
           this.setLocation(getX(), getY()+133);
           r++;
      }
       
       if("w".equals(key) && getY() != 70)
       {
          this.setLocation(getX(), getY() - 133);
          r--;
        }
        
      
        
    
    }
    
    public int getR()
    {
        return r;
    }
    
    public int getC()
    {
        return c;
    }
    
    
}
