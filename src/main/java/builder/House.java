package builder;

public class House implements HousePlan{

    private String basement;
    private String structure;
    private String roof;
    private String interior;


    @Override
    public void setBasement(String basement) {
        this.basement=basement;
    }

    @Override
    public void setStructure(String structure) {
        this.structure=structure;
    }

    @Override
    public void setRoof(String roof) {
        this.roof=roof;
    }

    @Override
    public void setInterior(String interior) {
        this.interior=interior;
    }

    @Override
    public String toString() {
        return "House{" +
                "basement='" + basement + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}
