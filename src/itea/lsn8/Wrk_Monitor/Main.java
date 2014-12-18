package itea.lsn8.Wrk_Monitor;

public class Main {
	public static void main(String[] args) {
		Monitor m = new Monitor("D:\\Temp\\1.txt", new FileEvent());
		m.start();
	}
}