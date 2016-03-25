package bmi;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class GuiBMI implements ActionListener {

    JRadioButton MRButton = new JRadioButton("Male");
    JRadioButton MRSButton = new JRadioButton("Female");
    JButton CALCButton = new JButton("Calculate");
    JTextField SurnameField = new JTextField();
    JTextField HeightField = new JTextField();
    JTextField WeightField = new JTextField();

    public GuiBMI() {
        JFrame frame = new JFrame("BMI Application");

        GridLayout gl = new GridLayout(5, 2, 3, 4);

        JPanel panel = new JPanel();
        TitledBorder tb = new TitledBorder("Enter Data");
        panel.setLayout(gl);
        panel.setBorder(tb);

        JLabel surnameLabel = new JLabel("Surname : ");
        JLabel heightLabel = new JLabel("Height : ");
        JLabel weightLabel = new JLabel("Weight : ");
        JLabel genderLabel = new JLabel("Gender : ");
        
        // add a panel to create 2 radio button
        JPanel genderPanel = new JPanel();

        // addActionListener(this) method to use ActionListener
        
        MRButton.addActionListener(this);
        MRSButton.addActionListener(this);
        genderPanel.add(MRButton);
        genderPanel.add(MRSButton);

        CALCButton.addActionListener(this);

        /**
         *add relevant data to panel
         */
        panel.add(surnameLabel);
        panel.add(SurnameField);
        panel.add(heightLabel);
        panel.add(HeightField);
        panel.add(weightLabel);
        panel.add(WeightField);
        panel.add(genderLabel);
        panel.add(genderPanel);
        panel.add(CALCButton);

      
        frame.add(panel);

        /**
         * settings of frame
         */
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GuiBMI guiVKI = new GuiBMI();
    }

    /**
     * ActionListener ->actionPerformed method
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Mr")) {
            MRSButton.setSelected(false);
            MRButton.setSelected(true);
        } else if (e.getActionCommand().equals("Mrs/Miss")) {
           MRButton.setSelected(false);
            MRSButton.setSelected(true);
        } else if (e.getActionCommand().equals("Calculate")) {
            String surname = SurnameField.getText();
            String weight = WeightField.getText();
            String height = HeightField.getText();
            int gender = 0;
            if (MRButton.isSelected()) {
                gender = 1;
            } else if (MRSButton.isSelected()) {
                gender = 2;
            }

            double dWeight = Double.parseDouble(weight);
            double dHeight = Double.parseDouble(height) / 100;

            BMI bmi = new BMI(surname, gender, dWeight, dHeight);
            double bmi1 = bmi.getBMI();
            String status = bmi.getStatus();
            String call = bmi.getGender() == 1 ? "Mr " : "Mrs/Miss ";
            
            JOptionPane.showMessageDialog(null, call + bmi.getSurname() + " result"
                    + "\nyour BMI = " + bmi1
                    + "\nyour status  = " + status);

        }

    }
}
