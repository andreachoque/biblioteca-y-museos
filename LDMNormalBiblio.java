import java.util.Scanner;

public class LDMNormalBiblio extends LDMBiblio{
	
		public LDMNormalBiblio()
		{
			super();
		}
		public boolean esVacia()
		{
			if(getPm()==null)
				return true;
			else
				return false;
		}
		
		
		public void addPrincipio(NodoDobleBiblio w)
		{
			
			if(getPm()==null)
			{
				setPm(w);
			}
			else
			{
				w.setSig(getPm());
				getPm().setAnt(w);
				setPm(w);
			
			}
		}
		
		
		public void addFinal(Biblioteca x)
		{
			NodoDobleBiblio w=new NodoDobleBiblio();
			w.setDatoL(x);
			NodoDobleBiblio aux;
			if(getPm()==null)
			{
				setPm(w);
			}
			else
			{
				aux=getPm();
				while(aux.getSig()!=null)
				{
					aux=aux.getSig();
				}
				aux.setSig(w);
				w.setAnt(aux);
			}		
		}
		
		public NodoDobleBiblio delPrincipio()
		{
			NodoDobleBiblio w=new NodoDobleBiblio();
			w=getPm();
			if(w.getSig()==null)
			{
				setPm(null);
			}
			else
			{
				setPm(w.getSig());
				getPm().setAnt(null);
				w.setSig(null);
			}
			return w;
		}
		
		public NodoDobleBiblio delFinal()
		{
			NodoDobleBiblio w=new NodoDobleBiblio();
			NodoDobleBiblio aux;
			aux=getPm();
			w=getPm();
			if(aux.getSig()==null)
			{
				setPm(null);			
			}
			else
			{
				while(aux.getSig()!=null)
				{
					aux=aux.getSig();
				}
				aux.getAnt().setSig(null);
				aux.setAnt(null);
				w=aux;
			}
			return w;
		}
		
		public void leerPrincipio(int n)
		{
			Scanner teclado = new Scanner(System.in);
			for(int i=1;i<=n;i++)
			{
				LSNormalLibros x= new LSNormalLibros(); 
				Libros l= new Libros();
				x.addPrimero(l);
			}
		}
		public void leerFinal(int n)
		{
			//Scanner teclado = new Scanner(System.in);
			for(int i=1;i<=n;i++)
			{
				LSNormalLibros x= new LSNormalLibros(); 
				Libros l= new Libros();
				x.addUltimo(l);
			}
		}
		/*public void mostrarLDN()
		{
			LSNormalLibros laux= new LSNormalLibros();
			NodoDobleBiblio aux;
			aux=getPm();
			while(aux!=null)
			{
				laux.setP(aux.getDatoL());
				laux.mostrarLSN();
				System.out.println("\n.........");
				aux = aux.getSig();
			}
		} */
		public void mostrarLDN()
		{
		    NodoDobleBiblio aux = getPm();
		    while(aux != null)
		    {
		        // Imprimir el nombre de la biblioteca
		        System.out.println("Biblioteca: " + aux.getDatoL().getDireccion());

		        // Recorrer la lista de libros de la biblioteca y mostrarlos
		        NodoLSLibro nodoLibro = aux.getDatoB().getL().getCab();
		        while (nodoLibro != null)
		        {
		            System.out.println("Libro: " + nodoLibro.getLibro().getTitulo());
		            nodoLibro = nodoLibro.getSig();
		        }

		        // Ir al siguiente nodo de la lista de bibliotecas
		        aux = aux.getSig();
		    }
		}

		
}
