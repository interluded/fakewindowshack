import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class Main extends JPanel implements MouseListener, MouseMotionListener {
    int x;
    int y;
    private JTextField textField;
    private JTextField portField; // New text field for port
    private JButton button;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 400, 600);
        frame.setTitle("fakeWindowsHack");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main fakeWindowsHack = new Main();
        frame.add(fakeWindowsHack);
        frame.setVisible(true);
    }

    public Main() {
        setLayout(null);
        addMouseListener(this);
        addMouseMotionListener(this);

        textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        add(textField);

        // Create and add the new text field for port
        portField = new JTextField();
        portField.setBounds(50, 100, 200, 30); // Adjusted the position to avoid overlap
        add(portField);

        button = new JButton("Submit");
        button.setBounds(100, 150, 100, 30); // Adjusted the position to avoid overlap
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText(); // Get text from text field
                String port = portField.getText(); // Get text from port field
                System.out.println("Input received: " + input);
                System.out.println("Port received: " + port); // Print the port
                String hackor = "cmd.exe /c start .\\hack.exe " + input + " " + port;
                try {
                    Runtime.getRuntime().exec(hackor);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
