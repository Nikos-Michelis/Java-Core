class Student {

    String name;
    String lastname;
    double DegreeExercise1;
    double DegreeExercise2;
    double DegreeTest;
    //double sum=0;
    //double DegreeAvg=1;

    Student(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }
    Student(String name, String lastname, double DegreeExercise1, double DegreeExercise2){
        this(name, lastname);
        this.DegreeExercise1 = 0;
        this.DegreeExercise2 = 0;
    }
    public void gradeAssignment1(double DegreeExercise1){
        this.DegreeExercise1 = DegreeExercise1;
    }
    public void gradeAssignment2(double DegreeExercise2){
        this.DegreeExercise2 = DegreeExercise2;
    }
    public void gradeFinalExam(double DegreeTest){
        this.DegreeTest = DegreeTest;
    }
    public double finalGrade(){
       //sum = DegreeExercise1 + DegreeExercise2 + DegreeTest;
       //return DegreeAvg = sum/3;
         return (DegreeExercise1 + DegreeExercise2 + DegreeTest)/3;
       //return ( DegreeExercise1 + DegreeExercise2 + DegreeTest )
    }
}
