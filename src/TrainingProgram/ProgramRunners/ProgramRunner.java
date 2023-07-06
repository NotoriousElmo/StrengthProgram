package TrainingProgram.ProgramRunners;

import TrainingProgram.ProgramMakers.ProgramCreator;

import java.util.Scanner;

public class ProgramRunner {

    public Integer currentSession = 0;

    public ProgramRunner(ProgramCreator programCreator) {
        Scanner scanner = new Scanner(System.in);
        while(currentSession < 26) {
            System.out.println(programCreator.program.get(currentSession));
            String input = scanner.nextLine();
            if (input.equals("Next")) {
                nextSession();
            } else if (currentSession > 0 && input.equals("Previous")) {
                previousSession();

            }
        }
    }

    public void nextSession() {
        currentSession++;
    }

    public void previousSession() {
        currentSession--;
    }
}
