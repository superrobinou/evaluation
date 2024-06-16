package fr.toto.evaluation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Controle {
    private List<QCM> qcms;
    Controle(List<QCM> qcms){
        this.qcms=qcms;
    }
    public void evaluer(){
       Float note=0.0f;
       Float maxNote=0.0f;
        for(QCM qcm:qcms){
            qcm.afficherQuestion();
             BufferedReader reader = new BufferedReader(
           
            new InputStreamReader(System.in));
        // Reading data using readLine
        try{
        String reponse = reader.readLine();
        note=note+qcm.Repondre(reponse);
        maxNote=maxNote+qcm.getGoodNote();
        }
        catch(IOException exception){
            System.exit(0);
        }
        finally{

        }
    }
    System.out.println("votre note :"+note+"/"+maxNote);
}

    }

