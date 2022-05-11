import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class Bot extends JFrame {
    private JTextArea Chatarea = new JTextArea();
    private JTextField chatbox = new JTextField();

    public Bot() {
        JFrame frame = new JFrame("Bot");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setTitle("Chatbot");
        frame.add(Chatarea);
        frame.add(chatbox);

        // For Text Area

        Chatarea.setText("Hello, I'm a chatbot.\n");
        Chatarea.setSize(500, 400);
        Chatarea.setLocation(2, 2);

        // For Text Field
        chatbox.setSize(540, 30);
        chatbox.setLocation(2, 500);

        chatbox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String text = chatbox.getText();
                Chatarea.append("You: " + text + "\n");
                chatbox.setText("");

                if (text.contains("hi")) {
                    bot("holla");
                } else {
                    int rand = (int) (Math.random() * 3 + 1);
                    if (rand == 1) {
                        bot("I don't understand");
                    } else if (rand == 2) {
                        bot("I'm sorry, I don't understand");
                    } else {
                        bot("okay, i'm done");
                    }
                }
            }
        });
    }

    private void bot(String string) {
        Chatarea.append("Bot: " + string + "\n");
    }

    public static void main(String[] args) {
        new Bot();
    }
}