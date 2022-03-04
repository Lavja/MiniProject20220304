public class Main {

	public static void main(String[] args) {
		Queuing q = new Queuing();
		//broken bone, fever, open wound, aches, bleeding, gender, age
		Patient patient1 = new Patient("Susan", "Jones", "p123456",true,false,true,true,true,false,15);
		Patient patient2 = new Patient("Morgan", "Stones", "p123456",false,true,false,true,false,true,26);
		Patient patient3 = new Patient("Aaron", "Meachum", "p123456",false,true,false,true,false,true,55);
		Patient patient4 = new Patient("Meghan", "Tenner", "p123456",false,true,false,false,false,false,72);
		Patient patient5 = new Patient("Rick", "Grimes", "p123456",false,true,false,false,false,true,4);
		
		System.out.println(q.getScore(patient1));	
		System.out.println(q.getScore(patient2));
		System.out.println(q.getScore(patient3));
		System.out.println(q.getScore(patient4));
		System.out.println(q.getScore(patient5));
	}
}
