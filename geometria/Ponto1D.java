class Ponto1D {

    protected double x;

    public Ponto1D() {
        this.x = 0.0;
    }

    public Ponto1D(double x) {
        this.x = x;
    }

    public void movimentaPara(double x) {
        this.x = x;
    }

    public void movimentaEm(double x) {
        this.x += x;
    }

    public double estaEm() {
        return this.x;
    }

    public double modulo() {
        
        if (x >= 0.0) {
            return this.x;
        }

        return -this.x;
    }

    public Ponto1D clona() {
        return new Ponto1D(this.x);
    }

    public String toString() {
        return "Ponto x = " + this.x;
    }
}