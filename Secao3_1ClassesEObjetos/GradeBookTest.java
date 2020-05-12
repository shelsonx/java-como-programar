package Secao3_1ClassesEObjetos;
import java.util.Scanner;
public class GradeBookTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GradeBook myGradeBook = new GradeBook();
		String nameOfCourse;
		
		System.out.println("Informe o nome do curso: ");
		nameOfCourse = input.nextLine();//lê uma linha de texto
	
		myGradeBook.displayMessage(nameOfCourse);
	}
	
}
