package TrainingProgram.TrainingWeeks;

import TrainingProgram.ProgramMakers.ProgramCreator;

import java.time.LocalDate;

public class ThirdWeek {

    private final ProgramCreator programCreator;
    public ThirdWeek(ProgramCreator programCreator) {
        this.programCreator = programCreator;
        System.out.println("\n");
        System.out.println(getNameOfWeek());
        System.out.println("\n");
        System.out.println(getFirstDay());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(getSecondDay());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(getThirdDay());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(getFourthDay());
    }

    public String getNameOfWeek() {
        return "Week 3 - Linear Max OT Phase";
    }

    public String getFirstDay() {
        Double squat = programCreator.mRound(programCreator.squatMax * 0.85, 2.5) + 2.5;
        Double deadlift = programCreator.mRound(programCreator.deadLiftMax * 0.875, 2.5);
        return getStringLower(squat, deadlift, programCreator.date.plusDays(14));
    }

    public String getSecondDay() {
        String spaceFirst = getSpace(programCreator.upperBackFirst.length());
        String spaceSecond = getSpace(programCreator.shoulder.length());
        String spaceThird = getSpace((programCreator.upperBackSecond.length()));
        Double bench = programCreator
                .mRound(programCreator.benchMax * 0.85, 2.5);
        return getStringUpper(bench, spaceFirst, spaceSecond, spaceThird,
                programCreator.date.plusDays(16));

    }

    public String getThirdDay() {
        Double squat = programCreator.mRound(programCreator.squatMax * 0.85 + 2.5, 2.5) + 2.5;
        return "----------------------------------" +
                "\n" + "|     " + programCreator.date.plusDays(18) + "     |Set 1      |" +
                "\n" + "----------------------------------" +
                "\n" + "|Squat               |" + squat + " x4-6 |" +
                "\n" + "----------------------------------" +
                "\n" + "|Deadlift Variation  |       x8  |" +
                "\n" + "----------------------------------";
    }

    public String getFourthDay() {
        String spaceFirst = getSpace(programCreator.upperBackFirst.length());
        String spaceSecond = getSpace(programCreator.shoulder.length());
        String spaceThird = getSpace((programCreator.upperBackSecond.length()));
        Double bench = programCreator
                .mRound(programCreator.benchMax * 0.85, 2.5) + 2.5;
        return getStringUpper(bench, spaceFirst, spaceSecond, spaceThird,
                programCreator.date.plusDays(19));
    }

    private String getStringUpper(Double bench, String spaceFirst, String spaceSecond, String spaceThird, LocalDate date) {
        return "----------------------------------------------------------" +
                "\n" + "|     " + date +
                "     |Set 1      |Set 2      |Set 3      |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Bench Press         | " + bench + " x4-6 | " + bench + " x4-6 | "
                + bench + " x4-6 |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|" + programCreator.upperBackFirst + spaceFirst +
                "|       x6  |       x6  |       x6  |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|" + programCreator.shoulder + spaceSecond +
                "|       x6  |       x6  |       x6  |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|" + programCreator.upperBackSecond + spaceThird +
                "|       x6  |       x6  |       x6  |" +
                "\n" + "----------------------------------------------------------";
    }

    private String getSpace(Integer length) {
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < 20 - length; i++) {
            space.append(" ");
        }
        return space.toString();
    }

    private String getStringLower(Double squat, Double deadlift, LocalDate date) {
        return "----------------------------------------------------------" +
                "\n" + "|     " + date + "     |Set 1      |Set 2 " +
                "     |Set 3      |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Squat               |" + squat + " x4-6 |" + squat + " x4-6 |" + + squat + " x4-6 |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Deadlift            |" + deadlift + " x3-6 |" + deadlift + " x3-6 |-----------|" +
                "\n" + "----------------------------------------------------------";
    }
}
