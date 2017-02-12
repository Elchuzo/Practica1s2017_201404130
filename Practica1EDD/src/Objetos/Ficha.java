package Objetos;

public class Ficha {
    char letra;
    int valor;
    public static int cantidad;
    public void Letra()
    {
        
    }
    public void Letra(char letra, int valor, int cantidad)
    {
        this.setLetra(letra);
        this.setValor(valor);
        this.cantidad = cantidad;
    }

    /**
     * @return the letra
     */
    public char getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
}
