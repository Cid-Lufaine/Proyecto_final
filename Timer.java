
public class Timer  
{
    private long startTime;
    private long targetTime;
    private long limit_time;
    private long currentTime;
    private long elapsedTime;

    public Timer(int time)
    {
        startTime = System.currentTimeMillis();
        limit_time=time;
        targetTime = startTime + (limit_time*1000); 
    }

    public String Timer_Text(){
        currentTime = System.currentTimeMillis();
        elapsedTime = (currentTime - startTime) / 1000;
        return ""+ (limit_time-elapsedTime);
    }

    public boolean Time_Out()
    {
        return currentTime >= targetTime;
    }

}
