

public class Defensa2ParaleloC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        LSNormalLibros l1=new LSNormalLibros();
		l1.addUltimo(new Libros("Las intermitencias de la muerte", "Jose Saramago", 214, 2005));
		l1.addUltimo(new Libros("Animales Fantasticos", "JK Rowling", 150, 2001));
		l1.addUltimo(new Libros("Fuego y sangre", "George RR Martin", 100, 2018));
		l1.addUltimo(new Libros("El Se�or de los anillos", "JRR Tolkien", 100, 1954));
		
		LSNormalLibros l2=new LSNormalLibros();
		l2.addUltimo(new Libros("Harry Potter", "JK Rowling", 50, 1997));
		l2.addUltimo(new Libros("El resplandor", "Stephen King", 84, 1978));
		l2.addUltimo(new Libros("Juego de Tronos", "George RR Martin", 300, 1996));
		l2.addUltimo(new Libros("Carrie", "Stephen King", 100, 1974));
		
		LSNormalLibros l3 = new LSNormalLibros();
		l3.addUltimo(new Libros("Nomadas nocturnos", "George RR Martin", 210, 1980));
		l3.addUltimo(new Libros("Una vacante imprevista", "JK Rowling", 130,  2012));
		l3.addUltimo(new Libros("It", "Stephen King", 95,1986));
		l3.addUltimo(new Libros("El hobbit", "JRR Tolkien", 80,1937));
		l3.addUltimo(new Libros("Cuentos de Beedle el Bardo", "JK Rowling", 105, 2012));
		
		LSNormalLibros l4 = new LSNormalLibros();
		l4.addUltimo(new Libros("La historia de Lisey", "Stephen King", 10, 2006));
		l4.addUltimo(new Libros("El Silmarillion", "JRR Tolkien", 35, 1977));
		l4.addUltimo(new Libros("El gusano de seda", "JK Rowling", 60, 2016));
		l4.addUltimo(new Libros("La historia de Beren y Luthien", "JRR Tolkien", 88, 2017)); 
		
		LSNormalLibros l5 = new LSNormalLibros();
		l5.addUltimo(new Libros("Muerte de la luz", "George RR Martin", 150, 1977));
		l5.addUltimo(new Libros("El retorno del rey", "JRR Tolkien", 300, 1955));
		l5.addUltimo(new Libros("La larga marcha", "Stephen King", 190,1979));
		l5.addUltimo(new Libros("El canto del Cuco", "JK Rowling", 99, 2013));
		l5.addUltimo(new Libros("Festin de cuervos", "George RR Martin", 500, 2004));
		
		LSNormalLibros l7 = new LSNormalLibros();
		l7.addUltimo(new Libros("Cien a�os de soledad", "Gabriel Garc�a M�rquez", 300, 1967));
		l7.addUltimo(new Libros("El amor en los tiempos del c�lera", "Gabriel Garc�a M�rquez", 250, 1985));
		l7.addUltimo(new Libros("La ciudad y los perros", "Mario Vargas Llosa", 200, 1963));
		l7.addUltimo(new Libros("La casa de los esp�ritus", "Isabel Allende", 280, 1982));
		l7.addUltimo(new Libros("Rayuela", "Julio Cort�zar", 150, 1963));

		LSNormalLibros l8 = new LSNormalLibros();
		l8.addUltimo(new Libros("1984", "George Orwell", 180, 1949));
		l8.addUltimo(new Libros("Un mundo feliz", "Aldous Huxley", 200, 1932));
		l8.addUltimo(new Libros("Fahrenheit 451", "Ray Bradbury", 150, 1953));
		l8.addUltimo(new Libros("El hombre invisible", "H.G. Wells", 120, 1897));
		l8.addUltimo(new Libros("La m�quina del tiempo", "H.G. Wells", 100, 1895));
		
		LSNormalLibros l9 = new LSNormalLibros();
		l9.addUltimo(new Libros("El c�digo Da Vinci", "Dan Brown", 350, 2003));
		l9.addUltimo(new Libros("La sombra del viento", "Carlos Ruiz Zaf�n", 280, 2001));
		l9.addUltimo(new Libros("La catedral del mar", "Ildefonso Falcones", 300, 2006));
		l9.addUltimo(new Libros("El psicoanalista", "John Katzenbach", 200, 2002));
		l9.addUltimo(new Libros("La trilog�a de Nueva York", "Paul Auster", 220, 1987));

		LSNormalLibros l0 = new LSNormalLibros();
		l0.addUltimo(new Libros("Los pilares de la Tierra", "Ken Follett", 900, 1989));
		l0.addUltimo(new Libros("La isla del tesoro", "Robert Louis Stevenson", 150, 1883));
		l0.addUltimo(new Libros("Las aventuras de Tom Sawyer", "Mark Twain", 180, 1876));
		l0.addUltimo(new Libros("El gran Gatsby", "F. Scott Fitzgerald", 200, 1925));
		l0.addUltimo(new Libros("La llamada de lo salvaje", "Jack London", 120, 1903));

		LSNormalLibros l6 = new LSNormalLibros();
		l6.addUltimo(new Libros("La odisea", "Homero", 250, -800));
		l6.addUltimo(new Libros("La Il�ada", "Homero", 280, -750));
		l6.addUltimo(new Libros("Divina Comedia", "Dante Alighieri", 300, 1320));
		
				
		System.out.println("------------------------------------------------------");
		
		l1.mostrarLSN();
		l2.mostrarLSN();
		l3.mostrarLSN();
		l4.mostrarLSN();
		l5.mostrarLSN();
		l6.mostrarLSN();
		l7.mostrarLSN();
		l8.mostrarLSN();
		l9.mostrarLSN();
		l0.mostrarLSN();
		
		System.out.println("------------------------------------------------------");
		  LDMBiblio A=new LDMBiblio();
	        Biblioteca m1=new Biblioteca(10,"Miraflores","Calle Claudio Sanjinez N� 1602 (Casa del Poeta)","Biblioteca Especializada Yolanda Bedregal",l1);
	        Biblioteca m2=new Biblioteca(11,"Huaychani"," C. M�rida # 5","Municipal de Huaychani",l2);
	        Biblioteca m3=new Biblioteca(12,"Alto Obrajes"," Av. Del Maestro Esq. C. 10 - Frente al Parque UFAO","Alto Obrajes",l3);
	        Biblioteca m4=new Biblioteca(13,"Alto Pampahasi"," C. G Esq. Mercado La Paz - Lado Ret�n Policial","Zonal de Alto Pampahasi",l4);
	        Biblioteca m5=new Biblioteca(14,"Achachicala"," Av. Ramos Gavil�n entre la C. 3 y 2 - Lado Mercado de las Nieves","Municipal de Achachicala",l5);
	        Biblioteca m6=new Biblioteca(15,"El Tejar bajo","Av. H�roes del Pac�fico Esq. C. Raymundo Gonz�les, Sede Social de Junta de Vecinos - Plaza 27 de mayo","Biblioteca de tradiciones, costumbres y folklore :Ismael Sotomayor",l6);
	        Biblioteca m7=new Biblioteca(16,"Munaypata"," C. 31 de Julio - frente al Colegio 25 de Mayo","Biblioteca Zonal Munaypata",l7);
	        Biblioteca m8=new Biblioteca(17,"Central","Calle M�xico Plaza del Estudiante Calle Ca�ada Strongest","Centro de Informaci�n Documental",l8);
	        Biblioteca m9=new Biblioteca(18,"Mariscal Santa Cruz"," Av. Mscal Santa Cruz y Calle Potos�, (Casa de la Cultura Franz Tamayo)","Archivo Hist�rico Rosendo Gutierrez",l9);
	        Biblioteca m10=new Biblioteca(19,"Miraflores","Calle Francisco  de Chirinos esquina Calle Caballero","Biblioteca Municipal Miraflores",l0);

	        A.adiFinal(m1);
	        A.adiFinal(m2);
	        A.adiFinal(m3);
	        A.adiFinal(m4);
	        A.adiFinal(m5);
	        A.adiFinal(m6);
	        A.adiFinal(m7);
	        A.adiFinal(m8);
	        A.adiFinal(m9);
	        A.adiFinal(m10);
	        A.mostrar();

			System.out.println("------------------------------------------------------");
	       // mostrarBL(A);
		 
	        LSNormalObras O1=new LSNormalObras();
			O1.addUltimo(new Obras("29","Pablo Picasso","Guernica",1937));
			O1.addUltimo(new Obras("29","Pablo Picasso","Mujer Llorando",1937));
			O1.addUltimo(new Obras("29","Pablo Picasso","La Persistencia de la Memoria",1931));
			O1.addUltimo(new Obras("29","Pablo Picasso","El Viejo Guitarrista Ciego",1903));
			
			LSNormalObras O8=new LSNormalObras();
			O8.addUltimo(new Obras("50","Leonardo da Vinci","La Gioconda",1503));
			O8.addUltimo(new Obras("50","Leonardo da Vinci","La �ltima Cena",1495));
			O8.addUltimo(new Obras("50","Leonardo da Vinci","La Virgen de las Rocas",1483));
			O8.addUltimo(new Obras("50","Leonardo da Vinci","El Hombre de Vitruvio",1490));

			LSNormalObras O2=new LSNormalObras();
			O2.addUltimo(new Obras("33","Vincent van Gogh","Los Girasoles",1888));
			O2.addUltimo(new Obras("33","Vincent van Gogh","La Noche Estrellada",1889));
			O2.addUltimo(new Obras("33","Vincent van Gogh","Los Comedores de Patatas",1885));
			O2.addUltimo(new Obras("33","Vincent van Gogh","Autorretrato sin Barba",1889));

			LSNormalObras O3=new LSNormalObras();
			O3.addUltimo(new Obras("12","Salvador Dal�","La Persistencia de la Memoria",1931));
			O3.addUltimo(new Obras("12","Salvador Dal�","El Gran Masturbador",1929));
			O3.addUltimo(new Obras("12","Salvador Dal�","Sue�o Causado por el Vuelo de una Abeja Alrededor de una Granada un Segundo Antes de Despertar",1944));
			O3.addUltimo(new Obras("12","Salvador Dal�","La Tentaci�n de San Antonio",1946));
			
			LSNormalObras O0=new LSNormalObras();
			O0.addUltimo(new Obras("BOL001","Melchor P�rez de Holgu�n","La Virgen de la Candelaria", 1730));
			O0.addUltimo(new Obras("BOL001","Melchor P�rez de Holgu�n","San Francisco de As�s", 1744));
			O0.addUltimo(new Obras("BOL001","Melchor P�rez de Holgu�n","La Asunci�n de la Virgen Mar�a", 1745));
			O0.addUltimo(new Obras("BOL001","Melchor P�rez de Holgu�n","La Pur�sima Concepci�n", 1752));

			LSNormalObras O6=new LSNormalObras();
			O6.addUltimo(new Obras("BOL002","Mar�a Luisa Pacheco","Retrato de V�ctor Paz Estenssoro", 1960));
			O6.addUltimo(new Obras("BOL002","Mar�a Luisa Pacheco","Retrato de Jos� Santos Vargas", 1963));
			O6.addUltimo(new Obras("BOL002","Mar�a Luisa Pacheco","Retrato de Alcides Arguedas", 1965));
			O6.addUltimo(new Obras("BOL002","Mar�a Luisa Pacheco","Retrato de Franz Tamayo", 1968));
	
			LSNormalObras O7=new LSNormalObras();
			O7.addUltimo(new Obras("BOL003","Bernardo Bitti","La �ltima Cena", 1601));
			O7.addUltimo(new Obras("BOL003","Bernardo Bitti","La Asunci�n de la Virgen", 1585));
			O7.addUltimo(new Obras("BOL003","Bernardo Bitti","La Anunciaci�n", 1587));
			O7.addUltimo(new Obras("BOL003","Bernardo Bitti","El Bautismo de Cristo", 1596));

			LSNormalObras O4=new LSNormalObras();
			O4.addUltimo(new Obras("BOL004","Melit�n Rodr�guez","Retrato de Andr�s de Santa Cruz", 1845));
			O4.addUltimo(new Obras("BOL004","Melit�n Rodr�guez","Retrato de Manuel Isidoro Belz�", 1848));
			O4.addUltimo(new Obras("BOL004","Melit�n Rodr�guez","Retrato de Jos� Ballivi�n y Segurola", 1852));
			O4.addUltimo(new Obras("BOL004","Melit�n Rodr�guez","Retrato de Pedro Blanco Soto", 1857));

			LSNormalObras O5=new LSNormalObras();
			O5.addUltimo(new Obras("BOL005","Julio de la Vega","Oruro, Carnaval 1", 1956));
			O5.addUltimo(new Obras("BOL005","Julio de la Vega","Oruro, Carnaval 2", 1956));
			O5.addUltimo(new Obras("BOL005","Julio de la Vega","Bailando Caporales", 1957));
			O5.addUltimo(new Obras("BOL005","Julio de la Vega","Calle Sag�rnaga", 1960));
			
			LSNormalObras O10=new LSNormalObras();
			O10.addUltimo(new Obras("10","Frida Kahlo","Las Dos Fridas",1939));
			O10.addUltimo(new Obras("10","Frida Kahlo","Autorretrato con Collar de Espinas",1940));
			O10.addUltimo(new Obras("10","Frida Kahlo","Ra�ces",1943));
			O10.addUltimo(new Obras("10","Frida Kahlo","El Abrazo de Amor del Universo",1949));
			

			LSNormalObras O9 = new LSNormalObras();
			O9.addUltimo(new Obras("MM001", "Roberto Mamani Mamani", "El Poder de la Pachamama", 2002));
			O9.addUltimo(new Obras("MM002", "Roberto Mamani Mamani", "Mitos y Leyendas Andinas", 1998));
			O9.addUltimo(new Obras("MM003", "Roberto Mamani Mamani", "La Vida en las Alturas", 2007));
			O9.addUltimo(new Obras("MM004", "Roberto Mamani Mamani", "La Sabidur�a de los Antiguos", 2012));
			
						
			System.out.println("------------------------------------------------------");
			
			O1.mostrarLSN();
			O2.mostrarLSN();
			O3.mostrarLSN();
			O4.mostrarLSN();
			O5.mostrarLSN();
			O6.mostrarLSN();
			O7.mostrarLSN();
			O8.mostrarLSN();
			O9.mostrarLSN();
			O10.mostrarLSN();
		 
		 LDMMuseo M=new LDMMuseo();
	     Museo M1=new Museo(29,"Miraflores","Av. Del Ej�rcito","ESPACIO DE LA MEMORIA HIST�RICA DE LAS LUCHAS DEL PUEBLO BOLIVIANO POR LA LIBERTAD Y LA DEMOCRACIA");
	     Museo M2=new Museo(20, "Centro", "Calle Linares 906", "EXPOSICI�N Y VENTA DE TEXTILES ANDINOS");	    
	     Museo M3=new Museo(21, "Sopocachi", "Plaza Isabel La Cat�lica s/n", "EXPOSICI�N DE ARTE CONTEMPOR�NEO");	     
	     Museo M4=new Museo(22, "Miraflores", "Calle Ingavi s/n", "EXPOSICI�N DE ARTEFACTOS ARQUEOL�GICOS PREHISP�NICOS");	     
	     Museo M5=new Museo(23, "San Pedro", "Calle Linares 906", "EXPOSICI�N DE LA HISTORIA, USO Y CULTIVO DE LA COCA");	    
	     Museo M6=new Museo(24, "Sopocachi", "Calle Capit�n Castrillo s/n", "EXPOSICI�N DE LA HISTORIA DEL LITORAL BOLIVIANO");	     
	     Museo M7=new Museo(25, "San Francisco", "Calle Ja�n 711", "EXPOSICI�N DE INSTRUMENTOS MUSICALES BOLIVIANOS");	     
	     Museo M8=new Museo(26, "San Jorge", "Calle Comercio 1472", "EXPOSICI�N DE ARTE BOLIVIANO E INTERNACIONAL");	     
	     Museo M9=new Museo(27, "San Jorge", "Calle Comercio 1472", "EXPOSICI�N DE LA HISTORIA DE LA REVOLUCI�N BOLIVIANA");	     
	     Museo M0=new Museo(28, "Cotahuma", "Calle 21 de Mayo s/n", "EXPOSICI�N DE LA CULTURA DE LA COCA Y LA IDENTIDAD BOLIVIANA");   
	     
	     	M.adiFinal(M1);
	        M.adiFinal(M2);
	        M.adiFinal(M3);
	        M.adiFinal(M4);
	        M.adiFinal(M5);
	        M.adiFinal(M6);
	        M.adiFinal(M7);
	        M.adiFinal(M8);
	        M.adiFinal(M9);
	        M.adiFinal(M0);
			System.out.println("------------------------------------------------------");

	        M.mostrar();
	        
	        
        
        
    }
    
    public static void mostrarBL(LDMBiblio X) {
		NodoDobleBiblio o=X.getPm();
        while(o!=null)
        {
        	o.getDatoL().mostrar();
        	o.getDatoL().getListaLibros().mostrarLSN();
        	o= o.getSig();
    	}
           
        }
    
        
    }
    
  
