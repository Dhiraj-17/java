public class variable {

    public static void main(String[] args) {
       byte numberOfSeats = 5;
       byte numberOfDoors = 2;
       byte numberOfVehicleOwner = 1;
       byte emissionSticker = 4;

       short power = 362;
       short horsepower = 495;
       short co2Emission = 111;
       short cubicCapacity = 111;

       int price = 29999;
       int mileage = 14888;

       long registrationNumber = 2587941263255145L;

       float fuelConsumptionCombined = 15.5F;
       float fuelConsumptionUrban = 21.1F;
       float fuelConsumptionExtraUrban = 13.6F;

       double fuelConsumptionPreciseAverage = 1523489247815495e-1;

       boolean isDamaged = true;

       char energyEfficiencyCategory = 'H';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + "km");
        System.out.println("The Car is Damaged: " + isDamaged);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity + "ccm");
        System.out.println("Power: " + power + "kWh (" + horsepower +"hp)");
        System.out.println("CO2 Emission: " + co2Emission + " g/km");
        System.out.println("Emission Sticker: " + emissionSticker + " ( Energy Efficiency Category: "+ energyEfficiencyCategory + ")");
        System.out.println("Combined Fuel Consumption: " + fuelConsumptionCombined + " l/100km");
        System.out.println("Combined Fuel Consumption Urban: " + fuelConsumptionUrban + " l/100km");
        System.out.println("Combined Fuel Consumption Extra Urban: " + fuelConsumptionExtraUrban + " l/100km");
        System.out.println("Precise Average Fuel Consumption Urban: " + fuelConsumptionPreciseAverage + " l/100km");
        System.out.println("Number of Vehicle owners: " + numberOfVehicleOwner );
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Category: " + energyEfficiencyCategory);

        System.out.println("conversion");
        short newNumberOfSeats = numberOfSeats;
        System.out.println("The New Number of Seats: =" + newNumberOfSeats);

        double newFuelConsumptionCombined = fuelConsumptionCombined;
        System.out.println("The New Fuel Consumption: =" + fuelConsumptionCombined +" l/100km");

        byte newPower = (byte) power;
        System.out.println("The New Power: =" + newPower +"kw");
        }
    }




