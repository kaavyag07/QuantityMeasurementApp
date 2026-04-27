class QuantityMeasurementApp {

    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            // Reflexive
            if (this == obj) return true;

            // Null check
            if (obj == null) return false;

            // Type check
            if (getClass() != obj.getClass()) return false;

            // Cast
            Feet other = (Feet) obj;

            // Value comparison (IMPORTANT)
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Optional main method for manual testing
    public static void main(String[] args) {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        System.out.println("Are equal? " + f1.equals(f2));
    }
}