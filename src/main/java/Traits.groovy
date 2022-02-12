class Traits {
    static void main(String[] args) {
        Student st = new Student()
        st.StudentID = 1
        st.Marks1 = 10
        println(st.DisplayMarks())
    }
}

trait Marks {
    int marks

    void DisplayMarks() {
        this.marks = 10
        println("Student marks- " + this.marks)
    }
}

class Student implements Marks {
    int StudentID
    int Marks1
}
