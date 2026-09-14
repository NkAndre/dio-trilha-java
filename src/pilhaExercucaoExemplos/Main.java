package pilhaExercucaoExemplos;

public class Main {
    public static void main(String[] args) {
        System.out.println("inicio do programa no método main");
        a();

        System.out.println("finalizou do programa no método main");
    }

    public static void a(){
        System.out.println("entrou no metodo A");
        b();
        System.out.println("Finalizou o método A");
    }
    public static void b(){
        System.out.println("entrou no metodo B");
        for(int i = 0; i<=4;i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método B");
    }
    public static void c(){
        System.out.println("entrou no metodo C");
        //Thread.dumpStack();
        System.out.println("Finalizou o método C");
    }


}
