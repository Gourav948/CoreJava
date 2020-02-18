package com.annotaion;

import java.util.*;
class Person implements Comparable<Person>
{
  int height;
  int weight;
  String name;

  public Person(   String name, int height, int weight)
  {
  	 this.name=name;
     this.height=height;
     this.weight=weight;
  }
  @Override
  public String toString()
  {
  	return this.name+" "+this.height+" "+this.weight;
  }
  public int compareTo(Person a)
  {
  	if (this.height >a.height)
  		return 1;
  	else if(a.height>this.height)
  		return -1;
  	else 
  		return 0;
  }
}

class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) 
	{
		return p1.name.compareTo(p2.name);
	}
}
class PersonHeightComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.height > p2.height) {
			return 1;
		}
		else if(p1.height < p2.height) {
			return -1;
		}
		return 0;
	}
}
class PersonWeightComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.weight > p2.weight) {
			return 1;
		}
		else if(p1.weight < p2.weight) {
			return -1;
		}
		return 0;
	}
}

class PersonTest
{
	public static void main(String[] args) 
	{
		Person a =new Person("Gourav",10,58);
		Person b =new Person("Surendra",9,62);
		Person c =new Person("Snigdha",8,50);

		List <Person> l =new ArrayList <Person> ();
		l.add(a);
		l.add(b);
		l.add(c);

		//Collections.sort(l); //calls Comparable
        Collections.sort(l, new PersonWeightComparator()); //calls Comparator
		
		for(Person p: l) {
			System.out.println(p);
		}

	}
}
/*
OUTPUT;
 Collections.sort(l, new PersonNameComparator());
H:\IBM FullStack Training\COre java>javac PersonTest.java

H:\IBM FullStack Training\COre java>java PersonTest
Gourav 10 58
Snigdha 8 50
Surendra 9 62

Collections.sort(l, new PersonHeightComparator());

H:\IBM FullStack Training\COre java>javac PersonTest.java

H:\IBM FullStack Training\COre java>java PersonTest
Snigdha 8 50
Surendra 9 62
Gourav 10 58

 Collections.sort(l, new PersonWeightComparator()); 
H:\IBM FullStack Training\COre java>javac PersonTest.java

H:\IBM FullStack Training\COre java>java PersonTest
Snigdha 8 50
Gourav 10 58
Surendra 9 62


*/