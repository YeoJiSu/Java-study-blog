public class Employee {
    private final String name;
    private final Double salary;

    public Employee(String name ,Double salary ){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public Double getSalary(){
        return salary;
    }


    @Override
    public String toString(){
        String format = String.format("%s %.1f",name, salary);
        return format;
    }

    @Override
    public boolean equals(Object o){
       if (this == o) return true;
       if (o == null) return false;
       if (this.getClass() != o.getClass()) return false;
        Employee emp = (Employee) o;
        return name.equals(emp.name) && salary.equals(emp.salary);
    }
    public int hashCode(){
        int result =1;
        result = 31*result +name.hashCode();
        result = 31*result +Double.valueOf(salary).hashCode();
        return result;
    }
}
