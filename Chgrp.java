
import java.awt.Font;

import javax.swing.JOptionPane;

import javax.swing.UIManager;

import javax.swing.plaf.ColorUIResource;



public class Chgrp {


        public static void main (String[] args){

            try{


                int Option,Exit;

                int childrenId; int parentId;

                Potsu main=  new Potsu();

                do {

                    UIManager.put("OptionPane.messageFont", new Font("Montserrat", Font.BOLD, 14));

                    UIManager.put("OptionPane.buttonFont", new Font("Montserrat", Font.PLAIN, 12));

                    
                    UIManager UI=new UIManager();

                    UIManager.put("OptionPane.background",new ColorUIResource(0,150,136));

                    UIManager.put("Panel.background",new ColorUIResource(238,238,238));



                    Option=Integer.parseInt(JOptionPane.showInputDialog(

                            "     ----------------Main Menu----------------\n"+"\n"+

                                    "1. Register the children information a the end.  \n"+"\n"+

                                    "2. Register the children information a the start." +"\n"+

                                    "3. Register the children information between two nodes."+ "\n" +

                                    "4. Show the children height and weight by children id. " +"\n"+

                                    "5. Show the children height and weight by parent id."+"\n"+

                                    "6. Delete the children information by children id."+"\n"+

                                    "7. Amount of children with low height in each municipality." +"\n"+

                                    "8. Information about the boys with low weight and ."+"\n"+
                                      " Amount of children with low height in each municipality."+ "\n" +

                                    "9. Show the children information per municipality and. " +"\n"+
                                      " Amount of children for each municipality"+ "\n" +

                                    "10. Generate a text file with the list content."+"\n"+

                                    "11. Close the Menu. "+"\n"+

                                    " Please enter an option : "));


                    switch(Option){
                        case 1:

                            try{

                                main.addLast();

                            }catch(NegativeArraySizeException a){

                                JOptionPane.showMessageDialog(null, "DO NOT INSERT NEGATIVE NUMBERS "
                                        + "FOR THE ARRAY LENGHT");

                            }catch(NumberFormatException b){

                                JOptionPane.showMessageDialog(null, " DO NOT INSERT LETTERS,SIGNS \n"
                                        + " OR AN EXAGGERATED AMOUNT OF  \n"
                                        + " NUMBERS IN THE ARRAY PLEASE ");
                            }catch(NullPointerException d){

                                d.printStackTrace();

                                JOptionPane.showMessageDialog(null, "please be logic ");
                            }

                            break;

                        case 2:

                            main.addStart();

                            break;

                        case 3:


                                try{

                                    main.addBetween();

                                } catch(NumberFormatException b){
                                    JOptionPane.showMessageDialog(null, "DO NOT INSERT LETERS, SIGNS\n"
                                            + "OR EXAGGERATE AMOUNT OF NUMBERS \n"
                                            +" IN THE LICENSE PLATE PLEASE");
                                }

                            break;

                        case 4:
                                    childrenId = Integer.parseInt(JOptionPane.showInputDialog("Please enter the children id"));
                                    main.byChildId(childrenId);

                            break;



                        case 5:


                                try{

                                   parentId = Integer.parseInt(JOptionPane.showInputDialog("Please enter the parent id"));
                                   main.byParentId(parentId);


                                }catch(ArrayIndexOutOfBoundsException c){
                                    JOptionPane.showMessageDialog(null,"Please be logic");
                                }

                            break;

                        case 6:


                            try{

                                childrenId = Integer.parseInt(JOptionPane.showInputDialog("Please enter the children id"));
                                main.setDelete(childrenId);


                            }catch(ArrayIndexOutOfBoundsException c){
                                JOptionPane.showMessageDialog(null,"Please be logic");
                            }

                            break;

                        case 7:

                        main.childLH();


                         case 8:


                            try{

                                main.childLw();
                                main.childLW();


                            }catch(ArrayIndexOutOfBoundsException c){
                                JOptionPane.showMessageDialog(null,"Please be logic");
                            }

                            break;



                        case 9:


                            try{

                                main.childL();
                                main.childM();
                                main.childS();
                                main.municipality();


                            }catch(ArrayIndexOutOfBoundsException c){
                                JOptionPane.showMessageDialog(null,"Please be logic");
                            }

                            break;

                        case 10:


                            try{

                                main.setRegisterArchive();


                            }catch(ArrayIndexOutOfBoundsException c){
                                JOptionPane.showMessageDialog(null,"Please be logic");
                            }

                            break;

                        case 11:
                            JOptionPane.showMessageDialog(null, "See you later.");
                            break;
                        default:

                            JOptionPane.showMessageDialog(null, "Non valid option ");



                    }


                }while (Option != 11);
                System.exit(0);


            } catch(NumberFormatException a){

                JOptionPane.showMessageDialog(null, "BE LOGIC PLEASE");


            }
        }
}
