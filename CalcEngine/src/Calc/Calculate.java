// Abdullah AL-Sinaidi


package Calc;

public class Calculate {

		public double get_future(double investment, double years, double annual_interest_rate){
			double rate = 1+  annual_interest_rate/100;
			return (int)(investment* Math.pow(rate,years));
		}
	}


