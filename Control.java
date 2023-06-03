import greenfoot.*;

public class Control extends Actor
{
    private static final int ACCELERATION = 2;  
    private static final int SPEED = 5;   
    private int vSpeed = 0;
    
    public void moveRight()
    {
        setLocation ( getX() + SPEED, getY() );
    }
    
    public void moveLeft()
    {
        setLocation ( getX() - SPEED, getY() );
    }
    
    public boolean onGround()
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2-8 , null);
        return under != null;
    }

    public void setVSpeed(int speed)
    {
        vSpeed = speed;
    }
    
    public void fall()
    {
        setLocation ( getX(), getY() + vSpeed);
        vSpeed = vSpeed + ACCELERATION;
    }
    
    protected boolean atBottom()
    {
        return getY() >= getWorld().getHeight() - 2;
    }
    
}
