package Call;

public class Tariff {
	
	    private String country;
	    private double price;


	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    
	    @Override
		public String toString() {
			return "Tariff [country=" + country + ", price=" + price + "]";
		}

		public double getSum(int sum){
	        return price*sum;
	    }
	}
