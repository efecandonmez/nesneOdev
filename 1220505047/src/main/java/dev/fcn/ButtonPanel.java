package dev.fcn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ButtonPanel extends JFrame {

    private  JButton[][] buttons; //Buton matrisi 4x4
    private  List<JButton> activeButtons; //Bu array listesi aktif durumdaki butonlari tutmaya yarar.

    public static void main(String[] args) {
        //GUI'yi olusturuyoruz.
        SwingUtilities.invokeLater(() -> {
            ButtonPanel buttonPanel =new ButtonPanel();
            buttonPanel.setVisible(true);
        });


    }


    public ButtonPanel() throws HeadlessException {
        //Framein temel ozelliklerini ayarliyoruz.

        setTitle("4x4 Button Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new GridLayout(4, 4));
        buttons=new JButton[4][4];
        activeButtons=new ArrayList<>();

        //Tek tek buton olusturmaktansa for dongusu kullanarak olusturuyoruz.
        for (int i=0;i<4;i++) {
            for (int j=0;j<4;j++) {
                buttons[i][j] = createButton("Button-"+(i * 4 + j + 1));
                add(buttons[i][j]);
            }
        }


    }

    //Burada arayuz acildigindaki butonlarin yani normal duz butonun ozelliklerini ayarliyoruz.
    private JButton createButton(String buttonText) {
        JButton button = new JButton(buttonText);

        button.addActionListener(new ButtonClickListener());
        button.setFont(new Font("Arial", Font.PLAIN, 15));
        button.setForeground(Color.black);
        button.setBackground(Color.darkGray);
        button.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/static/inactive_icon.png"))));
        button.putClientProperty("GraphQLSchema", "https://google.com");
        button.putClientProperty("ActiveColor", Color.green);
        button.putClientProperty("InactiveColor", Color.darkGray);
        button.putClientProperty("ActiveIcon", new ImageIcon(Objects.requireNonNull(getClass().getResource("/static/active_icon.png"))));
        button.putClientProperty("InactiveIcon", new ImageIcon(Objects.requireNonNull(getClass().getResource("/static/inactive_icon.png"))));
        return button;



    }
    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton=(JButton) e.getSource();
            if (activeButtons.contains(clickedButton)) {
                // Tiklanmis yani aktif butonlari pasif hale getirme
                for (int i=0;i<4;i++) {
                    for (int j=0;j<4;j++) {
                        JButton button = buttons[i][j];
                        button.setBackground((Color) button.getClientProperty("InactiveColor"));
                        button.setIcon((Icon) button.getClientProperty("InactiveIcon"));
                        activeButtons.clear();
                    }
                }
            } else { //dugme aktif degilse aktif hale getirme
                activeButtons.add(clickedButton);
                clickedButton.setBackground((Color) clickedButton.getClientProperty("ActiveColor"));
                clickedButton.setIcon((Icon) clickedButton.getClientProperty("ActiveIcon"));
                String schemaAddress = (String) clickedButton.getClientProperty("GraphQLSchema");
                System.out.println(" GraphQL mutation calisiyor: " + clickedButton.getText() + "===>" + schemaAddress);

            }
        }
    }


}