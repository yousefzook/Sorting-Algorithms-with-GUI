package Controller;

import javax.swing.JOptionPane;

public class Runner {
	static Simulation Sim = Simulation.get_instance();
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Enter the array number : ");
		int num = Integer.valueOf(n);
		Sim.setArr(num);
		String sort = null;
		new Container();
		sort = JOptionPane.showInputDialog(
				"Enter the Sort : (Bubble , Heap , Shell , Merge, Insertion ," + "Selection or Quick )");

		while (sort != null && !sort.equals("end")) {

			Sim.sort(sort);
			sort = JOptionPane.showInputDialog(
					"Enter the Sort : (Bubble , Heap , Shell , Merge, Insertion ," + "Selection or Quick )");
			Sim.Clear();
		}
		System.exit(0);

	}
}