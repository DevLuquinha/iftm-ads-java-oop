package oop.classroom_exercises.classroom.class_26_06_17;

public enum Probability {
    SIX(4.5), SEVEN(31.5), EIGHT(126), NINE(378);

    private final double probabilityValue;
    Probability(double value){
        this.probabilityValue = value;
    }

    public double getProbabilityValue(){
        return this.probabilityValue;
    }
}
