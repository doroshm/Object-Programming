public class Lab2_2 {
    public static void main(String[] args) {
        int x = 1; //declares a starting integers
        
        //loop to use 5 lines
        for (int i = 0; i < 5; i++) { 
            
            //loop for printing j incrementing using the x as the lowerbound and x + 4 as the outerbound
            for (int j = x; j <= x + 4; j++) { 
                System.out.print(j + " "); //prints j
            }
            System.out.println(); //forces to code to a new line
            x++; //increments x to start at new # for the next line
        }
    }
}