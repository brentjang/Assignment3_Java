import java.util.Scanner;
public class Foothill
{
   // food #1 constants
   static final String FOOD_1_NAME = "peanuts";
   static final double FOOD_1_CALORIES_P100G = 828;  // in calories
   static final double FOOD_1_PROTEIN_P100G = 37.7;   // in grams
   static final double FOOD_1_TOT_CARBS_P100G = 23.5;   // in grams
   static final double FOOD_1_TOT_FAT_P100G = 71.9;   // in grams
   
   // food #2 constants
   static final String FOOD_2_NAME = "duck eggs";
   static final double FOOD_2_CALORIES_P100G = 130;  // in calories
   static final double FOOD_2_PROTEIN_P100G = 9;   // in grams
   static final double FOOD_2_TOT_CARBS_P100G = 1;   // in grams
   static final double FOOD_2_TOT_FAT_P100G = 9.6;   // in grams
   
   // food #3 constants
   static final String FOOD_3_NAME = "bacon";
   static final double FOOD_3_CALORIES_P100G = 446;  // in calories
   static final double FOOD_3_PROTEIN_P100G = 15.4;   // in grams
   static final double FOOD_3_TOT_CARBS_P100G = 9.1;   // in grams
   static final double FOOD_3_TOT_FAT_P100G = 42.5;   // in grams
   
   // food #4 constants
   static final String FOOD_4_NAME = "lemons";
   static final double FOOD_4_CALORIES_P100G = 21.6;  // in calories
   static final double FOOD_4_PROTEIN_P100G = 1.3;   // in grams
   static final double FOOD_4_TOT_CARBS_P100G = 11.6;   // in grams
   static final double FOOD_4_TOT_FAT_P100G = 0.3;   // in grams
   
   static final String INDENT = "   ";
   static final String SEPARATOR = "\n";
   
