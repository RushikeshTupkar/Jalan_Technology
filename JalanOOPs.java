
import java.util.*;

class Service{
HashMap<String ,String>serviceNames;
Map<String,Integer>BS01;
Map<String,Integer>EF01;
Map<String,Integer>CF01;
Map<String,Integer>GF01;
Map<String,Integer>BF01;

Service(){

 serviceNames = new HashMap<>();
    serviceNames.put("BS01","Basic Servicing       ");
    serviceNames.put("EF01","Engine Fixing         ");
    serviceNames.put("CF01","Clutch Fixing         ");
    serviceNames.put("BF01","Brake Fixing          ");
    serviceNames.put("GF01","Gear Fixing           ");

BS01 = new HashMap<String,Integer>();
    BS01.put("Hatchback",2000);
    BS01.put("Sedan",4000);
    BS01.put("Suv",5000);
    
EF01 = new HashMap<String,Integer>();
    EF01.put("Hatchback",5000);
    EF01.put("Sedan",8000);
    EF01.put("Suv",10000);

    CF01 = new HashMap<String,Integer>();
    CF01.put("Hatchback",2000);
    CF01.put("Sedan",4000);
    CF01.put("Suv",6000);

    GF01 = new HashMap<String,Integer>();
    GF01.put("Hatchback",1000);
    GF01.put("Sedan",1500);
    GF01.put("Suv",2500);
    
    
    BF01 = new HashMap<String,Integer>();
    BF01.put("Hatchback",3000);
    BF01.put("Sedan",6000);
    BF01.put("Suv",8000);

    
}
    public int services(String cartype, String serviceCode){

        switch(serviceCode){
            case "BS01": return BS01.get(cartype);
            case "EF01": return EF01.get(cartype);
            case "CF01": return CF01.get(cartype);
            case "BF01": return BF01.get(cartype);
            case "GF01": return GF01.get(cartype);
    }   return 0;
}

public void addCarType(String newCarType,int bs01, int ef01, int cf01, int gf01, int bf01){
    BS01.put(newCarType,bs01);
    EF01.put(newCarType,ef01);
    CF01.put(newCarType,cf01);
    GF01.put(newCarType,gf01);
    BF01.put(newCarType,bf01);
}

}

    public class JalanOOPs{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String>servicesTodo = new ArrayList<>();

        String carType = sc.nextLine();
        String exit = "x";
        while(true){
                String code1 = sc.next();
            if(code1.equals(exit)){
                int bill = 0;
                Service obj = new Service();
        for(int i = 0; i<servicesTodo.size(); i++){
                String code = servicesTodo.get(i);
                int value = obj.services(carType,code);
                bill+=value;
                System.out.println(obj.serviceNames.get(code)+"- Rs "+value);
            }
            if(bill>10000){
                System.out.println("Complimentry cleaning - Rs 0");
            }
                System.out.println("Total bill            - Rs "+bill);
                sc.close();
                return;
        }   else{
                servicesTodo.add(code1);
        }
        }

        
    }
}