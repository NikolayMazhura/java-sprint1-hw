import java.util.Scanner;

public class Converter {
  int converterToKm(int steps) {
      int km = (steps*75)/1000;
   return km;
}
int convertStepsToKilocalories(int steps) {
      int kcal = (steps*50)/1000;
      return kcal;
}
 double averageSteps( int steps) {

     double averS = (double) steps/30;
      return averS;

}
}
