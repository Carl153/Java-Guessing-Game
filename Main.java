package Task9;

import java.io.IOException;
import static java.lang.System.*;

public class Main {
	//Populates GameApp using information from the .txt file
	public static void main(String[] args) {
		String txtfile = "data/data.txt";
		try {
			GameApp app = new GameApp(txtfile);
			app.game();
		}catch(IOException ioe) {
			out.printf("Perhaps missing text file: %s/%s? \n\n",
					new Main().getClass().getPackage().getName(), txtfile);

		}
	}	
}
