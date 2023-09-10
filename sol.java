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

        Scanner sc=new Scanner(System.in);
        ArrayList<passenger_registration> preg=new ArrayList<passenger_registration>();
        ArrayList<p_register> p2reg=new ArrayList<p_register>();
        ArrayList<String> aid=new ArrayList<>();//ids
        ArrayList<String> avail=new ArrayList<String>();//email
        ArrayList<String> pnrno=new ArrayList<String>();//pnrno
        boolean done=true;
        while(done){
            System.out.println("\nEnter your choice");
            System.out.println("\n  1 ---> registration \n  2 ---> Ticket booking\n  3 ---> view details");
            String ch=sc.nextLine();
            switch(ch){
                case "1":ArrayList<String>[] uc8= registration(avail,aid);
                        preg.add(new passenger_registration(uc8[0].get(0),uc8[0].get(1),uc8[0].get(2),uc8[0].get(3),uc8[0].get(4),uc8[0].get(5)));
                        aid=uc8[2];
                        avail=uc8[1];
                        System.out.println("\n -----------registration successful----------\n ");
                        System.out.println("\n YOUR PASSENGER ID :- "+uc8[0].get(0)+"\n");
                        System.out.println("\n----------      THANK YOU       ----------\n");
                        break;
                case "2":ArrayList<String>[] uc9 = tbook(preg,pnrno);
                        if (uc9 != null){
                            p2reg.add(new p_register(uc9[0].get(0),uc9[0].get(1) ,uc9[0].get(2) ,uc9[0].get(3) ,uc9[0].get(4) ,uc9[0].get(5) ,uc9[0].get(6),uc9[0].get(7) ));
                            pnrno=uc9[1];
                        }
                        break;
                case "3":System.out.println("\n enter your Passenger id to view ur detals:-");
                        String pi3=sc.nextLine();
                        ArrayList<String[]> uc10= fetch_det(pi3,p2reg); 
                        if(uc10.size()>0){
                            for(int i=0;i<uc10.size();i++){
                            System.out.println(uc10.get(i)[0]+"\t"+uc10.get(i)[1]+"\t"+uc10.get(i)[2]+"\t"+uc10.get(i)[3]+"\t"+uc10.get(i)[4]+"\t"+uc10.get(i)[5]);
                            }
                        }
                        else{
                            System.out.println("passenger id does not exist");
                        }
                        break;
                default: System.out.println("Operations out of range");
            }
            System.out.println("enter E to exit or C to continue");
            String re=sc.nextLine();
            if(re.equalsIgnoreCase("E")){
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
    public static ArrayList[] registration(ArrayList<String>  avail,ArrayList<String>  aid){
        ArrayList<String> f1=new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        //pid
        Random random = new Random();
        int gpid = random.nextInt(9999)+1000000;
        String ppid=Integer.toString(gpid);
        while(true){
            boolean cpid=aid.contains(gpid);
            if(cpid){
            gpid=random.nextInt(9999)+1000000;
            continue;
            }
            else{
                aid.add(Integer.toString(gpid));
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
        f1.add(ppid);
        f1.add(name);
        f1.add(email);
        f1.add(password);
        f1.add(address);
        f1.add(ph);
        ArrayList[] rr={f1,avail,aid};
        return rr;
    }
    public static ArrayList[] tbook(ArrayList<passenger_registration> p,ArrayList<String> pnrno){
        ArrayList<String> f2=new ArrayList<String>();
        System.out.println("enter ur Passenger ID :-");
        Scanner sc=new Scanner(System.in);
        String pf2=sc.nextLine();
        String pidf2;
        for(passenger_registration i:p){
            if(i.getpid().equals(pf2)){
                pidf2=i.getpid();
            }
            else{
                System.out.println("user does not exists \nplease register urself brfore booking a ticket");
                return null;
            }
        }
        Random random = new Random();
        int gpnr = random.nextInt(99999)+2000000;
        String ppnr=Integer.toString(gpnr);
        while(true){
            boolean cpnr=pnrno.contains(gpnr);
            if(cpnr){
            gpnr=random.nextInt(9999)+1000000;
            continue;
            }
            else{
                pnrno.add(Integer.toString(gpnr));
                break;
            }
        }
        System.out.println("\nenter the travelling date (dd/mm/yyyy)");
        String date=sc.nextLine();
        System.out.println("\nentrer the source");
        String source=sc.nextLine();
        System.out.println("\nentrer the destination");
        String dest=sc.nextLine();
        System.out.println("\nenter your status (new/confirm/hold)");
        String status=sc.nextLine();
        System.out.println("\nenter your seat preference (middle/aisle)");
        String sp=sc.nextLine();
        System.out.println("\nenter your Meal preference (veg/nveg)");
        String mp=sc.nextLine();
        f2.add(pf2);
        f2.add(ppnr);
        f2.add(date);
        f2.add(source);
        f2.add(dest);
        f2.add(status);
        f2.add(sp);
        f2.add(mp);
        ArrayList[] rr2={f2,pnrno};
        return rr2;
    }
    public static ArrayList fetch_det(String p3,ArrayList<p_register> reg){
        ArrayList<String[]>f3=new ArrayList<String[]>();
        for(p_register i:reg){
            if(i.getppid().equals(p3)){
                String[] k=new String[6];
                k[0]=i.getpnrno();
                k[1]=i.getdate();
                k[2]=i.getsource();
                k[3]=i.getdestination();
                k[4]=i.getsp();
                k[5]=i.getmp();
                f3.add(k);
            }
        }
        return f3;
    }
}
class passenger_registration{
    private String pid,pname,email,password,address,phno;
    
    passenger_registration(String pid,String pname,String email,String password,String address,String phno){
        this.pid = pid;
        this.pname = pname;
        this.email= email;
        this.password = password;
        this.address = address;
        this.phno=phno;
    }
    
    public String getpid(){
        return this.pid;
    }
    
}
class p_register{
    private String ppid,pnrno,date,source,destination,status,seatp,mealp;
    p_register(String ppid,String pnrno,String date,String source,String destination,String status,String seatp,String mealp){
        this.ppid=ppid;
        this.pnrno = pnrno;
        this.date=date;
        this.source=source;
        this.destination=destination;
        this.status=status;
        this.seatp=seatp;
        this.mealp=mealp;
    }
    public String getppid(){
        return this.ppid;
    }
    public String getpnrno(){
        return this.pnrno;
    }
    public String getdate(){
        return this.date;
    }
    public String getsource(){
        return this.source;
    }
    public String getdestination(){
        return this.destination;
    }
    public String getsp(){
        return this.seatp;
    }
    public String getmp(){
        return this.mealp;
    }
}