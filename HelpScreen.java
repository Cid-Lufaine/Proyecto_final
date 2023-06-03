import greenfoot.*; 

public class HelpScreen extends World
{
    MusicManager Musicmanager;

    public HelpScreen()
    {    
        super(600, 400, 1);
        setBackground("Pantalla_Ayuda.jpg");
        Musicmanager = Musicmanager.getInstance();
        prepare();
    }

    private void prepare() {
        ButtonReturn buttonReturn = new ButtonReturn();
        addObject(buttonReturn, getWidth() / 2, getHeight() - 50);

    }

    public void act() {
        Musicmanager.playTrack(0);

    }
}
