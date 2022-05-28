public class SnakePosition {

    int xPosition = 10;
    int yPosition = 10;

    static SnakePosition obj = new SnakePosition();
    private SnakePosition(){

    }

    public static SnakePosition getInstance(){
        return obj;
    }
}
