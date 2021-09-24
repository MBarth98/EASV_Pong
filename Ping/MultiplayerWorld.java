import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MultiplayerWorld here.
 * 
 * @author philip esmaeel zadeh
 * @author victor gugerel
 * @author mads rahr mandahl-barth
 * @author mikkel theut meier
 * @author rasmus scherning sandbæk   
 * @version (a version number or a date)
 */
public class MultiplayerWorld extends GameWorld
{   
    public static boolean multiPlayerActive = false;
    
    @Override
    public void ResetBackground() {}
    public MultiplayerWorld()
    {
        super();
        multiPlayerActive = true;
        GreenfootImage background = new GreenfootImage("bg90.png");
        setBackground(background);
        addObject(new Overlay(), WORLD_WIDTH/2, WORLD_HEIGHT/2);
        setPaintOrder(Overlay.class, Paddle.class, Ball.class, ScoreCounter.class, ScoreCounterGlow.class, PaddleGlow.class);
        
        /*
        //add ball with glow effect
        Ball ball = new Ball();
        addObject(ball, WORLD_WIDTH/2, WORLD_HEIGHT/2);
        ball.addGlow();
        */

        //initializeScoreCounters();
        
        
        //add ball with glow effect
            Ball ball = new Ball();
            addObject(ball, WORLD_WIDTH/2, WORLD_HEIGHT/2);
            ball.addGlow();
            
            initializePlayers();

        
        addObject(new ScoreCounter(), WORLD_WIDTH / 4, 80);
        addObject(new MultiScoreCounter(), (WORLD_WIDTH / 4) * 3, 80);
    }
    
    private void initializePlayers()
    {
        Paddle playerOne     = new PlayerPaddle();
        Paddle playerTwo     = new Player2Paddle();
            
        addObject(playerOne, (int)playerOne.xPos, (int)playerOne.yPos);
        addObject(playerTwo, (int)playerTwo.xPos, (int)playerTwo.yPos);
            
        playerOne.addGlow();
        playerTwo.addGlow();
        
    }
    
    public void act()
    {
        
    }
    
    public void initializeScoreCounters()
    {
        
    }
}
