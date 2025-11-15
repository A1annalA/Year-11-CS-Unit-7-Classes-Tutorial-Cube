public class Cube {
    private int side;

    // No-argument constructor - sets side to 1
    public Cube() {
        this.side = 1;
    }

    // Constructor with side parameter
    public Cube(int side) {
        validateSide(side);
        this.side = side;
    }

    // Getter method
    public int getSide() {
        return side;
    }

    // Setter method
    public void setSide(int side) {
        validateSide(side);
        this.side = side;
    }

    // Calculate surface area: 6 * side^2
    public int calculateSurfaceArea() {
        return 6 * side * side;
    }

    // Calculate volume: side^3
    public int calculateVolume() {
        return side * side * side;
    }

    // toString method in required format
    @Override
    public String toString() {
        return "Cube{side=" + side + "}";
    }

    // Private helper method to validate side length
    private void validateSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
    }
}