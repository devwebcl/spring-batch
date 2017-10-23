package cl.devweb.model;

// it can be done automatically

public class Deal {

	private int id;
	private String date;
	private String brand_id;
	private String status;
	private String type2;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}


	@Override
	public String toString() {
		return "Deal [id =" + id + " date=" + this.date + ", brand_id=" + this.brand_id + ", status=" + this.status + ", type2=" + this.type2 + "]";
	}

}
