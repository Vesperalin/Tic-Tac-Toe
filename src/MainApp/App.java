package MainApp;
import Model.*;
import View.*;
import Controller.*;
public class App {

	public static void main(String[] args) {
		View view = new View();
		Model model = new Model();
		Controller controller = new Controller(model, view);
	}

}
