package dk.kea;

public class Superhero {
    private String navn;
    private String superhelteNavn;
    private String superkraft;
    private int oprindelsesår;
    private boolean erMenneske;
    private double styrke;

    public Superhero (String navn, String superhelteNavn, String superkraft, int oprindelsesår, boolean erMenneske, double styrke){
        this.navn = navn;
        this.superhelteNavn = superhelteNavn;
        this.superkraft = superkraft;
        this.oprindelsesår = oprindelsesår;
        this.erMenneske = erMenneske;
        this.styrke = styrke;
    }

    public String getNavn(){
        return navn;
    }

    public String getSuperhelteNavn(){
        return superhelteNavn;
    }

    public String getSuperkraft(){
        return superkraft;
    }

    public int getOprindelsesår(){
        return oprindelsesår;
    }

    public boolean getErMenneske(){
        return erMenneske;
    }

    public double getStyrke(){
        return styrke;
    }
}
