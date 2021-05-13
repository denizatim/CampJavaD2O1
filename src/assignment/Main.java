package assignment;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Programlamaya Giri�", "Engin Demiro�");
		Course course2 = new Course(2, "C# + Angular", "Engin Demiro�");
		Course course3 = new Course(3, "Java + React", "Engin Demiro�");

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.name);
		}

		CourseManager courseManager = new CourseManager();
		courseManager.takeUp(course1);
		courseManager.info(course1);
	}
}
