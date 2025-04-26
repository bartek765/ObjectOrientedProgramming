package pl.kedrabartosz.designpatterns.builder;

import java.time.Instant;

public class Patient {
    private String name;
    private String surname;
    private String department;
    private int age;
    private Instant dateOfAdmission;
    private String illness;

    private Patient(PatientBuilder patientBuilder) {// tutaj zamieniamy na private!!!
        this.name = patientBuilder.name;
        this.surname = patientBuilder.surname;
        this.department = patientBuilder.department;
        this.age = patientBuilder.age;
        this.dateOfAdmission = patientBuilder.dateOfAdmission;
        this.illness = patientBuilder.illness;
    }

    //1wewnatrz tej klasy tworze publiczna statyczna klase o takiej samej nazwie ale na koncu builder
    //2przekopiowuje pola z klasy bazowej to tej klasy budowniczej
    //3 wewnatrz tego buildera generuje settery ale specjalne! takie ktore zwracaja buildera
    //zaznaczam Builder!
    //4 na samym koncu buildera dodajemy metode o typie klasie o nazwie build ktora zwraca obiekt juz typ docelowy czyli w tym przypadku Pacjent
    //5 na koncu samieniamy konstruktor na prywatny!
    // w mainie pozniej normalnie kiedy bierzemy pola ktora sa nam potrzebne to dajemy po new i naziwe obiektu
    //Builder() i pozniej wymieniamy sety ktore nam sa potrzebne i na koncu zakanczamy .build()!!
    public static class PatientBuilder {
        private String name;
        private String surname;
        private String department;
        private int age;
        private Instant dateOfAdmission;
        private String illness;

        public PatientBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PatientBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PatientBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public PatientBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PatientBuilder setDateOfAdmission(Instant dateOfAdmission) {
            this.dateOfAdmission = dateOfAdmission;
            return this;
        }

        public PatientBuilder setIllness(String illness) {
            this.illness = illness;
            return this;
        }
        public Patient build(){
            return new Patient(this);
        }
    }
}
