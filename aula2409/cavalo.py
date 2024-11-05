Aluno = {
    "silvio@logica.com": "MaTeMaTiCa",
}

Professor = {
    "silvioadmin@prof.com": "Professor2345678"
}

def verificar_login(email, senha, tipo):
    # Verifica se é Aluno ou Professor 
    if tipo == "Aluno" and email in Aluno and Aluno [email] == senha:
        return "Aluno"
    elif tipo == "Professor " and email in   Professor and Professor [email] == senha:
        return "Professor "
    return False

def sistema_aluno():
    print("Bem-vindo ao sistema do Aluno!")
    # Aqui você pode implementar funcionalidades de aluno
    print("Aqui você terá acesso aos seus cursos e cursos que podem ser do seu interesse, faça bom proveito ;).")

def sistema_Professor ():
    print("Bem-vindo ao painel do Professor !")
    # Aqui você pode implementar funcionalidades de administrador
    print("Aqui você poderá administrar seus alunos, coordenar seus cursos, entre outras funções, faça bom proveito ;) .")

def sistema():
    print("Bem-vindo ao SAGE (Sistema de Aprendizagem e Gestão Educacional), aqui você encontrará os melhores cursos, além dos melhores preços do mercado!")
    
    # Pergunta se é usuário ou administrador
    tipo_usuario = input("Você é (1) Aluno ou (2) Professor ? Digite o número correspondente: ")
    
    # Definindo o tipo de usuário
    if tipo_usuario == "1":
        tipo = "Aluno"
    elif tipo_usuario == "2":
        tipo = "Professor "
    else:
        print("Opção inválida. Tente novamente.")
        return
    
    # Solicita email e senha
    email = input("Digite seu email: ")
    senha = input("Digite sua senha: ")
    
    # Verifica se as credenciais estão corretas
    login_status = verificar_login(email, senha, tipo)
    
    if login_status == "Aluno":
        print(f"Acesso concedido como Aluno, {email}.")
        sistema_aluno()
    elif login_status == "Professor ":
        print(f"Acesso concedido como Professor , {email}.")
        sistema_Professor ()
    else:
        print("Email ou senha incorretos. Tente novamente.")

# Executa o sistema
if __name__ == "__main__":
    sistema()
