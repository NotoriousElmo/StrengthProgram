package TrainingProgram.TrainingWeeks;

import TrainingProgram.ProgramCreator;

import java.time.LocalDate;

public class FirstWeek {

    ProgramCreator programCreator;
    public FirstWeek(ProgramCreator programCreator) {
        this.programCreator = programCreator;
        System.out.println(firstDay());
        System.out.println(fourthDay());
    }

    private String firstDay() {
        Double squat = programCreator.mRound(205 * 0.8);
        Double deadlift = programCreator.mRound(205 * 0.8);
        String plan = "----------------------------------------------------------------------" +
                "\n" + "|     " + programCreator.date + "     |Set 1      |Set 2      |Set 3      |Set 4      |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Squat               | " + squat + " x6  | " + squat + " x6  | "
                + squat + " x6  | " + squat + " x6  |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Deadlift            | " + deadlift + " x6  | " + deadlift +
                " x6  |-----------------------|" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Optional Exercise 1 |           |           |           |-----------|" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Optional Exercise 2 |           |           |           |-----------|" +
                "\n" + "----------------------------------------------------------------------";
        return plan;
    }

    private String fourthDay() {
        Double squat = programCreator.mRound(205 * 0.7);
        Double deadlift = programCreator.mRound(205 * 0.7);
        String plan = "----------------------------------------------------------------------" +
                "\n" + "|     " + programCreator.date.plusDays(4) + "     |Set 1      |Set 2      |Set 3      |Set 4      |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Squat               | " + squat + " x8  | " + squat + " x8  | "
                + squat + " x8  | " + squat + " x8  |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Deadlift            | " + deadlift + " x8  | " + deadlift +
                " x8  |-----------------------|" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Optional Exercise 1 |           |           |           |-----------|" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Optional Exercise 2 |           |           |           |-----------|" +
                "\n" + "----------------------------------------------------------------------";
        return plan;
    }
}
