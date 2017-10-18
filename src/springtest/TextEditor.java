package springtest;

public class TextEditor {

	public String name;

	public String teacher;
	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	private SpellChecker spellChecker;
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void spellCheck() {
		System.out.println(name +" "+ teacher + spellChecker);
	}
}
