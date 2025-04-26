package pl.kedrabartosz.designpatterns.builder;

import java.time.Instant;

public class Runner {
    public static void main(String[] args) {
        Patient patient = new Patient.PatientBuilder()
                .setName("Hania")
                .setSurname("Testowska")
                .setDepartment("Chirurgia")
                .setAge(77)
                .setDateOfAdmission(Instant.now())
                .setIllness("alergia")
                .build();// na koncu musi byc build!!
        //wywolujemy zawsze po tworzeniu obiektu wywolujemy konstuktor buildera
        Patient patient1 = new Patient.PatientBuilder()
                .setName("Ola")
                .setAge(55)
                .setSurname("testowska")
                .setDepartment("chirurgia")
                .setDateOfAdmission(Instant.now())
                .build();
        Patient patient2 = new Patient.PatientBuilder()
                .setName("tomek")
                .setAge(45)
                .setIllness("gruzlica")
                .setDateOfAdmission(Instant.now())
                .setDepartment("chirurgia")
                .build();
        Patient patient3 = new  Patient.PatientBuilder()
                .setName("bonifacy")
                .setAge(44)
                .setSurname("testowy")
                .setDateOfAdmission(Instant.now())
                .build();
    }
}