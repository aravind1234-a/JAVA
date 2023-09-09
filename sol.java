// US008 - Passenger Registeration programming

//  Attributes:-
//  1. passenger id - 7 digit number with a default value
//  2. P name - String max 50
//  3. email - String
//  4. Password - String max 30
//  5. Address - String max 100
//  6. contact number - max 10  

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class sol{
    public static void main(String args[]){
        boolean done=true;
        ArrayList<passenger_registration> preg=new ArrayList<passenger_registration>();
        ArrayList<String> avail=new ArrayList<String>();
        while(done){
            Scanner sc = new Scanner(System.in);
            //pid
            ArrayList<Integer> aid=new ArrayList<>();
            Random random = new Random();
            int gpid=random.nextInt(9999)+1000000;
            while(true){
                boolean cpid=aid.contains(gpid);
                if(cpid){
                gpid=random.nextInt(9999)+1000000;
                continue;
                }
                else{
                    aid.add(gpid);
                    break;
                }
            }

            //name
            System.out.println("\nEnter ur name :-");
            String name = sc.nextLine();
            while(true){
                if(name.length()>50){
                    System.out.println("\nname out of range (Please re-enter ur name):-");
                    name = sc.nextLine();
                    continue;
                }
                else{
                    break;
                }
            }

            //email
            System.out.println("\nEnter ur email :- ");
            String email=sc.nextLine();
            while(true){
                if(email_validation(email) && (! avail.contains(email))){
                    avail.add(email);
                    break;
                }
                else if(avail.contains(email)){
                    System.out.println("\n ------User alredy exists-------");
                    System.out.println("\n ----------      THANK YOU      ----------");
                    System.exit(1);
                }
                else{
                    System.out.println("\nenter a valid email :-");
                    email=sc.nextLine();
                    continue;
                }
            }

            //password
            System.out.println("\nEnter your password :-" );
            String password= sc.nextLine();

            //Address 
            System.out.println("\nenter your address :- ");
            String address=sc.nextLine();
            
            //phone number
            System.out.println("\nenter ur phone number :- ");
            String ph=sc.nextLine();
            while(true){
                if(ph_validation(ph)){
                    break;
                }
                else{
                    System.out.println("\nenter valid phone number :-");
                    ph=sc.nextLine();
                    continue;
                }
            }
            preg.add(new passenger_registration(gpid,name,email,password,address,ph));
            System.out.println("\n -----------registration successful----------\n ");
            System.out.println("\n YOUR PASSENGER ID :- "+gpid+"\n");
            System.out.println("\n----------      THANK YOU       ----------\n");
            System.out.println("\n \npress E to exit or C to continue\n\n\n\n");
            String e=sc.nextLine();
            if(e.equalsIgnoreCase("E")){
                done=false;
            }
        }
    }

    public static boolean email_validation(String e){
        String regex = "^(.+)@(.+)$";
        Pattern pat=Pattern.compile(regex);
        Matcher mat=pat.matcher(e);
        if(mat.matches()){
            return true;
        }
        return false;
    }
    public static boolean ph_validation(String p){
        String regex = "^[6789][0-9]*";
        Pattern pat=Pattern.compile(regex);
        Matcher mat=pat.matcher(p);
        if(p.length()==10 && mat.matches()){
            return true;
        }
        return false;
    }
}
class passenger_registration{
    private int pid;
    private String pname,email,password,address,phno;
    
    passenger_registration(int pid,String pname,String email,String password,String address,String phno){
        this.pid = pid;
        this.pname = pname;
        this.email= email;
        this.password = password;
        this.address = address;
        this.phno=phno;
    }
    
}