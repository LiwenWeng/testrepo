public class Class {
    private int num;

    public Class(int num) {
        this.num = num;
    }
    public int getNum() {
        return this.num;
    }

    public void setNum(int newNum) {
        num = newNum;
    }
    public int numPlus(int numX){
        return num + numX;
    }
}
