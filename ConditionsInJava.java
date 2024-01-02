public class ConditionsInJava {
    public static void main(String[] args) {
        // Syntax of the statement
        // if (condition) {
        // body
        // }else{
        // body
        // }
        int salary = 25000;
        // if (salary > 20000) {
        // salary += 2000;
        // System.out.println(salary);
        // } else {
        // System.out.println(salary);
        // }

        // Multiple if-elses
        if (salary > 1000 && salary < 20000) {
            salary += 2000;
            System.out.println(salary);
        } else if (salary > 20000) {
            salary += 5000;
            System.out.println(salary);
        } else {
            System.out.println(salary);
        }

    }
}
