package com.annotaion;

abstract class Persistence
{
    abstract void persist();
}
class FilePersistence extends Persistence
{
   public void persist()
   {
   	System.out.println("Data persisted into file");
   }

}
class DatabasePersistence extends Persistence
{
   public void persist()
   {
   	System.out.println("Data persisted into Database");
   }
}
class PersistenceFactory
{
	public static Persistence getPersistance()
	{
		return new FilePersistence();
	}
}
class PersistenceTest
{
	
	public static void main(String[] args) 
	{
		Persistence p=PersistenceFactory.getPersistance();
		p.persist();
	}
}

/*
OUTPUT:

H:\IBM FullStack Training\COre java>java PersistenceTest
Data persisted into Database

H:\IBM FullStack Training\COre java>javac PersistenceTest.java

H:\IBM FullStack Training\COre java>java PersistenceTest
Data persisted into file
*/

