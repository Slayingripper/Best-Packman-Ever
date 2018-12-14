package engine;



import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("serial")
public class Highscore extends JPanel {
    public Highscore() {
        initialize();
    }

    private void initialize() {
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        try {
            // Read some text from the resource file to display in
            // the JTextArea.
            textArea.read(new InputStreamReader(
                    getClass().getResourceAsStream("BestPacmanEverV5\\src\\Scores.txt")),
                null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.setPreferredSize(new Dimension(500, 200));
        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.CENTER);
    }

    public static void showFrame() {
        JPanel panel = new JPanel();
        panel.setOpaque(true);

        JFrame frame = new JFrame("Populate JTextArea from File");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Highscore.showFrame();
            }
        });
    }
}