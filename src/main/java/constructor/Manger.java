package constructor;

public class Manger extends SuperConsturctorPerson{
   String name;
    Manger(int id,String name){
       super(id);
       this.name = name;
        System.out.println("Manger default constructor called!"+
                "\nManger ID: " + id +
                "\nManger Name: " + name);
    }
}
