class Gerente extends Funcionario {
	int senha;
	int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}