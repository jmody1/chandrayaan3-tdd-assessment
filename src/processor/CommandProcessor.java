package processor;
/**
 * Sample input processing file for command processing taking care of input validity and logging  
 */
import java.util.Arrays;

import service.GalacticSpaceCraft;

/**
 * @author Jimit
 *
 */
public class CommandProcessor {

	public static void processCommands(GalacticSpaceCraft spacecraft, String[] commands) {
        for (String command : commands) {
            if (isValidCommand(command)) {
                executeCommand(spacecraft, command);
            } else {
                logInvalidCommand(command);
            }
        }
    }

    private static boolean isValidCommand(String command) {
        return Arrays.asList("f", "b", "l", "r", "u", "d").contains(command.toLowerCase());
    }

    private static void executeCommand(GalacticSpaceCraft spacecraft, String command) {
        switch (command.toLowerCase()) {
            case "f":
                spacecraft.moveForward();
                break;
            case "b":
                spacecraft.moveBackward();
                break;
            case "l":
                spacecraft.turnLeft();
                break;
            case "r":
                spacecraft.turnRight();
                break;
            case "u":
                spacecraft.turnUp();
                break;
            case "d":
                spacecraft.turnDown();
                break;
        }
    }

    private static void logInvalidCommand(String command) {
        System.out.println("Invalid command: " + command);
    }
}
