public class Student {
    private String name;
    private int year;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
    public String toString(){
        String format = String.format("[%s, %d학년]",name, year);
        return format;
    }
    public boolean equals(Object o){
        if (this == o)return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Student std = (Student) o;
        return name.equals(std.name) && year==std.year;
    }
    public int hashCode(){
        int result = 1;
        result = 31*result + name.hashCode();
        result = 31*result + Integer.valueOf(year).hashCode();
        return result;
    }
}
