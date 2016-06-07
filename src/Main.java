import java.rmi.RemoteException;

import es.trafico.www.atex.esquema.vehiculo.AtexFault;
import es.trafico.www.atex.esquema.vehiculo.Vehiculo;
import es.trafico.www.atex.servicio.ATEX_WSProxy;
import es.trafico.www.atex.servicio.DatosUsuario;
import es.trafico.www.atex.servicio.SolicitudMatricula;

public class Main {

	public static void main(String[] args) throws AtexFault, RemoteException {
		SolicitudMatricula m = new SolicitudMatricula();
		m.setDatosUsuario(new DatosUsuario("C0720"));
		m.setMatricula("3838GHM");
		ATEX_WSProxy ap = new ATEX_WSProxy();
		Vehiculo answer = ap.consultarMatricula(m);
		System.out.println(answer);
		return;
	}

}
