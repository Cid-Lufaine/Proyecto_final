import greenfoot.*;

public class ButtonEasy extends Button
{
    public ButtonEasy(){
        super("facil_normal.png", "facil_hover.png");
    }
    
    public void act (){
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level1World(0));
     
            }
    }
}
