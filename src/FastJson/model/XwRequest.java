package FastJson.model;


public class XwRequest<T> {
    private T head;
    private T body;

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
