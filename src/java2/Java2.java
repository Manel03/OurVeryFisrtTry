
package java2;

public class Java2 {

    
    public static void main(String[] args) {
     Etudiant e1=new Etudiant();   
        //System.out.println(e1.id);
        //System.out.println(e1.nom);
        //System.out.println(e1.prenom);
        e1.afficherEtudiant();
        
        Etudiant e2= new Etudiant(2, "Mouhamed", "Salah");
        //System.out.println(e2.id);
        //System.out.println(e2.nom);
       // System.out.println(e2.prenom);
        //e2.afficherEtudiant();
        System.out.println(e2);
    }
    
}
