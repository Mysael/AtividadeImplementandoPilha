package br.cesed.si.p3.arrays.atividade;

public class DequeFacisa {
	private int numElementos;
	private Object[] meuDeckInterno;
	
	public DequeFacisa(int tamanho){
		this.meuDeckInterno = new Object[tamanho];
	}

	public void adicionaNoComeco(Object o){
		if (meuDeckInterno.length == numElementos){
			dobraTamanho(meuDeckInterno);
		}
		if (meuDeckInterno[0] == null){
			meuDeckInterno[0] = o;
		}
		for(int i = 1; i < meuDeckInterno.length; i++){
			if(meuDeckInterno[i] == null){
				while (i<0){
					meuDeckInterno[i] = meuDeckInterno[i-1];
					i--;
				} meuDeckInterno[0] = o;
			}
		}
	}
	public void adicionaNoFinal(Object o){
		if (meuDeckInterno.length == numElementos){
			dobraTamanho(meuDeckInterno);
		}
		if (meuDeckInterno[meuDeckInterno.length-1] == null){
			meuDeckInterno[meuDeckInterno.length-1] = o;
		}
		for(int i = meuDeckInterno.length; i >0; i--){
			if(meuDeckInterno[i] == null){
				while (i<0){
					meuDeckInterno[i] = meuDeckInterno[i-1];
					i--;
				} meuDeckInterno[0] = o;
			}
		}
	}
	
	
	
	
	
	public void dobraTamanho(Object array1[]){
		Object array2[] = new Object[array1.length * 2];
		for(int i = 0; i <= array1.length; i++){
			array2[i] = array1[i];
		}
		array2 = array1;
	}
	
	
}

