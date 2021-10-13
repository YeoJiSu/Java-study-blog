public class School {
    private String name;
    private int limit;
    private Student[] students;
    private int studentCount;
    public String toString(){
        String msg = "School Name: "+ name+ " Student Count: "+ studentCount + "\n";
        for (int i = 0; i< studentCount ; i++){
            msg+="\t"+students[i]+"\n";
        }
        return msg;
    }
    public School(String name, int limit) {
        this.name = name;
        this.limit = limit;
        students = new Student[limit];
    }
    public Student findStudent(String studentName, int schoolYear){
        Student find = null;
        for (int i = 0; i< studentCount; i++){
            if (students[i].getName().equals(studentName)&& students[i].getYear()==schoolYear){
                find = students[i];
            }
        }
        return find;
    }

    public void removeAllStudent() {
        studentCount = 0;
    }

    public void addStudent(Student newStudent) {
        String name = newStudent.getName();
        Integer year =  newStudent.getYear();
        students[studentCount]= new Student(name,year);
        studentCount+=1;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass())return false;
        School sch = (School) o;
        boolean equal = name.equals(sch.name) && limit == sch.limit && students.equals(sch.students) && studentCount == sch.studentCount;
        return equal;
    }
    public int hashCode(){
        int result = 1;
        result = 31*result +name.hashCode();
        result = 31*result +Integer.valueOf(limit).hashCode();
        result = 31*result + students.hashCode();
        result = 31*result + Integer.valueOf(studentCount).hashCode();
        return result;
    }
}
