package kay;
class MobileMoney{
	long balance;
	String MobileNo;
	public MobileMoney(){
		balance=0;
		
	}
	protected MobileMoney(long bal,String no) {
		balance=bal;
		MobileNo=no;
	}
	public long SaveMoney(long Cash) {
		long x= Cash+balance;
		return x;
	}
	
	


	public static void main(String[]args) {
		MobileMoney obj1=new MobileMoney();
		long Mybalance =obj1.SaveMoney(23000);
		System.out.println("obj1 new balance is "+Mybalance);
		
		MobileMoney obj2=new MobileMoney();
		long balance =obj2.SaveMoney(50000);
		System.out.println("obj2 new balance is "+balance);
		
		
		
	}
}

