package builder;

public class IglooHouseBuilder implements HouseBuilder{

    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Ice Bars");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice blocks");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice dome");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice cravings");
    }

    @Override
    public House getHouse(){
        return this.house;
    }
}
