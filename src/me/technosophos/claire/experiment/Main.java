package me.technosophos.claire.experiment;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Chair my_chair = new Chair("neon orange");
        System.out.print(" Me: My chair is " + my_chair.color);
        //my_chair.legs = 2;
        System.out.println(" and has " + my_chair.legs + " legs.");
        //notebook my_n = new notebook();
        //System.out.print(my_n.toString());
        if (my_chair.legs >6) {
            System.out.print("Dad: That's a lot of legs!");

        }
    }
}
