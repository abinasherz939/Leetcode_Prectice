package com.company;

public class enumCode {

//    public enum level{
//        high, medium, low;
//    }
    public enum coffeesize{

        BIG (8), HUGE(10), OVERWHELMING(16);

    private final int ounces;

    coffeesize(int ounces) {
        this.ounces = ounces;
    }

    public int getOunces(){
        return ounces;
    }
}

//    public static void main(String[] args) {


//        level levelLowenum = level.low;
//        System.out.println(levelLowenum);


//        coffeesize size = coffeesize.BIG;
//        System.out.println(size.ounces+ " " + size);
//
//
//
//   }
}

class coffee{
    enumCode.coffeesize size;

    public static void main(String[] args) {
        coffee drink1 = new coffee();
        drink1.size = enumCode.coffeesize.BIG;
        coffee drink2 = new coffee();
        drink2.size = enumCode.coffeesize.OVERWHELMING;
        System.out.println(drink1.size +"\n"+ drink2.size);

        enumCode.coffeesize arr[] = enumCode.coffeesize.values();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + arr[i].ordinal()+ "");
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(enumCode.coffeesize.valueOf(String.valueOf(arr[i])).getOunces());
            System.out.println(enumCode.coffeesize.valueOf(arr[i].toString()).getOunces());
        }
        for (enumCode.coffeesize value :
                enumCode.coffeesize.values()) {
            System.out.println(value);
            System.out.println(value.getOunces());
            System.out.println(enumCode.coffeesize.valueOf(value.toString()));//doubt

            System.out.println(value.ordinal());
        }

    }

}
