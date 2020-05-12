package Secao3_1ClassesEObjetos;

import javax.swing.JOptionPane;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee empregado1 = new Employee("Shelson","Alves",2000);
		Employee empregado2 = new Employee("Doriane","Alves",3000);
		
		displayMessageObjeto(empregado1);
		displayMessageObjeto(empregado2);
		
		empregado1.setAumento(10);
		displayMessageObjeto(empregado1);
		
		empregado2.setAumento(10);
		displayMessageObjeto(empregado2);
		
	}
	
	public static void displayMessageObjeto(Employee employee) {
		String texto = String.format("%s %s%n%.2f%n%.2f", 
				employee.getNome(),
				employee.getSobrenome(),
				employee.getSalarioMensal(),
				employee.getSalarioAnual());
		JOptionPane.showMessageDialog(null,texto);
		
	}
}
