import equipamento.*;
import geometria.Cilindo;
import polimorfismo.employee.*;
import polimorfismo.veiculo.*;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        Departamento dep = new Departamento(1,"Computacao");
        Empregado emp = new Empregado(101,"Mario", dep);
        Empregado novo;
        novo = emp;

        if(novo == emp)
            System.out.println("Iguais"); // imprime iguais
        else    
            System.out.println("Diferentes");
            
        System.out.println("Mostrando os dados iniciais ...");   
        System.out.println("novo: " + novo);   
        System.out.println("emp " + emp);
        
        novo.setNome("Gisele");
        System.out.println("Modificando nome de novo...");   
        System.out.println("novo: " + novo);   
        System.out.println("emp " + emp); // nome de emp passa a ser gisele, copia rasa

        System.out.println("Clonando emp em novo2 e modificando dados de novo2 ...");

        var novo2 = (Empregado)emp.clone();
        novo2.getDepartamento().setNome("AEDS I");
        novo2.setNome("Mario");
        System.out.println(novo2); 
        System.out.println(emp); // copia profunda, as alteraçoes em novo2 nao sao refletidas em emp

        System.out.println("Clonando emp em novo3 e comparando conteudos");

        var novo3 = (Empregado)emp.clone();

        if(emp.equals(novo3))
            System.out.println("Conteudos Iguais"); // conteudo vai ser igual, porem cada um tem seu endeço de memoria
        else
            System.out.println("Conteudos diferentes");

    }
    */

    // ComissionEmployeeDriver
    /*     
    ComissionEmployee employee = new ComissionEmployee("Sue", "Jones", "222-22-2222", 10000, 0.06);

    System.out.println(employee);
    */

    // BasePlusComissionEmployeeDriver
    /* 
    BasePlusComissionEmployee employee = new BasePlusComissionEmployee("Sue", "Jones", "222-22-2222", 10000, 0.06,8000);

    System.out.println(employee);
    System.out.println("\nTotal salary : " + employee.earnings());
    */
    /* 
    EquipamentoSonoro eq = new EquipamentoSonoro();

    short s = 10;

    eq.liga();
    eq.setVolume(s);
    System.out.println(eq);
    */

    // Cilindro
    /* 
    Cilindo c = new Cilindo(3, 4, 10, 15);

    System.out.println("Area: " + c.area());
    System.out.println("Volume: " + c.volume());
    System.out.println(c.toString());
    */

    // Driver oficina
    /* 
    Oficina of = new Oficina();
    Veiculo vec;

    for (int i = 0; i < 4; i++) {
        vec = of.proximo();
        System.out.println(of.getNum());
        of.manter(vec);
    }
    */

    //Drive Empregado versao polimorfismo

    EmpregadoAssalariado ea = new EmpregadoAssalariado("John", "Smith", "11111111-1", 800.00);

    EmpregadoHorista eh = new EmpregadoHorista("Karen", "Price", "2222222-2", 16.75, 40);

    EmpregadoComissionado ec = new EmpregadoComissionado("Sue", "Jones", "33333333-3", 10000, 0.06);

    EmpregadoComissionadoAssalariado eca = new EmpregadoComissionadoAssalariado("Bob", "Lewis", "444444444-4", 5000, 0.04, 300);

    System.out.println("Processando individualmente\n");

    System.out.println(ea.salario());
    System.out.println(eh.salario());
    System.out.println(ec.salario());
    System.out.println(eca.salario());

    Empregado vetor[] = new Empregado[4];

    vetor[0] = ea;
    vetor[1] = eh;
    vetor[2] = ec;
    vetor[3] = eca;

    System.out.println("Processando polimorficamente\n");

    for(Empregado elem: vetor) {
        System.out.println(elem);
        if(elem instanceof EmpregadoComissionadoAssalariado) {
            EmpregadoComissionadoAssalariado tmp = (EmpregadoComissionadoAssalariado)elem;
            tmp.setSalarioMensal(tmp.getSalarioMensal()*1.1);
            System.out.println(tmp);
        }
        System.out.println("Salario: " + elem.salario());
    }
    
    for (Empregado elem: vetor) {
        System.out.println("O empregado e " + elem.getClass().getSimpleName());
    }
    }
}
