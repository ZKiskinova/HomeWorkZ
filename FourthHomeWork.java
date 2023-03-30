package fouth;

public class FourthHomeWork {

    public static void main(String[] args) {
        printIterator(20);
        int[] defaultValues = new int [20];
        int i = 0;


        while (i < defaultValues.length){
            System.out.println("The product of index " + i +  " and integer 5 is: " + i*5);
            i++;

        }

    }
        public static void printIterator(int index) {
            int printing = 0;
            int iterator = index;

            do {
                printing += iterator;
                iterator--;
            }while(iterator>0);

            System.out.printf("Sum of all %s indexes is: %s\n", index, printing);
        }
        }





