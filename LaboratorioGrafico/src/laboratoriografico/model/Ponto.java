package laboratoriografico.model;

import java.awt.Graphics;

/**
 *
 * @author Dionathan
 * @since 23/02/2018
 *
 */
public class Ponto extends Forma {

    private String nome;
    private double cordX;
    private double cordY;

    public Ponto() {
    }

    public Ponto(double cordX, double cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }

    public Ponto(String nome, double cordX, double cordY) {
        this.nome = nome;
        this.cordX = cordX;
        this.cordY = cordY;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCordX() {
        return cordX;
    }

    public void setCordX(double cordX) {
        this.cordX = cordX;
    }

    public double getCordY() {
        return cordY;
    }

    public void setCordY(double cordY) {
        this.cordY = cordY;
    }

    @Override
    public void desenha(Graphics g) {
        g.drawLine((int) cordX, (int) cordY, (int) cordX, (int) cordY);
    }

    @Override
    public String toString() {
        return ". " + nome + " (" + cordX + "," + cordY + ")";
    }

}