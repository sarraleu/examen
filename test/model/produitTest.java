/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cash express
 */
public class produitTest {
    
    public produitTest() {
    }
    
   
    @Test
    public void testPrix_total() {
        System.out.println("prix_total");
        
        produit instance = new produit ("banan",500,2);
       
       double result = instance.prix_total(500, 2);
        
        assertEquals(1000, result, 0.0);
        
        
    }
    
}
