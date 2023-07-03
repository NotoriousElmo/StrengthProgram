package TrainingProgram.ProgramMakers;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramCreatorTest {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final LocalDate date = LocalDate.parse("2023-03-27", formatter);
    private final ProgramCreator programCreator = new ProgramCreator(
            205, 180, 107.5f,
            "Barbell Row", "Military Press",
            "Lat Pulldown", date);
    @Test
    public void testMRound1() {
        assertEquals(programCreator.mRound(220 * 0.7, 5), 155.0, 0.001);
    }

    @Test
    public void testMRound2() {
        assertEquals(programCreator.mRound(215 * 0.7, 5), 150.0, 0.001);
    }

    @Test
    public void testMRound3() {
        assertEquals(programCreator.mRound(212.5 * 0.7, 5), 150.0, 0.001);
    }

    @Test
    public void testMRound4() {
        assertEquals(programCreator.mRound(210 * 0.7, 5), 145.0, 0.001);
    }

    @Test
    public void testMRound5() {
        assertEquals(programCreator.mRound(205 * 0.7, 5), 145.0, 0.001);
    }
}