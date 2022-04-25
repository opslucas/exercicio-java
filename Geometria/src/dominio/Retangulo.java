package dominio;

public class Retangulo {
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    private int base;
    private int altura;

    public int calcularArea() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return 2 * (base + altura);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
