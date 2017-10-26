package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final String etcData;

    public Greeting(long id, String content, String etcData) {
        this.id = id;
        this.content = content;
        this.etcData = etcData;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getEtcData() {return etcData;}
}
