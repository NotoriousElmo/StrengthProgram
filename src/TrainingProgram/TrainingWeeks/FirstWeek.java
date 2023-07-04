package TrainingProgram.TrainingWeeks;

import TrainingProgram.ProgramMakers.ProgramCreator;

import java.time.LocalDate;

public class FirstWeek {

    private final ProgramCreator programCreator;
    public FirstWeek(ProgramCreator programCreator) {
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
        return "Week 1 - Muscular Conditioning (W/ Moderate Difficulty)";
    }

    public String getFirstDay() {
        Double squat = programCreator.mRound(programCreator.squatMax * 0.8, 2.5);
        Double deadlift = programCreator.mRound(programCreator.deadLiftMax * 0.8, 2.5);
        return getStringLower(squat, deadlift, programCreator.date);
    }

    public String getSecondDay() {
        String spaceFirst = getSpace(programCreator.upperBackFirst.length());
        String spaceSecond = getSpace(programCreator.shoulder.length());
        String spaceThird = getSpace((programCreator.upperBackSecond.length()));
        return getStringUpper(spaceFirst, spaceSecond, spaceThird,
                programCreator.date.plusDays(1));

    }

    public String getThirdDay() {
        String spaceFirst = getSpace(programCreator.upperBackFirst.length());
        String spaceSecond = getSpace(programCreator.shoulder.length());
        String spaceThird = getSpace((programCreator.upperBackSecond.length()));
        return getStringUpper(spaceFirst, spaceSecond, spaceThird,
                programCreator.date.plusDays(3));
    }

    public String getFourthDay() {
        Double squat = programCreator.mRound(programCreator.squatMax * 0.7, 5);
        Double deadlift = programCreator.mRound(programCreator.deadLiftMax * 0.7, 5);
        return getStringLower(squat, deadlift, programCreator.date.plusDays(4));
    }

    public String getFifthDay() {
        String spaceFirst = getSpace(programCreator.upperBackFirst.length());
        String spaceSecond = getSpace(programCreator.shoulder.length());
        String spaceThird = getSpace((programCreator.upperBackSecond.length()));
        LocalDate date = programCreator.date.plusDays(5);
        return "----------------------------------------------------------------------" +
                "\n" + "|     " + date +
                "     |Set 1      |Set 2      |Set 3      |Set 4      |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Bench Press         | " +
                programCreator.mRound(programCreator.benchMax * 0.8, 2.5)
                + " xMR  |-----------|-----------|-----------|" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|" + programCreator.upperBackFirst + spaceFirst +
                "|      x10  |      x10  |      x8   |      x6   |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|" + programCreator.shoulder + spaceSecond +
                "|      x12  |      x12  |      x10  |      x8   |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|" + programCreator.upperBackSecond + spaceThird +
                "|      x12  |      x12  |      x10  |      x8   |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Optional Exercise 1 |    x8-12  |    x8-12  |    x8-12  |-----------|" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Optional Exercise 2 |    x8-12  |    x8-12  |    x8-12  |-----------|" +
                "\n" + "----------------------------------------------------------------------";
    }

    private String getStringUpper(String spaceFirst, String spaceSecond, String spaceThird, LocalDate date) {
        return "----------------------------------------------------------------------" +
                "\n" + "|     " + date +
                "     |Set 1      |Set 2      |Set 3      |Set 4      |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Bench Press         | " +
                programCreator.mRound(programCreator.benchMax * 0.5, 2.5)
                + " x10  | " + programCreator.mRound(programCreator.benchMax * 0.675, 2.5) + " x10  | "
                + programCreator.mRound(programCreator.benchMax * 0.75, 2.5) + " x8   | " +
                programCreator.mRound(programCreator.benchMax * 0.775, 2.5) + " x6   |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|" + programCreator.upperBackFirst + spaceFirst +
                "|      x10  |      x10  |      x8   |      x6   |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|" + programCreator.shoulder + spaceSecond +
                "|      x12  |      x12  |      x10  |      x8   |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|" + programCreator.upperBackSecond + spaceThird +
                "|      x12  |      x12  |      x10  |      x8   |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Optional Exercise 1 |    x8-12  |    x8-12  |    x8-12  |-----------|" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Optional Exercise 2 |    x8-12  |    x8-12  |    x8-12  |-----------|" +
                "\n" + "----------------------------------------------------------------------";
    }

    private String getSpace(Integer length) {
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < 20 - length; i++) {
            space.append(" ");
        }
        return space.toString();
    }

    private String getStringLower(Double squat, Double deadlift, LocalDate date) {
        return "----------------------------------------------------------------------" +
                "\n" + "|     " + date + "     |Set 1      |Set 2 " +
                "     |Set 3      |Set 4      |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Squat               | " + squat + " x8  | " + squat + " x8  | "
                + squat + " x8  | " + squat + " x8  |" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Deadlift            | " + deadlift + " x8  | " + deadlift +
                " x8  |-----------|-----------|" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Optional Exercise 1 |           |           |           |-----------|" +
                "\n" + "----------------------------------------------------------------------" +
                "\n" + "|Optional Exercise 2 |           |           |           |-----------|" +
                "\n" + "----------------------------------------------------------------------";
    }
}
