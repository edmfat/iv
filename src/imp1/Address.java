package imp1;

public class Address {
	private String doorno;
	private String streetName;
	private String cityName;
	
	public Address() {
		
	}

	public Address(String doorno, String streetName, String cityName) {
		
		this.doorno = doorno;
		this.streetName = streetName;
		this.cityName = cityName;
	}
	
	

	public String getDoorno() {
		return doorno;
	}

	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", streetName=" + streetName + ", cityName=" + cityName + "]";
	}
	
	
}
