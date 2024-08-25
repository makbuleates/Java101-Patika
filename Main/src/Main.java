public class Main {
    public static void main(String[] args) {
     Teacher t1 = new Teacher("Mahmut","999", "TRH");
     Teacher t2 = new Teacher("Asiye", "888", "FZK");
     Teacher t3 = new Teacher("Gülcan", "444", "BIO");


     Course tarih = new Course("Tarih", "101", "TRH");
     tarih.addTeacher(t1);

     Course fizik = new Course("Fizik", "102", "FZK");
     fizik.addTeacher(t2);

     Course biyoloji = new Course("Biyoloji", "103", "BIO");
     biyoloji.addTeacher(t3);

     Student s1 = new Student("Ayşe", "666", "2", tarih, fizik, biyoloji);
     s1.addBulkExamNote(100,56,48);
     s1.isPass();

     Student s2 = new Student("Ahmet", "111", "4", tarih, fizik, biyoloji);
     s2.addBulkExamNote(263,75,36);
     s2.isPass();

     Student s3 = new Student("Deniz", "555", "3", tarih, fizik, biyoloji);
     s3.addBulkExamNote(10,96,55);
     s3.isPass();

    }
}