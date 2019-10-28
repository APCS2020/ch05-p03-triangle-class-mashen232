public class triangle{
    private int side;
    private int side2;
    /**
     * @return the side
     */
    public int getSide() {
        return side;
    }
    /**
     * @return the side2
     */
    public int getSide2() {
        return side2;
    }
    /**
     * @param side the side to set
     */
    public void setSide(int side) {
        this.side = side;
    }
    /**
     * @param side2 the side2 to set
     */
    public void setSide2(int side2) {
        this.side2 = side2;
    }
    public double getArea(){
        return side * side2 * 0.5;
    }
}