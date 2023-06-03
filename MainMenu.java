import greenfoot.*;  

public class MainMenu extends World
{
    MusicManager Musicmanager;
    public MainMenu()
    {    
        super(600, 400, 1);
        setBackground("Menu_Main.jpg");
        Musicmanager = Musicmanager.getInstance();
        prepare();
    }

    private void prepare() {

        ButtonPlay buttonPlay = new ButtonPlay();
        addObject(buttonPlay, getWidth() / 2, getHeight() / 2 - 50);

        ButtonHelp buttonHelp = new ButtonHelp();
        addObject(buttonHelp, getWidth() / 2, getHeight() / 2 + 50);

        ButtonRecords buttonRecords = new ButtonRecords();
        addObject(buttonRecords, getWidth() / 2, getHeight() / 2 + 150);

    }

    public void act() {
        Musicmanager.playTrack(6);

    }

}
