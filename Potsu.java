import javax.swing.*;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Potsu {

        nod head;

        Potsu(){

            head=null;

        }

        public nod childId(int childId){

            if(head == null)

                return null;

            else{

                nod n = head;

                while(n != null){

                    if(n.childId == childId)

                        return n;

                    n=n.foll;

                }

                return null;
            }
        }


    public nod parntId(int parentId){

        if(head == null)

            return null;

        else{

            nod n = getLast();

            while(n != null){

                if(n.parentId == parentId)

                    return n;

                n=n.bef;

            }

            return null;
        }
    }


    public int cLHL(){

         int c = 0;

        if(head == null)

            return 0;

        else{

            nod n = getLast();

            while(n != null){

                if (n.municipality.equals("Lorica") && n.childAge >= 4 && n.childAge <= 6 && n.childHeight < 100)

                    c++;



                n=n.bef;

                return c;

            }

            return 0;
        }
    }

    public int cLHS(){

         int c = 0;

        if(head == null)

            return 0;

        else{

            nod n = getLast();

            while(n != null){

                if (n.municipality.equals("Sahagún") && n.childAge >= 4 && n.childAge <= 6 && n.childHeight < 100)
                    c++;




                n=n.bef;




                    return c;



            }

            return 0;
        }
    }

    public int cLHM(){

       int c = 0;

        if(head == null)

            return 0;

        else{

            nod n = getLast();

            while(n != null){

                if (n.municipality.equals("Montería") && n.childAge >= 4 && n.childAge <= 6 && n.childHeight < 100)

                    c++;



                n=n.bef;

                return c;



            }

            return 0;


        }
    }

    public int cLWL(){

        int c = 0;

        if(head == null)

            return 0;

        else{

            nod n = getLast();

            while(n != null){

                if (n.municipality.equals("Lorica")  && n.childAge == 2 || n.childAge == 3 && n.childWeight < 15)

                    c++;


                n=n.bef;

                return c;

            }

            return 0;
        }
    }

    public int cLWS(){

        int c = 0;

        if(head == null)

            return 0;

        else{

            nod n = getLast();

            while(n != null){

                if (n.municipality.equals("Sahagún")  && n.childAge == 2 || n.childAge == 3 && n.childWeight < 15)
                    c++;


                n=n.bef;




                return c;



            }

            return 0;
        }
    }

    public int cLWM(){

        int c = 0;

        if(head == null)

            return 0;

        else{

            nod n = getLast();

            while(n != null){

                if (n.municipality.equals("Montería")  && n.childAge >= 2 && n.childAge <
                 3 && n.childWeight < 15)

                    c++;

                n=n.bef;

                return c;



            }

            return 0;


        }
    }

    public nod childLw() {

        if (head == null){

            JOptionPane.showMessageDialog(null, "Nothing here");
            return null;

        }else {

            nod n = getLast();

            while (n != null) {

                if (((n.childAge >= 2 && n.childAge <= 3) && (n.childWeight < 15)))

                    n.showAll();


                n = n.bef;

            }

            JOptionPane.showMessageDialog(null, "Nothing here");

            return null;

        }
    }


    public nod childL(){

        if(head == null){

             JOptionPane.showMessageDialog(null, "Nothing here");

              return null;

        }else{

            nod n = getLast();

            while(n != null){

                JOptionPane.showMessageDialog(null,"Information about the Children who lives in lorica ");

                if (n.municipality.equals("Lorica")){n.showAll();}

                

                n=n.bef;

            }
            JOptionPane.showMessageDialog(null, "Nothing here");

            return null;
        }
    }

    public nod childM(){

        if(head == null){JOptionPane.showMessageDialog(null, "Nothing here");return null;}

            

        else{

            nod n = getLast();

            while(n != null){

                JOptionPane.showMessageDialog(null,"Information about the Children who lives in Montería");

                if ( n.municipality.equals("Montería"))
                    n.showAll();

                n=n.bef;

            }

            JOptionPane.showMessageDialog(null, "Nothing here");

            return null;
        }
    }

    public nod childS(){

        if(head == null){JOptionPane.showMessageDialog(null, "Nothing here");return null;}

            

        else{

            nod n = getLast();

            while(n != null){

                JOptionPane.showMessageDialog(null,"Information about the Children who lives in Sahagún");

                if ( n.municipality.equals("Sahagún"))

                    n.showAll();

                n=n.bef;

            }

            JOptionPane.showMessageDialog(null, "Nothing here");

            return null;
        }
    }


        public nod setNode(){

            nod inf = null, n = null , x = null;

            int parentId ;

            int parentAge ;

            String parentName ;

            String parentSex ;

            String parentEmail ;

            int parentNumberPhone ;

            // Children information

            int childId;

            String childName ;

            int childAge ;

            String childSex ;

            int childHeight ;

            int childWeight ;


            // Municipality

            String municipality ;

            //Counters
            int cLorica = 0;

            int cMont = 0 ;

            int cSa = 0;

            int contParent = 0;

            int contCLH = 0;

            int contCLW = 0;


            Object tyMun [] = new Object[]{"Lorica","Sahagún" , "Montería"};

            Object xMun = JOptionPane.showInputDialog(null,
                    "Please choose the Municipality",
                    "Municipality Selection",
                    JOptionPane.QUESTION_MESSAGE,null,tyMun ,tyMun[0]);

            municipality = xMun.toString();

            if (municipality.equals("Lorica"))
                cLorica++;

            else  if (municipality.equals("Sahagún"))
                cSa++;

            else if (municipality.equals("Montería"))
                cMont++;




            do{

                childAge = Integer.parseInt(JOptionPane.showInputDialog("Please enter the child age"));

                if(childAge > 6)
                    JOptionPane.showMessageDialog
                            (null,"Error! The child age must be minor than 6 years");



            }while( childAge > 6  || childAge < 1);

            do {

                childId = Integer.parseInt(JOptionPane.showInputDialog
                        ("Please enter the child id: "));

                n = childId(childId);

                if(n!=null)
                    JOptionPane.showMessageDialog(null,
                            "Error! the id is only one , can not be two id.");

            }while(n!=null);

            childName = JOptionPane.showInputDialog("Please enter the child name");

            Object tyGender[] = new Object[]{"M","F"};

            Object xGender = JOptionPane.showInputDialog(null,
                    "Please choose the child gender",
                    "Gender Selection",
                    JOptionPane.QUESTION_MESSAGE,null,tyGender ,tyGender[0]);

            childSex = xGender.toString();

            childHeight = Integer.parseInt(JOptionPane.showInputDialog("Please enter the child height"));

            childWeight = Integer.parseInt(JOptionPane.showInputDialog("Please enter the child weight"));

            // Parent

            do{

                parentId = Integer.parseInt(JOptionPane.showInputDialog("Please enter the parent id"));

                x = parntId(parentId);

                if (x != null)
                    contCLH++;

                if (contCLH > 2)
                    JOptionPane.showMessageDialog(null,"A parent just can represent 2 children");


            }while ( contCLH > 2);

            parentName = JOptionPane.showInputDialog("Please enter the parent name");

            parentAge = Integer.parseInt(JOptionPane.showInputDialog("Please enter the parent age"));



            Object tyGen [] = new Object[]{"M","F"};

            Object xGen = JOptionPane.showInputDialog(null,
                    "Please choose the child gender",
                    "Gender Selection",
                    JOptionPane.QUESTION_MESSAGE,null,tyGen ,tyGen[0]);

            parentSex = xGender.toString();

            parentEmail = JOptionPane.showInputDialog("Please enter the parent email");

            parentNumberPhone = Integer.parseInt(JOptionPane.showInputDialog("Please enter the parent number phone"));


            inf = new nod(  parentId,

             parentAge,

             parentName,

             parentSex,

             parentEmail,

             parentNumberPhone,

             childId,

             childName,

             childAge,

             childSex,

             childHeight,

             childWeight,

             municipality,

             cLorica,

             cMont,

             cSa,

             contCLH,

             contCLW);

            return inf;

        }

        public nod getLast(){

            if(head==null)

                return null;

            else{

                nod q = head;

                while(q.foll!=null)

                    q=q.foll;

                return q;

            }
        }

        public void addLast(){

            nod inf = setNode();

            if(head==null){

                head = inf;

                JOptionPane.showMessageDialog(null,
                        "Node added to the list, it was empty");

            }else{

                nod u=getLast();

                u.foll = inf;

                inf.bef=u;

                JOptionPane.showMessageDialog(null,
                        "Node added at the end of the list.");

            }
        }

    public void addBetween() {

        nod inf = setNode();

        if (head == null) {

            head = inf;

            JOptionPane.showMessageDialog(null,
                    "Node added to the list, it was empty");

        }else if(head.foll== null){

            head.foll = inf;

            inf.bef = head;

            JOptionPane.showMessageDialog(null,
                    "Node added aside the only list element");

        }
        else{
            inf.foll=head.foll;
            head.foll=inf;

                JOptionPane.showMessageDialog(null,
                        "Node added between two nodes.");

            }
        }


        public void addStart () {

            nod inf = setNode();

            if (head == null) {

                head = inf;

                JOptionPane.showMessageDialog(null,
                        "Node added to the list, it was empty");

            } else {

                inf.foll = head;

                head.bef = inf;

                head = inf; //cab=cab.ant;

                JOptionPane.showMessageDialog(null,
                        "Node added at the start of the list.");

            }
        }



        public void byChildId(int childId){

            nod b= childId(childId);

            if(head == null)

                JOptionPane.showMessageDialog(null,
                        "Empty List ");

            else if(b==null)

                JOptionPane.showMessageDialog(null,
                        "The searched element is not here");

            else

                b.showTwo();
        }


    public void byParentId(int parentId){

        nod b= parntId(parentId);

        if(head == null)

            JOptionPane.showMessageDialog(null,
                    "Empty List");

        else if(b==null)

            JOptionPane.showMessageDialog(null,
                    "The searched element is not here");

        else

            b.showTwo();
    }





    public void setDelete(int childrenId){

        if(head == null)

            JOptionPane.showMessageDialog(null,
                    "Empty List.");

        else{

            nod b= childId(childrenId);

            if(b==null)

                JOptionPane.showMessageDialog(null,
                        "The searched element is not here.");

            else{

                if((b == head)&&(head.foll == null)){

                    head=null;

                    JOptionPane.showMessageDialog(null,
                            "Element deleted, the list is empty now.");
                }

                else if((b == head)&&(head.foll != null)){

                    head=head.foll;

                    b.foll=null;

                    head.bef=null;

                    b=null;

                    JOptionPane.showMessageDialog(null,
                            "Element deleted at the start of the list");

                }

                else if(b.foll==null){

                    b.bef.foll=null;

                    b.bef=null;

                    b=null;

                    JOptionPane.showMessageDialog(null,
                            "Element deleted at the end of the list");
                }
                else{

                    b.bef.foll=b.foll;

                    b.foll.bef=b.bef;

                    b.bef=b.foll=null;

                    b=null;

                    JOptionPane.showMessageDialog(null,
                            "Element deleted between two nodes.");
                }
            }
        }
    }

    //Este método genera un archivo,
    //si existe lo sobreescribe con toda
    //la información disponible en la lista
    void setRegisterArchive(){

        FileWriter fichero = null;

        PrintWriter pw = null;

        if(head == null){

            try{

                fichero = new FileWriter("c:/Prueba/prueba.txt");

                pw = new PrintWriter(fichero);

                pw.println("Empty List");

                JOptionPane.showMessageDialog(
                        null, "Datos guardados al archivo!",
                        "Información",
                        JOptionPane.INFORMATION_MESSAGE);

            }catch (Exception e) {

                JOptionPane.showMessageDialog(
                        null, "Information: \n"+e.getMessage(),
                        "Error!",
                        JOptionPane.WARNING_MESSAGE);

            } finally {

                try {

                    //Aprovechamos el finally para
                    //asegurarnos que se cierra el fichero.
                    if (null != fichero)
                        fichero.close();

                } catch (Exception e2) {

                    JOptionPane.showMessageDialog(
                            null, "Information: \n"+e2.getMessage(),
                            "Error!",
                            JOptionPane.WARNING_MESSAGE);

                }
            }

        }else{

            try{

                fichero = new FileWriter("c:/Prueba/prueba.txt");

                pw = new PrintWriter(fichero);

                nod p= head;

                while(p!=null){

                    pw.println(""+p.parentId);

                    pw.println(""+p.parentAge);

                    pw.println(""+p.parentName);

                    pw.println(""+p.parentSex);

                    pw.println(""+p.parentEmail);

                    pw.println(""+p.parentNumberPhone);

                    pw.println(""+p.childId);

                    pw.println(""+p.childName);

                    pw.println(""+p.childAge);

                    pw.println(""+p.childSex);

                    pw.println(""+p.childHeight);

                    pw.println(""+p.childWeight);

                    pw.println(""+p.municipality);

                    pw.println(""+p.cLorica);

                    pw.println(""+p.cMont);

                    pw.println(""+p.cSa);

                    pw.println(""+p.contCLH);

                    pw.println(""+p.contCLW);

                    p=p.foll;

                }

                JOptionPane.showMessageDialog(
                        null, "Datos guardados al archivo!",
                        "Información",
                        JOptionPane.INFORMATION_MESSAGE);

            }catch (Exception e) {

                JOptionPane.showMessageDialog(
                        null, "Information: \n"+e.getMessage(),
                        "Error!",
                        JOptionPane.WARNING_MESSAGE);

            } finally {

                try {

                    //Aprovechamos el finally para
                    //asegurarnos que se cierra el fichero.
                    if (null != fichero)
                        fichero.close();

                } catch (Exception e2) {

                    JOptionPane.showMessageDialog(
                            null, "Information: \n"+e2.getMessage(),
                            "Error!",
                            JOptionPane.WARNING_MESSAGE);

                }
            }
        }
    }

    public  nod childLH(){

        

        if(head == null){

         JOptionPane.showMessageDialog(null,"Empty list");

         return null;

        }
        else{

        JOptionPane.showMessageDialog(null,"Information about the boys with LH :"+" \n"+

        "Children with CL in Lorica : " + cLHL() +"\n"+

        "Children with CL in Montería : " + cLHM() +" \n"+

        "Children with CL in Sahagún : " + cLHS() +" \n");

        }
    

        JOptionPane.showMessageDialog(null,"Empty list");

        return null;
    }
       
        
        

    public  void childLW(){

        JOptionPane.showMessageDialog(null,
         "Information about the boys with LH : "+"\n"+

         "Children with CL in Lorica : " + cLWL() +"\n"+

         "Children with CL in Montería : " + cLWM() +"\n"+

        "Children with CL in Sahagún : " + cLWS() +"\n");


    }

    public  void municipality(){

        nod n = getLast();

        JOptionPane.showMessageDialog(null,
                "The Information about the boys in each municipality is :" + "\n" +

                         "Children  in Lorica : " + n.L() +  "\n" +

                          "Children  in Montería : " + n.M() + "\n" +

                          "Children  in Sahagún : " + n.S() + "\n");

    }
}
