public class Mariage {
    // Attributs privés
    private String date, lieu ;
    private Homme ungars ;
    private Femme unefille ;

    // Constructeur initialise les attributs avec les paramètres
    public Mariage(String pdate, String plieu, Homme h, Femme f) {
        date=pdate; lieu=plieu; ungars=h ; unefille=f ;
    }
}
