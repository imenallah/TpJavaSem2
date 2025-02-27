public class tp71{
	public static void main(String[]args){
		int[][] M=new int[50][50];
		int nl,nc,x,i,j;
		boolean existe = false;
		do{
			System.out.println("donner le nombre des lignes");
			nl=Clavier.lireInt();
		}while(nl<0 || nl>50 );
		do{
			System.out.println("donner le nombre des colonnes");
			nc=Clavier.lireInt();
		}while(nc<0 || nc>50 );
		for(i=0;i<nl;i++){
			for(j=0;j<nc;j++){
				do{
				System.out.println("M["+i+","+j+"]=");
				M[i][j]=Clavier.lireInt();
				}while(M[i][j]%2!=0);
			}
		}
		do{
			System.out.println("donner x");
		x=Clavier.lireInt();
		}while(x%2!=0);
		i=0;
		j=0;
		while(!existe && i<nl && j<nc){
			if(M[i][j]==x){
				existe=true;
			}else if(i<nl && j==(nc-1)){
				j=0;
				i++;
			}else{
				j++;
			}
		}
		if(existe){
			System.out.println(x+" existe!");
		}else{
			System.out.println(x+" n'existe pas!");
		}
	}
}