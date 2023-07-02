package TrainingProgram;

import TrainingProgram.TrainingWeeks.FirstWeek;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgramCreator{

    public final float squatMax;
    public final float deadLiftMax;
    public final float benchMax;
    public final String upperBackFirst;
    public final String shoulder;
    public final String upperBackSecond;
    public final LocalDate date;
    public List<String> program = new ArrayList<>();

    public ProgramCreator(float squatMax, float deadLiftMax, float benchMax,
                          String upperBackFirst, String shoulder, String upperBackSecond,
                          LocalDate date) {
        this.squatMax = squatMax;
        this.deadLiftMax = deadLiftMax;
        this.benchMax = benchMax;
        this.upperBackFirst = upperBackFirst;
        this.shoulder = shoulder;
        this.upperBackSecond = upperBackSecond;
        this.date = date;
        createWeeks();
    }

    public Double mRound(double number) {
        return Math.ceil(number / 2.5) * 2.5;
    }

    private void createWeeks() {
        FirstWeek firstWeek = new FirstWeek(this);
    }
}
