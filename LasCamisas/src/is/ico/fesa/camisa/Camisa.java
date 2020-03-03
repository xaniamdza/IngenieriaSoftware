package is.ico.fesa.camisa;

import java.util.Scanner;

public class Camisa {

    private int compra;
    private int camisa;
    private int id;
    private int total;
    private double descuento;
    private double totalD;
    private double totalFinal;

    public Camisa() {
    }

    public Camisa(int compra, int camisa, int id, int total, double descuento, double totalD, double totalFinal) {
        this.compra = compra;
        this.camisa = camisa;
        this.id = id;
        this.total = total;
        this.descuento = descuento;
        this.totalD = totalD;
        this.totalFinal = totalFinal;
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(double totalFinal) {
        this.totalFinal = totalFinal;
    }

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotalD() {
        return totalD;
    }

    public void setTotalD(double totalD) {
        this.totalD = totalD;
    }

    public double vender() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántas camisas desea comprar?");

        compra = teclado.nextInt();

        if (compra <= 2) {
            System.out.println("************************************************************");
            System.out.println("No hay descuento en su compra.");
            System.out.println("************************************************************");
            this.descuento = 0;
        } else if (compra >= 3 && compra <= 5) {
            System.out.println("************************************************************");
            System.out.println("Tiene el 5% de descuento en su compra.");
            System.out.println("************************************************************");
            descuento = 0.05;
        } else {
            System.out.println("************************************************************");
            System.out.println("Tiene el 8% de descuento en su compra");
            System.out.println("************************************************************");
            descuento = 0.08;
        }
        while (compra != 0) {
            System.out.println("Escriba el id de la camisa que desea comprar:");
            id = teclado.nextInt();
            if (id >= 1 && id <= 3) {
                if (id == 1) {
                    camisa = 190;
                } else if (id == 2) {
                    camisa = 230;
                } else if (id == 3) {
                    camisa = 310;
                }
                compra -= 1;
            } else {
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                System.out.println("Dijite un id valido.");
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            }
            total = total + camisa;
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("El total de la compra es: " + total);
        System.out.println("------------------------------------------------------------");
        System.out.println("\nEl total de su compra con descuento es:" );
        
        totalD = total * descuento;
        totalFinal = total - totalD;
        System.out.println(totalFinal);

        return 0;
    }

}
