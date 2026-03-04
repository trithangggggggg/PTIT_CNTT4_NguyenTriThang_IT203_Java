package Session16.MiniPrj;

public class Pet {
    private  String id ;
    private String name;
    private String species;
    private double price;

    public Pet(String id, String name, String species, double price) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.price = price;
    }

    public Pet() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pet => id: "+ id + " name: " + name + " species: " + species + " price: " + price;
    }
}