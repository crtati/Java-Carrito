
package lacompletaferia;

import java.util.Scanner;

/**
 *
 * @author Taty
 */
public class LaCompletaFeria {


    public static void main(String[] args) {
        Carrito carri = new Carrito();
        

        
        boolean flag = true;
        while (flag){
            //Menú
            carri.menú();
            Scanner sc = new Scanner(System.in);
            int menú = sc.nextInt();
            
            if (menú == 1){
                carri.agregarProducto(sc);
            }else if (menú == 2){
                carri.mostrarProducto();
            }else if (menú == 3){
                carri.eliminarProducto();
            }else if (menú == 4){
                System.out.println("Vuelva pronto");
                flag = false;
            }
        }

}
}
