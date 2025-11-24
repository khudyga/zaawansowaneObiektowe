import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JLabel display;
    private boolean isNewNumber;
    private String currentOperator;
    private double result;

    public Calculator(){
        isNewNumber = true;
        currentOperator = "=";
        result = 0.0;
        JFrame frame = new JFrame("Kalkulator");
        display = new JLabel("0",JLabel.RIGHT);
        display.setFont(new Font("Segoe UI", Font.BOLD, 24));
        display.setBackground(Color.WHITE);
        display.setOpaque(true);
        display.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame.add(display, BorderLayout.NORTH);
        frame.add(createButtonsPanel(), BorderLayout.CENTER);
        frame.setSize(300,400);
        frame.setMinimumSize(new Dimension(250,300));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    private JPanel createButtonsPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4,5,5));
        panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        String buttons[] = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };
        for (String button: buttons){
            panel.add(createButton(button));
        }
        return panel;
    }

    private JButton createButton(String btnName){
        JButton btn = new JButton(btnName);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btn.setFocusPainted(false);
        if ("+-/=*".contains(btnName)){
            btn.setBackground(new Color(255, 139, 238));
            btn.setForeground(Color.WHITE);
        } else {
            btn.setBackground(new Color(240,240,240));
        }
        return btn;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

    }
}
