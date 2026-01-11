interface Alpha {
    void methodA();
    void methodB();
}

interface Beta {
    void methodC();
    void methodD();
}

abstract class AbstractBase implements Alpha {
    public void methodA() {
        System.out.println("A");
    }
    public abstract void methodE();
}

class FinalClass extends AbstractBase {

    public void methodB() {
        System.out.println("B");
    }

    public void methodC() {
        System.out.println("C");
    }

    public void methodD() {
        System.out.println("D");
    }

    public void methodE() {
        System.out.println("E");
    }
}
