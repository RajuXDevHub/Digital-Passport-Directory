import java.util.*;



class Passport {
    private String name ;
    private String city ;
    private String country ;

    public Passport(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return " name :  "+ name + " city : "+ city  + " country : "+ country;
    }
}

public class PasswordDirectory {
    public static void main(String[] args) {


        System.out.println(" Passport Information App : ");
        Passport p1 = new Passport("Raju","Malda","West Bengal ");
        Passport p2 = new Passport("Nijanjana","NandiGram ","West Bengal ");
        Passport p3 = new Passport("Raj","Kolkata "," Noida  ");

        Integer passNo1 = Integer.valueOf(101);
        Integer passNo2 = Integer.valueOf(102);
        Integer passNo3 = Integer.valueOf(103);

        HashMap<Integer , Passport> hm = new HashMap<>();
        hm.put(passNo1,p1);
        hm.put(passNo2,p2);
        hm.put(passNo3,p3);

        System.out.println(hm);


        //? Imput from the user

        Scanner snc = new Scanner(System.in);
        System.out.print("Kindly Enter your Passport no : ");
        Integer userN = snc.nextInt();

        boolean flag = false;

        Set<Map.Entry<Integer,Passport>> values = hm.entrySet();
        Iterator<Map.Entry<Integer,Passport>> itr =  values.iterator();

        while ( itr.hasNext()){
            Map.Entry<Integer,Passport> keyValue = itr.next();
            Integer key = keyValue.getKey();

            if (key.equals(userN)) {

                System.out.println(" Found your details given billow : ");
                System.out.println(keyValue.getValue());
                flag = true;
            }
//            System.out.println(keyValue.getKey());


        }
        if ( flag == false){
            System.out.println( "Unable to fetch your information based on passport id given ");
        }

    }
}
