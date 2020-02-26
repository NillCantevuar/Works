package whole.storage.currentWorkoutStorage;

public class Break implements WorkoutPice{


    private int seconds;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return " "+ seconds +"s of break ";
    }

    public Break(int seconds) {

        this.seconds = seconds;
    }
}
