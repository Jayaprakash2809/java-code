class EmployeeL
{
    public static void main(String args[]){
        Employee E = new Employee();
        E.e_name="jai";
        E.gender="male";
        E.age=22;
        System.out.println(E.e_name);
        System.out.println(E.gender);
        System.out.println(E.age);
        E.work();
        E.skill();
        E.role();
    }
}