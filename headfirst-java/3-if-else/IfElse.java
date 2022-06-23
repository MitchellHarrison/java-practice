// if/else demo
class IfElse {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("x is large");
        } else {
            // this line shouldn't run
            System.out.println("x is small");
        }

        if ((x > 5) && (x < 15)) {
            System.out.println("x is bigger than 5 but less than 15");
        } else {
            // this line shouldn't run
            System.out.println("this line should never run");
        }
    }
}
