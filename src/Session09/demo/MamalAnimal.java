package Session09.demo;

public class MamalAnimal extends Animal{
    private String foodType;
    private boolean isLiveWithHuman;
    private String mamalSound;

    public MamalAnimal() {
        super();
    }

    public MamalAnimal(int everageLifeExpectancy, String furColor, int numberOfLegs, String animalName, String foodType, boolean isLiveWithHuman, String mamalSound) {
        super(everageLifeExpectancy, furColor, numberOfLegs, animalName);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mamalSound = mamalSound;
    }

    public String getFoodType() {
        return foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }

    public String getMamalSound() {
        return mamalSound;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void setLiveWithHuman(boolean liveWithHuman) {
        isLiveWithHuman = liveWithHuman;
    }

    public void setMamalSound(String mamalSound) {
        this.mamalSound = mamalSound;
    }

}
