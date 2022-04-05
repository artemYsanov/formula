package com.company;
import java.util.Scanner;
class formula{
    float x;
    float y;
    float z;

public formula(float x, float y, float z){
    this.x = x;
    this.y = y;
    this.z = z;
}
public void displayFormula(){
    double l = Math.sqrt(x*x+y*y+z*z);
    System.out.println(l);
}
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x- ");
        float x = scanner.nextFloat();
        System.out.println("y- ");
        float y = scanner.nextFloat();
        System.out.println("z- ");
        float z = scanner.nextFloat();
    formula formm = new formula(x, y, z);
    formm.displayFormula();
    formula formm2 = new formula(x, y, z);
    }
}
