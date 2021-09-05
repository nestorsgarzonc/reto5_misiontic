package core;

public class CustomException extends Exception {
    private String message;

    public CustomException(String message) {
        this.message = message;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

}
