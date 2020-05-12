package Secao4_InstrucoesDeControle;

public class Student {
	private String nome;
	private double average;
	
	public Student(String nome, double average){
		this.nome = nome;
		
		if(average > 0)
			if(average <= 100)
				this.average = average;
	}
	
	public String getLetterGrade() {
		String letterGrade = "";
		if(average >=90)
			letterGrade="A";
		else if(average >=80)
			letterGrade = "B";
		else if(average >=70)
			letterGrade = "C";
		else if(average >= 60)
			letterGrade = "D";
		else if(average >= 50)
			letterGrade = "E";
		else
			letterGrade = "F";
		
		return letterGrade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setAverage(double average) {
		if(average > 0)
			if(average <=1000)
				this.average = average;
	}
	
	public double getAverage() {
		return average;
	}
}
