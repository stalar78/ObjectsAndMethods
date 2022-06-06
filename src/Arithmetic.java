public class Arithmetic {
    private int num1;
    private int num2;

    public void numberConstruct(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSum() {
        int sum = num1 + num2;
        return sum;
    }

    public int getMulti() {
        int multi = num1 * num2;
        return multi;
    }

    public int getMax() {
        int max = Math.max(num1, num2);
        return max;
    }

    public int getMin() {
        int min = Math.min(num1, num2);
        return min;
    }

}
