package structural.delegation;

public class PrinterController implements Printer {

	private Printer printer;

	@Override
	public void print(String message) {
		printer.print(message);

	}

	public void setPrinter(String printerClass) {
		switch (printerClass) {
		case "canonPrinter":
			this.printer = new CanonPrinter();
			break;
		case "epsonPrinter":
			this.printer = new EpsonPrinter();
			break;
		case "hpPrinter":
			this.printer = new HpPrinter();
			break;
		}
	}

}
