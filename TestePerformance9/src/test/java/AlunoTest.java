import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoTest {
    @Test
    public void testarMatricula() {
        int numero = 5;
        int esperado = 5;
        Aluno matricula = new Aluno();
        int resultado =  matricula.setMatricula(numero);
        Assertions.assertEquals(esperado, resultado);
    }
}
