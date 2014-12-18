package itea.lsn8.Wrk_LinesReader;

public interface IEvents {
    void onNewLine(String line);
    void onError(String msg);
}
