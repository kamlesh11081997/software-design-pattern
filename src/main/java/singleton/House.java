package singleton;

public class House {
    // Ref : https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/
    private static House house;
    private House() {
    }

    public static House getHouse(){
        if(house==null){
            house=new House();
        }
        return house;
    }
}
