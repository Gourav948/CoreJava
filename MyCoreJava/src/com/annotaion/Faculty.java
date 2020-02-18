package com.annotaion;

//package fact;

public class Faculty
{
	int rollno;
	int marks;
	public Faculty(int rollno, int marks)
	{
      this.rollno=rollno;
      this.marks=marks;
	}
    public int getStudentMarks(int rollno)
    {
      return this.marks;
    }
}