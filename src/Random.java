public class Random {
    private int X0;
    private static final int A = 3;
    private static final int B = 8;
    // maximum value
    private static final int M = 17;

    /***
     *
     * @param start - variable holds first random value
     */
    public Random(int start) {
        this.X0 = start;
    }

    /***
     * Method generates pseudo random integer value but with equal chances
     * <b>When generator reaches its maximum value, it generates our first number...<b/>
     * @return
     */
    public double linearRandomizeEuqalChance() {
        int value = linearRandomize();
        int min = 0;
        double res = min + ((double)value / M) * (M - min);
        return res;
    }

    /***
     * Method generates pseudo random integer value
     * <b>When generator reaches its maximum value, it generates our first number...<b/>
     * @return - integer value
     */
    public int linearRandomize() {
        X0 = (A * X0 + B) % M;
        return X0;
    }
}
