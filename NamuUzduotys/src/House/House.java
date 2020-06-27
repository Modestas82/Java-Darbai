package House;

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

	     double getHouseArea() {
	        return houseArea;
	    }

	     private String getDistrict() {
	        return district;
	    }


	    int getBuiltYear() {
	        return builtYear;
	    }


	    String getCondition() {
	        return condition;
	    }



	    @Override
	    public String toString() {
	        StringBuilder x = new StringBuilder();
	        x.append("District: ").append(this.getDistrict()).
	          append("\nBuilt year: ").append(this.getBuiltYear()).
	          append("\nHouse area: ").append(this.getHouseArea()).append(" square meters.").
	          append("\nCondition: ").append(this.getCondition()).append("\n");
	        return x.toString();
	    }
}
