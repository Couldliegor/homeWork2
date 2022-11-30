public class SixEight {
    public static void main(String[] args) {
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
            System.out.println("Общий вес двух бойцов: " + secondBoxerWeight % firstBoxerWeight);
                System.out.println("Общий вес двух бойцов: " + (secondBoxerWeight - firstBoxerWeight)); // или

        //Задача 8

        int countOfWorkingHours = 640;
        int hoursPerPerson = 8;
        int countOfWorkers = countOfWorkingHours / hoursPerPerson;
            System.out.println("Всего работников в компании - " + countOfWorkers + " человек");

        // Задача 8/2

        countOfWorkers = countOfWorkers + 94;
        countOfWorkingHours = hoursPerPerson * countOfWorkers;

        System.out.println("Если в компании работает " + countOfWorkers + " человек, то всего " + countOfWorkingHours + " часов работы может быть поделено между сотрудниками." );
    }
}
