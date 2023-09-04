public class Apprentice extends Human{

    private String topic;

    public Apprentice(String topic, String name){
        super(name);
        this.topic = topic;

    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}