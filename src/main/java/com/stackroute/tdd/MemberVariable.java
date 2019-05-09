//class named Member with Name, age, Salary as its variable, write an other
//class named Member Variable that creates an instance of the Member class, initialises its
//member variables, and then displays the value of each member variable.

package com.stackroute.tdd;

class Member {

    // print name, age and salary
    public void display(String name, int age, double salary) {
        System.out.println("Members name:" + name);
        System.out.println("Members age:" + age);
        System.out.println("Members salary:" + salary);
    }


}

public class MemberVariable {
    public static void main(String[] args) {


        Member variable = new Member();
        //pass the arguments to method display
        variable.display("Harrypotter", 30, 2500.3);
    }

}