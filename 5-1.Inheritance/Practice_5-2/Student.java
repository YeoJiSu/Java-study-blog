public class Student extends Person {
    private String schoolName ;
    private Grade grade ;
    public Student(String name, int age, String address, String schoolName) {
        super(name, age, address) ;
        this.schoolName = schoolName ;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s, %s, %s",
                getName(), getAge(), getAddress(), schoolName, grade) ;
    }
    public boolean equals(Object o) {
        if(this == o)return true;
        if (o == null)return false;
        if (this.getClass()!= o.getClass()) return false;
        Student std = (Student) o;
        return  getName().equals(std.getName()) &&
                getAge()==std.getAge() &&
                getAddress().equals(std.getAddress())&&
                schoolName.equals(std.schoolName);
    }
}
