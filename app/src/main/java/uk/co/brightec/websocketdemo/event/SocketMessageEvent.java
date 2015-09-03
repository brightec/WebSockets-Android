package uk.co.brightec.websocketdemo.event;

/**
 * Created by chris on 27/03/15.
 */
public class SocketMessageEvent {
    private String mMessage;

    public SocketMessageEvent(String message) {
        mMessage = message;
    }

    public String getMessage() {
        return mMessage;
    }
}
