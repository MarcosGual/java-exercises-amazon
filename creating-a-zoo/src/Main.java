import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + tigerObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);

                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter age: ");
                                tigerObject.setAge(keyboard.nextInt());
                                System.out.println("Enter height: ");
                                tigerObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter weight: ");
                                tigerObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter speed: ");
                                tigerObject.setSpeed(keyboard.nextInt());
                                System.out.println("Enter number of stripes: ");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter sound level of roar: ");
                                tigerObject.setSoundLevelOfRoar(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.print("Age: "+tigerObject.getAge()+". ");
                                System.out.print("Weight: "+tigerObject.getWeight()+". ");
                                System.out.print("Height: "+tigerObject.getHeight()+". ");
                                System.out.print("Speed: "+tigerObject.getSpeed()+". ");
                                System.out.print("Number of stripes: "+tigerObject.getNumberOfStripes()+". ");
                                System.out.print("Sound level of roar: "+tigerObject.getSoundLevelOfRoar()+". ");
                                break;
                            case 3:
                                tigerObject.walking();
                                break;
                            case 4:
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);

                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter age: ");
                                dolphinObject.setAge(keyboard.nextInt());
                                System.out.println("Enter height: ");
                                dolphinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter weight: ");
                                dolphinObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter swimming speed: ");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                System.out.println("Enter color of dolphin: ");
                                dolphinObject.setColorOfDolphin(keyboard.next());
                                break;

                            case 2:
                                System.out.print("Age: "+dolphinObject.getAge()+". ");
                                System.out.print("Weight: "+dolphinObject.getWeight()+". ");
                                System.out.print("Height: "+dolphinObject.getHeight()+". ");
                                System.out.print("Color of dolphin: "+dolphinObject.getColorOfDolphin()+". ");
                                System.out.print("Swimming speed: "+dolphinObject.getSwimmingSpeed()+". ");
                                break;
                            case 3:
                                dolphinObject.swimming();
                                break;
                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                case 3:
                    do {
                        System.out.println("The animal which is chosen is : " + penguinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);

                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter age: ");
                                penguinObject.setAge(keyboard.nextInt());
                                System.out.println("Enter height: ");
                                penguinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter weight: ");
                                penguinObject.setWeight(keyboard.nextInt());
                                System.out.println("Is the penguin swimming? (true/false)");
                                penguinObject.setSwimming(keyboard.nextBoolean());
                                System.out.println("Enter swimming speed: ");
                                penguinObject.setSwimSpeed(keyboard.nextInt());
                                System.out.println("Enter walking speed: ");
                                penguinObject.setWalkSpeed(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.print("Age: "+penguinObject.getAge()+". ");
                                System.out.print("Weight: "+penguinObject.getWeight()+". ");
                                System.out.print("Height: "+penguinObject.getHeight()+". ");
                                System.out.print("Walking speed: "+penguinObject.getWalkSpeed()+". ");
                                System.out.print("Swimming speed: "+penguinObject.getSwimSpeed()+". ");
                                break;
                            case 3:
                                if(penguinObject.isSwimming()){
                                    penguinObject.swimming();
                                }else{
                                    penguinObject.walking();
                                }
                                break;
                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal (1-3):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}



