package scratchPad;

class Base{
    Base privateClass;
    Base(Base privateClass){
        this.privateClass=privateClass;
    }
    public void display() {
        privateClass.display();
    }
    
}
class Child extends Base{

    Child() {
        super(new Child());
    }
    public void display() {
        System.out.println("This is child class");
    }
    
}
public class PrivateClassDataPattern {
        public static void main(String[] ar) {
            new Base(new Child()).display(); 
        }
}
