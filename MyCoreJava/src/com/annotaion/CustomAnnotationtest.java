package com.annotaion;

import java.lang.annotation.*; 
import java.lang.reflect.*;

@Retention (RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface Getter
{
	String x() default "xyz";
	int a() default 2;
}
class CustomAnnotationTest 
{
   int x;
   String y;
   
   public void setX(int x)
   {
   	this.x=x;
   }
   @Getter
   public int getX()
   {
   	return this.x;
   }
    @Getter
   public int getx()
   {
   	return this.x;
   }
   
   public void setY(String y)
   {
   	this.y=y;
   }
   @Getter(x="Surender",a=10)
   public String getY()
   {
   	return this.y;
   }
   @Getter
   public String gety()
   {
   	return this.y;
   }
   @SuppressWarnings({"unchecked"})
   public static void main(String[] args) throws Exception
   {
   	  CustomAnnotationTest obj =new CustomAnnotationTest();
   	  obj.setX(7);
   	  obj.setY("Gourav");
   	  Class c= Class.forName("CustomAnnotationTest");
   	  Method m [] =c.getMethods();
   	  String t;
   	  for (int i=0;i<m.length; i++) 
   	  {
   	  	String s;
   	  	boolean isGetterMethod=false;

   	  	 Method myMethod =m[i];
   	     //System.out.println(myMethod.getName());
   	     Annotation annotation [] =myMethod.getAnnotations();
   	     for(int j=0;j<annotation.length;j++)
   	     {
   	     	if((annotation[j].annotationType().getName()).equals("Getter"))
   	     	{
   	     		isGetterMethod =true; 	     		
   	        }
   	     }
   	     if(isGetterMethod)
   	     {
   	     	//System.out.println(myMethod.getName());
   	     	 s =myMethod.getName();
   	     	 t="get"+s.substring(3,s.length()).toLowerCase();
   	     	//System.out.println(t);
   	     	if(myMethod.getName().equals(t))
   	     	{
   	     		System.out.println("Wrongs Used Getter Method "+myMethod.getName() );
   	     	}
   	     }
   	  }

    } 

}

/*
OUTPUT 
H:\IBM FullStack Training\COre java>java CustomAnnotationTest
Wrongs Used Getter Method gety
Wrongs Used Getter Method getx
*/

