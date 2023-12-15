public class Class {
    private int num;

    public Class(int num) {
        this.num = num;
    }
    public int getNum() {
        return this.num;
    }
    public int numPlus(int numX){
        return num + numX;
    }
    public int numX2(){
        return num * 2;
    }
    public void printNum() {
        System.out.println(num);
    }
}
