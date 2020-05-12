package Secao4_InstrucoesDeControle;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student("Doriane Alves",98.5);
		Student student2 = new Student("Shelson Alves",78.6);
		
		System.out.printf("%s letter grade is %s%n",
				student1.getNome(),student1.getLetterGrade());
		
		System.out.printf("%s letter grade is %s%n",
				student2.getNome(),student2.getLetterGrade());
		
	}
}
