package builder;

//Ref : https://www.geeksforgeeks.org/builder-design-pattern/
public interface HousePlan {
    void setBasement(String basement);
    void setStructure(String structure);
    void setRoof(String roof);
    void setInterior(String interior);
}
