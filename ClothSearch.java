import java.util.Scanner;
class ClothSearch {
    public static void main(String[] args) {
        int x = 0;
        int menuChoice = -1;
        Scanner input = new Scanner(System.in);
        Cloth[] clothArray = new Cloth[10]; // Array to store cloth objects

        try {
            do {
                System.out.println("\n\t~Welcome to our Shop~\n");
                System.out.println("\t\tCloth Menu:");
                System.out.println("\t\t1. Add Cloth");
                System.out.println("\t\t2. Exit\n");
                System.out.println("Choose an option:");
                menuChoice = input.nextInt();

                if (menuChoice == 1) {
                    if (x < 10) {
                        System.out.println("Cloth name:");
                        String clothName = input.next();
                        System.out.println("Cloth Type:");
                        String clothType = input.next();
                        System.out.println("Cloth Quantity:");
                        int clothQuantity = input.nextInt();
                        System.out.println("Cloth Price:");
                        String clothPrice = input.next();
                        System.out.println("Cloth Order:");
                        String clothOrder = input.next();

                        Cloth c = new Cloth(clothName, clothType, clothQuantity, clothPrice, clothOrder);
                        clothArray[x] = c;
                        x++;
                    } else {
                        System.out.println("Failed. Can't add any more Cloth.");
                    }
                } else if (menuChoice == 2) {
                    for (int i = 0; i < x; i++) {
                        Cloth c = clothArray[i];
                        System.out.println("Cloth name: " + c.getClothName());
                        System.out.println("Cloth type: " + c.getClothType());
                        System.out.println("Cloth Quantity: " + c.getClothQuantity());
                        System.out.println("Cloth price: " + c.getClothPrice());
                        System.out.println("Cloth order: " + c.getClothOrder());
                        System.out.println();
                    }
                } else if (menuChoice < 1 || menuChoice > 2) {
                    System.out.println("Please re-enter a valid menu choice.");
                }
            } while (menuChoice != 2);
        } finally {
            input.close();
        }
    }
}
