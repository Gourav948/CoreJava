package com.annotaion;

class Complex
{
	private int real;
	private int img;
	/*public Complex ()
	{

	}*/
	public Complex(int real, int img)
	{
		this.real= real;
        this.img=img;
	}
	public Complex addComplex(Complex a)
	{
		
		int real=a.real+this.real;
		int img=a.img+this.img;
		Complex x =new Complex(real,img);
		return x;
	}
	public Complex substractComplex(Complex a)
	{
		
		int real=a.real-this.real;
		int img=a.img-this.img;
		Complex x =new Complex(real,img);
		return x;
	}
	public Complex multiplyComplex(Complex a)
	{
		
		int real=(a.real*this.real)-(a.img*this.img);
		int img=(a.real*this.img)+(a.img*this.real);
		Complex x =new Complex(real,img);
		return x;
	}
	public static void swapComplex(Complex [] a)
	{
		Complex temp = a[0];
		a[0]=a[1];
		a[1]=temp;

	}
	public int getReal()
	{
		return this.real;
	}
	public int getImg()
	{
		return this.img;
	}
    public String toString()
    {
    	return this.getReal()+" + "+this.getImg()+"j";
    }

}
public class ComplexNoTest
{
	public static void main(String[] args) 
	{
		Complex x[]=new Complex[2];
		 x[0]=new Complex(2,3);
		 x[1]=new Complex(5,6);
		Complex r1=x[0].addComplex(x[1]);
		System.out.println("Addition="+r1.toString());
		Complex r2=x[0].substractComplex(x[1]);
		System.out.println("Substraction="+r2.toString());
		Complex r3=x[0].multiplyComplex(x[1]);
		System.out.println("Multiplication="+r3.toString());
		System.out.println("Before Swapping");
		System.out.println("Value of x[0]="+x[0]);
		System.out.println("Value of x[1]="+x[1]);
		Complex.swapComplex(x);
		System.out.println("After Swapping");
		System.out.println("Value of x[0]="+x[0]);
		System.out.println("Value of x[1]="+x[1]);
	}

}


/*

OUTPUT:
H:\IBM FullStack Training\COre java>javac ComplexNoTest.java

H:\IBM FullStack Training\COre java>java ComplexNoTest
Addition=7 + 9j
Substraction=3 + 3j
Multiplication=-8 + 27j
Before Swapping
Value of x[0]=2 + 3j
Value of x[1]=5 + 6j
After Swapping
Value of x[0]=5 + 6j
Value of x[1]=2 + 3j


*/