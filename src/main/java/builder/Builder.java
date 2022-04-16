package builder;

public class Builder {
    public static void main(String[] args) {

        /**
         * Building house(concrete class) using House Builder and Civil Engineer class
         **/
        HouseBuilder iglooBuilder =new IglooHouseBuilder();
        CivilEngineer iglooCivilEngineer=new CivilEngineer(iglooBuilder);
        iglooCivilEngineer.constructHouse();
        House house=iglooCivilEngineer.getHouse();
        System.out.println(house.toString());

        /**
         * Building house (concrete class) using House Builder and Civil Engineer class
         **/
        HouseBuilder tipiBuilder=new TipiHouseBuilder();
        CivilEngineer tipiCivilEngineer=new CivilEngineer(tipiBuilder);
        tipiCivilEngineer.constructHouse();
        House tipiHouse= tipiCivilEngineer.getHouse();
        System.out.println(tipiHouse.toString());


    }
}
