package TrainingProgram;

import TrainingProgram.ProgramMakers.ProgramCreator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse("2023-03-27", formatter);
        ProgramCreator programCreator = new ProgramCreator(
                205, 180, 107.5f,
                "Barbell Row", "Military Press",
                "Lat Pulldown", date);
    }
}