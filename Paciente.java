public class Paciente {
    private String nome;
    private String dataNacimento;
    private boolean marcacao;
    private String id;
    private String login;
    //private String doenca;

    public Paciente() {
        this.marcacao=false;
    }

    public Paciente(String nome, String dataNacimento, boolean marcacao, String id) {
        this.nome = nome;
        this.dataNacimento = dataNacimento;
        this.marcacao = marcacao;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

}
