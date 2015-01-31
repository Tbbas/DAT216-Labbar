/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipesearch;

import javax.swing.JFrame;

/**
 *
 * @author jonathan
 */
public class Test extends JFrame {
    
    public Test() {
        setSize(500,500);
        add(new RecipeSearchSearchModel()).setVisible(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[]     args) {
        Test t = new Test();
        t.setVisible(true);
    }
    
}
