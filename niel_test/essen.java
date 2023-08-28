package niel_test;

public class essen {
    private int hungerLevel;
    private int HamburgerHungerLevels;
    private int EisHungerLevels;
    private int PommesHungerLevels;

    public essen() {
        hungerLevel = 100;
        HamburgerHungerLevels = 50;
        EisHungerLevels = 10;
        PommesHungerLevels = 30;
    }

    public int gethungerLevel() {
        return this.hungerLevel;
    }

    public void sethungerLevel(int newhungerLevel) {
        this.hungerLevel -= newhungerLevel;
    }

    public void eatEis() {
        this.hungerLevel += EisHungerLevels;
    }
    
    public void eatHamburger() {
        this.hungerLevel += HamburgerHungerLevels;
    }

    public void eatPommes() {
        this.hungerLevel += PommesHungerLevels;
    }

}

