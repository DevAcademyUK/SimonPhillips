package backend.LibraryLists;

import java.util.Comparator;

public class member implements Comparable<member> {
    public int memberID;
    public String memberForename;
    public String memberSurname;
    public byte memberAge;

    public member(int ID, String forename, String surname, byte age) {
        memberID = ID;
        this.memberForename = forename;
        this.memberSurname = surname;
        this.memberAge = age;
    }

    public static Comparator<member> memberFnameComparator = new Comparator<member>() {
        @Override
        public int compare(member m1, member m2) {
            String fname1 = m1.memberForename.toLowerCase();
            String fname2 = m2.memberForename.toLowerCase();

            return fname1.compareTo(fname2);
        }
    };

    public static Comparator<member> memberSnameComparator = new Comparator<member>() {
        @Override
        public int compare(member m1, member m2) {
            String sname1 = m1.memberSurname.toUpperCase();
            String sname2 = m2.memberSurname.toUpperCase();

            return sname1.compareTo(sname2);
        }
    };

    public static Comparator<member> memberAgeComparator = new Comparator<member>() {
        @Override
        public int compare(member m1, member m2) {
            byte age1 = m1.memberAge;
            byte age2 = m2.memberAge;

            return age1.compareTo(age2);
        }
    };

}
