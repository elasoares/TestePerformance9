import lombok.*;

@Getter@AllArgsConstructor@NoArgsConstructor
public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;

    public int setMatricula(int matricula) {
        if (matricula <= 0) {
            throw new ArithmeticException("Erro: Matrícula deve ser maior que zero.");
        }
        this.matricula = matricula;
        return matricula;
    }
}