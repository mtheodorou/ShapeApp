package drawingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingUIController {
    private JPanel controlsPanel;
    private JPanel mainPanel;

    public DrawingUIController(){
        controlsPanel = new JPanel();
        controlsPanel.setLayout(new GridLayout(3,1));
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2,1));
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
