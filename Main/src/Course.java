public class Course{
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=note;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
        this.teacher=teacher;}
        else{
            System.out.println("Öğretmen ve Ders bilgileri uyuşmuyor!");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }
}
