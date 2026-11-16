package assignments.ch5.section03;
//I could do this but it was a little confusing because i didnt know the fields
public class StepTracker {
    private int minStep = 0;
    private int active = 0;
    private int totalSteps = 0;
    private int days = 0;
    public StepTracker(int min){
        minStep = min;
    }
    public void addDailySteps(int num){
        if (num >= minStep){
            active++;
        }
        totalSteps += num;
        days++;
    }
    public int activeDays(){
        return active;
    }
    public double averageSteps(){
        if(days == 0){
            return 0;
        }
        else{
            return totalSteps/days;
        }
    }
}
