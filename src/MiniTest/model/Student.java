package MiniTest.model;

public class Student extends People {
    private double mathScores;
    private double physicsScores;
    private double chemistryScores;

    public Student() {
    }

    public Student(int id, String name, String age, double mathScores, double physicsScores, double chemistryScores) {
        super(id, name, age);
        this.mathScores = mathScores;
        this.physicsScores = physicsScores;
        this.chemistryScores = chemistryScores;
    }

    public Student(String name, String age, double mathScores, double physicsScores, double chemistryScores) {
        super(name, age);
        this.mathScores = mathScores;
        this.physicsScores = physicsScores;
        this.chemistryScores = chemistryScores;
    }

    public Student(double mathScores, double physicsScores, double chemistryScores) {
        this.mathScores = mathScores;
        this.physicsScores = physicsScores;
        this.chemistryScores = chemistryScores;
    }

    public double getMathScores() {
        return mathScores;
    }

    public void setMathScores(double mathScores) {
        this.mathScores = mathScores;
    }

    public double getPhysicsScores() {
        return physicsScores;
    }

    public void setPhysicsScores(double physicsScores) {
        this.physicsScores = physicsScores;
    }

    public double getChemistryScores() {
        return chemistryScores;
    }

    public void setChemistryScores(double chemistryScores) {
        this.chemistryScores = chemistryScores;
    }
    public double getMediumScore(){
        return (this.chemistryScores + this.mathScores + this.physicsScores) / 3;
    }

    @Override
    public String toString() {
        return "Student{" + " id = "+super.getId()+
                " name ="+ super.getName()+" age = "+super.getAge()+
                " mathScores=" + mathScores +
                ", physicsScores=" + physicsScores +
                ", chemistryScores=" + chemistryScores +
                '}';
    }
}
