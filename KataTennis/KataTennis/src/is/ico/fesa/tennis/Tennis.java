package is.ico.fesa.tennis;

import java.util.Scanner;

public class Tennis {

    private int puntaje1;
    private int puntaje2;
    private int pganador;
    private int pganador2;
    private int r1;
    private int r2;
    private int set;
    private int victoria1;
    private int victoria2;

    public Tennis() {
    }

    public Tennis(int puntaje1, int puntaje2, int pganador, int pganador2, int r1, int r2, int set, int victoria1, int victoria2) {
        this.puntaje1 = puntaje1;
        this.puntaje2 = puntaje2;
        this.pganador = pganador;
        this.pganador2 = pganador2;
        this.r1 = r1;
        this.r2 = r2;
        this.set = set;
        this.victoria1 = victoria1;
        this.victoria2 = victoria2;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public int getPuntaje1() {
        return puntaje1;
    }

    public void setPuntaje1(int puntaje1) {
        this.puntaje1 = puntaje1;
    }

    public int getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje2(int puntaje2) {
        this.puntaje2 = puntaje2;
    }

    public int getPganador() {
        return pganador;
    }

    public void setPganador(int pganador) {
        this.pganador = pganador;
    }

    public int getPganador2() {
        return pganador2;
    }

    public void setPganador2(int pganador2) {
        this.pganador2 = pganador2;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getVictoria1() {
        return victoria1;
    }

    public void setVictoria1(int victoria1) {
        this.victoria1 = victoria1;
    }

    public int getVictoria2() {
        return victoria2;
    }

    public void setVictoria2(int victoria2) {
        this.victoria2 = victoria2;
    }
    
    public int iniciarJuego(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Desea iniciar el juego de tennis?\n 1)Si\n 2)No");
        set = teclado.nextInt();
        
        if (set == 1){
            System.out.println("Juego iniciado");
            
        } else{
            System.out.println("Fin del juego");
        }
        return set;
    }

    public int jugarTennis() {
        Scanner teclado = new Scanner(System.in);

        while (set == 1) {
            System.out.println("¿El jugador 1 anotó punto?\n 1)Si\n 2)No");
            r1 = teclado.nextInt();

            if (puntaje1 < 30) {
                if (r1 == 1) {
                    puntaje1 = puntaje1 + 15;
                } else {
                    puntaje1 = puntaje1 + 0;
                }
            } else {
                if (r1 == 1) {
                    puntaje1 = puntaje1 + 10;
                } else {
                    puntaje1 = puntaje1 + 0;
                }

            }

            System.out.println("¿El jugador 2 anotó punto?\n 1)Si\n 2)No");
            r2 = teclado.nextInt();

            if (puntaje2 < 30) {
                if (r2 == 1) {
                    puntaje2 = puntaje2 + 15;
                } else {
                    puntaje2 = puntaje2 + 0;
                }
            } else {
                if (r2 == 1) {
                    puntaje2 = puntaje2 + 10;
                } else {
                    puntaje2 = puntaje2 + 0;
                }
            }

            System.out.println("-----------------------------------------------");
            System.out.println("                 Jugador 1                     ");
            System.out.println("                 Marcador:" + puntaje1);
            System.out.println("-----------------------------------------------");
            System.out.println("                 Jugador 2                     ");
            System.out.println("                 Marcador:" + puntaje2);
            System.out.println("-----------------------------------------------");

            if (puntaje1 == 50 && puntaje2 < 50) {
                victoria1 += 1;
                set -= 1;
            } else if (puntaje2 == 50 && puntaje1 < 50) {
                victoria2 += 1;
                set -= 1;
            } else if (puntaje1 == 50 && puntaje2 == 50) {
                while (pganador == pganador2) {
                    System.out.println("¿El jugador 1 anotó punto?\n 1)Si\n 2)No");
                    pganador = teclado.nextInt();
                    System.out.println("¿El jugador 2 anotó punto?\n 1)Si\n 2)No");
                    pganador2 = teclado.nextInt();

                    if (pganador == pganador2) {
                        pganador += 1;
                        pganador2 += 1;
                        System.out.println("-----------------------------------------------");
                        System.out.println("                Siguen empates                 ");
                        System.out.println("-----------------------------------------------");
                    } else if (pganador < pganador2) {
                        victoria1 += 1;
                    } else {
                        victoria2 += 1;
                    }
                }
                set -= 1;
            }
        }
        puntaje1 = 0;
        puntaje2 = 0;
        pganador = 0;
        pganador2 = 0;

        return 0;
    }

    public int ganadorFinal() {
        int ganadorFinal = 0;
        if (victoria1 > victoria2) {
            System.out.println("EL JUGADOR 1 GANÓ EL JUEGO");
            ganadorFinal = victoria1;
        } else if (victoria2 > victoria1){
            System.out.println("EL JUGADOR 2 GANÓ EL JUEGO");
            ganadorFinal = victoria2;
        }

        return ganadorFinal;
    }

}
