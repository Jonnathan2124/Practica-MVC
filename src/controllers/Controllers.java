package Controllers;

import Models.Person;
import Views.View;
import javax.sound.sampled.SourceDataLine;


public class Controllers {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    private Person[] personas;

    public Controllers(View view, SortingMethods sortingMethods, SearchMethods searchMethods){
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        System.out.println("Controller created");
    }
    
}
