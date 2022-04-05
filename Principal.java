public class Principal {
    public static void main(String[]args){
        Gerente gerente=new Gerente();
        System.out.println("Digite a senha: ");
        gerente.setSenha(306412);
        System.out.println(gerente.getSenha());
        
        Funcionario funcionario=new Funcionario();
        funcionario.setNome("Matheus");
        funcionario.setCPF("47699316894");
        funcionario.setSalario(5000);
        funcionario.setDepartamento("Compras");
        funcionario.setBonus(2500);

        Funcionario Funcionario=new Funcionario();
        System.out.println("Nome: ");
        System.out.println(funcionario.getNome());
        System.out.println("CPF: ");
        System.out.println(funcionario.getCPF());
        System.out.println("Salário: ");
        System.out.println(funcionario.getSalario());
        System.out.println("Departamento: ");
        System.out.println(funcionario.getDepartamento());
        System.out.println("O bônus adicionado é: ");
        System.out.println(funcionario.getBonus());
    }
    
}
