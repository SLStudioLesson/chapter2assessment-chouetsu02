import ui.RecipeUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        RecipeUI ui = new RecipeUI();
        ui.displayMenu();
    }
}
