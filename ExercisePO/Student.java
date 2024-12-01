package OOP.ExercisePO;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double notaPrimeiroSemestre = sc.nextDouble();
        double notaSegundoSemestre = sc.nextDouble();
        double notaTerceiroSemestre = sc.nextDouble();

        MainAluno newMainStudent = new MainAluno(name,notaPrimeiroSemestre, notaSegundoSemestre, notaTerceiroSemestre);

        System.out.println(newMainStudent.getName());
        System.out.println(newMainStudent.getNotaPrimeiroSemestre());
        System.out.println(newMainStudent.getNotaSegundoSemestre());
        System.out.println(newMainStudent.getNotaTerceiroSemestre());


        System.out.println(newMainStudent.calcularMediaEstudante(notaTerceiroSemestre, notaSegundoSemestre, notaSegundoSemestre));

        System.out.println(newMainStudent.resultAprovado());


        sc.close();

    }
}
