public class University {
     class Student{
        String name;
        Student(String name){
            this.name = name;
        }
        void print(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        University uni = new University();
        University.Student s = uni.new Student("Joseph");
        //Student s = new Student("Joseph");
        s.print();
    }
}
