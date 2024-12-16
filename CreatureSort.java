import java.util.Stack;

public class CreatureSort {

    static class Creature {
        String name;
        int powerLevel;

        Creature(String name, int powerLevel) {
            this.name = name;
            this.powerLevel = powerLevel;
        }
        public String toString() {
            return name + " = " + powerLevel;
        }
    }

    public static void main(String[] args) {
        // CREATE AN ARRAY OF CREATURES WITH THEIR RESPECTIVE POWER LEVELS
        Creature[] creatures = {
            new Creature("Dragon", 95),
            new Creature("Griffin", 88),
            new Creature("Unicorn", 78),
            new Creature("Phoenix", 92),
            new Creature("Centaur", 85)
        };

       // BUBBLE SORT TO SORT CREATURES BY POWER LEVEL IN DESCENDING ORDER
        bubbleSortDescending(creatures);
        System.out.println("BUBBLE SORTt: Descending Order by Power Level ");
        // Display the sorted creatures
        displayArray(creatures);

        // SELECTION SORT TO SORT CREATURES BY POWER LEVEL IN ASCENDING ORDER
        selectionSortAscending(creatures);
        System.out.println("\n SELECTION SORT: Ascending Order by Power Level");
        // Display the sorted creatures
        displayArray(creatures);

        // STACK TO REVERSE THE SORTED ORDER AND DISPLAY CREATURES
        Stack<Creature> creatureStack = new Stack<>();
        for (Creature creature : creatures) {
        // Push each creature onto the stack   
            creatureStack.push(creature);

        
        }

        System.out.println("\n STACK IMPLEMENTATION: Popping Creatures");
    // POP EACH CREATURE FROM THE STACK AND DISPLAY   
        while (!creatureStack.isEmpty()) { 
            System.out.println("Popped: " + creatureStack.pop());
        }
    }

    // BUBBLE SORT IMPLEMENTATION (DESCENDING ORDER)
    public static void bubbleSortDescending(Creature[] array) { 
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {// Iterate through the array
            for (int j = 0; j < n - 1 - i; j++) {
    // SWAP ADJACENT ELEMENTS IF THEY ARE IN THE WRONG ORDER           
                if (array[j].powerLevel < array[j + 1].powerLevel) { 
                    Creature temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // SELECTION SORT IMPLEMENTATION (ASCENDING ORDER)
    public static void selectionSortAscending(Creature[] array) { 
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
    // FIND THE MINIMUM ELEMENT IN THE UNSORTED PART OF THE ARRAY        
            for (int j = i + 1; j < n; j++) { 
                if (array[j].powerLevel < array[minIdx].powerLevel) {
                    minIdx = j;
                }
            }
    // SWAP THE FOUND MINIMUM ELEMENT WITH THE FIRST ELEMENT IN THE UNSORTED PART       
            Creature temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

   // DISPLAY ARRAY
    public static void displayArray(Creature[] array) { 
        for (Creature creature : array) {        
   //PRINT EACH CREATURE'S NAME AND POWER LEVEL   
            System.out.println(creature); 
        }
    }
}
