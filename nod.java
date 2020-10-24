import javax.swing.*;

public class nod {

    // Parent information

    public int parentId;

    public int parentAge;

    public String parentName;

    public String parentSex;

    public String parentEmail;

    public int parentNumberPhone;

    // Children information

    public int childId;

    public String childName;

    public int childAge;

    public String childSex;

    public int childHeight;

    public int childWeight;



    // Municipality

    public String municipality;

    //Counters

    public int cLorica;

    public int cMont;

    public int cSa;

    public int contCLH;

    public int contCLW;

    //List

    public nod foll , bef;

    nod(){
        // Parent information

         int parentId = -1;

         int parentAge = -1;

         String parentName = "";

         String parentSex = "";

         String parentEmail = "";

         int parentNumberPhone = -1;

        // Children information

         int childId = -1;

         String childName = "";

         int childAge = -1;

         String childSex = "";

         int childHeight = -1;

         int childWeight = -1;


        // Municipality

         String municipality = "";

        //Counters
         int cLorica = -1;

         int cMont = -1;

         int cSa = -1;

         int contCLH;

         int contCLW;

        //List

         foll = null;


    }

    public nod(  int parentId,

             int parentAge,

             String parentName,

             String parentSex,

             String parentEmail,

             int parentNumberPhone,

             int childId,

             String childName,

             int childAge,

             String childSex,

             int childHeight,

             int childWeight,

            // Municipality

             String municipality,

            //Counters
             int cLorica,

             int cMont,

             int cSa,

             int contCLH,

             int contCLW

               ) {

        this.parentName = parentName;

        this.parentAge = parentAge;

        this.parentId = parentId;

        this.parentSex = parentSex;

        this.parentEmail = parentEmail;

        this.parentNumberPhone = parentNumberPhone;

        this.childId = childId;

        this.childName = childName;

        this.childSex = childSex;

        this.childHeight = childHeight;

        this.childWeight = childWeight;

        this.childAge = childAge;

        this.municipality = municipality;

        this.cLorica = cLorica;

        this.cMont = cMont;

        this.cSa = cSa;

        this.contCLH = contCLH;

        this.contCLW = contCLW;

        foll = bef = null;
    }

    public void showTwo(){

        if(childSex.equals("M")) {

            String a = "The boy's weight and height is : \n";

            a += "Boy's height : " + childHeight + "\n";

            a += "Boy's weight: " + childWeight + "\n";

            JOptionPane.showMessageDialog(null, a);

        }
         else if (childSex.equals("F")){

            String a = "The girl's weight and height is : \n";

            a += "Girl's height : " + childHeight + "\n";

            a += "Girl's weight: " + childWeight + "\n";

            JOptionPane.showMessageDialog(null, a);

        }



    }

    public void showAll(){

        if(childSex.equals("M")) {

            String a = "The boy's weight and height is : \n";

            a += "Boy's Id : " + childId+ "\n";

            a += "Boy's Name: " + childName + "\n";

            a += "Boy's Age : " + childAge + "\n";

            a += "Boy's Sex : " + childSex + "\n";

            a += "Boy's Height: " + childHeight + "\n";

            a += "Boy's weight: " + childWeight + "\n";

            JOptionPane.showMessageDialog(null, a);

            String b = "The boy's weight and height is : \n";

            b += "Parent's Id : " + parentId+ "\n";

            b += "Parent's Name: " + parentName + "\n";

            b += "Parent's Age : " + parentAge + "\n";

            b += "Parent's Sex : " + parentSex + "\n";

            b += "Parent's Email: " + parentEmail + "\n";

            b += "Parent's Phone: " + parentNumberPhone + "\n";

            JOptionPane.showMessageDialog(null, b);




        }

        else if (childSex.equals("F")){

            String a = "The girl's weight and height is : \n";

            a += "Girl's Id : " + childId+ "\n";

            a += "Girl's Name: " + childName + "\n";

            a += "Girl's Age : " + childAge + "\n";

            a += "Girl's Sex : " + childSex + "\n";

            a += "Girl's height : " + childHeight + "\n";

            a += "Girl's weight: " + childWeight + "\n";

            JOptionPane.showMessageDialog(null, a);

            String b = "The boy's weight and height is : \n";

            b += "Parent's Id : " + parentId+ "\n";

            b += "Parent's Name: " + parentName + "\n";

            b += "Parent's Age : " + parentAge + "\n";

            b += "Parent's Sex : " + parentSex + "\n";

            b += "Parent's Email: " + parentEmail + "\n";

            b += "Parent's Phone: " + parentNumberPhone + "\n";

            JOptionPane.showMessageDialog(null, b);

        }
    }

    public int L(){

        int l = cLorica;

        return l;

    }

    public int S(){

        int S = cSa;

        return  S;
    }

    public int M(){

        int M = cMont;

        return M;
    }
}
