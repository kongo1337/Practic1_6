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

public class recipe2 extends Doctor{
    public void writeRecipe(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введиие рецепт:");
        String recipe = scan.nextLine().toUpperCase();
        scan.close();
        
        System.out.println("Рецепт: " + recipe);
    }
    
}
