public class tp72{
	public static void main(String[]args){
		int[][] M=new int[30][30];
		int nl,nc,x,i,j,s,p;
		do{
			System.out.println("donner le nombre des lignes");
			nl=Clavier.lireInt();
		}while(nl<0 || nl>30 );
		do{
			System.out.println("donner le nombre des colonnes");
			nc=Clavier.lireInt();
		}while(nc<0 || nc>30 );
		for(i=0;i<nl;i++){
			for(j=0;j<nc;j++){
				System.out.println("M["+i+","+j+"]=");
				M[i][j]=Clavier.lireInt(); 
			}
		}
		s=0;
		p=1;
	
		for(i=0;i<nl;i++){
			for(j=0;j<nc;j++){
				s=s+M[i][j];
				p=p*M[i][j];
			}
		}
		System.out.println("la somme est"+s);
		System.out.println("le produit est"+p);
	}}