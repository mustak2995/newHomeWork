package newHomeWork;

public class CompoundInter {

	

		public static void main(String[] args) {
			 int p=2000, n=12,t=5;
			double R=0.08;
			double amount=p*Math.pow((1+R/n), (n*t));
			double compoundi=amount-p;
			System.out.println("the compound interest anuallly is.."+compoundi);
		}

	}
