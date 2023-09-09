
package Controller;


import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

public class SearchingProgramming extends Menu<String> {

    static String[] mc = {"Search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SearchingProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
        
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1: search();     break;
            case 2: System.exit(0);
            default : System.out.println("Invalid choice, try enter again !");
        }
    }



    public void search() {
        final String[] mcSearch = {"Linear Search", "Binary Search", "Exit"};
        class SearchMenu extends Menu<String> {

            public SearchMenu() {
                super("Search Option", mcSearch);
            }

            @Override
            public  void execute(int n) {
                switch (n) {
                    case 1-> {   
                        System.out.println("The array has been created:");
                        library.display(array);
                        int x  = library.checkInt("Enter a number to find:");
                        int result = algorithm.linearSearch(array, x);
                        if (result != -1 ){
                            System.out.format("%d found at index %d\n ",x, result);
                        }else {
                            System.out.println("No number found in the array");
                        }
   
                        break;
                    }
                    case 2-> {
                        System.out.println("Unsorted Array:");
                        library.display(array);
                        algorithm.bubbleSort(array);
                        System.out.println("Sorted Array");
                        library.display(array);
                        
                        int x = library.checkInt("Enter a number to find:");
                        int result = algorithm.binarySearch(array, x, 0, array.length -1);
                        if (result != -1 ){
                            System.out.format("%d found at index %d\n ",x , result);
                        }else {
                            System.out.println("No number found in the array");
                        }
                    }    
                    case 3 -> {
                        System.exit(0);
                        break;
                    }
                }
            }
        }
        SearchMenu sm = new SearchMenu();
        sm.run();
    }
}