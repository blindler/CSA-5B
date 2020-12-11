public class StepTracker_Dean
{
    // copy the instance variable declarations here

    // write instance variable declarations here
    private int activeDays;
    private int steps;
    private boolean active;
    private int minSteps;
    private int days;
    // write the constructor with a parameter here
    public StepTracker_Dean(int minsteps)
    {
        minSteps = minsteps;
        activeDays = 0;
        steps = 0;
        active = false;
    }
    public StepTracker_Dean()
    {
        minSteps = 10000;
        activeDays = 0;
        steps = 0;
        active = false;
    }

    public int getSteps(){
        return steps;
    }

    public int activeDays()
    {
        return activeDays;
    }

    public void addDailySteps( int dailySteps)
    {
        steps += dailySteps;
        days++;
        if (dailySteps >= minSteps)
        {
            active = true;
            activeDays++;
            minSteps = 10000;
        }
    }

    public double averageSteps()
    {
        if (steps == 0)
        {
            return 0.0;
        }
        else
        {
            return (double)steps/days;
        }

    }

    public static void main(String[] args)
    {
        StepTracker_Dean tr = new StepTracker_Dean(10000);
        System.out.println(tr.activeDays()); // returns 0. No data have been recorded yet.
        System.out.println(tr.averageSteps()); // returns 0.0. When no step data have been recorded, the averageSteps method returns 0.0.
        tr.addDailySteps(9000); // This is too few steps for the day to be considered active.
        tr.addDailySteps(5000); // This is too few steps for the day to be considered active.
        System.out.println(tr.activeDays()); // returns 0.  No day had at least 10,000 steps.
        System.out.println(tr.getSteps()); // prints 14000

        System.out.println(tr.averageSteps()); // returns 7000.0 The average number of steps per day is (14000 / 2).
        tr.addDailySteps(13000); // This represents an active day.
        System.out.println(tr.activeDays());  // returns 1. Of the three days for which step data were entered, one day had at least 10,000 steps.
        System.out.println(tr.averageSteps()); // returns 9000.0. The average number of steps per day is (27000 / 3).
        tr.addDailySteps(23000); // This represents an active day.
        tr.addDailySteps(1111); // This is too few steps for the day to be considered active.
        System.out.println(tr.activeDays()); // returns 2. Of the five days for which step data were entered, two days had at least 10,000 steps.
        System.out.println(tr.averageSteps()); // returns 10222.2. The average number of steps per day is (51111 / 5).
    }
}
