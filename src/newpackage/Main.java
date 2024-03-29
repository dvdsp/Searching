package newpackage;

import Common.Library;
import Controller.SearchingProgramming;
import Model.Element;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSize_array(library.getInt("Enter number of array", 1, 100));
        //2. Create array by generate random integer in range
        element.setArray(library.createArray(element.size_array));
        new SearchingProgramming(element).run();
    }
}
