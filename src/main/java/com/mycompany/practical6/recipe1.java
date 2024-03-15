/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical6;

/**
 *
 * @author KonGo
 */
import java.util.Scanner;

public class recipe1 extends Doctor {
    public void writeRecipe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рецепт:");
        String recipe = scanner.nextLine();
        scanner.close();
        StringBuilder reversed = new StringBuilder();
        for (int i = recipe.length() - 1; i >= 0; i--) {
            reversed.append(recipe.charAt(i));
        }
        
        System.out.println("Recipe: " + reversed.toString());
    }
}
