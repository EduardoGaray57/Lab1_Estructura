class ListaCircular{
	private Nodo inicio;
	private Nodo ultimo;
	//private int tamano;

	void ListaCircular(){
		inicio=null;
		ultimo=null;
	//	tamano=0;
	}

	boolean esVacia(){
		return inicio==null;
	}
	/*int getTamano(){
		return tamano;
	}*/
	void agregarAlFinal(String valor){
		Nodo nuevo= new Nodo();
		nuevo.setValor(valor.toUpperCase());
		if(esVacia()){
			inicio=nuevo;
			ultimo=nuevo;
			ultimo.setSgte(inicio);
		}else{			
				ultimo.setSgte(nuevo);
				nuevo.setSgte(inicio);
				ultimo=nuevo;						
		}
		//tamano++;
	}
	void insertarPorPosicion(int posicion, String valor){
		int cont=1;
		//if(posicion>=0 && posicion<=contar()){
			Nodo nuevo= new Nodo();
			Nodo aux= inicio;
			nuevo.setValor(valor);
			if(posicion==0){
				nuevo.setSgte(inicio);
				inicio=nuevo;
				ultimo.setSgte(inicio);
			}else{
				while(cont!=posicion){
					cont++;
					aux=aux.getSgte();
				}
				nuevo.setSgte(aux.getSgte());
				aux.setSgte(nuevo);
			}
		//}
	}
	boolean buscar(String referencia){
		Nodo aux= inicio;
		boolean encontrado=false;
		do{
			if(referencia.equalsIgnoreCase(aux.getValor())){
				System.out.println(aux.getValor());
				System.out.println("---------");
				encontrado=true;
			}else{
				System.out.println(aux.getValor());
				System.out.println("---------");
				aux=aux.getSgte();
			}
		}while(aux != inicio && encontrado != true);
		return encontrado;
	}
	void editarPorPosicion(int posicion, String valor){
		if(posicion >= 0 && posicion<contar()){
			if(posicion == 0){
				inicio.setValor(valor);
			}else{
				Nodo aux= inicio;
				for (int i = 0;i < posicion ;i++ ) {
					aux=aux.getSgte();
				}
				aux.setValor(valor);
			}
		}
	}
	void removerPorReferencia(String referencia){
		if(buscar(referencia)){
			if(inicio.getValor().equalsIgnoreCase(referencia)){
				inicio=inicio.getSgte();
				ultimo.setSgte(inicio);

			}else{
				Nodo aux= inicio;
				while(!aux.getSgte().getValor().equalsIgnoreCase(referencia)){
					aux= aux.getSgte();
				}
				if(aux.getSgte() == ultimo){
					aux.setSgte(inicio);
					ultimo = aux;
				}else{
					Nodo sgte= aux.getSgte();
					aux.setSgte(sgte.getSgte());
				}
			}
		}
	}
	void removerPorPosicion(int posicion){
		if(posicion>=0 && posicion<contar()){
			if(posicion == 0){
				inicio= inicio.getSgte();
				ultimo.setSgte(inicio);
			}else{
				Nodo aux = inicio;
				for (int i = 0;i<posicion-1 ;i++ ) {
					aux=aux.getSgte();
				}
				if(aux.getSgte()== ultimo){
					aux.setSgte(inicio);
					ultimo=aux;
				}else{
					Nodo sgte = aux.getSgte();
					aux.setSgte(sgte.getSgte());
				}
			}
			//tamano--;
		}
	}
	void eliminar(){
		inicio=null;
		ultimo=null;
		//tamano=0;
	}
	void lista(){
		if(!esVacia()){
			Nodo aux=inicio;
			int i=0;
			System.out.println("->");
			do{
				System.out.println(i+".[ "+aux.getValor() + " ]" + " ->");
				aux=aux.getSgte();
				i++;
			}while(aux != inicio);
		}
	}
	Nodo getInicio(){
		return inicio;
	}
	Nodo getUltimo(){
		return ultimo;
	}
	void eliminarUltimo(){
		Nodo aux= new Nodo();
		aux=inicio;
		while(aux.getSgte().getValor()!=ultimo.getValor()){
			aux=aux.getSgte();
		}
		if(aux.getSgte()==ultimo){
			aux.setSgte(inicio);
			ultimo=aux;
		}else{
			Nodo sgte=aux.getSgte();
			aux.setSgte(sgte.getSgte());
		}	
	}
	int contar(){
		int contado=0;
		Nodo aux=inicio;
		while(aux!=getUltimo()){
			contado++;
			aux=aux.getSgte();
		}
		return contado+1;
	}
	/*int setContar(int a){
		int contado=0;
		Nodo aux=inicio;
		while(aux!=getUltimo()){
				contado++;
				aux=aux.getSgte();
			if(contado<a){
				setContar(contado);
			}
		}
		return contado;
	}*/
	boolean comparar(String x){
		Nodo temp=inicio;
		boolean comp=false;
		do{
			if(x.equalsIgnoreCase(temp.getValor())){
				comp=true;
			}else{
				temp=temp.getSgte();
			}
		}while(temp != inicio && comp != true);
		return comp;
	}
	void ordenar(){
		if(inicio!=null && ultimo!=null){
			Nodo aux;
			Nodo actual;
			String temp;
			aux=inicio;
			while(aux!=ultimo){
				actual=aux.getSgte();
				while(actual!=inicio){
					if(aux.getValor().compareTo(actual.getValor())>0){
						temp=aux.getValor();
						aux.setValor(actual.getValor());
						actual.setValor(temp);
					}
					actual=actual.getSgte();
				}
				aux=aux.getSgte();
			}
		}else{
			System.out.println("lista no inicialisada");
		}
	}
}