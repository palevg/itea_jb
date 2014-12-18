package itea.lsn8.Wrk_Monitor01;

import java.util.Date;

public interface IFileEvent {
	void onFileAdded(String s, Date d);
}