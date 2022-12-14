import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int row;
    private int col;
    public int[][] arr;
    private redCircle redcircle; 
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        
        
        redcircle = new redCircle();
        this.row = 6;
        this.col = 6;
        int hDist = getWidth()/(col);
        int vDist = getHeight()/(row);
        arr = new int[6][6];
        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < col; c++)
            {
                addObject(new whiteCircle(r, c), (hDist*(c)+70), (vDist*(r)+70));
            }
        }
       addObject(redcircle, 70, 70);
      

    }
 
    int timesCalled=0;
    public void changeGrid(int r, int c)
        {
            if(timesCalled % 2 == 0)
            {
                arr[r][c] = 2; // red's turn
            } else
            {
                arr[r][c] = 1; // blue's turn
            }
           
        
        }
        
    private boolean isEnterDown = false;
    public void act()
    {
        int count = 0;
        if(Greenfoot.isKeyDown("enter") && !isEnterDown && count % 2 == 0)
        {
           

           changeGrid(redcircle.getR(), redcircle.getC());
           System.out.println("grid changed"+ redcircle.getR() + "," + redcircle.getC());
           isEnterDown = true;
           
        }
        
        if(!Greenfoot.isKeyDown("enter"))
        {
            isEnterDown = false;
        }

        
    }
}
