import greenfoot.*;

public class Button extends Actor {
    
    private GreenfootImage normalImage;
    private GreenfootImage hoverImage;
    private MouseInfo mouse;
    private Boolean hovering;
    
    public Button(String normalImage, String hoverImage) {
        this.normalImage = new GreenfootImage(normalImage);
        this.hoverImage = new GreenfootImage(hoverImage);
        hovering=false;
        setImage(this.normalImage);
    }
    
    public void act() {
        if (Greenfoot.mouseMoved(null)) {
            mouse = Greenfoot.getMouseInfo();
                if (mouse != null) {
                    if (mouse.getActor() == this) {
                        hovering = true;
                    } else {
                        hovering = false;
                    }
            }
        }   

        if (hovering) {
            setImage(hoverImage);
        } else {
            setImage(normalImage);
        }
    }
    
    
}

