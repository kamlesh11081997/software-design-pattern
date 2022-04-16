package builder;

public class CivilEngineer {

    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }
    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
        this.houseBuilder.buildStructure();
    }
    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
}
