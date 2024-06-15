package lesson_2_2

fun main (){

    val mainEmployee = 50
    val mainEmployeeSalary = 50000
    val trainee = 30
    val traineeSalary = 30000

    val expenseMainSalary = mainEmployee * mainEmployeeSalary
    val generalExpenseSalary = (expenseMainSalary + (trainee * traineeSalary))
    val middleSalary = (generalExpenseSalary / (mainEmployee + trainee))

    println("Расходы на зарплату основных сотрудников составляют: $expenseMainSalary$")
    println("Общий расход на зарплату основных сотрудников и стажеров составляет: $generalExpenseSalary$")
    println("Средняя зарплата сотрудника в организации составляет: $middleSalary")
}