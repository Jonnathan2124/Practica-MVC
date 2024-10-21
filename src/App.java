

import Controllers.*;
import Views.View;

public class App {
    public static void main(String[] args) throws Exception {
        
        ///CREAR LA VISTA
        View vista = new View();

        ///Crear las clases con los metodos de ordenamiento y busqueda
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();
        
        /// Crear el controlador
        Controllers controller = new Controllers(vista, sortingMethods, searchMethods);
    }
}
