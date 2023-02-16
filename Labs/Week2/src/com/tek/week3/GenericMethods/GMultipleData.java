package com.tek.week3.GenericMethods;

public class GMultipleData <Datatypeone, DatatypeTwo> {
	
	Datatypeone valueOne;
	   DatatypeTwo valueTwo;

	   public GMultipleData(Datatypeone v1, DatatypeTwo v2)
	   {
	       this.valueOne = v1;
	       this.valueTwo = v2;
	   }

	   public Datatypeone getValueOne() {
	       return valueOne;
	   }

	   public void setValueOne(Datatypeone valueOne) {
	       this.valueOne = valueOne;
	   }

	   public DatatypeTwo getValueTwo() {
	       return valueTwo;
	   }

	   public void setValueTwo(DatatypeTwo valueTwo) {
	       this.valueTwo = valueTwo;
	   }
	   
	   //THIS CAN BE IN ITS OWN CLASS CALLED MYRUMMER OR GMULTIPLEMAIN
	   
	   public static void main(String[] args) {
	       // initialize generic class
	       // with String and Integer data
	       
		   GMultipleData<String, Integer> mobj = new GMultipleData("Per Scholas", 11025);

	       System.out.println(mobj.getValueOne());
	       System.out.println(mobj.getValueTwo());
	       
	         // initialize generic class
	       // with String and String data
	       GMultipleData<String, String> mobj2 = new GMultipleData("Per Scholas", "Non profit");
	       System.out.println(mobj2.getValueOne());
	       System.out.println(mobj2.getValueTwo());
	   }



}
