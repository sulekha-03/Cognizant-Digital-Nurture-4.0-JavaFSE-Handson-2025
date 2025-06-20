
public class FinancialForecaster {
	
	 public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
	        
	        if (periods <= 0) {
	            return currentValue;
	        }   
	        double nextValue = currentValue * (1 + growthRate);
	        return calculateFutureValue(nextValue, growthRate, periods - 1);
	    }

	    public static void main(String[] args) {
	        double initialInvestment = 1000.0; 
	        double annualGrowthRate = 0.07;     
	        int years = 20;                
	        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, years);
	        System.out.println("Future Forecasting Financial Value using Recursion:");
	        System.out.printf(" After %d years at %.2f%% growth, $%.2f becomes $%.2f%n",
	                years, annualGrowthRate * 100, initialInvestment, futureValue);

	    }

}
