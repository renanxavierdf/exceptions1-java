package entidades;

public class Individual extends TaxPayer {

		private Double healtExpenditures;

		public Individual() {
			
		}
		
		public Individual(Double healtExpenditures) {
				this.healtExpenditures = healtExpenditures;
		}



		public Individual(String name, Double anualIncome, double healtExpenditures) {
			super(name, anualIncome);
			this.healtExpenditures = healtExpenditures;
		}

		public double getHealtExpenditures() {
			return healtExpenditures;
		}

		public void setHealtExpenditures(Double healtExpenditures) {
			this.healtExpenditures = healtExpenditures;
		}
		
		

		@Override
		public Double tax() {
			
			if(getAnualIncome() < 20000 ) {
				return getAnualIncome() * 0.15 - healtExpenditures * 0.5;
		}
			else {
				return getAnualIncome() * 0.25 - healtExpenditures * 0.5;
				}
	}
		
		
		
	
}
