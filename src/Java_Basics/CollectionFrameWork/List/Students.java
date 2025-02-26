package Java_Basics.CollectionFrameWork.List;

public class Students {
    private String name;
    private String rollno;

    public Students(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void printdetails(){
        System.out.println("Student name "+ this.name);
        System.out.println("Student rollno "+ this.rollno);
    }

    @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollNo='" + rollno + '\'' +
                    '}';
    }
}

