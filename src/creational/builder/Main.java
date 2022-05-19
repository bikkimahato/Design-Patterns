package creational.builder;

public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		
		System.out.println(computer);

	}

}
