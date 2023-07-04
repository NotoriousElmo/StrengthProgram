package TrainingProgram.TrainingWeeks;

import TrainingProgram.ProgramMakers.ProgramCreator;

import java.time.LocalDate;

public class FourthWeek {

    private final ProgramCreator programCreator;
    public FourthWeek(ProgramCreator programCreator) {
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
        return "Week 4 - Heavy Weight Acclimation";
    }

    public String getFirstDay() {
        return "----------------------------------------------------------" +
                "\n" + "|     " + programCreator.date.plusDays(21) +
                "     |Set 1      |Set 2      |Set 3      |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Squat               |" +
                (programCreator.mRound(programCreator.squatMax * 0.9, 2.5) - 2.5) + "  x3  |" +
                (programCreator.mRound(programCreator.squatMax * 0.9, 2.5)) + "  x3  |" +
                (programCreator.mRound(programCreator.squatMax * 0.9, 2.5) + 2.5) + "  x3  |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Deadlift Variation  |       x6  |       x6  |-----------|" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Optional Exercise 1 |           |           |           |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Optional Exercise 2 |           |           |           |" +
                "\n" + "----------------------------------------------------------";
    }

    public String getSecondDay() {
        String spaceFirst = getSpace(programCreator.upperBackFirst.length());
        String spaceSecond = getSpace(programCreator.shoulder.length());
        String spaceThird = getSpace((programCreator.upperBackSecond.length()));
        Double bench = programCreator
                .mRound(programCreator.benchMax * 0.85, 2.5);
        return null;
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
        return null;
    }

    private String getSpace(Integer length) {
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < 20 - length; i++) {
            space.append(" ");
        }
        return space.toString();
    }
}

