interface MyCamera {
    void takeSnap();
    void recordedVideo();
    default  void  record4KVideo(){
        System.out.println("Recording in  4K");
    }
}
   interface MyWifi{
       String[]  getNetworks();
       //void connectToNetwork(String network);
   }
class  MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling..."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
   class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi{

    public void takeSnap() {
        System.out.println("Taking Snap");
    }
    public void recordedVideo(){
        System.out.println("Taking video");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Priti, Sai, Aradhya, Malhar"};
        return networkList;
    }
}
public class pps_57_DefaultMethodsInterface {
    public static void main(String[] args) {
        MyCellPhone ms = new MyCellPhone();
        ms.pickCall();
       // String [] ar = ms.getNetworks();
      // for (String item: ar){nnnn
          //  System.out.println(item);
        }
    }
