package my.company;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("no action");
    }

    @Override
    public void dial(int number) {
        System.out.println("now ringing  " + number);
    }

    @Override
    public void answer() {
if(isRinging){
    System.out.println("answering");
    isRinging=false;
}
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging=true;
            System.out.println("ring ring");
        }else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
