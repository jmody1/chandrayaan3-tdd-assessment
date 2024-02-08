package driver;

import processor.CommandProcessor;
import service.GalacticSpaceCraft;

/**
 * @author Jimit
 *
 */
public class GalacticSpaceCraftDriver {

	public static void main(String[] args) {
		// Create a GalacticSpaceCraft with initial position (0, 0, 0) and direction 'N'
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(0, 0, 0, 'N');

        // Example commands
        String[] commands = {"f", "r", "u", "b", "l"};

        // Execute commands using CommandProcessor
        CommandProcessor.processCommands(spacecraft, commands);

        // Display final position and direction
        System.out.println("Final Position: (" + spacecraft.getX() + ", " + spacecraft.getY() + ", " + spacecraft.getZ() + ")");
        System.out.println("Final Direction: " + spacecraft.getDirection());

	}

}
