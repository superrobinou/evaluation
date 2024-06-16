package fr.toto.evaluation;

public class QCM {
    private String question;
    private String reponse;
    private Float noteBonne;
    QCM(String question,String reponse,Float noteBonne){
        this.question=question;
        this.reponse=reponse;
        this.noteBonne=noteBonne;
    }
    public Float Repondre(String reponse){
        if(this.reponse.equals(reponse)){
            System.out.println("bonne réponse!");
            return noteBonne;
        }
        else{
            System.out.println("mauvaise réponse, la bonne réponse était "+this.reponse);
            return 0.0f;
        }
    }
   public void afficherQuestion(){
    System.out.println("répondez a la question suivante: "+question);
   }
   public Float getGoodNote(){
    return noteBonne;
   }
}
