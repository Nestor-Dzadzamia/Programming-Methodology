//71. School კლასი(2018 წლის გამოცდის ამოცანა).
//თქვენი მიზანია დაწეროთ School კლასი, რომლის საშუალებითაც შევძლებთ
//უნივერსიტეტის მართვას. კლასს უნდა ჰქონდეს კონსტრუქტორი და 5 public მეთოდი.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import acm.program.ConsoleProgram;

public class School extends ConsoleProgram{
	HashMap<String, ArrayList<String>> teacherSubject;
	HashMap<String, ArrayList<String>> subjectPupil;
//	კონსტრუქტორს არაფერი არ გადაეცემა. აქ შეგიძლიათ ინიციალიზაცია გაუკეთოთ
//	თქვენთვის საჭირო ცვლადებს.
	public School() {
		teacherSubject = new HashMap<String, ArrayList<String>>();
		subjectPupil = new HashMap<String, ArrayList<String>>();
	}
	
//	addTeacher მეთოდის საშუალებით შეგიძლიათ სკოლას დაამატოთ ახალი
//	მასწავლებელი. მეთოდს გადაეცემა მასწავლებლის სახელი. შეგიძლიათ ჩათვალოთ,
//	რომ მასწავლებლის სახელი უნიკალურია.
	public void addTeacher(String teacher) {
		teacherSubject.put(teacher, new ArrayList<String>());
	}
	
//	addSubject მეთოდის საშუალებით შეგიძლიათ მასწავლებელს დაუმატოთ საგანი.
//	მეთოდს გადაეცემა მასწავლებლის სახელი და საგნის სახელი. ჩათვალეთ, რომ საგნის
//	სახელი უნიკალურია. ერთი და იგივე მასწავლებელი შეიძლება რამდენიმე საგანს
//	კითხულობდეს, ასევე ერთსა და იმავე საგანს შეიძლება რამდენიმე მასწავლებელი
//	კითხულობდეს ერთდროულად.
//	თუკი teacher სახელის მქონე მასწავლებელი არ არის აქამდე დამატებული, მაშინ
//	მეთოდმა არაფერი არ უნდა გააკეთოს.
	public void addSubject(String teacher, String subject) {
		if (teacherSubject.keySet().contains(teacher)) {
			ArrayList<String> currList = teacherSubject.get(teacher);
			if (currList.contains(subject) == false) {
				currList.add(subject);
			}
			teacherSubject.put(teacher, currList);
		} else {
			System.out.println("this teacher is not in database");
		}
	}
	
//	addPupil მეთოდის საშუალებით შეგიძლიათ საგანზე დაამატოთ მოსწავლე. ერთი და
//	იგივე მოსწავლე შეიძლება ერთ ან რამდენიმე საგანს სწავლობდეს.
	public void addPupil(String pupil, String subject) {
		if (subjectPupil.keySet().contains(subject)) {
			ArrayList<String> currList = subjectPupil.get(subject);
			currList.add(pupil);
			subjectPupil.put(subject, currList);
		} else {
			ArrayList<String> currList = new ArrayList<String>();
			currList.add(pupil);
			subjectPupil.put(subject, currList);
		}
	}
	
//	getTeachers მეთოდს გადაეცემა მოსწავლის სახელი და მან უნდა დააბრუნოს ამ
//	მოსწავლის ყველა მასწავლებელზე იტერატორი. ანუ მხოლოდ იმ მასწავლებლების
//	სახელები, რომლებიც ასწავლიან იმ საგნებს, რომლებზეც მოსწავლეა
//	დამატებული(სწავლობს). თუკი pupil სახელის მოსწავლე არ გვყავს მაშინ მეთოდმა
//	უნდა დააბრუნოს null.
	public Iterator<String> getTeachers(String pupil) {
		ArrayList<String> teacher = new ArrayList<String>();
		for (String subject : subjectPupil.keySet()) {
			if (subjectPupil.get(subject).contains(pupil)) {
				for (String keyTeacher : teacherSubject.keySet()) {
					if (teacherSubject.get(keyTeacher).contains(subject)) {
						teacher.add(keyTeacher);
					}
				}
			}
		}
		return teacher.iterator();
	}
	
//	getPupils მეთოდს გადაეცემა მასწავლებლის სახელი და მან უნდა დააბრუნოს ამ
//	მასწავლებლის ყველა სტუდენტზე იტერატორი. ანუ მხოლოდ იმ სტუდენტების
//	სახელები, რომლებიც მის რომელიმე საგანს სწავლობენ. თუკი teacher სახელის მქონე
//	ლექტორი არ გვყავს მაშინ მეთოდმა უნდა დააბრუნოს null.
	public Iterator<String> getPupils(String teacher){
		ArrayList<String> pupils = new ArrayList<String>();
		if (teacherSubject.containsKey(teacher) == false) return null; 
		
		ArrayList<String> subjectsOfTeacher = teacherSubject.get(teacher);
		
		for (String key : subjectPupil.keySet()) {
			if (subjectsOfTeacher.contains(key)) {
				for (String s : subjectPupil.get(key)) {
					pupils.add(s);
				}
			}
		}
		return pupils.iterator();
	}
	
//	მეთოდმა უნდა წაშალოს მასწავლებლის შესახებ ყველა ინფორმაცია. ამ მეთოდის
//	გამოძახების, შემდეგ getTeachers მეთოდმა არ უნდა დააბრუნოს teacher სახელი არც
//	ერთი სტუდენტისთვის.
	public void removeTeacher(String teacher) {
		teacherSubject.remove(teacher);
	}
	
}