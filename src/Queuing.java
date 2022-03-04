public class Queuing {
	
	public int getScore(Patient patient) {
		int score = 0;
		if(patient.getAge()<5 || patient.getAge()>75) score+=100;
		if(patient.getAge()<15 || patient.getAge()>60) score+=50;
		if(patient.isHasBrokenBone) score+=100;
		if(patient.isBleeding) score+=50;
		if(patient.isAching) score+=50;
		if(patient.isHasFever) score+=50;
		if(!patient.isMale) score+=20;
		if(patient.isHasOpenWound) score+=45;
		
		return score;
	}
	
}
