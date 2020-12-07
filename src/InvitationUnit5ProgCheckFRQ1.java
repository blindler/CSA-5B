

public class InvitationUnit5ProgCheckFRQ1 {

    public static void main(String[] args){
        Invitation invite = new Invitation("barry", "ChickFilA");
        System.out.println(invite.getHostName());
        invite.setAddress("AwfulWaffle");
        System.out.println( invite.getMessage("Morgan"));

        Invitation invite2 = new Invitation("Austin's House");
        System.out.println(invite2.getMessage("cousin"));
    }
}

class Invitation
{
    private String hostName;
    private String address;

    public Invitation(String n, String a)
    {
        hostName = n;
        address = a;
    }

    public Invitation(String address)
    {
        this.address = address;
        hostName = "Host";
    }

    public String getHostName(){
        return hostName;
    }

    public void setAddress(String add){
        address = add;
    }

    public String getMessage(String invitee){
        String message = "Dear " + invitee + ", please attend my event at " +
                address + ". See you then, " + hostName;

        return message;
    }



   /** Dear Cheryl, please attend my event at 1234 Walnut Street. See you
    then, Karen. */

}


