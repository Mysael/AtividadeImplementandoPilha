package br.cesed.si.p3.arrays.atividade;

/**
 * 
 * @author Mysael
 * 
 * implementando funcionamento de pilhas
 *
 */
public class PilhasFacisa {
	private Object [] minhaPilhaInterna;
	int pos = 0;
	
	
	public PilhasFacisa(int tamanho){
		this.minhaPilhaInterna = new Object[tamanho];
	}
	
	public void push (Object o){
		minhaPilhaInterna[pos] = o;
		pos ++;
	}
	
	public Object pop (Object o){
		//int percorre = 0;
		for (int i = 0; i< minhaPilhaInterna.length; i++){
			if(minhaPilhaInterna[i] == o){
				return o;
				}minhaPilhaInterna[i] = null;
		}
		return null;
	}
	
	
	
}
