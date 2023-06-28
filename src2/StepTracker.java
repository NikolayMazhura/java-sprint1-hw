import java.util.Scanner;
public  class StepTracker {
    MonthData[] monthToData = new MonthData[12];
     Scanner scanner;

    Converter converter = new Converter();
    private int goalByStepsPerDay;


    StepTracker(Scanner scan) {
        this.scanner = scan;
        this.goalByStepsPerDay = 10000;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца где 1 - это январь. а 12 - это декабрь");
        int month = scanner.nextInt();
        if (month <= 0) {
            System.out.println("Месяца начинаются с 0!");
        } else if (month >= 13) {
            System.out.println("Число не может быть выше 12!");

        } else {
            System.out.println("Введите день от 1 до 30 (включительно)");
            int days = scanner.nextInt();
            if (days <= 0) {
                System.out.println("Число не может быть ниже или равно 0!");

            } else if (days > 30) {
                System.out.println("Число не может быть выше 30 !");

            } else {
                System.out.println("Введите количество шагов");
                int steps = scanner.nextInt();
                if (steps <= 0) {
                    System.out.println("Число не может быть ниже 0 или меньше 0");
                }

                MonthData monthData = monthToData[month - 1];
                monthData.days[days - 1]=steps;


            }
        }



    }
     void changeStepGoal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите новую цель : ");
        int newGoal = scanner.nextInt();

        if (newGoal <= 0) {
            System.out.println("Цель не может быть меньше или равна 0!");
        } else {
            this.goalByStepsPerDay = newGoal;
            System.out.println("Цель успешно изменена.");
        }
    }
        void printStatistic () {

            System.out.println("Введите число месяца:");
            int command = scanner.nextInt();
            if (command <= 0) {
                System.out.println("Число не может быть ниже или равно 0!");
            } else if (command >= 13) {
                System.out.println("Число не может быть выше 12!");
            }
                MonthData monthData = monthToData[command -1];
                int sumStep = monthData.sumStepsFromMonth();
                monthData.printDaysAndStepsFromMonth();
                System.out.println("Общее кол-во шагов за весь месяц : " + monthData.sumStepsFromMonth());
                System.out.println("Максимальное кол-во шагов за месяц : " + monthData.maxSteps());
                System.out.println("В среднем вы прошли " + converter.averageSteps(sumStep) + " шагов");
                System.out.println("Вы прошли " + converter.converterToKm(sumStep) + " километров");
                System.out.println("Вы сожгли " + converter.convertStepsToKilocalories(sumStep) + " килокалорий");
                System.out.println("Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));
            }
        }






