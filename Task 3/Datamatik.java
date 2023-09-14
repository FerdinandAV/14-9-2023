//Datamatik
Student Student1;
Student Student2;
Teacher Teacher1;

void setup(){
  Student1 = new Student("Ferdinand",19,false,"DAT1");
  Student2 = new Student("Madhi",34,false,"DAT1");
  Teacher1 = new Teacher("Tess",0-100,true); 
 println(Teacher1.name);  
 println(Student1.name + " " + Student1.datamatikerTeam);
println(Student2.name + " " + Student2.datamatikerTeam);
}
