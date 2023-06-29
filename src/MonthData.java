import java.util.Scanner;

public class MonthData {
     int[] days = new int[30];


     void printDaysAndStepsFromMonth() {
          for (int i = 0; i <days.length; i++) {
               System.out.println((i + 1) + "День:" + days[i]);
          }
     }

     int sumStepsFromMonth() {
          int sumSteps = 0;
          for (int i = 0; i < days.length; i++) {
               sumSteps = days[i] + sumSteps;
          }
          return sumSteps;
     }
     public int bestSeries(int goalByStepPerDay) {
          int currentSeries = 0;
          int finalSeries = 0;
          for (int i = 0; i < days.length; i++){
          if (days[i] >= goalByStepPerDay) {
               currentSeries =  currentSeries + 1;
          } else if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
               } else {
               currentSeries = 0;
          }
          }
          return finalSeries;
     }
     int maxSteps() {
          int maxSteps = 0;
          for (int i = 0; i < days.length; i++) {
               if(days[i] > maxSteps) {
                    maxSteps = days[i];
               }

          }
          return maxSteps;
     }

}