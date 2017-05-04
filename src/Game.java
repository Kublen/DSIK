import java.awt.EventQueue;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Frame();
			}
		});
		System.out.println("Wprowadz adres IP: ");
		Scanner scan = new Scanner(System.in);
		scan.close();
	}
}