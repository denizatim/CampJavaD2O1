package assignment;

public class CourseManager {
	public void takeUp(Course course) {
		System.out.println(course.name + " Kursuna kay�t olundu.");
	}

	public void info(Course course) {
		System.out.println("Kurs Bilgileri:\n��retmen: " + course.teacher + "\nKurs ad�: " + course.name);
	}
}
