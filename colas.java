import java.util.Scanner;

import java.util.Random;

 

class FilaUsuario

{

 

  private int[] fila;

  private int index;

  private int nUsuarios;

 

  public FilaUsuario ()

  {

    this.fila = new int[20];

      this.index = 0;

      this.nUsuarios = 0;

  }

 

  public FilaUsuario (int n)

  {

    this.fila = new int[n];

    this.index = 0;

    this.nUsuarios = 0;

  }

 

  public void llenarFila ()

  {

    if (fila[fila.length - 1] == 0)

      {

    if (index < fila.length)

      {

        fila[index] = ++nUsuarios;

        index++;

      }

      }

    else

      {

    System.out.println ("La fila esta llena");

      }

    imprimirFila ();

  }

 

public void anexarUsuariosAleatorios(){

        Random random = new Random();

        int numUsuarios = random.nextInt(20) + 1; // De 1 a 5 usuarios

        for (int i = 0; i < numUsuarios; i++) {

            if (index < fila.length) {

                fila[index] = ++nUsuarios;

                index++;

            } else {

                System.out.println("La fila está llena");

                break;

            }

        }

        imprimirFila();

    }

 

  public void retirarUsuarioFila ()

  {

    if (index != 0)

      {

    for (int i = 0; i < fila.length - 1; i++)

      {

        fila[i] = fila[i + 1];

      }

    fila[fila.length - 1] = 0;

    index--;

    imprimirFila ();

      }

    else

      {

    System.out.println ("La fila esta vacia");

      }

  }

 

 

  public boolean estaVacia ()

  {

    return fila[0] == 0;

  }

 

 

  public void imprimirFila ()

  {

    System.out.println ();

    for (int i = 0; i < fila.length; i++)

      {

    System.out.print (fila[i] + " ");

      }

    System.out.println ();

  }

}

 

 

public class Main

{

 

 

  private FilaUsuario unaFila;

  private Scanner sc;

 

 

  public Main (int n)

  {

    if (n > 0)

      {

    this.unaFila = new FilaUsuario (n);

    this.sc = new Scanner (System.in);

      }

  }

 

 

  public void procesarOperacionesFila ()

  {

    String menu = "1. Agregar usuario fila.\n2. Agregar usuario aleatorio. \n"

      + "3. Imprimir fila\n4. Retirar usuario fila\n"

      + "5. Estado de la fila\n6. Salir\n\n Seleccione opcion"; 

     int opc = 1;

    do

      {

    System.out.println (menu);

    opc = sc.nextInt ();

    switch (opc)

      {

      case 1:

        unaFila.llenarFila ();

        break;

      case 2:

        unaFila.anexarUsuariosAleatorios();

        break;

      case 3:

        unaFila.imprimirFila ();

        break;

      case 4:

        unaFila.retirarUsuarioFila ();

        break;

      case 5:

        verificarEstado ();

        break;

      }

      }

    while (opc != 6);

  }

 

 

  private void verificarEstado ()

  {

    if (unaFila.estaVacia ())

      {

    System.out.println ("La fila esta vacia");

      }

    else

      {

    System.out.println ("En la fila hay usuarios");

      }

  }

 

 

  public static void main (String[]args)

  {

    int usuarios = 20;

    Main app = new Main (usuarios);

    app.procesarOperacionesFila ();

  }

}
