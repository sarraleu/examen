
package model;

/**
 *
 * @author toshiba
 */
public class produit {
    String designation;
    int prix;
    int quantite ;

    public produit(String designation, int prix, int quantite) {
        this.designation = designation;
        this.prix = prix;
        this.quantite=quantite;
    }
    public int prix_total(int prix, int quantite)
    { return prix*quantite;}
    
}
