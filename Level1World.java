import greenfoot.*;

public class Level1World extends World
{
    private int score;
    private int lives;
    private int difficulty;
    private Timer timer;
    private Character character;
    private Bank bank;
    MusicManager Musicmanager;

    public Level1World(int difficulty)
    {   
        super(600, 400, 1);
        score=0;
        lives=3;
        this.difficulty=difficulty;
        timer= new Timer(15);
        character = new Character();
        Musicmanager = Musicmanager.getInstance();
        bank = new Bank();

        prepare();
    }

    private void prepare() {
        setBackground("Fondo_juego_1.jpg"); 

        addObject ( new Level0Floor(), getWidth() / 2  , getHeight()* 95/ 100);
        addObject ( bank, getWidth() *95/ 100  , getHeight()* 55/ 100);
        addObject ( new Coin(), getWidth() *50/ 100  , getHeight()* 50/ 100);

        addObject ( character, getWidth()* 5 / 100 , getHeight()* 75/ 100 );

    }

    public void act() {
        Musicmanager.playTrack(2);
        printHub();
        addCoins();

        if(character.scoreUpdate())
        {
            score+= bank.updateScore();
        }
        
        if (timer.Time_Out() ) {
            score+=10;
            if(difficulty==0)
            {
                score+= lives*25; 
                Greenfoot.setWorld(new GameOverScreen(score,difficulty));
            }else{   
                Greenfoot.setWorld(new Level2World(score,difficulty,lives));
            }
        }
    }

    private void printHub(){
        showText("lives: "+lives+ "    Score: " + score,  getWidth()* 1/ 5, getHeight()- (int)(getHeight()*0.9));
        showText( timer.Timer_Text(), getWidth()* 4/ 5, getHeight()- (int)(getHeight()*0.9));

    }

    private void addCoins(){
        if (Greenfoot.getRandomNumber(1000) < 10) {
            Coin c = new Coin();
            int randx = Greenfoot.getRandomNumber(this.getWidth()-50)+25;
            this.addObject(c, randx, getHeight()*60/100);
        }

    }

}
