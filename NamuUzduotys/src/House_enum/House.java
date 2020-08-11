package House_enum;

public class House {

    private double houseArea;
    private String district;
    private int builtYear;
    private String condition;

    public House(double houseArea, String district, int builtYear, String condition) {
        this.houseArea = houseArea;
        this.district = district;
        this.builtYear = builtYear;
        this.condition = condition;
    }
    public int getBuiltYear() {
        return builtYear;
    }
    public double getHouseArea() {
        return houseArea;
    }
    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseArea=" + houseArea +
                ", district='" + district + '\'' +
                ", builtYear=" + builtYear +
                ", condition='" + condition + '\'' +
                '}';
    }
}