package structural.delegation;

public class App {

	private final static String message = "Pages 500";

	public static void main(String[] args) {

		PrinterController printerController = new PrinterController();
		printerController.setPrinter("canonPrinter");
		printerController.print(message);

		printerController.setPrinter("epsonPrinter");
		printerController.print(message);

		printerController.setPrinter("hpPrinter");
		printerController.print(message);
	}

}
