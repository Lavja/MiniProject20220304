public class Queuing {
	
	public int getScore(Patient patient) {
		int score = 0;
		if(patient.getAge()<5 || patient.getAge()>75) score+=100;
		if(patient.getAge()<15 || patient.getAge()>60) score+=50;
		if(patient.hasBrokenBone) score+=100;
		return score;
	}
	
}
