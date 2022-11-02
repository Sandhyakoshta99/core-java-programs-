package com.student;
//....................declaring a class.......................
public class Student {
//.................. Declaring a Local variables......................
		private int id;
		private String stName;
		private float marks;
		
	//......................Default Constructor.................
		public Student() {
			//................calling the object class.................
			super();   //...........can be omitted.................
			this.id=0;
			this.stName="your Name:";
			this.marks= 50.09f;
			System.out.println(".......Default........");
			
		}

		 //................Parameterized constructor............
		public Student(int id, String stName) {
			this();
			System.out.println("Paramterize 1..........");
			//.................this refers to current obj................
			this.id = id;
			this.stName=stName;
		}
		
		//................Parameterized constructor............
		public Student(int id, String stName, float marks) {
			this(id, stName);
			System.out.println("Paramterize 2..........");
			//.................this refers to current obj................
			this.marks = marks;
		}
		//.................copy constructor.......................
		public Student(Student s) {
		
			this.id = s.id;
			this.stName = s.stName;
			this.marks = s.marks ;
		}

		
		//..............get and set Method..................
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getStName() {
			return stName;
		}

		public void setStName(String stName) {
			this.stName = stName;
		}

		public float getMarks() {
			return marks;
		}

		public void setMarks(float marks) {
			this.marks = marks;
		}

		//...........Implementation for toString method............... 
		@Override
		public String toString() {
			return "Student id = " + id + ", Name = " + stName + ", marks = " + marks;
		}
		
		

}
