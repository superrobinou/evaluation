package fr.toto.evaluation;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     List<QCM> qcms=new ArrayList<QCM>();
      qcms.add(new QCM("quelle est la capital de l'Espagne","Madrid",1.0f));
      qcms.add(new QCM("que fait le creeper","il explose",2.0f));
      qcms.add(new QCM("que fait l'enderman","il se téléporte",1.0f));
      qcms.add(new QCM("quel camp est méchant","les loups garous",1.0f));
      Controle controle=new Controle(qcms);
      controle.evaluer();
    }
}
