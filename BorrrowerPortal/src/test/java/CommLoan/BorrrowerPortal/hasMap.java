package CommLoan.BorrrowerPortal;

import java.util.HashMap;

public class hasMap extends ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> StateCitys = new HashMap<String,Integer>();
		
		StateCitys.put("UP",1);
		StateCitys.put("Haryana",2);
		StateCitys.put("Rajishtan",3);
		StateCitys.put("Maharasht",4);
		StateCitys.put("Maharasht",4);
		System.out.println(StateCitys);
		//System.out.println(StateCitys.get("Haryana"));
		//System.out.println(StateCitys.size());
		//StateCitys.remove("UP");
		//System.out.println(StateCitys.size());
		//System.out.println(StateCitys.containsValue(StateCitys));
		
		ScannerClass scOBJ= new ScannerClass();
		scOBJ.main();
			

	}

}
