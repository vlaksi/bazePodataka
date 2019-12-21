package rs.ac.uns.ftn.db.jdbc.pozoriste.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import rs.ac.uns.ftn.db.jdbc.pozoriste.dto.PrikazivanjeDTO;
import rs.ac.uns.ftn.db.jdbc.pozoriste.model.Prikazivanje;

public interface PrikazivanjeDAO extends CRUDDao<Prikazivanje, Integer> {

	// Metoda koja racuna ukupan broj gledalaca, prosecan broj gledalaca i broj prikazivanja za svaku predstavu
	HashMap<Integer, PrikazivanjeDTO> nadjiSumAvgCountPredstave() throws SQLException;
	
	// Metoda koja vraca ID-eve predstava koje se prikazuju
	List<Integer> pronadjiPrikazivanePredstave() throws SQLException;
	
	
	// Metoda koja pronalazi sva prikazivanja odredjene predstave
	List<Prikazivanje> nadjiSvaPrikazivanjaPredstave(Integer idPredstave) throws SQLException;
}