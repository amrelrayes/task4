
import javax.swing.JOptionPane;

public class GradeRange {

	public static void main(String[] args) {

		String grade = JOptionPane.showInputDialog("Please Enter your Grade :");
		switch (grade.toLowerCase()) {
		case "f":

			JOptionPane.showMessageDialog(null, "This Grade Starts is from 0 to 50");
			break;
		case "d":
			JOptionPane.showMessageDialog(null, "This Grade Starts is from 50 to 65");
			break;
		case "c":
			JOptionPane.showMessageDialog(null, "This Grade Starts from 65 to 75");
			break;
		case "b":
			JOptionPane.showMessageDialog(null, "This Grade Starts from 75 to 85");
			break;
		case "a":
			JOptionPane.showMessageDialog(null, "This Grade Starts from 85 to 100");
            break;
		default:
			JOptionPane.showMessageDialog(null, "This is not a valid Grade");
			break;
		}
	}
}
