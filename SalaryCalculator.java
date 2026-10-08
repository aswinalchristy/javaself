 class SalaryCalculator {
    
    public static void calculateSalary() {
        double basicSalary = 30000.0;
        double hra = 5000.0;
        double da = 3000.0;
        double deductions = 2000.0;
        double netSalary = (basicSalary + hra + da) - deductions;
        System.out.println("Net Salary: " + netSalary);
    }

    public static void main(String[] args) {
        calculateSalary();
    }
}

