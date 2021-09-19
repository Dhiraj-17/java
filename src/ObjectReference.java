import java.util.Locale;

public class ObjectReference {

     public static void main(String[] args) {
          Byte numberOfSeats =5;
          Short horsePower = 392;
          Integer price = 14999;
          Long registrationNumber = 248624577321258572L;

          Float fuelConsumptionCombined = 15.5F;
          Double fuelConsumptionPrecise = 15.234656568956269329559625626456;

          Boolean isDamaged= true;
          Character energyEfficiency = 'G';

          String carModel = "DodgeChallenger SRT 392";
          String carModelNew = new String( "DodgeChallenger SRT 392");

          System.out.println("Number Of Seats =" +numberOfSeats);
          System.out.println("Horse Power =" +horsePower);
          System.out.println("Price: $" +price.floatValue());
          System.out.println("Registration Number: " +registrationNumber);
          System.out.println("Fuel Consumption Combined :" + fuelConsumptionCombined);
          System.out.println("Fuel Consumption Precise: " +fuelConsumptionPrecise.intValue());
          System.out.println("Is Damaged: " + isDamaged);
          System.out.println("Energy Efficiency: "+ energyEfficiency);

          System.out.println("The Car Model:" +carModel);
          System.out.println("The New Car Model with UPPERCASE: " +carModel.toUpperCase());
          System.out.println("The New Car Model with lowercase: " +carModel.toLowerCase());
          System.out.println("Car Model and car Model with new keyword are equals: " +carModel.equals(carModelNew));
          System.out.println("The car model with new keyword: " +carModelNew);

     }

}
