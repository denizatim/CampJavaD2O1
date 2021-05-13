package assignment;

public class CourseManager {
	public void takeUp(Course course) {
		System.out.println(course.name + " Kursuna kayıt olundu.");
	}

	public void info(Course course) {
		System.out.println("Kurs Bilgileri:\nÖğretmen: " + course.teacher + "\nKurs adı: " + course.name);
	}
}
