public class Principal {
    public static void main(String[]args){
        Funcionario funcionario=new Funcionario();
        funcionario.setNome("Matheus");
        funcionario.setCPF("47699316894");
        funcionario.setSalario(5000);
        funcionario.setDepartamento("Compras");

        Funcionario Funcionario=new Funcionario();
        System.out.println("Nome: ");
        System.out.println(funcionario.getNome());
        System.out.println("CPF: ");
        System.out.println(funcionario.getCPF());
        System.out.println("Salário: ");
        System.out.println(funcionario.getSalario());
        System.out.println("Departamento: ");
        System.out.println(funcionario.getDepartamento());
    }
    
}
