package D1_A;

public class Heizung {
    private int temperature = 15;
    private int min;
    private int max;
    private int increment;

    public Heizung(int min, int max, int increment){
        this.temperature = 15;
        this.min = min;
        this.max = max;
        this.increment = increment;
    }

    public void increaseTemperature(){
        if(!(this.max < this.temperature + this.increment)){
            this.temperature += this.increment;
        }
    }

    public void decreaseTemperature(){
        if(!(this.min > this.temperature - this.increment)){
            this.temperature -= this.increment;
        }
    }

    public void getTemperature() {
        System.out.println(temperature);
    }
}
