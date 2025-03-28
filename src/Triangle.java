public class Triangle {




        private int sideA , sideB, sideC;

        public static int counter = 0;
        public int counterForObject = 0;


    public Triangle(int sideC, int sideB, int sideA) {
        this.sideC = sideC;
        this.sideB = sideB;
        this.sideA = sideA;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    @Override
    public double area() {
        return (this.sideA * this.sideB)/2;
    }
    @Override
    public double perimeter(){
        return this.sideA+this.sideB+this.sideC;
    }
    @Override
    public String toString(){
        return "Triangle{"+
                "sideA=" + sideA +
                "sideB=" + sideB +
                "sideC=" + sideC +
                '}'

    }
}
