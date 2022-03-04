class Patient{
	String name, surname, ID;
	boolean hasBrokenBone, hasFever, hasOpenWound, isAching, isBleeding, isMale;
	int age;
	
	public Patient(String name, String surname, String ID, boolean brokenBone, boolean fever, boolean openWound, boolean aches, boolean bleeding, boolean gender, int age) {
		this.name = name;
		this.surname = surname;
		this.ID = ID;
		this.hasBrokenBone = brokenBone;
		this.hasFever = fever;
		this.hasOpenWound = openWound;
		this.isAching = aches;
		this.isBleeding = bleeding;
		this.isMale = gender;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	String getID() {
		return ID;
	}

	void setID(String iD) {
		ID = iD;
	}

	boolean isHasBrokenBone() {
		return hasBrokenBone;
	}

	void setHasBrokenBone(boolean hasBrokenBone) {
		this.hasBrokenBone = hasBrokenBone;
	}

	boolean isHasFever() {
		return hasFever;
	}

	void setHasFever(boolean hasFever) {
		this.hasFever = hasFever;
	}

	boolean isHasOpenWound() {
		return hasOpenWound;
	}

	void setHasOpenWound(boolean hasOpenWound) {
		this.hasOpenWound = hasOpenWound;
	}

	boolean isAching() {
		return isAching;
	}

	void setAching(boolean isAching) {
		this.isAching = isAching;
	}

	boolean isBleeding() {
		return isBleeding;
	}

	void setBleeding(boolean isBleeding) {
		this.isBleeding = isBleeding;
	}

	boolean isMale() {
		return isMale;
	}

	void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
}