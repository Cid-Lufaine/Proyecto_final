import greenfoot.*;  

public class Level1Platform extends Actor
{
    private int speed ;
    private int leftTurnXLimit;
    private int rightTurnXLimit;

    public Level1Platform(int leftX, int rightX){
        speed = 2;
        leftTurnXLimit = leftX;
        rightTurnXLimit = rightX;
        setImage("plataforma.png");
    }

    public void act()
    {
        setLocation ( getX() + speed, getY() );

        Actor actor = getOneIntersectingObject(null);
        if(actor != null) {
            actor.setLocation ( actor.getX() + speed, actor.getY() );
        }

        if (atTurningPoint()) {
            speed = -speed;
        }

    }

    public boolean atTurningPoint()
    {
        return (getX() <= leftTurnXLimit || getX() >= rightTurnXLimit);
    }
}
