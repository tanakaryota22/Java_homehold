package Dto;

	public class Dto {
		private String income; // 収入
		private String spending; // 支出

	public Dto(){
	}
		public Dto(String income, String spending) {
		super();
		this.income = income;
		this.spending = spending;
}

	public String getincome() {
		return income;
	}

	public void setincome(String income) {
		this.income = income;
	}

	public String getspending() {
		return spending;
	}

	public void setSpending(String spending) {
		this.spending= spending;

	}
	}