package proyectosudoku;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Casilla extends JButton {

    private Tablero tablero;
    private int valor;

    public Casilla(Tablero t) {

        this.setPreferredSize(new Dimension(60, 60));
    }

    //Getters
    public Casilla getCasilla() {
        return this;
    }

    public Tablero getTablero() {
        return this.tablero;
    }

    public int getValor() {
        return this.valor;
    }

    //Setters
    public void setTablero(Tablero t) {
        this.tablero = t;
    }

    public void setValor(int val) {
        this.valor = val;
    }
}
