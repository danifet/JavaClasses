package day48_constructors_static;

public class CybertekGroups {
    public static void main (String[]args){
        Group group1 = new Group ("Cyberbugs");
        System.out.println(group1.getGroupName());

        System.out.println(group1.getMembers().size());
    }
}
