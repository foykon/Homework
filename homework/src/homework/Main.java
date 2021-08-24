package homework;

public class Main {

	public static void main(String[] args) {
		
		
		
		Fidan fidan1= new Fidan("çam",10,5);
		Fidan fidan2= new Fidan("ceviz",5,15);
		Fidan fidan3= new Fidan("zeytin",5,25);
		
		
		
		FidanManager fidanManager=new FidanManager();
		fidanManager.totalFidan(fidan1.amount);
		fidanManager.totalFidan(fidan2.amount);
		fidanManager.totalFidan(fidan3.amount);
		
		fidanManager.totalFidanGörme();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	

}
