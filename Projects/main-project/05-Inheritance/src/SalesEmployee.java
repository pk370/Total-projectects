
public class SalesEmployee  extends Employee{
    private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public double computeAllowance() {
		if(cityName=="hyderabad") {
			return (this.getBasicSalary()*0.35)+5000;
		}
		return (this.getBasicSalary());
	}
    
}
