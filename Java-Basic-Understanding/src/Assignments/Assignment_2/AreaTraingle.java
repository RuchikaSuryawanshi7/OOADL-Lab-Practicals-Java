package Assignments.Assignment_2;

import java.util.Scanner;

//Area Of Triangle
public class AreaTraingle {
    //Area Of Isosceles Triangle
    //Area_of_Isosceles_Triangle= (1 * b * h) / 2;
    public static void IsoscelesTriangle(float b, float h){
        float area = (1 * b * h) / 2;
        System.out.println("Area of Isosceles is "+ area);
    }
    //Normal Triangle
    public static void TriangleArea(float b, float h){
        float area = b * h;
        System.out.println("Area of reactangle "+ area);
    }

    //Eqillateral Triangle = Area of Equilateral Triangle= ( 1.73 × a × a)/4
    public static void EquilTraingle(float b){
        float area = (float) (1.73 * b * b)/4;
        System.out.println("Area of Equilateral Triangle "+area);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height and Base of Triangle");
        float base = input.nextFloat();
        float height = input.nextFloat();
        IsoscelesTriangle(base, height);
        TriangleArea(base, height);
        EquilTraingle(base);

    }
}
