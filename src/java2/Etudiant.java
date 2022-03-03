
package java2;

import java.awt.BorderLayout;

public class Etudiant {
    int id;
    String nom;
    String prenom;
    
    public Etudiant(){
        
    }
    
    public Etudiant(int id, String nom ,String prenom){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
    }
    public void afficherEtudiant(){
        System.out.println("L id est"+id+ ",le nom :"+ nom+" , le prenom : "+prenom);
    }
    @Override
    public String toString(){
          return("L id est"+id+ ",le nom :"+ nom+" , le prenom : "+prenom);

    }
}
