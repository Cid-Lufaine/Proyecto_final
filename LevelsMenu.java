import greenfoot.*;

public class LevelsMenu extends World {
    MusicManager Musicmanager;

    public LevelsMenu() {
        super(600, 400, 1);
        setBackground("Menu_Dificultad.jpg");
        Musicmanager = Musicmanager.getInstance();
        prepare();
    }

    private void prepare() {
        ButtonEasy buttonEasy = new ButtonEasy();
        addObject(buttonEasy, getWidth() / 2, getHeight() / 2 - 50);

        ButtonNormal buttonNormal = new ButtonNormal();
        addObject(buttonNormal, getWidth() / 2, getHeight() / 2 + 50);

        ButtonHard buttonHard = new ButtonHard();
        addObject(buttonHard, getWidth() / 2, getHeight() / 2 + 150);

        ButtonReturn buttonReturn = new ButtonReturn();
        addObject(buttonReturn, getWidth()*1/ 4, getHeight() - 50);

    }

    public void act() {
        Musicmanager.playTrack(5);

    }

}
