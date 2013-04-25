package main.java;

/**
 * Created with IntelliJ IDEA.
 * User: ZIG
 * Date: 22.04.2013
 * Time: 22:49
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    private int id;
    private String nume;
    private String prenume;
    private Double medieBac;
    private Double medieExamen;
    private Double medieLiceu;
    private Double medieAdmitere;
    private StudentType studentType;

    public Student(){}

    public Student(String nume, String prenume, Double medieBac, Double medieExamen, Double medieLiceu) {
        this.nume = nume;
        this.prenume = prenume;
        this.medieBac = medieBac;
        this.medieExamen = medieExamen;
        this.medieLiceu = medieLiceu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Double getMedieBac() {
        return medieBac;
    }

    public void setMedieBac(Double medieBac) {
        this.medieBac = medieBac;
    }

    public Double getMedieExamen() {
        return medieExamen;
    }

    public void setMedieExamen(Double medieExamen) {
        this.medieExamen = medieExamen;
    }

    public Double getMedieLiceu() {
        return medieLiceu;
    }

    public void setMedieLiceu(Double medieLiceu) {
        this.medieLiceu = medieLiceu;
    }

    public Double getMedieAdmitere() {
        return medieAdmitere;
    }

    public void setMedieAdmitere(Double medieAdmitere) {
        this.medieAdmitere = medieAdmitere;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getNume() + " " + getPrenume();
    }
}
