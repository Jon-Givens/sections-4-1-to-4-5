import javax.swing.*;

public class ComputeBMI_4_5 {
    public static void main(String[] args)
	{
            Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
            Double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight"));
            int BMI =  (int)  (weight / (Math.pow(height, 2)) * 703);
        System.out.println(BMI);
        }
}
