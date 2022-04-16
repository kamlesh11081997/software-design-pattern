package singleton;

public class Driver {
    public static void main(String[] args) {
        House house1=House.getHouse();
        House house2=House.getHouse();
        System.out.println(house1.hashCode());
        System.out.println(house2.hashCode());
        System.out.println(house1.equals(house2));
    }
}
