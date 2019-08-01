class Ponto2D extends Ponto1D {

    protected double y;
    
    public Ponto2D() {

        super();
        this.y = 0.0;
    }

    public Ponto2D(double x, double y) {

        super(x);
        this.y = y;
    }

    public void movimentaPara(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public void movimentaEm(double x, double y) {

        this.x += x;
        this.y += y;
    }

    public double XestaEm() {
        return this.x;
    }

    public double YestaEm() {
        return this.y;
    }

    public double modulo() {
        return Math.sqrt(x * x + y * y);
    }

    public Ponto2D clona() {
        return new Ponto2D(this.x, this.y);
    }

    public boolean igualA(Ponto2D a) {
        return false;
    }

    public boolean maiorQue(Ponto2D a) {
        return this.modulo() > a.modulo();
    }

    public boolean maiorOuIgualA(Ponto2D a) {
        return this.modulo() >= a.modulo();
    }

    public boolean menorQue(Ponto2D a) {
        return !maiorOuIgualA(a);
    }

    public boolean menorOuIgualA(Ponto2D a) {
        return !maiorQue(a);
    }

    public boolean diferenteDe(Ponto2D a) {
        return !igualA(a);
    }

    public String toString() {
        return "Ponto X = " + this.x + "\nPonto Y = " + this.y;
    }
}