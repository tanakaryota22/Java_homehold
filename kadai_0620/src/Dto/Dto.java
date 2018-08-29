package Dto;

	public class Dto {
		 private int id;
		    private String name;
		    private int price;
		    private int day;



		  public Dto(int id,String name,int price,int day){
		        this.id = id;
		        this.name = name;
		        this.price = price;
		        this.day = day;


	}
	 public Dto() {
			// TODO 自動生成されたコンストラクター・スタブ
		}
	public int getId() {
	        return id;
	    }


	    public void setId(int id) {
	        this.id = id;
	    }


	    public String getName() {
	        return name;
	    }


	    public void setName(String name) {
	        this.name = name;
	    }


	    public int getPrice() {
	        return price;
	    }


	    public void setPrice(int price) {
	        this.price = price;
	    }
	    public int getDay() {
	        return day;
	    }


	    public void setDay(int day) {
	        this.day = day;
	    }
	}
