package Session09.demo;

import java.util.Scanner;

public class BirdAnimal extends Animal {
    private boolean isFly;
    private String birdSound;

    public BirdAnimal(){
        super();
    }

    public BirdAnimal(int everageLifeExpectancy, String furColor, int numberOfLegs, String animalName, boolean isFly, String birdSound) {
        super(everageLifeExpectancy, furColor, numberOfLegs, animalName);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public boolean isFly() {
        return isFly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        BirdAnimal bird = new BirdAnimal();

    }

}
