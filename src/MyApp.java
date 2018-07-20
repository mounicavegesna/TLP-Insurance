
public class MyApp {
	
		
		
		
	//private  final String[] coverages= {"malpractise","buildings","ontents"};
		
	//private	final String[] industries= {"medical","construction","retail"};
	
		
public static void main(String[] args) {
	

			
		Person person = new Person("ravi",32,"jgf","9273958","ggfg2764");
		
		
		OverallPricing overallprice = new OverallPricing("average", "high","");
		
		OverallPricingLogic logic2 = new OverallPricingLogic(overallprice);
		
		//Person person = new Person("ravi", 24, "abc@gmail.com", "8527552252", "HDFS564");
		
		
		//CoverageStability coverageStability = new CoverageStability();
		
		
		//CoveragestabilityLogic logic = new CoveragestabilityLogic(coverageStability);
		
		
    logic2.start();
    System.out.println(logic2.getInsurance().getStatus());
		
}		
			
	
}
