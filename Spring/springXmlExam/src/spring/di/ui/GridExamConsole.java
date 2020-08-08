package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {


	private Exam exam;
	
	public GridExamConsole() {
		
	}
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	public void print() {
		System.out.println("total : "+ exam.total());
		System.out.println("avg :" + exam.avg());

	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;	
	}

}
