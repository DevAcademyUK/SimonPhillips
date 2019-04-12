package backend.Library;

public class member {
    public int memberID;
    public String memberForename;
    public String memberSurname;
    public byte memberAge;

    public member(int ID, String forename, String surname, byte age){
        memberID = ID;
        this.memberForename = forename;
        this.memberSurname = surname;
        this.memberAge = age;
    }
}
