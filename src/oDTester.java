import objectdraw.*;

import java.awt.*;

public class oDTester extends WindowController{

    public static void main(String[] args){
        new oDTester().startController(400, 400);
    }

    public void begin(){
        new FilledOval(50, 50, 100, 100, canvas).setColor(Color.BLUE);
    }
}