/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import uspg.edu.model.Agenda;
import uspg.edu.model.Contacto;

/**
 *
 * @author Usuario
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    static List<Agenda>listadeTelefonos = new ArrayList();
    static List<Contacto>listadeContactos = new ArrayList();
    public static int opcionmenuPrincipal;
    static public Scanner sc = new Scanner(System.in);
    public  int menu = 0;
    public static void main(String[] args) {
        menu();
    
       
        
    }
    
    private static void menu(){
          System.out.println("\tMENU");
            System.out.println("===================================");
            System.out.println("Seleccione una opción:");
            System.out.println("1 - Añadir Contacto ");
            System.out.println("2 - Lista de Contactos ");
            System.out.println("3 - Grabar Telefono ");
            System.out.println("4 - Lista de Telefono");
            System.out.println("5 - Salir ");
            opcionmenuPrincipal = sc.nextInt();
            
           switch(opcionmenuPrincipal){
               case 1:
                   AñadirContacto();
                   break;
                   
               case 2:
                   ListadeContactos();
                   break;
                   
               case 3:
                   GrabarTelefono();
                   break;
                   
               case 4:
                   ListadeTelefono();
                   break;
                   
               case 5:
                   //Salir();
                   break;
               default:
                   System.out.println("Opcion no encontrada"); 
                   break;
                   }
           }
      
      public static void AñadirContacto(){
          Contacto contacto = new Contacto();
            String nombre;
            String apellidos;
            int ID;
            int telefono;
            String Direccion;
         
          System.out.println("Ingrese Nombre");
          nombre = sc.next();
          
          System.out.println("Ingrese Apellido");
          apellidos = sc.next();
          
          System.out.println("Ingrese ID");
          ID= sc.nextInt();
          
          System.out.println("Ingrese Telefono");
          telefono = sc.nextInt();
          
          System.out.println("Ingrese Direccion");
          Direccion = sc.next();
          
           contacto = new Contacto(nombre,apellidos,ID,telefono,Direccion);
           
           listadeContactos.add(contacto);
           System.out.println("mensaje grabado correctamente ");
           
           menu();
           
           
      }
      
      public static void ListadeContactos(){
          Iterator<Contacto> IteratorContacto = listadeContactos.iterator();
          Contacto contacto;
          System.out.println(listadeContactos.size());
          System.out.println("\t\tLISTA DE CONTACTOS");
          System.out.println("=====================================");
          System.out.println("NOMBRE\t\tTELEFONO\tDIRECCION\t");
          while (IteratorContacto.hasNext()){
              contacto = IteratorContacto.next();
              System.out.println(contacto.getNombre()+ 
                      "\t\t" + contacto.getTelefono() + "\t\t" + contacto.getDireccion());
              
          }
          
          menu();
    }
      
      public static void GrabarTelefono(){
          Agenda agenda = new Agenda();
            int numerodePagina;
            String mes;
            String año;
            String dia;
         
          System.out.println("Ingrese Numero de Pagina ");
          numerodePagina = sc.nextInt();
          
          System.out.println("Ingrese Mes");
          mes = sc.next();
          
          System.out.println("Ingrese Año");
          año = sc.next();
          
          System.out.println("Ingrese Dia");
          dia = sc.next();
          
           agenda = new Agenda(numerodePagina,mes,año,dia);
           
           listadeTelefonos.add(agenda);
           System.out.println("mensaje grabado correctamente ");
           menu();
   
}
      
       public static void ListadeTelefono(){
          Iterator<Agenda> IteratorAgenda = listadeTelefonos.iterator();
          Agenda agenda;
          System.out.println(listadeTelefonos.size());
          System.out.println("\t\tLISTA DE TELEFONOS");
          System.out.println("=====================================");
          
          menu();
    }
}
