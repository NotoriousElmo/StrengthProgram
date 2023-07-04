package TrainingProgram.TrainingWeeks;

import TrainingProgram.ProgramMakers.ProgramCreator;

import java.time.LocalDate;

public class SecondWeek {

    private final ProgramCreator programCreator;
    public SecondWeek(ProgramCreator programCreator) {
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
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(getFifthDay());
    }

    public String getNameOfWeek() {
        return "Week 2 - Muscular Conditioning/Hypertrophy (W/ Higher Difficulty)";
    }

    public String getFirstDay() {
        Double squat = programCreator.mRound(programCreator.squatMax * 0.8, 2.5);
        String addon = "\n" + "----------------------------------------------------------" + "\n" +
                "|Extra Volume Squats - Add 2.5 kg, then perform          |" +
                "\n" + "|5 x 3  each set with 60 seconds rest between sets.      |" +
                "\n" + "----------------------------------------------------------"
                + "\n" + "|Note - If you get below 8 reps, reduce max by 2.5%.     |" +
                "\n" + "----------------------------------------------------------"
                + "\n" + "|Still complete the 5 sets of 3 reps regardless          |";
        return getStringLower(squat, programCreator.date.plusDays(7), addon);
    }

    public String getSecondDay() {
        String spaceFirst = getSpace(programCreator.upperBackFirst.length());
        String spaceSecond = getSpace(programCreator.shoulder.length());
        String spaceThird = getSpace((programCreator.upperBackSecond.length()));
        return getStringUpper(spaceFirst, spaceSecond, spaceThird,
                programCreator.date.plusDays(8));

    }

    public String getThirdDay() {
        Double squat = programCreator.mRound(programCreator.squatMax * 0.8, 2.5) + 2.5;
        String addon = "\n" + "----------------------------------------------------------" +
                "\n" + "|Back Off Squats - Reduce weight by 5kg and proceed with:|" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|If you did 10 reps, then do 10x3, with 60 seconds rest. |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|If you did 8-9 reps, then do 8x3, with 60 seconds rest. |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|If you did 7 reps, then do 5x3, with 60 seconds rest.   |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|If you did < 7 reps, then skip and reduce max by 2.5%.  |";
        return getStringLower(squat, programCreator.date.plusDays(10), addon);
    }

    public String getFourthDay() {
        String spaceFirst = getSpace(programCreator.upperBackFirst.length());
        String spaceSecond = getSpace(programCreator.shoulder.length());
        String spaceThird = getSpace((programCreator.upperBackSecond.length()));
        return getStringUpper(spaceFirst, spaceSecond, spaceThird,
                programCreator.date.plusDays(11));
    }

    public String getFifthDay() {
        String spaceFirst = getSpace(programCreator.upperBackFirst.length());
        String spaceSecond = getSpace(programCreator.shoulder.length());
        String spaceThird = getSpace((programCreator.upperBackSecond.length()));
        LocalDate date = programCreator.date.plusDays(13);
        return "----------------------------------------------------------" +
                "\n" + "|     " + date +
                "     |Set 1      |Set 2      |Set 3      |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Bench Press         | " +
                (programCreator.mRound(programCreator.benchMax * 0.8, 2.5) - 2.5) +
                " xMR  |-----------|-----------|" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|" + programCreator.upperBackFirst + spaceFirst +
                "|      x10  |       x8  |       x8  |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|" + programCreator.shoulder + spaceSecond +
                "|      x10  |       x8  |       x6  |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|" + programCreator.upperBackSecond + spaceThird +
                "|      x10  |       x8  |       x6  |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Optional Exercise 1 |    x8-12  |    x8-12  |    x8-12  |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Optional Exercise 2 |    x8-12  |    x8-12  |    x8-12  |" +
                "\n" + "----------------------------------------------------------";
    }

    private String getStringUpper(String spaceFirst, String spaceSecond, String spaceThird, LocalDate date) {
        return "----------------------------------------------------------" +
                "\n" + "|     " + date +
                "     |Set 1      |Set 2      |Set 3      |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Bench Press         | " +
                programCreator.mRound(programCreator.benchMax * 0.725, 2.5)
                + " x10  | " + programCreator.mRound(programCreator.benchMax * 0.775, 2.5)
                + "  x8  | "
                + (programCreator.mRound(programCreator.benchMax * 0.8, 2.5) + 2.5) +
                " x6-8 |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|" + programCreator.upperBackFirst + spaceFirst +
                "|      x10  |       x8  |       x8  |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|" + programCreator.shoulder + spaceSecond +
                "|      x10  |       x8  |       x6  |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|" + programCreator.upperBackSecond + spaceThird +
                "|      x10  |       x8  |       x6  |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Optional Exercise 1 |    x8-12  |    x8-12  |    x8-12  |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Optional Exercise 2 |    x8-12  |    x8-12  |    x8-12  |" +
                "\n" + "----------------------------------------------------------";
    }

    private String getSpace(Integer length) {
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < 20 - length; i++) {
            space.append(" ");
        }
        return space.toString();
    }

    private String getStringLower(Double squat, LocalDate date, String addon) {
        return "----------------------------------------------------------" +
                "\n" + "|     " + date + "     |Set 1      |Set 2 " +
                "     |Set 3      |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Squat               |" + squat +
                " xMR10|-----------|-----------|" + addon +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Deadlift Variation  |       x8  |       x8  |       x8  |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Optional Exercise 1 |           |           |           |" +
                "\n" + "----------------------------------------------------------" +
                "\n" + "|Optional Exercise 2 |           |           |           |" +
                "\n" + "----------------------------------------------------------";
    }
}
