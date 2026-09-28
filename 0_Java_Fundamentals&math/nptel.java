class NPTEL_W2 {
    int x;

    NPTEL_W2(int x) {
        this.x = x;
    }

    void printX() {
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        NPTEL_W2 obj = new NPTEL_W2(000);
        obj.printX();
    }
}