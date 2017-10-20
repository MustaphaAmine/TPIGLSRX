package pk;

public class Main {

    public static  int[] trieVect(int[] tab){
    	/** faire le trie d'un tableau d'entier **/
    	int z;
    	for(int i = 0; i<tab.length-1 ; i++){
    		if(tab[i]>tab[i+1]){
    			for( int j = i ; j >= 0 && tab[j] > tab[j+1]; j--){
    				z = tab[j];
    				tab[j] = tab[j+1];
    				tab[j+1] = z;
    			}
    		}
    	}
    	return tab;
    }
    
    public static int[] sommeVect(int[] tab1,int[] tab2) throws exceptionTailleDeff{
    	/** somme deux veccteeur **/
    	if(tab1.length != tab2.length) throw new exceptionTailleDeff();
    	else
    		for(int i = 0 ; i < tab1.length ; i++)
    			tab1[i] += tab2[i];
    	return tab1;
    }
    
    public static int[] Inverser(int[] tab){
    	/** fait l'inversement d'un tableau **/
    	int[] tabRes = new int[tab.length];
    	int j = tab.length-1;
    	for(int i = 0  ; i<tab.length ;i++){
    		tabRes[j] = tab[i];
    		j--;
    	}
    	return tabRes;
    }
    
    public static MinMax obtMinMax(int[] tab){
    	/** obtenir le maximum et le minimun d'un taleau **/
    	MinMax  minMaxval = new MinMax(0,0);
    	minMaxval.min = tab[0];
		minMaxval.max = tab[0];
	
    	for (int i = 0 ; i <tab.length ; i++){
             if(tab[i] < minMaxval.min) minMaxval.min =  tab[i];
             if(tab[i] > minMaxval.max) minMaxval.max = tab[i];
    	}
    	
    	return minMaxval;
    }
    
    public static int[] multPar2(int[] tab){
    	/** multiplie tout les element du tableau par 2**/
    	for(int i = 0; i<tab.length; i++)
    		tab[i] *= 2;
    	
    	return tab;
    }
    
    public static void main (String[] args) throws exceptionTailleDeff{
    }
    
}