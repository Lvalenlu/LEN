import java.util.Scanner;

 

class FilaUsuario {

 

    private int[] fila;

    private int index;

    private int nUsuarios;

 

    public FilaUsuario() {

        this.fila = new int[20];

        this.index = 0;

        this.nUsuarios = 0;

    }

 

    public FilaUsuario(int n) {

        this.fila = new int[n];

        this.index = 0;

        this.nUsuarios = 0;

    }

 

    public void llenarFila() {

        if (fila[fila.length - 1] == 0) {

            if (index < fila.length) {

                fila[index] = ++nUsuarios;

                index++;

            }

        } else {

            System.out.println("La fila esta llena");

        }

        imprimirFila();

    }

 

    public void retirarUsuarioFila() {

        if (index != 0) {

            for (int i = 0; i < fila.length - 1; i++) {

                fila[i] = fila[i + 1];

            }

            fila[fila.length - 1] = 0;

            index--;

            imprimirFila();

        } else {

            System.out.println("La fila esta vacia");

        }

    }

 

    public boolean estaVacia() {

        return fila[0] == 0;

    }

 

    public void imprimirFila() {

        System.out.println();

        for (int i = 0; i < fila.length; i++) {

            System.out.print(fila[i] + " ");

        }

        System.out.println();

    }

 

    public void agregarUsuariosAleatorios() {

        int numUsuarios = (int) (Math.random() * 5) + 1;

        for (int i = 0; i < numUsuarios; i++) {

            llenarFila();

        }

    }

 

    public void retirarUsuarios(int numUsuarios) {

        for (int i = 0; i < numUsuarios; i++) {

            retirarUsuarioFila();

        }

    }

 

    public void verPrimerElemento() {

        if (!estaVacia()) {

            System.out.println("Primer elemento en la fila: " + fila[0]);

        } else {

            System.out.println("La fila esta vacia");

        }

    }

 

    public boolean estaLlena() {

        return index == fila.length;

    }

}

 

public class Main {

 

    private FilaUsuario unaFila;

    private Scanner sc;

 

    public Main(int n) {

        if (n > 0) {

            this.unaFila = new FilaUsuario(n);

            this.sc = new Scanner(System.in);

        }

    }

 

    public void procesarOperacionesFila() {

        String menu = "1. Agregar usuario fila.\n2. Imprimir fila\n"

                + "3. Retirar usuario fila\n4. Estado de la fila\n"

                + "5. Salir\n6. Agregar usuarios aleatorios\n"

                + "7. Retirar 2 o 3 usuarios\n8. Ver primer elemento\n"

                + "9. Verificar si la fila esta llena\n\nSeleccione opcion";

        int opc = 1;

 

        do {

            System.out.println(menu);

            opc = sc.nextInt();

            switch (opc) {

                case 1:

                    unaFila.llenarFila();

                    break;

                case 2:

                    unaFila.imprimirFila();

                    break;

                case 3:

                    unaFila.retirarUsuarioFila();

                    break;

                case 4:

                    verificarEstado();

                    break;

                case 6:

                    unaFila.agregarUsuariosAleatorios();

                    break;

                case 7:

                    System.out.println("Ingrese la cantidad de usuarios a retirar (2 o 3):");

                    int numUsuarios = sc.nextInt();

                    if (numUsuarios >= 2 && numUsuarios <= 3) {

                        unaFila.retirarUsuarios(numUsuarios);

                    } else {

                        System.out.println("Cantidad de usuarios invalida");

                    }

                    break;

                case 8:

                    unaFila.verPrimerElemento();

                    break;

                case 9:

                    if (unaFila.estaLlena()) {

                        System.out.println("La fila esta llena");

                    } else {

                        System.out.println("La fila no esta llena");

                    }

                    break;

            }

        } while (opc != 5);

    }

 

    private void verificarEstado() {

        if (unaFila.estaVacia()) {

            System.out.println("La fila esta vacia");

        } else {

            System.out.println("En la fila hay usuarios");

        }

    }

 

    public static void main(String[] args) {

        int usuarios = 5;

        Main app = new Main(usuarios);

        app.procesarOperacionesFila();

    }

}



