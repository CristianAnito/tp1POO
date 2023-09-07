import ar.edu.unlu.poo.ecuacionsg.EcuacionSG;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EcuacionSGTest {
    @Test
    void obtengo_Valor_y(){
        EcuacionSG ecuacion = new EcuacionSG(1,2,1);
        assertEquals(4,ecuacion.calcularResultado("1", "1"));
    }

}
