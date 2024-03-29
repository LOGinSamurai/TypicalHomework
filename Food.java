 public class Food {
	public String name;
	public Integer gramms;
	public Float price;
	
	public Food(String name, Integer gramms, Float price) {
		this.name = name;
		this.gramms = gramms;
		this.price = price;
	}

	@Override
	public String toString() {
		return "<" + name + ": " + gramms + "g| " + price + "MDL> \n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gramms == null) ? 0 : gramms.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (gramms == null) {
			if (other.gramms != null)
				return false;
		} else if (!gramms.equals(other.gramms))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	

	 
	

}