package Entity;

public class Client {
    private String message;
    public Client(){}

    public Client(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
