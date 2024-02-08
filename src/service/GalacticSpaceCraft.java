package service;
/**
 * 
 * @author Jimit
 *
 */
public class GalacticSpaceCraft {
	private int x,y,z;
	private char direction;
	
	public GalacticSpaceCraft(int x, int y, int z, char direction) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.direction = direction;
	}
	// API to be called for move forward command
	public void moveForward() {
        switch (direction) {
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
            case 'U':
                z++;
                break;
            case 'D':
                z--;
                break;
        }
    }
	
	// API to be called for move backward command
	public void moveBackward() {
        switch (direction) {
            case 'N':
                y--;
                break;
            case 'S':
                y++;
                break;
            case 'E':
                x--;
                break;
            case 'W':
                x++;
                break;
            case 'U':
                z--;
                break;
            case 'D':
                z++;
                break;
        }
    }
	
	// API to be called when turn left command entered
	public void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'W':
                direction = 'S';
                break;
        }
    }

	// API to be called when turn right command entered
    public void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }
    
    // Changes the direction to Up for the turn up command
    public void turnUp() {
        if (direction != 'U') {
            direction = 'U';
        }
    }

    // Changes the direction to Down for the turn down command
    public void turnDown() {
        if (direction != 'D') {
            direction = 'D';
        }
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public char getDirection() {
		return direction;
	}

	public void setDirection(char direction) {
		this.direction = direction;
	}
    

}
