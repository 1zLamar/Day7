public class Employee {

    String id;
    String name;
    int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {

        return id;
    }
    public String getName() {

        return name;
    }
    public int getSalary() {

        return salary;
    }
    public int getAnnualSalary() {

        return salary*12;
    }

    public int raisedSalary(int percent){
        return (salary*percent)/100;
    }
    public String toString(){
        return "\nId: " + id + ' ' +
                "\nName: "+name+' '+
                "\nSalary: " + salary + "";
    }


}
