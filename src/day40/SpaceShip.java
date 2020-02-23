package day40;

public class SpaceShip {
    String name;
    int x;
    int y;
    String currentDirection;

    public void setInitialPosition(int newX, int newY){
        x=newX;
        y=newY;

    }
     public void setDirection(String newDirection){


        if (newDirection.equalsIgnoreCase("up") || newDirection.equalsIgnoreCase("down") ||
                 newDirection.equalsIgnoreCase("right") || newDirection.equalsIgnoreCase("left")

         ) {
            currentDirection=newDirection;


         }else {
            System.out.println("Invalid Direction");

        }
     }

    public void move1Block() {

        switch(currentDirection) {
            case "right":
                x += 1;
                break;
            case "left":
                x -= 1;
                break;
            case "up":
                x += 1;
                break;
            case "down":
                x -= 1;
                break;
            default:
                break;


        }


    }
    //add a functionality to move1block with direction provided in one shot

    public void move1Block(String newDirection){
        setDirection(newDirection);
        move1Block();
    }


    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", currentDirection='" + currentDirection + '\'' +
                '}';
    }
}

