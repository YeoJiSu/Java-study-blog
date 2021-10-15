public class Professor extends Person{
    private String schoolName;
    private String major;
    public Professor(String name, int age, String address, String schoolName, String major){
        super(name, age, address);
        this.schoolName = schoolName;
        this.major = major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public String toString() {
        return String.format("%s, %d, %s, %s, %s",getName(),getAge(),getAddress(),schoolName, major );
    }
    public boolean equals(Object o){
        if(this == o)return true;
        if (o == null)return false;
        if (this.getClass()!= o.getClass()) return false;
        Professor pro = (Professor) o;
        return getName().equals(pro.getName())&&
                getAge() == pro.getAge() &&
                getAddress().equals(pro.getAddress()) &&
                schoolName.equals(pro.schoolName) &&
                major.equals(pro.major);
    }

}