   public static void main(String[] args)
   {
      String recipeName, userInputStr;
      int userInputInt;
      double totalCals, totalPro, totalCarbs, totalFat;
      double serveCals, servePro, serveCarbs, serveFat;
      Scanner inputStream = new Scanner(System.in);
      
      // initialize accumulator variables
      totalPro  = 0.;
      totalCals =  0;
      totalCarbs = 0;
      totalFat = 0;
      serveCals = 0;
      servePro = 0;
      serveCarbs = 0;
      serveFat = 0;
      
      // print menu
      System.out.println("------ List of Possible Ingredients -----");
      System.out.println(INDENT + "Food #1: " + FOOD_1_NAME);
      System.out.println(INDENT + "Food #2: " + FOOD_2_NAME);
      System.out.println(INDENT + "Food #2: " + FOOD_3_NAME);
      System.out.println(INDENT + "Food #3: " + FOOD_4_NAME + SEPARATOR);      
    
      // name of recipe
      System.out.print("What are you calling this recipe ? ");
      recipeName  = inputStream.nextLine();
      
      // food #1 --------------------------------------------------
      System.out.print("How many grams of " + FOOD_1_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      if (userInputInt < 0 || userInputInt > 1500)
      {
         System.out.print("This number is out of range.");
         inputStream.close();
         return;
      }
      else
      {
         // update accumulators
         totalCals += userInputInt * (FOOD_1_CALORIES_P100G / 100.);
         totalPro  += userInputInt * (FOOD_1_PROTEIN_P100G / 100.);
         totalCarbs += userInputInt * (FOOD_1_TOT_CARBS_P100G / 100.);
         totalFat  += userInputInt * (FOOD_1_TOT_FAT_P100G / 100.);
      }     

      // food #2 --------------------------------------------------
      System.out.print("How many grams of " + FOOD_2_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      if (userInputInt < 0 || userInputInt > 1500)
      {
         System.out.print("This number is out of range.");
         inputStream.close();
         return;
      }
      else
      {
         // update accumulators
         totalCals += userInputInt * (FOOD_2_CALORIES_P100G / 100.);
         totalPro  += userInputInt * (FOOD_2_PROTEIN_P100G / 100.);
         totalCarbs += userInputInt * (FOOD_2_TOT_CARBS_P100G / 100.);
         totalFat  += userInputInt * (FOOD_2_TOT_FAT_P100G / 100.);
      }   
      
      // food #3 --------------------------------------------------
      System.out.print("How many grams of " + FOOD_3_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      if (userInputInt < 0 || userInputInt > 1500)
      {
         System.out.print("This number is out of range.");
         inputStream.close();
         return;
      }
      else
      {
         // update accumulators
         totalCals += userInputInt * (FOOD_3_CALORIES_P100G / 100.);
         totalPro  += userInputInt * (FOOD_3_PROTEIN_P100G / 100.);
         totalCarbs += userInputInt * (FOOD_3_TOT_CARBS_P100G / 100.);
         totalFat  += userInputInt * (FOOD_3_TOT_FAT_P100G / 100.);
      }

      // food #4 --------------------------------------------------
      System.out.print("How many grams of " + FOOD_4_NAME + "? ");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      if (userInputInt < 0 || userInputInt > 1500)
      {
         System.out.print("This number is out of range.");
         inputStream.close();
         return;
      }
      else
      {
         // update accumulators
         totalCals += userInputInt * (FOOD_4_CALORIES_P100G / 100.);
         totalPro  += userInputInt * (FOOD_4_PROTEIN_P100G / 100.);
         totalCarbs += userInputInt * (FOOD_4_TOT_CARBS_P100G / 100.);
         totalFat  += userInputInt * (FOOD_4_TOT_FAT_P100G / 100.); 
      }      
     
      // compute number of servings
      // checks for numbers outside required range
      System.out.print("How many servings of " + recipeName + "?");
      userInputStr = inputStream.nextLine();
      userInputInt = Integer.parseInt(userInputStr);
      if (userInputInt > 15 || userInputInt < 1)
      {
         System.out.print("This number is out of range.");
         inputStream.close();
         return;
      }
      else
      {
         serveCals = totalCals / userInputInt;
         servePro  = totalPro / userInputInt;
         serveCarbs = totalCarbs / userInputInt;
         serveFat  = totalFat / userInputInt;  
         inputStream.close();
      }
           
      // report results -------------------------------------------
      System.out.println("\nNutrition for " + recipeName + "---------"); 
      System.out.println(INDENT + "Calories: " + totalCals);
      System.out.println(INDENT + "Protein: " + totalPro + " grams"); 
      System.out.println(INDENT + "Total Carbs: " + totalCarbs 
            + " grams");       
      System.out.println(INDENT + "Total Fat: " + totalFat + " grams");
 
      System.out.println("\nNutrition PER SERVING for " 
      + recipeName + "------------"); 
      System.out.println(INDENT + "Calories: " + serveCals);
      System.out.println(INDENT + "Protein: " + servePro + " grams"); 
      System.out.println(INDENT + "Total Carbs: " + serveCarbs 
            + " grams");       
      System.out.println(INDENT + "Total Fat: " + serveFat + " grams");
   }
}

/*
 *\\\\\\\\\\\\\\\\\\\\\\\\ PASTED OUTPUT /////////////////////////////
#RUN_1----------------------------------------------------------------
   ------ List of Possible Ingredients -----
   Food #1: peanuts
   Food #2: duck eggs
   Food #2: bacon
   Food #3: lemons

What are you calling this recipe ? Classic Eggs and Bacon
How many grams of peanuts? 0
How many grams of duck eggs? 150
How many grams of bacon? 200
How many grams of lemons? 0
How many servings of Classic Eggs and Bacon?2

Nutrition for Classic Eggs and Bacon---------
   Calories: 1087.0
   Protein: 44.3 grams
   Total Carbs: 19.7 grams
   Total Fat: 99.4 grams

Nutrition PER SERVING for Classic Eggs and Bacon------------
   Calories: 543.5
   Protein: 22.15 grams
   Total Carbs: 9.85 grams
   Total Fat: 49.7 grams
   
#RUN_2----------------------------------------------------------------
   ------ List of Possible Ingredients -----
   Food #1: peanuts
   Food #2: duck eggs
   Food #2: bacon
   Food #3: lemons

What are you calling this recipe ? The Special
How many grams of peanuts? 100
How many grams of duck eggs? 600
How many grams of bacon? 1200
How many grams of lemons? 20
How many servings of The Special?4

Nutrition for The Special---------
   Calories: 6964.32
   Protein: 276.76 grams
   Total Carbs: 141.01999999999998 grams
   Total Fat: 639.56 grams

Nutrition PER SERVING for The Special------------
   Calories: 1741.08
   Protein: 69.19 grams
   Total Carbs: 35.254999999999995 grams
   Total Fat: 159.89 grams
   
#RUN_3----------------------------------------------------------------
   ------ List of Possible Ingredients -----
   Food #1: peanuts
   Food #2: duck eggs
   Food #2: bacon
   Food #3: lemons

What are you calling this recipe ? Non-vegan Bacon
How many grams of peanuts? 50
How many grams of duck eggs? 0
How many grams of bacon? 1000
How many grams of lemons? 0
How many servings of Non-vegan Bacon?3

Nutrition for Non-vegan Bacon---------
   Calories: 4874.0
   Protein: 172.85 grams
   Total Carbs: 102.75 grams
   Total Fat: 460.95 grams

Nutrition PER SERVING for Non-vegan Bacon------------
   Calories: 1624.6666666666667
   Protein: 57.61666666666667 grams
   Total Carbs: 34.25 grams
   Total Fat: 153.65 grams
   
#RUN_4----------------------------------------------------------------
   ------ List of Possible Ingredients -----
   Food #1: peanuts
   Food #2: duck eggs
   Food #2: bacon
   Food #3: lemons

What are you calling this recipe ? Candied Peanuts
How many grams of peanuts? 750
How many grams of duck eggs? 0
How many grams of bacon? 0
How many grams of lemons? 250
How many servings of Candied Peanuts?10

Nutrition for Candied Peanuts---------
   Calories: 6263.999999999999
   Protein: 286.0 grams
   Total Carbs: 205.25 grams
   Total Fat: 540.0000000000001 grams

Nutrition PER SERVING for Candied Peanuts------------
   Calories: 626.3999999999999
   Protein: 28.6 grams
   Total Carbs: 20.525 grams
   Total Fat: 54.000000000000014 grams

#RUN_5----------------------------------------------------------------
   ------ List of Possible Ingredients -----
   Food #1: peanuts
   Food #2: duck eggs
   Food #2: bacon
   Food #3: lemons

What are you calling this recipe ? Error Recipe
How many grams of peanuts? 20
How many grams of duck eggs? 0
How many grams of bacon? 50
How many grams of lemons? 30
How many servings of Error Recipe?20
This number is out of range. 
*/

