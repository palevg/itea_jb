package itea.lsn8.Wrk_Monitor01;

import java.util.Date;

public class FileEvent implements IFileEvent {
	@Override
	public void onFileAdded(String s, Date d) {
		System.out.println("File added: " + s + "; Date of file: " + d);
	}
}