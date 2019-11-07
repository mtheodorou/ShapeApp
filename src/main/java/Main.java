import drawingUI.DrawingUIController;

import javax.swing.*;
import java.awt.*;

public class Main {

    static GraphicsConfiguration gc;
    public static void main(String[] args){

        JFrame frame = new JFrame(gc);
        frame.setSize(500, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        DrawingUIController controller = new DrawingUIController();
        frame.getContentPane().add(controller.getMainPanel());

    }
}
