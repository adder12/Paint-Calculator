
import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {

      // final int paintCanVol = 1000;
       final int paintVolNeeded = 100;
        Scanner scan = new Scanner(System.in);
        Paint[] paintTypes = setPaints();
        Paint chosenPaint = choosePaint(paintTypes,scan);


       /*
        paintTypes[0] =  new Paint("ownBrand", 10.2, 2000);
        paintTypes[1] = new Paint("dulux", 20.5, 1000);
        paintTypes[2] = new Paint("royal", 50, 750);
*/

/*
        boolean paintCorrect = false;
        System.out.println("We have " + paintTypes.length + " types of paint for you today, we have:");
        for(int i = 0; i <= paintTypes.length -1;i++){
            System.out.println(i+ ": Name: " + paintTypes[i].getName() + " | Cost per Can: " + paintTypes[i].getCostPerCan() + " | The size of each can is: " + paintTypes[i].getCanSizeMl());
        }
        System.out.println("Please enter the name of the paint you would like!");

        String chosenPaint = "";
       do {
           chosenPaint = scan.nextLine();


           switch (chosenPaint.toLowerCase()){
               case "ownBrand","dulux","farrow":
                   paintCorrect = true;
                   break;
               default:
                   System.out.println("Your entry was not a supported paint type, please enter one of the paint types on offer");
                   //System.out.println(paintCorrect);
           }



       } while (paintCorrect == false);

*/
        System.out.println("please enter the number of walls");
        int wallCount = scan.nextInt();

        //double[] lengthArray = new double[wallCount];
       // double[] heightArray = new double[wallCount];
        //double[] wallArea = new double[wallCount];
        double totalArea;

        /*int wallNumber = 0;
        for(int i = 0;i < wallCount;i++){
            wallNumber++;
            System.out.println("Please enter the length of wall number: " + wallNumber );
            lengthArray[i] = scan.nextDouble();
            System.out.println("Please enter the height of wall number: " + wallNumber);
            heightArray[i] = scan.nextDouble();
            wallArea[i] = lengthArray[i] * heightArray[i];
            totalArea += wallArea[i];
        }
*/

        totalArea = calculateArea(wallCount, scan);
        double paintNeeded = totalArea * paintVolNeeded;

        int cansNeeded = (int) Math.ceil(paintNeeded/chosenPaint.getCanSizeMl());
        System.out.println("In total to paint all " + wallCount + " walls, you will need " + paintNeeded + "mls of paint! With a can size of " + chosenPaint.getCanSizeMl() + "ml, you will need " + cansNeeded + " cans of " + chosenPaint.getName());

        }

        public static Paint[]  setPaints(){
        Paint[] paints = new Paint[3];
            paints[0] =  new Paint("ownBrand", 10.2, 2000);
            paints[1] = new Paint("dulux", 20.5, 1000);
            paints[2] = new Paint("royal", 50, 750);
            return paints;
        }

        public static Paint choosePaint(Paint[] paintTypes,  Scanner scan){
            //Scanner scan = new Scanner(System.in);
            Paint chosenPaint = null;
            boolean paintCorrect = false;
            System.out.println("We have " + paintTypes.length + " types of paint for you today, we have:");
            for(int i = 0; i <= paintTypes.length -1;i++){
                System.out.println(i+ ": Name: " + paintTypes[i].getName() + " | Cost per Can: " + paintTypes[i].getCostPerCan() + " | The size of each can is: " + paintTypes[i].getCanSizeMl());
            }
            System.out.println("Please enter the name of the paint you would like!");

            String chosenPaintStr;
            do {
                chosenPaintStr = scan.nextLine();




                switch (chosenPaintStr.toLowerCase()){
                    case "ownbrand":
                        chosenPaint = paintTypes[0];
                        paintCorrect = true;
                        break;
                    case "dulux":
                        chosenPaint = paintTypes[1];
                        paintCorrect = true;
                        break;
                    case "royal":
                        chosenPaint = paintTypes[2];
                        paintCorrect = true;
                        break;
                    default:
                        System.out.println("Your entry was not a supported paint type, please enter one of the paint types on offer");
                        //System.out.println(paintCorrect);
                }



            } while (!paintCorrect);
        return chosenPaint;
        }
        public static double calculateArea (int numWalls, Scanner scan){
        boolean[] obstruction = new boolean[numWalls];
        double area = 0;


        Wall[] walls = new Wall[numWalls];


        for(int i = 0; i < numWalls; i++){
            System.out.println("Please enter the length of wall " + numWalls+1);
            double length = scan.nextDouble();

            System.out.println("Please enter the height of wall " + numWalls+1);
            double height = scan.nextDouble();

            System.out.println("How many Obstructions does this wall have?");
            int obstructCount = scan.nextInt();


            if(obstructCount != 0){
                Obstruction[] obstructions = new Obstruction[obstructCount];
                obstruction[i] = true;
                for(int j = 0;j< obstructCount;j++){
                    System.out.println("please enter the length of the next obstruction");
                    double obsLength = scan.nextDouble();
                    System.out.println("please enter the height of the next obstruction");
                    double obsHeight = scan.nextDouble();


                    obstructions[j] = new Obstruction(obsLength, obsHeight);

                }

                walls[i] = new Wall(length, height, obstructions);
            }else{
                walls[i] = new Wall(length,height);
            }


        }
        for(int k = 0; k < numWalls; k++){
            area += walls[k].getArea();
            if(obstruction[k]){
                for(int l = 0;l < walls[k].getSingleObstruction(l).getLength();l++){
                    area += walls[k].getSingleObstruction(l).getArea();
                }
            }
        }
            return area;
        }




/*
        System.out.println("Enter the length of the wall in meters");
        double wallLength = scan.nextDouble();
        System.out.println("Enter the height of the wall in meters");
        double wallHeight = scan.nextDouble();
        double wallArea = wallHeight * wallLength;
        double totalPaint = wallArea * paintVolNeeded;
        System.out.println("The total paint you need to paint this wall is " + totalPaint + "ml");

*/
/*
        int numberOfWalls = 4;

        float wallLength = 3.1f;

        float wallHeight = 2.5f;

        float wallArea = wallHeight * wallLength;

        float totalPaint = wallArea * numberOfWalls * paintVolNeeded;

        System.out.println("The total volume of paint needed for this wall is " + totalPaint + "ml");
*/

/*
        System.out.println("Enter the surface area of your walls in meters squared");
        double wallArea = scan.nextDouble();
        System.out.println("Enter the surface area of your ceiling in meters squared");
        double ceilArea = scan.nextDouble();

        double wallPaintNeeded = wallArea * paintVolNeeded;
        double ceilPaintNeeded = ceilArea * paintVolNeeded;
        double totalPaint = ceilPaintNeeded + wallPaintNeeded;

        System.out.println("The total number of paint that you require is " + totalPaint + "ml");

*/
    }
