import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the world is where our hero lives
 * 
 * @author Ryan dutton
 * @version 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 40 , 40);
        
        createPie();
    }
     public void gameOver()
     {
         Label gameOverLabel = new Label("game over",100);
         addObject(gameOverLabel, 300, 200);
     }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    
    public  void createPie()
    {
       Pie pie = new Pie();
       pie.setSpeed(level);
       int x = Greenfoot.getRandomNumber(600);
       int y = 0;
    addObject(pie, x, y); 
    }
}
