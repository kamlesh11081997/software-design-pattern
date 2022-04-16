package builder;

public class TipiHouseBuilder implements HouseBuilder {

    private House house;

    public TipiHouseBuilder() {
        this.house =new House();
    }

    @Override
    public void buildBasement() {
        this.house.setBasement("Wooden poles");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("Wood and ice");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Wood, caribou and seal skin");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("Fire wood");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
